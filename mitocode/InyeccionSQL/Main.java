/*
 * Autor: Diego Garrido
 */
package InyeccionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Diego
 */
public class Main {

    private Connection con = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.conectar();
        //existe deportivo,41
        //no existe Deportivo,43
        boolean res = m.leer(new Zapato("Deportivo OR M=M", 43));
        m.desconectar();
        if (res) {
            System.out.println("Verificación correcta");
        } else {
            System.out.println("Error,Acceso denegado");
        }
    }

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "root", "admin");
            System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error, no conectado");
            System.out.println(ex.getClass());
        }
    }

    public void desconectar() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
    }

    public boolean leer(Zapato z) {
        boolean resp = false;
        try (Statement st = con.createStatement()) {
            String sql = "SELECT * FROM test WHERE diseno=" + z.getDiseño();
            System.out.println("Query: " + sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Talla encontrada");
                resp = true;
            } else {
                System.out.println("No encontrado");
            }
            System.out.println("Consulta exitosa");
        } catch (SQLException ex) {
        }
        return resp;
    }

}
