/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xhtml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     * @throws javax.xml.transform.TransformerException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, TransformerException, IOException {
        String result = obtenerCarteleraHMTL();
        System.out.println(result);
    }

    public static String obtenerCarteleraHMTL() throws SAXException, ParserConfigurationException, IOException, TransformerConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // Usar JAXP DOM para generar Document con fichero xml
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("test/cartelera.xml");
        // Generar un objeto transformer para realizar transform XSL
        TransformerFactory tFactory = TransformerFactory.newInstance();
        StreamSource stylesource = new StreamSource("test/cartelera.xsl");
        Transformer transformer = tFactory.newTransformer(stylesource);
        DOMSource source = new DOMSource(document);
        ByteArrayOutputStream outputByteArray = new ByteArrayOutputStream();
        StreamResult result = new StreamResult(outputByteArray);
        transformer.transform(source, result);
        return outputByteArray.toString();

    }
}
