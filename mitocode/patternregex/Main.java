/*
 * Autor: Diego Garrido
 */
package patternregex;

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
        Pattern p = Pattern.compile("ufromail.cl");
        String correo = "d.garrido@ufromail.cl";
        String[] split = correo.split("@");
        Matcher m = p.matcher(split[1]);
        System.out.println(m.matches());
    }
    
}
