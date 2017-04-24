package com.proyecto1;

import java.util.*;

public class Curso {

    private Alumno[] alumnos = new Alumno[30];
    private Integer nivel;
    private char letra;
    private ArrayList<String> profesores;
    private Asignatura[] asignaturas = new Asignatura[5];

    public Curso(Integer nivel, char letra) {
        this.nivel = nivel;
        this.letra = letra;
        this.profesores = new ArrayList();
    }

    public Curso() {
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<String> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<String> profesores) {
        this.profesores = profesores;
    }
    
    public Integer getNivel() {
        return this.nivel;
    }

    /**
     *
     * @param nivel
     */
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public char getLetra() {
        return this.letra;
    }

    /**
     *
     * @param letra
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

}
