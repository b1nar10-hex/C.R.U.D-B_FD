/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class ConexionBD {
    
    /*Se realiza la conexion correspondiente
      a la base de datos para importar la conexion
      en las clases que se requiera.
    */
    
    private static String uri = "jdbc:mysql://localhost:3307/biblioteca_fd";
    private static String user = "root";
    private static String pass = "xz26ml27";
    private static Connection conn = null;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            if(conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(uri,user,pass);
            }
            
            return conn;
            
        }
        catch(Exception e) {
                System.err.println("Excepcion en ConexionBD.getConexion: " + e);
                return null;
        }       
    }
}//fin class
