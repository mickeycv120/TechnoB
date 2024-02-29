package com.mickey;

import com.mickey.GUI.Subir;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Establece la conexión con la BD
        String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
        String username = "root"; //Usuario
        String password = "mickeycv"; //Contraseña
        Subir s = new Subir();
      s.setVisible(true);

        try (Connection conn = DriverManager.getConnection(url,username,password);
             Statement  stmt = conn.createStatement();
             ResultSet  resultado = stmt.executeQuery("SELECT * FROM productos")){


            while(resultado.next()) {
                System.out.println("resultado = " + resultado.getString("nombre"));
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
