package by.freee.it.lesson13;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

final public class JAXBWorker {

    public static void writeListToXML(Devices devices, File filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Computer.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(devices, filePath);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Devices fromXMLToObject(File filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Devices.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (Devices) un.unmarshal(filePath);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean validateXMLSchema(File xsdPath, File xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(xsdPath);
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xmlPath));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }
}




