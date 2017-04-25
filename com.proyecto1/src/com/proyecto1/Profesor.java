package com.proyecto1;

import java.util.ArrayList;

/**
 * Clase Profesor
 * @author Diego
 */
public class Profesor{

    private ArrayList<Asignatura> asignaturas = new ArrayList();
    private ArrayList<String> cursos= new ArrayList();
    private String nombre;

    /**
     * Constructor
     * @param nombre nombre del profesor
     */
    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor sin parámetros
     */
    public Profesor() {
    }

    /**
     * GetNombre
     * @return nombre del profesor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * SetNombre
     * @param nombre nombre del profesor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * GetAsignaturas
     * @return arrayList de tipo asignaturas que imparte el profesor
     */
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    /**
     * SetAsignaturas
     * @param asignaturas arrayList de tipo asignaturas que imparte el profesor
     */
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    /**
     * GetCursos
     * @return Cursos a los que enseña el profesor
     */
    public ArrayList<String> getCursos() {
        return cursos;
    }

    /**
     * SetCursos
     * @param cursos Cursos a los que enseña el profesor
     */
    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

}
