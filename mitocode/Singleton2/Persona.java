package Singleton2;


public class Persona {
    private String nombre;
    private int edad;
    private String ciudad;
    
    private static boolean instanciado=false;
    private static Persona personaInstancia;

    public static Persona getPersona() {
        if(!Persona.instanciado){
            personaInstancia=new Persona();
            Persona.instanciado=true;
        }
        return Persona.personaInstancia;
    }

    private Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + '}';
    }
    
}
