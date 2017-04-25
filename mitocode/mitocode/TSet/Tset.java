/*
 * Autor: Diego Garrido
 */
package TSet;

import java.util.TreeSet;


/**
 *
 * @author Diego
 */
public class Tset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Persona> lista = new TreeSet();
        lista.add(new Persona(1,"persona 1",30));
        lista.add(new Persona(1,"persona 2",30));
        lista.add(new Persona(1,"persona 2",22));
        lista.add(new Persona(1,"persona 3",30));
        lista.add(new Persona(1,"persona 4",21));
        lista.add(new Persona(1,"persona 1",22));
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.toArray()[i]);
        }
    }
    
}
