package TSet;

public class Zapato implements Comparable<Zapato>{
    private String diseño;
    private int talla;

    public Zapato(String diseño, int talla) {
        this.diseño = diseño;
        this.talla = talla;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Zapato{" + "dise\u00f1o=" + diseño + ", talla=" + talla + '}';
    }

    @Override
    public int compareTo(Zapato o) {
        return this.talla-o.getTalla();
    }
    
}
