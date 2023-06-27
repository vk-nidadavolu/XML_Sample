package com.ck.framework;


import com.ck.framework.pojo.cano.Document;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class XML {

    private static final Map<Class<?>, Class<?>> WRAPPER_TYPE_MAP;
    private Map<String, Object> data;

    static {
        WRAPPER_TYPE_MAP = new LinkedHashMap<>();
        WRAPPER_TYPE_MAP.put(String.class, String.class);
        WRAPPER_TYPE_MAP.put(boolean.class, boolean.class);
        WRAPPER_TYPE_MAP.put(Integer.class, int.class);
        WRAPPER_TYPE_MAP.put(Byte.class, byte.class);
        WRAPPER_TYPE_MAP.put(Character.class, char.class);
        WRAPPER_TYPE_MAP.put(Boolean.class, boolean.class);
        WRAPPER_TYPE_MAP.put(Double.class, double.class);
        WRAPPER_TYPE_MAP.put(BigDecimal.class, BigDecimal.class);
        WRAPPER_TYPE_MAP.put(Float.class, float.class);
        WRAPPER_TYPE_MAP.put(Long.class, long.class);
        WRAPPER_TYPE_MAP.put(Short.class, short.class);
        WRAPPER_TYPE_MAP.put(Void.class, void.class);
    }

    private XML(){
    }

    public XML(XMLBuilder builder) {
        this.data = builder.data;
    }

    public <T> String generateXML(MessageType messageType)  {
        try {
            Class<T> clazz =
                      (messageType.equals(MessageType.CANO))
                    ? (Class<T>) com.ck.framework.pojo.cano.Document.class
                              : (messageType.equals(MessageType.CANOE))
                    ? (Class<T>) com.ck.framework.pojo.canoe.Document.class
                              : null;
            if(Objects.isNull(clazz)) {
                throw new RuntimeException("Invalid message type. Couldn't able to generate XML message");
            }
            T value = createObjects(clazz);
            StringWriter writer = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(value.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            if(messageType.equals(MessageType.CANO)){
                com.ck.framework.pojo.cano.ObjectFactory factory = new com.ck.framework.pojo.cano.ObjectFactory();
                JAXBElement<com.ck.framework.pojo.cano.Document> element = factory.createDocument((com.ck.framework.pojo.cano.Document) value);
                marshaller.marshal(value, writer);
            } else if(messageType.equals(MessageType.CANOE)){
                com.ck.framework.pojo.canoe.ObjectFactory factory = new com.ck.framework.pojo.canoe.ObjectFactory();
                JAXBElement<com.ck.framework.pojo.canoe.Document> element = factory.createDocument((com.ck.framework.pojo.canoe.Document) value);
                marshaller.marshal(element, writer);
            }
            return writer.toString();
        } catch(JAXBException e) {
            throw new RuntimeException("Failed to generated XML", e);
        }

    }

    private <T> T createObjects (Class<T> clazz) {
        try {
            T obj = (T) new Object();
            if(!clazz.isEnum()) {
                obj = clazz.getDeclaredConstructor().newInstance();
            }
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields) {
                String fieldKey = clazz.getSimpleName() + "." + field.getName();
                field.setAccessible(true);
                if(field.isEnumConstant()) {

                } else if(isPrimitiveType(field.getType())) {
                    if(data.containsKey(fieldKey)) {
                        field.set(obj, data.get(fieldKey));
                    }
                } else if(field.getType().equals(List.class)) {
                    Set<String> valueList = data.keySet().stream().filter(s -> s.startsWith(fieldKey)).collect(Collectors.toSet());
                    List<Object> childListObj = new ArrayList<>();
                    for(int i=1; i< valueList.size(); i++) {
                        if(isPrimitiveType(((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0].getClass()) && data.containsKey(fieldKey)){
                            childListObj.add(data.get(fieldKey + "." + i));
                        } else {
                            if(!clazz.isEnum()) {
                                childListObj.add(createObjects(((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0].getClass()));
                            } else {
                                clazz.getClass().getEnumConstants();
                            }
                        }
                    }
                    field.set(obj, childListObj);
                } else {
                    if(!field.getType().isEnum()) {
                        field.set(obj, createObjects(field.getType()));
                    } else {
                        field.set(obj, getEnum((Class<Enum>) field.getType(), data.get(fieldKey)));
                    }
                }
                field.setAccessible(false);
            }
            return obj;
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Failed to generated Objects", e);
        }
    }


    private static <T extends Enum<T>> Object getEnum(Class<Enum> aEnum, Object enumValue) {
        Set<?> enumSet = Arrays.stream(aEnum.getEnumConstants()).map(e -> e.toString()).collect(Collectors.toSet());
        return enumSet.contains(enumValue) ? Enum.valueOf(aEnum, enumValue.toString()) : null;
    }
    private static boolean isPrimitiveType(Class<?> source) {
        return WRAPPER_TYPE_MAP.containsKey(source);
    }

    public static class XMLBuilder {
        private Map<String, Object> data = new LinkedHashMap<>();

        public XMLBuilder data(Map<String, Object> data) {
            this.data = data;
            return this;
        }

        public XML build() {
            return new XML(this);
        }
    }

}

