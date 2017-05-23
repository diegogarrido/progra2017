/*
 * Autor: Diego Garrido
 */
package catchlineal;

import java.io.IOException;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //String str = "str";
            //int num = Integer.parseInt(str);
            //int div = 2/0;
            Clase clase = new Clase();
        }catch(java.lang.RuntimeException /*| NumberFormatException | java.lang.ArithmeticException */ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
