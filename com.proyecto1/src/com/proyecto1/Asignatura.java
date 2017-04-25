package com.proyecto1;

/**
 * Clase Asignatura
 * @author Diego
 */
public class Asignatura {

    private String profesor;
    private String nombre;
    private String[] planificacion = new String[10];

    /**
     * Constructor
     * @param profesor Nombre del Profesor que la imparte
     * @param nombre Nombre de la asignatura
     */
    public Asignatura(String profesor, String nombre) {
        this.profesor = profesor;
        this.nombre = nombre;
    }

    /**
     * Constructor sin parámetros
     */
    public Asignatura() {
    }
    
    /**
     * GetNombre
     * @return Nombre de la asignatura
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * SetNombre
     * @param nombre Nombre de la asignatura
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** 
     * GetProfesor
     * @return Nombre del profesor que la imparte
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * SetProfesor
     * @param profesor Nombre del profesor que la imparte
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    /**
     * GetPlanificacion
     * @return array de strings con la planificación de la asignatura 
     * en el formato (nombre de la actividad,booleano true si es una nota para el promedio false si no,fecha de la actividad)
     * ej: ("Prueba 1,true,25/04/2017)
     */
    public String[] getPlanificacion() {
        return this.planificacion;
    }

    /**
     * SetPlanificacion
     * @param planificacion array de strings con la planificación de la asignatura 
     * en el formato (nombre de la actividad,booleano true si es una nota para el promedio false si no,fecha de la actividad)
     * ej: ("Prueba 1,true,25/04/2017)
     */
    public void setPlanificacion(String[] planificacion) {
        this.planificacion = planificacion;
    }

}
