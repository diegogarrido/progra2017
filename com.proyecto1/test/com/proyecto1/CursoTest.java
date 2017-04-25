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
 * Junit de Curso
 * @author Diego
 */
public class CursoTest {
    
    /**
     *
     */
    public CursoTest() {
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
     * Test of getAsignaturas method, of class Curso.
     */
    @Test
    public void testGetAsignaturas() {
        System.out.println("getAsignaturas");
        Curso instance = new Curso();
        Asignatura[] expResult = new Asignatura[5];
        Asignatura[] result = instance.getAsignaturas();
        assertArrayEquals(expResult, result);
        
    }

    /**
     * Test of setAsignaturas method, of class Curso.
     */
    @Test
    public void testSetAsignaturas() {
        System.out.println("setAsignaturas");
        Asignatura[] asignaturas = null;
        Curso instance = new Curso();
        instance.setAsignaturas(asignaturas);
        assertArrayEquals(asignaturas,instance.getAsignaturas());
    }

    /**
     * Test of getAlumnos method, of class Curso.
     */
    @Test
    public void testGetAlumnos() {
        System.out.println("getAlumnos");
        Curso instance = new Curso();
        Alumno[] expResult = new Alumno[30];
        Alumno[] result = instance.getAlumnos();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setAlumnos method, of class Curso.
     */
    @Test
    public void testSetAlumnos() {
        System.out.println("setAlumnos");
        Alumno[] alumnos = null;
        Curso instance = new Curso();
        instance.setAlumnos(alumnos);
        assertArrayEquals(alumnos,instance.getAlumnos());
    }

    /**
     * Test of getProfesores method, of class Curso.
     */
    @Test
    public void testGetProfesores() {
        System.out.println("getProfesores");
        Curso instance = new Curso();
        ArrayList<String> expResult = new ArrayList();
        ArrayList<String> result = instance.getProfesores();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProfesores method, of class Curso.
     */
    @Test
    public void testSetProfesores() {
        System.out.println("setProfesores");
        ArrayList<String> profesores = null;
        Curso instance = new Curso();
        instance.setProfesores(profesores);
        assertEquals(profesores,instance.getProfesores());
    }

    /**
     * Test of getNivel method, of class Curso.
     */
    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        Curso instance = new Curso(1,'B');
        Integer expResult = 1;
        Integer result = instance.getNivel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNivel method, of class Curso.
     */
    @Test
    public void testSetNivel() {
        System.out.println("setNivel");
        Integer nivel = null;
        Curso instance = new Curso();
        instance.setNivel(nivel);
        assertEquals(nivel,instance.getNivel());
    }

    /**
     * Test of getLetra method, of class Curso.
     */
    @Test
    public void testGetLetra() {
        System.out.println("getLetra");
        Curso instance = new Curso(1,'A');
        char expResult = 'A';
        char result = instance.getLetra();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLetra method, of class Curso.
     */
    @Test
    public void testSetLetra() {
        System.out.println("setLetra");
        char letra = ' ';
        Curso instance = new Curso();
        instance.setLetra(letra);
        assertEquals(letra,instance.getLetra());
    }
    
}
