package com.proyecto1;

import java.util.*;

/**
 * Clase curso contenedora de todas las otras clases
 * @author Diego
 */
public class Curso {

    private Alumno[] alumnos = new Alumno[30];
    private Integer nivel;
    private char letra;
    private ArrayList<String> profesores = new ArrayList();;
    private Asignatura[] asignaturas = new Asignatura[5];

    /**
     * Constructor
     * @param nivel int del nivel (1 a 8)
     * @param letra letra del curso(A o B)
     */
    public Curso(Integer nivel, char letra) {
        this.nivel = nivel;
        this.letra = letra;
    }

    /**
     * Constructor sin parámetros
     */
    public Curso() {
    }

    /**
     * GetAsignaturas
     * @return Array de asignaturas del curso
     */
    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    /**
     * SetAsignaturas
     * @param asignaturas Array de asignaturas del curso
     */
    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    /**
     * GetAlumnos
     * @return array de los alumnos del curso
     */
    public Alumno[] getAlumnos() {
        return alumnos;
    }

    /**
     * SetAlumnos
     * @param alumnos array de los alumnos del curso
     */
    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * GetProfesores
     * @return Arraylist de los nombres de los profesores
     */
    public ArrayList<String> getProfesores() {
        return profesores;
    }

    /**
     * SetProfesores
     * @param profesores Arraylist de los nombres de los profesores
     */
    public void setProfesores(ArrayList<String> profesores) {
        this.profesores = profesores;
    }
    
    /**
     * GetNivel
     * @return int del nivel del curso (1 a 8)
     */
    public Integer getNivel() {
        return this.nivel;
    }

    /**
     * SetNivel
     * @param nivel int del nivel del curso (1 a 8)
     */
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    /**
     * GetLetra
     * @return letra del curso (A o B)
     */
    public char getLetra() {
        return this.letra;
    }

    /**
     * SetLetra
     * @param letra letra del curso (A o B)
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

}
