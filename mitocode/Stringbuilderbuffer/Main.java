/*
 * Autor: Diego Garrido
 */
package Stringbuilderbuffer;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //StringBuffer sb = new StringBuffer("diego");
        StringBuilder sb = new StringBuilder("diego");
        //sb.append("diego").append(" garrido");
        //System.out.println(sb.toString());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        sb.setLength(0);
        System.out.println(sb.length());
        
        
    }
    
}
