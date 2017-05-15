/*
 * Autor: Diego Garrido
 */
package Singleton2;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per = Persona.getPersona();
        per.setEdad(24);
        per.setCiudad("Temuco");
        per.setNombre("Juanito");
        
        System.out.println(per);
        
        Persona per2 = Persona.getPersona();
        
        System.out.println(per2);
    }
    
}
