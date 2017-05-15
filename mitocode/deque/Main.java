/*
 * Autor: Diego Garrido
 */
package deque;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque<Zapato> dq = new ArrayDeque();
        dq.add(new Zapato("Deportivo", 38));
        dq.add(new Zapato("Casual", 43));
        dq.add(new Zapato("Casual", 43));
        dq.add(new Zapato("de Playa", 32));
        dq.add(new Zapato("Formal", 42));   
        
        for(int i=0;i<dq.size();i++){
            System.out.println(dq.toArray()[i]);
        }
        System.out.println("---");
        
        System.out.println("peek: "+dq.peek());
        System.out.println("poll: "+dq.poll());
        System.out.println("pop: "+dq.pop());
        
        System.out.println("---");
        dq.addFirst(new Zapato("de Cuero",45));
        dq.addLast(new Zapato("running",39));
        
        for(int i=0;i<dq.size();i++){
            System.out.println(dq.toArray()[i]);
        }
    }
    
}
