/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Junit de Alumno
 * @author Diego
 */
public class AlumnoTest {
    
    /**
     *
     */
    public AlumnoTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getNotasAsig method, of class Alumno.
     */
    @Test
    public void testGetNotasAsig() {
        System.out.println("getNotasAsig");
        Alumno instance = new Alumno();
        String[] expResult = instance.getNotasAsig();
        assertSame(expResult.length,25);
    }

    /**
     * Test of setNotasAsig method, of class Alumno.
     */
    @Test
    public void testSetNotasAsig() {
        System.out.println("setNotasAsig");
        String[] notasAsig = null;
        Alumno instance = new Alumno();
        instance.setNotasAsig(notasAsig);
        Assert.assertArrayEquals(notasAsig, instance.getNotasAsig());
    }

    /**
     * Test of getAnotaciones method, of class Alumno.
     */
    @Test
    public void testGetAnotaciones() {
        System.out.println("getAnotaciones");
        Alumno instance = new Alumno();
        ArrayList<String> result = instance.getAnotaciones();
        assertEquals(new ArrayList<>(), result);
    }

    /**
     * Test of setAnotaciones method, of class Alumno.
     */
    @Test
    public void testSetAnotaciones() {
        System.out.println("setAnotaciones");
        ArrayList<String> anotaciones = null;
        Alumno instance = new Alumno();
        instance.setAnotaciones(anotaciones);
        assertEquals(anotaciones, instance.getAnotaciones());
    }

    /**
     * Test of getNotas method, of class Alumno.
     */
    @Test
    public void testGetNotas() {
        System.out.println("getNotas");
        Alumno instance = new Alumno();
        String[] result = instance.getNotas();
        assertEquals(25, result.length);
    }

    /**
     * Test of setNotas method, of class Alumno.
     */
    @Test
    public void testSetNotas() {
        System.out.println("setNotas");
        String[] notas = null;
        Alumno instance = new Alumno();
        instance.setNotas(notas);
        Assert.assertArrayEquals(notas,instance.getNotas());
    }

    /**
     * Test of getAsistencia method, of class Alumno.
     */
    @Test
    public void testGetAsistencia() {
        System.out.println("getAsistencia");
        Alumno instance = new Alumno();
        boolean[] result = instance.getAsistencia();
        assertEquals(30, result.length);
    }

    /**
     * Test of setAsistencia method, of class Alumno.
     */
    @Test
    public void testSetAsistencia() {
        System.out.println("setAsistencia");
        boolean[] asistencia = null;
        Alumno instance = new Alumno();
        instance.setAsistencia(asistencia);
        assertEquals(asistencia,instance.getAsistencia());
    }

    /**
     * Test of getCurso method, of class Alumno.
     */
    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        Alumno instance = new Alumno("nombre","curso",new Apoderado());
        String expResult = "curso";
        String result = instance.getCurso();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCurso method, of class Alumno.
     */
    @Test
    public void testSetCurso() {
        System.out.println("setCurso");
        String curso = "curso";
        Alumno instance = new Alumno();
        instance.setCurso(curso);
        assertEquals(curso,instance.getCurso());
    }

    /**
     * Test of getApoderado method, of class Alumno.
     */
    @Test
    public void testGetApoderado() {
        System.out.println("getApoderado");
        Alumno instance = new Alumno();
        Apoderado expResult = null;
        Apoderado result = instance.getApoderado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApoderado method, of class Alumno.
     */
    @Test
    public void testSetApoderado() {
        System.out.println("setApoderado");
        Apoderado apoderado = null;
        Alumno instance = new Alumno();
        instance.setApoderado(apoderado);
        assertEquals(apoderado,instance.getApoderado());
    }

    /**
     * Test of getNombre method, of class Alumno.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Alumno instance = new Alumno("nombre","curso",new Apoderado());
        String expResult = "nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Alumno.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "nombre";
        Alumno instance = new Alumno();
        instance.setNombre(nombre);
        assertEquals(nombre,instance.getNombre());
    }

    /**
     * Test of getPorcentajeAsistencia method, of class Alumno.
     */
    @Test
    public void testGetPorcentajeAsistencia() {
        System.out.println("getPorcentajeAsistencia");
        Alumno instance = new Alumno();
        instance.setAsistencia(new boolean[]{true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,});
        String expResult = "%50.0";
        String result = instance.getPorcentajeAsistencia();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPromedioAsignatura method, of class Alumno.
     */
    @Test
    public void testGetPromedioAsignatura() {
        System.out.println("getPromedioAsignatura");
        int asignatura = 1;
        Alumno instance = new Alumno();
        instance.setNotas(new String[]{"4.0,20","6.0,20","3.5,20","5.2,20","3.5,20"});
        String expResult = "4.4";
        String result = instance.getPromedioAsignatura(asignatura);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPromedio method, of class Alumno.
     */
    @Test
    public void testGetPromedio() {
        System.out.println("getPromedio");
        Alumno instance = new Alumno();
        instance.setNotas(new String[]{"4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,"});
        String expResult = "4.4";
        String result = instance.getPromedio();
        assertEquals(expResult, result);
    }

    /**
     * Test of estaReprobando method, of class Alumno.
     */
    @Test
    public void testEstaReprobando() {
        System.out.println("estaReprobando");
        Alumno instance = new Alumno();
        instance.setAsistencia(new boolean[]{true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,false,false,});
        instance.setNotas(new String[]{"4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,"});
        boolean expResult = false;
        boolean result = instance.estaReprobando();
        assertEquals(expResult, result);
    }

    /**
     * Test of razonReprobado method, of class Alumno.
     */
    @Test
    public void testRazonReprobado() {
        System.out.println("razonReprobado");
        Alumno instance = new Alumno();
        instance.setAsistencia(new boolean[]{true,true,true,true,true,true,true,true,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,});
        instance.setNotas(new String[]{"4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,","4.0,20","6.0,20","3.5,20","5.2,20","3.5,20,"});
        String expResult = "Porcentaje de Asistencia bajo %85";
        String result = instance.razonReprobado();
        assertEquals(expResult, result);
    }
    
}
