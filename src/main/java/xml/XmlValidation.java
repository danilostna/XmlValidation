package main.java.xml;

import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

public class XmlValidation {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        boolean isValid = true;
        try {
//            validate("teste.xml", "schema.xsd");
//            validate("vast2.0.xml", "validatorVast.xsd");
//            validate("vast3.0.xml", "validatorVast.xsd");
//            validate("vast4.0.xml", "validatorVast.xsd");
//            validate("vast4.0.xml", "vast4.0Validator.xsd");
            validate("vast3.0.xml", "validatorVast.xsd");
//            validateFromUrl("validatorVast.xsd");
        }
        catch (SAXException e){
            isValid = false;
//            Locale actualLocale = Locale.FRENCH;
//            Locale actualLocale = Locale.US;
//            Locale currentLocale = new Locale("pt", "BR");
//            ResourceBundle resourceBundle = ResourceBundle.getBundle("XMLSchemaMessages", actualLocale);
//            ResourceBundle resourceBundle = ResourceBundle.getBundle("XMLSchemaMessages");
//            String string = resourceBundle.getString(e.getMessage());
//            System.out.println(string);

            checkException(e);
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            isValid = false;
            System.out.println(e.getMessage());
        }
        System.out.println("Xml is valid? "+ isValid);
    }

    private static void checkException(SAXException e) {
        Locale currentLocale = Locale.FRENCH;
//        Locale currentLocale = new Locale("pt", "BR");
        //com.sun.org.apache.xerces.internal.impl.xpath.regex.message

        ResourceBundle messages = ResourceBundle.getBundle("com.sun.org.apache.xerces.internal.impl.msg.XMLSchemaMessages", currentLocale);
//        Enumeration<String> keys = messages.getKeys();
//        while (keys.hasMoreElements()){
//            System.out.println(keys.nextElement());
//        }
        String messagesString = messages.getString(e.getMessage().split(":")[0]);
//        String messagesString = messages.getString(e.getMessage());
//        System.out.println(messagesString);
        Object[] messageArguments = {};
        MessageFormat formatter = new MessageFormat("");
        formatter.setLocale(currentLocale);
        formatter.applyPattern(messagesString);
        String messagesFormatted = formatter.format(messageArguments);
        System.out.println(messagesFormatted);
    }

    private static void validate(String xml, String xsd) throws SAXException, IOException, ParseException {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

//        File fileXml = new File("src/resources/xml/"+xml);
//        File schema = new File("src/resources/xsd/"+xsd);
//        Validator validator = factory.newSchema(schema).newValidator();
//        validator.validate(new StreamSource(fileXml));

//        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
//        Date parse = df.parse("00:00:30");
        LocalTime localTime = LocalTime.parse("01:05:30");
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(parse);
//        long timeInMillis = calendar.getTimeInMillis();
//        calendar.gett
        System.out.println("Time in millis: "+ localTime.toSecondOfDay()*1000);
    }
}
