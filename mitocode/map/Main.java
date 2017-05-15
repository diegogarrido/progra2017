/*
 * Autor: Diego Garrido
 */
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Zapato,String> map = new HashMap();
        map.put(new Zapato("Formal", 42),"Formal");
        map.put(new Zapato("Deportivo", 38),"Deportivo");
        map.put(new Zapato("Casual", 43),"Casual");
        map.put(new Zapato("Casual", 43),"Casual");
        map.put(new Zapato("de Playa", 32),"de Playa");
        map.put(new Zapato("de Cuero", 45),"de Cuero");
        
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Zapato key = (Zapato) (it.next());
            System.out.println("Clave: "+key+" ->Valor: "+map.get(key));
        }
        System.out.println("-----");
        for(Entry<Zapato,String> ent : map.entrySet()){
            System.out.println("Clave: "+ent.getKey()+" ->Valor: "+ent.getValue());
        }
    }
    
}
