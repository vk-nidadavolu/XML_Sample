package com.ck.framework;

import com.ck.framework.pojo.cano.CorporateActionOption39Choice;
import com.ck.framework.pojo.cano.Document;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
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
    public void generateXMLTest() {
        XML XML = new XML.XMLBuilder().data(data).build();
        String xml = XML.generateXML(MessageType.CANO);
        xml = xml.replace("<tag1>\n\t\tUDFR</tag1>", "<tag1>abdc</tag1>");
        System.out.println(xml);
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

    public Set<Class<?>> findAllClassesUsingClassLoader(String packageName) {
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
