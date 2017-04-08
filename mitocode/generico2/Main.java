/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generico2;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ArrayList<String> array = new ArrayList();
        array.add("string");
        array.add(10);
        String str = (String) array.get(0);
        String str2 = array.get(0);
        String array2[] = new String[5];
        array2[0]="string";
        array2[1]=2;*/
        Clase<String,Integer,String,Double> clase = new Clase<>("String",10,"String2",0.1);
        clase.mostrar();
        ArrayList<Clase<String,Integer,String,String>> array = new ArrayList();
        array.add(new Clase("Str1",10,"Str2","Str3"));
        for(int i=0;i<array.size();i++){
            array.get(i).mostrar();
        }
    }
    
}
