package Singleton;


public class Conexion {
    private static Conexion instancia = null;
    
    private Conexion(){
        
    }
    
    public static Conexion GetInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
}
