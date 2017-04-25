/*
 * Autor: Diego Garrido
 */
package TSet;

import java.util.TreeSet;

/**
 *
 * @author Diego
 */
public class TsetEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Zapato> lista = new TreeSet();
        lista.add(new Zapato("cuero", 42));
        lista.add(new Zapato("cuero", 38));
        lista.add(new Zapato("deportivo", 40));
        lista.add(new Zapato("deportivo", 42));
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.toArray()[i]);
        }
    }

}
