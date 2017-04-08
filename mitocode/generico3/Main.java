/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Profesor> lista = new ArrayList();
        lista.add(new Profesor("Prof1"));
        lista.add(new Profesor("Prof2"));
        lista.add(new Profesor("Prof3"));
        listUpperBounded(lista);
        List<Persona> lista2 = new ArrayList();
        lista2.add(new Persona("Per1"));
        lista2.add(new Persona("Per2"));
        lista2.add(new Persona("Per3"));
        listUpperBounded(lista2);
        listLowerBounded(lista2);
        listUnBounded(lista);
    }
    
    public static void listUpperBounded(List<? extends Persona> lista){
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getNombre());
        }
    }
    
    public static void listLowerBounded(List<? super Persona> lista){
        for(int i=0;i<lista.size();i++){
            System.out.println(((Persona)lista.get(i)).getNombre());
        }
    }
    
    public static void listUnBounded(List<?> lista){
        for(int i=0;i<lista.size();i++){
            System.out.println(((Persona)lista.get(i)).getNombre());
        }
    }
}
