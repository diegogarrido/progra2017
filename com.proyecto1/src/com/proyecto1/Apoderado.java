package com.proyecto1;

import java.util.*;

/**
 *
 * @author Diego
 */
public class Apoderado{
    
    private ArrayList<String> hijos;
    private String nombre;

    /**
     *
     * @param nombre
     */
    public Apoderado(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public Apoderado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<String> hijos) {
        this.hijos = hijos;
    }

}
