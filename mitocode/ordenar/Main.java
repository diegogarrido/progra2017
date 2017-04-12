/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList();
        array.add(50);
        array.add(100);
        array.add(3);
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
        Collections.reverse(array);
        System.out.println(array);

        ArrayList<String> array2 = new ArrayList();
        array2.add("Chile");
        array2.add("Argentina");
        array2.add("Brazil");
        System.out.println(array2);
        Collections.sort(array2);
        System.out.println(array2);
        Collections.reverse(array2);
        System.out.println(array2);

        ArrayList<Persona> array3 = new ArrayList();
        array3.add(new Persona(3, "Nicolas", 24));
        array3.add(new Persona(1, "Jaime", 18));
        array3.add(new Persona(2, "Eddie", 42));
        for(int i = 0;i<array3.size();i++){
            System.out.println(array3.get(i).toString());
        }
        Collections.sort(array3);
        System.out.println("---");
        for(int i = 0;i<array3.size();i++){
            System.out.println(array3.get(i).toString());
        }
        System.out.println("---");
        Collections.sort(array3, (Persona o1, Persona o2) -> {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else if (o1.getId() < o2.getId()) {
                return -1;
            }
            return 0;
        });
        for(int i = 0;i<array3.size();i++){
            System.out.println(array3.get(i).toString());
        }
        System.out.println("---");
        
        ArrayList<Zapato> array4 = new ArrayList();
        array4.add(new Zapato("Formal",42));
        array4.add(new Zapato("Deportivo",38));
        array4.add(new Zapato("Casual",40));
        for(int i = 0;i<array4.size();i++){
            System.out.println(array4.get(i).toString());
        }
        System.out.println("---");
        Collections.sort(array4, new DiseñoComparator());
        for(int i = 0;i<array4.size();i++){
            System.out.println(array4.get(i).toString());
        }
        System.out.println("---");
        //uso Comparable
        Collections.sort(array4);
        for(int i = 0;i<array4.size();i++){
            System.out.println(array4.get(i).toString());
        }
    }
}
