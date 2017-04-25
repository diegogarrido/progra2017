package LHset;

import java.util.Objects;


public class Zapato /*implements Comparable<Zapato>*/{
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

    /*@Override
    public int compareTo(Zapato o) {
        return this.talla-o.getTalla();
    }*/

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.diseño);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zapato other = (Zapato) obj;
        if (!Objects.equals(this.diseño, other.diseño)) {
            return false;
        }
        return true;
    }
    
    
}
