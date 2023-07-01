package com.ck.framework;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
        WRAPPER_TYPE_MAP.put(XMLGregorianCalendar.class, XMLGregorianCalendar.class);
    }

    private XML(){
    }

    public XML(XMLBuilder builder) {
        this.data = builder.data;
    }

    public String generateXML(MessageType messageType)  {
        try {
            Class<?> clazz =
                      (messageType.equals(MessageType.CANO))
                    ? com.ck.framework.pojo.cano.Document.class
                              : (messageType.equals(MessageType.CANOE))
                    ? com.ck.framework.pojo.canoe.Document.class
                              : null;
            if(Objects.isNull(clazz)) {
                throw new RuntimeException("Invalid message type. Couldn't able to generate XML message");
            }
            Object value = createObjects(clazz);
            StringWriter writer = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(value.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            switch (messageType) {
                case CANO:
                    com.ck.framework.pojo.cano.ObjectFactory canoFactory = new com.ck.framework.pojo.cano.ObjectFactory();
                    JAXBElement<com.ck.framework.pojo.cano.Document> canoRootElement = canoFactory.createDocument((com.ck.framework.pojo.cano.Document) value);
                    marshaller.marshal(canoRootElement, writer);
                    break;
                case CANOE:
                    com.ck.framework.pojo.canoe.ObjectFactory canoeFactory = new com.ck.framework.pojo.canoe.ObjectFactory();
                    JAXBElement<com.ck.framework.pojo.canoe.Document> canoeRootElement = canoeFactory.createDocument((com.ck.framework.pojo.canoe.Document) value);
                    marshaller.marshal(canoeRootElement, writer);
                    break;
                default:
                    throw new RuntimeException("Invalid Message Type");
            }
            return writer.toString();
        } catch(JAXBException e) {
            throw new RuntimeException("Failed to generated XML", e);
        }

    }

    private <E extends Enum<E>> Object createObjects (Class<?> clazz) {
        String str = "";
        if(clazz.getSimpleName().equalsIgnoreCase("CorporateActionOption213")){
            System.out.println("DeemedRateType2Choice");
        }
        try {
            Object obj = new Object();
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
                        if(field.getType().equals(XMLGregorianCalendar.class)) {
                            field.set(obj, getGregorianCalendarDate());
                        } else{
                            field.set(obj, data.get(fieldKey));
                        }
                    }
                } else if(field.getType().equals(List.class)) {
                    Set<String> valueList = data.keySet().stream().filter(s -> s.startsWith(fieldKey)).collect(Collectors.toSet());
                    List<Object> childListObj = new ArrayList<>();

                    if(isPrimitiveType((Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0]) && data.containsKey(fieldKey)){
                        for(int i=1; i< valueList.size(); i++) {
                            if(data.containsKey(fieldKey + "." + i)) {
                                if(field.getType().equals(XMLGregorianCalendar.class)) {
                                    childListObj.add(getGregorianCalendarDate());
                                } else{
                                    childListObj.add(data.get(fieldKey + "." + i));
                                }
                            }
                        }
                    } else {
                        if(!clazz.isEnum()) {
                            for(int i=1; i< valueList.size(); i++) {
                                childListObj.add(createObjects((Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0]));
                            }
                        } else {
                            if(data.containsKey(fieldKey)) {
                                field.set(obj, getEnum((Class<E> )field.getType(), data.get(fieldKey)));
                            }
                        }
                    }
                    field.set(obj, childListObj);
                } else {
                    if(!field.getType().isEnum()) {
                        field.set(obj, createObjects(field.getType()));
                    } else {
                        if(data.containsKey(fieldKey)) {
                            field.set(obj, getEnum((Class<E> )field.getType(), data.get(fieldKey)));
                        }

                    }
                }
                field.setAccessible(false);
            }
            return obj;
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Failed to generated Objects " + str, e);
        }
    }

    private static <E extends Enum<E>> Object getEnum(Class<E> aEnum, Object enumValue) {
        Set<?> enumSet = Arrays.stream(aEnum.getEnumConstants()).map(Enum::toString).collect(Collectors.toSet());
        return enumSet.contains(enumValue) ? Enum.valueOf(aEnum, enumValue.toString()) : "";
    }

    private static boolean isPrimitiveType(Class<?> source) {
        return WRAPPER_TYPE_MAP.containsKey(source);
    }

    private static XMLGregorianCalendar getGregorianCalendarDate(){
        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(new Date());
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
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

