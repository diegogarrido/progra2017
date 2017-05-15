/*
 * Autor: Diego Garrido
 */
package stack;

import java.util.Stack;

/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Stack<Zapato> pila = new Stack();
        pila.push(new Zapato("Deportivo", 38));
        pila.push(new Zapato("Casual", 43));
        pila.push(new Zapato("Casual", 43));
        pila.push(new Zapato("de Playa", 32));
        pila.push(new Zapato("Formal", 42));
        for(int i=0;i<pila.size();i++){
            System.out.println(pila.get(i));
        }
        System.out.println("peek: "+pila.peek());
        System.out.println("search: "+pila.search(new Zapato("Casual",43)));
        while(!pila.isEmpty()){
            System.out.println("Removiendo "+pila.pop());
        }
    }
    
}
