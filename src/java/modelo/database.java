/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

/**
 *
 * @author dsalgado
 */
public class database {
   
  private static Connection cn = null;
    private static String URL = "jdbc:mysql://localhost:3306/iekabd";
    private static String usuario = "root";
    private static String contrasena = "";
   
    public static Connection getConexion() throws SQLException, ClassNotFoundException {
                
         Class.forName("com.mysql.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        cn = DriverManager.getConnection(URL, usuario, contrasena);  
        
        return cn;
    }

}