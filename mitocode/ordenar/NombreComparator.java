package ordenar;

import java.util.Comparator;


public class NombreComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Persona per1 = (Persona) o1;
        Persona per2 = (Persona) o2;
        return per1.getNombre().compareTo(per2.getNombre());
    }

}
