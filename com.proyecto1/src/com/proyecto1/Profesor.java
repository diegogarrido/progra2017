package com.proyecto1;

import java.util.ArrayList;

public class Profesor{

    private ArrayList<Asignatura> asignaturas;
    private ArrayList<String> cursos;
    private String nombre;

    /**
     *
     * @param nombre
     */
    public Profesor(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList();
        this.cursos = new ArrayList();
    }

    public Profesor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

}
