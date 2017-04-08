package generico2;


public class Clase<K,T,E,V> {
    private K objetoK;
    private T objetoT;
    private E objetoE;
    private V objetoV;
    

    public Clase(K objetoK,T objetoT,E objetoE,V objetoV) {
        this.objetoK = objetoK;
        this.objetoT = objetoT;
        this.objetoE = objetoE;
        this.objetoV = objetoV;
    }
    
    public void mostrar(){
        System.out.println("K es un: "+objetoK.getClass().getName());
        System.out.println("T es un: "+objetoT.getClass().getName());
        System.out.println("E es un: "+objetoE.getClass().getName());
        System.out.println("V es un: "+objetoV.getClass().getName());
    }
}
