/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.gson;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class JsonGson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per = new Persona("11.111.111-1","JP",18,new Ciudad(45,"Temuco"));
        System.out.println(per.toString());
        Gson gson = new Gson();
        String g = gson.toJson(per);
        System.out.println(g);
        Persona per2 = gson.fromJson(g, Persona.class);
        System.out.println(per2.toString());
        ArrayList<Persona> array = new ArrayList();
        array.add(gson.fromJson(g, Persona.class));
    }
    
}
