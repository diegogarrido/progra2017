package dom;

import java.io.FileInputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
public class EjemploDOM {
    public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException {
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        // Crear nueva instancia de DOMBuilder a través factoria
        DocumentBuilder parser = fact.newDocumentBuilder();
        FileInputStream fis = new FileInputStream("C:/Users/Diego/Diego/Informatica/Java/xml/test/dom.xml");
        InputSource is = new InputSource(fis);
        Document doc = parser.parse(is);
        Element element = doc.getDocumentElement();
        NodeList nodes = element.getElementsByTagName("Pelicula");
        for (int i = 0; i < nodes.getLength(); i++) {
            Node n = nodes.item(i);
            Element e = (Element) n; 
            System.out.println("Película "+(i+1)+"\n"+
            "Código: " + e.getAttribute("codigo")+"\n"+
            "Título: " + e.getAttribute("titulo")+"\n"+
            "Director: " + e.getAttribute("director")+"\n"+
            "Actores: " + e.getAttribute("actores")+"\n"+
            "-------------------");
        }
    }
    
    /*public static void tratarNodo(Node nodo) {
        switch (nodo.getNodeType()) {
            case Node.DOCUMENT_NODE:
                System.out.println("<xml version=\"1.0\">");
                Document doc = (Document)nodo;
                tratarNodo(doc.getDocumentElement());
            break;
            case Node.ELEMENT_NODE:
                String nombre = nodo.getNodeName();
                System.out.print("<" + nombre);
                NamedNodeMap ats = nodo.getAttributes();
                for (int i=0; i<ats.getLength(); i++) {
                    tratarNodo(ats.item(i));
                }
                System.out.println(">");
                NodeList hijos = nodo.getChildNodes();
                // tratar los hijos recursivamente
            break;
            case Node.ATTRIBUTE_NODE:
                System.out.print(" " + nodo.getNodeName() +
                "=\"" + nodo.getNodeValue() +"\"");
            break;
            case Node.TEXT_NODE:
                String texto = nodo.getNodeValue().trim();
                if (!texto.equals("")) {
                    System.out.println(ind + texto);
                }
            break;
            case Node.CDATA_SECTION_NODE:
                System.out.println(nodo.getNodeValue());
            break;
            case Node.PROCESSING_INSTRUCTION_NODE:
            break;
            case Node.ENTITY_REFERENCE_NODE:
            break;
            case Node.DOCUMENT_TYPE_NODE:
            break;
        }
    }
    */
    
}

