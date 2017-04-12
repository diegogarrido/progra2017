package ordenar;

import java.util.Comparator;


public class DiseñoComparator implements Comparator<Zapato>{

    @Override
    public int compare(Zapato o1, Zapato o2) {
        return o1.getDiseño().compareTo(o2.getDiseño());
    }

    
}
