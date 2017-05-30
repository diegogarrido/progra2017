/*
 * Autor: Diego Garrido
 */
package CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        m.registrar(new Zapato("deportivo",35));
        m.desconectar();
    }

    public void registrar(Zapato z) {
        try {
            String sql="{call test('"+z.getDiseño()+"','"+z.getTalla()+"')}";
            CallableStatement cs = con.prepareCall(sql);
            cs.execute();
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    
    public void bacthPrepared(PreparedStatements.Zapato z) {
        try {
            con.setAutoCommit(false);
            for (int i = 0; i < 10; i++) {
                String sql = "UPDATE test SET diseno='" + z.getDiseño() + "',talla='" + z.getTalla() + "'";
                PreparedStatement st = con.prepareStatement(sql);
                System.out.println("Query: " + sql);
                int filas = st.executeUpdate(sql);
                System.out.println("filas afectadas: " + filas);
            }

            con.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PreparedStatements.Main.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    public void batch(PreparedStatements.Zapato z) {
        try {
            con.setAutoCommit(false);

            Statement st = con.createStatement();
            for (int i = 0; i < 10; i++) {
                String sql = "UPDATE test SET diseno='" + z.getDiseño() + "',talla='" + z.getTalla() + "'";
                System.out.println("Query: " + sql);
                int filas = st.executeUpdate(sql);
                System.out.println("filas afectadas: " + filas);
            }
            con.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(PreparedStatements.Main.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

    public boolean leer(PreparedStatements.Zapato z) {
        boolean res = false;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT * FROM test WHERE diseno='" + z.getDiseño() + "' and talla='" + z.getTalla() + "'";
            System.out.println("Query: " + sql);
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            if (rs.next()) {
                System.out.println("Existen datos");
                res = true;
            } else {
                System.out.println("No existen datos");
            }
            System.out.println("Consulta exitosa");
        } catch (SQLException ex) {
            System.out.println("Error");
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(PreparedStatements.Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return res;
    }
}
