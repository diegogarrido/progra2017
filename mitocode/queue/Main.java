/*
 * Autor: Diego Garrido
 */
package queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Zapato> cola = new PriorityQueue();
        cola.offer(new Zapato("Deportivo", 38));
        cola.offer(new Zapato("Casual", 43));
        cola.offer(new Zapato("Casual", 43));
        cola.offer(new Zapato("de Playa", 32));
        cola.offer(new Zapato("Formal", 42));
        
        System.out.println("peek: "+cola.peek());
        
        while(!cola.isEmpty()){
            System.out.println("Borrando "+cola.poll());
        }
        
        
    }
    
}
