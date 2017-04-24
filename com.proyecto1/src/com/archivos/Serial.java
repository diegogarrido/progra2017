package com.archivos;

import com.google.gson.Gson;
import java.beans.XMLEncoder;
import java.io.*;
import org.json.JSONException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serial {

    Gson gson = new Gson();

    /**
     * Serialziar un objeto y guardarlo como json para ser utilizado por el
     * programa
     *
     * @param ob Un objeto cualquiera
     * @param archivo Nombre con el que guardar el archivo
     * @throws IOException
     */
    public void guardarGson(Object ob, String archivo) throws IOException {
        Gson gson = new Gson();
        String str = gson.toJson(ob);
        try (FileWriter file = new FileWriter("archivos/" + archivo + ".json")) {
            file.write(str);
        }
    }

    /**
     * Transformar un archivo json a xml para ser utilizado en los reportes
     *
     * @param ob Clase a guardar
     * @param archivo Nombre del archivo
     * @throws JSONException
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void guardarXml(Object ob, String archivo) throws JSONException, FileNotFoundException, IOException {
        FileOutputStream outputFile = new FileOutputStream("archivos/" + archivo + ".xml");
        try (XMLEncoder xe = new XMLEncoder(outputFile)) {
            xe.writeObject(ob);
        }
    }

    /**
     * Cargar y materializar un objeto a partir de datos guardados como json
     *
     * @param aClass Tipo de objeto que se va a construir
     * @param archivo Nombre del archivo a cargar
     * @return Un objeto del tipo entregado con los datos del json leído
     * @throws FileNotFoundException
     */
    public Object cargarGson(Class aClass, String archivo) throws FileNotFoundException {
        Object obj = gson.fromJson(new FileReader("archivos/" + archivo + ".json"), aClass);
        return obj;
    }

    public void planificacionWord(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/planificacionword.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/planific.doc";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }

    public void planificacionHtml(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();

        Source xslDoc = new StreamSource("archivos/planificacionhtml.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/planific.html";

        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }

    public void planificacionExcel(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();

        Source xslDoc = new StreamSource("archivos/planificacionexcel.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/planific.xls";

        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }

    public void asignaturaWord(String archivo,String nombre) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaword.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/asign"+nombre+".doc";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void asignaturaHtml(String archivo,String nombre) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturahtml.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/asign"+nombre+".html";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void asignaturaExcel(String archivo,String nombre) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaexcel.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/asign"+nombre+".xls";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void porcentajesWord(String archivo,String nombre) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaword.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/reporteAlumno"+nombre+".doc";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void porcentajesHtml(String archivo,String nombre) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturahtml.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/reporteAlumno"+nombre+".html";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void porcentajesExcel(String archivo,String nombre) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaexcel.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/reporteAlumno"+nombre+".xls";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void asistenciaWord(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaword.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/reporteAsistencia.doc";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void asistenciaHtml(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturahtml.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/reporteAsistencia.html";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void asistenciaExcel(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaexcel.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/reporteAsistencia.xls";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void reprobadosWord(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaword.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/reprobados.doc";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void reprobadosHtml(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturahtml.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/reprobados.html";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void reprobadosExcel(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaexcel.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/reprobados.xls";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void apoderadosWord(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaword.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/apoderados.doc";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void apoderadosHtml(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturahtml.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/apoderados.html";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
    
    public void apoderadosExcel(String archivo) throws FileNotFoundException, TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Source xslDoc = new StreamSource("archivos/asignaturaexcel.xsl");
        Source xmlDoc = new StreamSource("archivos/" + archivo + ".xml");
        archivo = archivo.substring(0, 14);
        String outputFileName = "archivos/" + archivo + "/reportes/apoderados.xls";
        OutputStream docFile = new FileOutputStream(outputFileName);
        Transformer trasform = tFactory.newTransformer(xslDoc);
        trasform.transform(xmlDoc, new StreamResult(docFile));
    }
}
