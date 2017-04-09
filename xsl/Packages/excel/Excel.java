/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author Diego
 */
public class Excel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory=TransformerFactory.newInstance();

        Source xslDoc=new StreamSource("test/excel.xsl");
        Source xmlDoc=new StreamSource("test/course.xml");

        String outputFileName="test/excel.xls";

        OutputStream htmlFile=new FileOutputStream(outputFileName);
        Transformer trasform=tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(htmlFile));
    }
    
}
