/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        /*PaisDAOImpl dao = new PaisDAOImpl();
        for(Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }*/
        
        PaisDAOImpl dao = PaisDAOImpl.getInstancia();
        for(Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
    }
    
}
