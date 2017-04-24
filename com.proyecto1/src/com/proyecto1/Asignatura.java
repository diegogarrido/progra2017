package com.proyecto1;

public class Asignatura {

    private String profesor;
    private String nombre;
    private String[] planificacion = new String[10];

    /**
     * Constructor
     * @param profesor
     * @param nombre
     */
    public Asignatura(String profesor, String nombre) {
        this.profesor = profesor;
        this.nombre = nombre;
    }

    public Asignatura() {
    }
    
    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String[] getPlanificacion() {
        return this.planificacion;
    }

    /**
     *
     * @param planificacion
     */
    public void setPlanificacion(String[] planificacion) {
        this.planificacion = planificacion;
    }

}
