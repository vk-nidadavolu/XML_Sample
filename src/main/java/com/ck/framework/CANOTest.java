package com.ck.framework;


import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;


public class CANOTest {

    private static final Map<String, Object> data = new LinkedHashMap<>();

    static {
        data.put("AccountAndBalance52.sfkpgAcct", "iPhone");
        data.put("AccountAndBalance52.blckChainAdrOrWllt", "24th Jan 2023");
        data.put("AlternatePartyIdentification9.ctry", "1800");
        data.put("AlternatePartyIdentification9.altrnId", "Android");
        data.put("AmountAndQuantityRatio5.BigDecimal", "8th Mar 2023");
        data.put("CashAccountIdentification6Choice.iban", "1200");
        data.put("CashAccountIdentification6Choice.prtry", "Chandru");
        data.put("CashOption87.ctryOfIncmSrc", "Chandru");
        data.put("ProcessingPosition10Choice.cd", "AFTE");
        data.put("GenericIdentification47.id", "Generic ID");
        data.put("GenericIdentification47.issr", "Generic ISSR");
        data.put("GenericIdentification47.schmeNm", "Generic Scheme Name");
        data.put("SafekeepingPlaceTypeAndText15.sfkpgPlcTp", "SHHE");
        data.put("OptionNumber1Choice.cd", "UNSO");
        data.put("DeemedRateType2Choice.cd", "DEDI");
        data.put("CashOption87.ctrctlPmtInd", "ACTU");
        data.put("CorporateActionOption39Choice.cd", "ABST");
        data.put("SignedQuantityFormat13.shrtLngPos", "SHOR");
        data.put("ProprietaryQuantity10.shrtLngPos", "SHOR");
        data.put("OriginalAndCurrentQuantities7.shrtLngPos", "SHOR");
        data.put("SignedQuantityFormat12.shrtLngPos", "SHOR");
        data.put("AdditionalBusinessProcessFormat20Choice.cd", "CLAI");
        data.put("IdentificationType44Choice.cd", "ARNU");

    }

    @Test
    public void buildCANOMessage() {
        XML XML = new XML.XMLBuilder().data(data).build();
        String xml = XML.generateXML(MessageType.CANO);
        writeXML(xml, "CANO");
    }
    @Test
    public void buildCANOEMessage() {
        XML XML = new XML.XMLBuilder().data(data).build();
        String xml = XML.generateXML(MessageType.CANOE);
        writeXML(xml, "CANOE");
    }
    private void writeXML(String xml, String fileName) {
        try {
            FileWriter writer = new FileWriter("./src/test/resources/generatedXml/" + fileName + ".xml");
            writer.write(xml);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void demo() {
        Set<Class<?>> classes = findAllClassesUsingClassLoader("com.ck.framework.pojo.cano");
        for(Class<?> cls : classes) {
            System.out.println(cls.getName());
            Field[] fields = cls.getDeclaredFields();
            for(Field field : fields) {
                ;
                System.out.println("       " + String.format("%30s", field.getName()) + "  :  " + field.getType().getSimpleName());
            }
        }
    }

    private Set<Class<?>> findAllClassesUsingClassLoader(String packageName) {
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(stream)));
        return reader.lines()
                .filter(line -> line.endsWith(".class"))
                .map(line -> getClass(line, packageName))
                .collect(Collectors.toSet());
    }

    private Class<?> getClass(String className, String packageName) {
        try {
            return Class.forName(packageName + "."
                    + className.substring(0, className.lastIndexOf('.')));
        } catch (ClassNotFoundException ignored) {
        }
        return null;
    }

}
