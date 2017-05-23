/*
 * Autor: Diego Garrido
 */
package matcherregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String correo = "d.garrido04@ufromail.cl d.garrido04@ufromail.cl d.garrido04@ufromail.cl";
        
        boolean pa = Pattern.compile(".*@ufromail.cl", Pattern.CASE_INSENSITIVE).matcher(correo).matches();
        
        System.out.println(pa+"\n");
        
        Pattern p = Pattern.compile("@ufromail.cl", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(correo);
        System.out.println("lookingAt "+m.lookingAt());
        
        int cont = 0;
        while(m.find()){
            cont++;
            System.out.println("Encontrado "+cont+" veces start "+m.start()+" end "+m.end());
        }
    }
    
}
