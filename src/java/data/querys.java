/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.database;
import java.sql.*;
import static java.sql.DriverManager.println;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dsalgado
 */
public class querys extends database{
    
    

    /** Constructor de clase */
    public querys (){}

    
    public static ResultSet ejecutarSQLSelect(String sql) throws ClassNotFoundException
    {
       ResultSet resultado;
       try {
          Statement sentencia = querys.getConexion().createStatement();
          resultado = sentencia.executeQuery(sql);
       } catch (SQLException ex) {
          ex.printStackTrace();
          return null;
       }

       return resultado;
    }
  
    /**
*
    *Método utilizado para realizar las instrucciones: INSERT, DELETE y UPDATE
    *@param sql Cadena que contiene la instrucción SQL a ejecutar
    *@return estado regresa el estado de la ejecución, true(éxito) o false(error)
    *
    */
    public boolean ejecutarSQL(String sql) throws ClassNotFoundException
    {
       try {
          Statement sentencia = querys.getConexion().createStatement();
          sentencia.executeUpdate(sql);
       } catch (SQLException ex) {
          ex.printStackTrace();
       return false;
       }

       return true;
    }
    public static boolean cargar_Actividad(String hora, String actividad ) throws ClassNotFoundException
    {
       try {
          String sql ="INSERT INTO iekabd.actividad_usuario(descripcion_actividad,horas_laboradas,id_actividad,id_usuario,id_cargo)VALUES('"+actividad+"','"+hora+"','1','2','1');";
          Statement sentencia = querys.getConexion().createStatement();
          sentencia.executeUpdate(sql);
       } catch (SQLException ex) {
          ex.printStackTrace();
          
       return false;
       }

       return true;
    }
}
