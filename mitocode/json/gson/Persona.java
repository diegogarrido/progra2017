package json.gson;


public class Persona {
    String run;
    String nombre;
    int edad;
    Ciudad ciudad;

    public Persona(String run, String nombre, int edad, Ciudad ciudad) {
        this.run = run;
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" + "run=" + run + ", nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + '}';
    }
}
