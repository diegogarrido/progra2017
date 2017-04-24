package com.proyecto1;

/**
 * Proyecto 1 programación avanzada 2017 1er semestre Gestión de colegio básico
 */
import com.userInterface.Cursos;
import java.io.FileNotFoundException;
/**
 * @version 0.0.1
 * @author Diego Garrido
 */
public class ComProyecto1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        Cursos cur = new Cursos();
        cur.setVisible(true);
    }

}
