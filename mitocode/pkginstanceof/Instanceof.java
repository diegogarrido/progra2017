/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginstanceof;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Instanceof {

    /**
     * @param args the command line arguments
     */
    static ArrayList canasta = new ArrayList();
    
    public static void main(String[] args) {
        String str = "String";
        if(str instanceof String){
            System.out.println("String");
        }
        Alumno al = new Alumno();
        if(al instanceof Persona){
            System.out.println("Persona");
        }
        if(al instanceof Alumno){
            System.out.println("Alumno");
        }
        System.out.println("Ingresar frutas");
        
        
        Manzana m1= new Manzana("Roja");
        Manzana m2= new Manzana("Verde");
        Naranja n1= new Naranja("Naranja sin pepa");
        Galleta g1= new Galleta("Chocolate");
        
        verificar(m1);
        verificar(m2);
        verificar(n1);
        verificar(g1);
    }
    
    private static void verificar(Object obj){
        if(obj instanceof Fruta){
            canasta.add(obj);
            System.out.println("Añadido "+((Fruta) obj).nombre);
        }else{
            String str=""+obj.getClass();
            str=str.replace("class pkginstanceof.", "");
            System.out.println(str+" No es una fruta");
        
        }
    }
}
