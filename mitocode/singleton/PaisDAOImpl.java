package Singleton;

import java.util.ArrayList;


public class PaisDAOImpl {
    
    private ArrayList paises;
    private static PaisDAOImpl instancia = null;
    
    private PaisDAOImpl(){
        
    }
    
    public ArrayList getPaises(){
        if(paises == null){
            paises = new ArrayList();
            Pais p1 = new Pais("Chile");
            Pais p2 = new Pais("Peru");
            Pais p3 = new Pais("Colombia");
            paises.add(p1);
            paises.add(p2);
            paises.add(p3);
        }
        return paises;
    }
    
    public static PaisDAOImpl getInstancia(){
        if(instancia == null){
            instancia = new PaisDAOImpl();
        }
        return instancia;
    }
}
