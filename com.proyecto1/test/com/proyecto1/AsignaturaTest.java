/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Junit de Asignatura
 * @author Diego
 */
public class AsignaturaTest {
    
    /**
     *
     */
    public AsignaturaTest() {
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
     * Test of getNombre method, of class Asignatura.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Asignatura instance = new Asignatura("profesor","nombre");
        String expResult = "nombre";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class Asignatura.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "nombre";
        Asignatura instance = new Asignatura("profesor","nombre");
        instance.setNombre(nombre);
        assertEquals(nombre,instance.getNombre());
    }

    /**
     * Test of getProfesor method, of class Asignatura.
     */
    @Test
    public void testGetProfesor() {
        System.out.println("getProfesor");
        Asignatura instance = new Asignatura("profesor","nombre");
        String expResult = "profesor";
        String result = instance.getProfesor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProfesor method, of class Asignatura.
     */
    @Test
    public void testSetProfesor() {
        System.out.println("setProfesor");
        String profesor = "profesor";
        Asignatura instance = new Asignatura();
        instance.setProfesor(profesor);
        assertEquals(profesor,instance.getProfesor());
    }

    /**
     * Test of getPlanificacion method, of class Asignatura.
     */
    @Test
    public void testGetPlanificacion() {
        System.out.println("getPlanificacion");
        Asignatura instance = new Asignatura();
        String[] expResult = new String[10];
        String[] result = instance.getPlanificacion();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setPlanificacion method, of class Asignatura.
     */
    @Test
    public void testSetPlanificacion() {
        System.out.println("setPlanificacion");
        String[] planificacion = null;
        Asignatura instance = new Asignatura();
        instance.setPlanificacion(planificacion);
        Assert.assertArrayEquals(planificacion,instance.getPlanificacion());
    }
    
}
