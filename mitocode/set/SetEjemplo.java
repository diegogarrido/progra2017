/*
 * Autor: Diego Garrido
 */
package set;

import java.util.HashSet;

/**
 *
 * @author Diego
 */
public class SetEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Zapato> lista = new HashSet();
        lista.add(new Zapato("cuero",42));
        lista.add(new Zapato("cuero",38));
        lista.add(new Zapato("deportivo",40));
        lista.add(new Zapato("deportivo",42));
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.toArray()[i]);
        }
    }
    
}
