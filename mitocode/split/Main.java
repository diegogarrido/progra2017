/*
 * Autor: Diego Garrido
 */
package split;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "diego|garrido|19769295216";
        String[] split = cadena.split("\\|",2);
        
        for(int i=0;i<split.length;i++){
            System.out.println(split[i]);
        }
    }
    
}
