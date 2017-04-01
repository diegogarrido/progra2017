/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        Clase<Integer> c = new Clase<Integer>(10);
        c.mostrarTipo();
        HashMap<String,Integer> map = new HashMap();
        map.put("string", 12342);
        System.out.println(map.values()+" "+map.get("string"));
    }
    
}
