/*
 * Autor: Diego Garrido
 */
package LHset;

import java.util.LinkedHashSet;

/**
 *
 * @author Diego
 */
public class LHsetEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedHashSet<Zapato> lista = new LinkedHashSet();
        lista.add(new Zapato("cuero", 42));
        lista.add(new Zapato("cuero", 38));
        lista.add(new Zapato("deportivo", 40));
        lista.add(new Zapato("deportivo", 42));
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.toArray()[i]);
        }
    }
    
}
