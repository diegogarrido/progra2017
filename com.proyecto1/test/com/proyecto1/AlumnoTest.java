/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAnotaciones method, of class Alumno.
     */
    @Test
    public void testGetAnotaciones() {
        System.out.println("getAnotaciones");
        Alumno instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getAnotaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnotaciones method, of class Alumno.
     */
    @Test
    public void testSetAnotaciones() {
        System.out.println("setAnotaciones");
        ArrayList<String> anotaciones = null;
        Alumno instance = null;
        instance.setAnotaciones(anotaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotas method, of class Alumno.
     */
    @Test
    public void testGetNotas() {
        System.out.println("getNotas");
        Alumno instance = null;
        String[] expResult = null;
        String[] result = instance.getNotas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotas method, of class Alumno.
     */
    @Test
    public void testSetNotas() {
        System.out.println("setNotas");
        String[] notas = null;
        Alumno instance = null;
        instance.setNotas(notas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAsistencia method, of class Alumno.
     */
    @Test
    public void testGetAsistencia() {
        System.out.println("getAsistencia");
        Alumno instance = null;
        boolean[] expResult = null;
        boolean[] result = instance.getAsistencia();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsistencia method, of class Alumno.
     */
    @Test
    public void testSetAsistencia() {
        System.out.println("setAsistencia");
        boolean[] asistencia = null;
        Alumno instance = null;
        instance.setAsistencia(asistencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurso method, of class Alumno.
     */
    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        Alumno instance = null;
        String expResult = "";
        String result = instance.getCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurso method, of class Alumno.
     */
    @Test
    public void testSetCurso() {
        System.out.println("setCurso");
        String curso = "";
        Alumno instance = null;
        instance.setCurso(curso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApoderado method, of class Alumno.
     */
    @Test
    public void testGetApoderado() {
        System.out.println("getApoderado");
        Alumno instance = null;
        Apoderado expResult = null;
        Apoderado result = instance.getApoderado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApoderado method, of class Alumno.
     */
    @Test
    public void testSetApoderado() {
        System.out.println("setApoderado");
        Apoderado apoderado = null;
        Alumno instance = null;
        instance.setApoderado(apoderado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcentajeAsistencia method, of class Alumno.
     */
    @Test
    public void testGetPorcentajeAsistencia() {
        System.out.println("getPorcentajeAsistencia");
        Alumno instance = null;
        String expResult = "";
        String result = instance.getPorcentajeAsistencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPromedioAsignatura method, of class Alumno.
     */
    @Test
    public void testGetPromedioAsignatura() {
        System.out.println("getPromedioAsignatura");
        int asignatura = 0;
        Alumno instance = null;
        String expResult = "";
        String result = instance.getPromedioAsignatura(asignatura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPromedio method, of class Alumno.
     */
    @Test
    public void testGetPromedio() {
        System.out.println("getPromedio");
        Alumno instance = null;
        String expResult = "";
        String result = instance.getPromedio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
