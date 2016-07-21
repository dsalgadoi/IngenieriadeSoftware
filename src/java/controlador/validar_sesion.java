/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.querys;

/**
 *
 * @author dsalgado
 */
public class validar_sesion extends HttpServlet {
    Connection con = null;
    String URL = "jdbc:mysql://localhost:3306/iekadb";
    String usuario = "root";
    String contrasena = "";
    int hora, estado;
    String nombre = "";
    String apellido = "";
    
    Calendar calendario = Calendar.getInstance();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String usuario = request.getParameter("user");
        String password = request.getParameter("pass");
        PrintWriter out1 = response.getWriter();
        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("Prueba ingreso");  
            boolean existeUsuario = false;
            
            String consulta = "SELECT * FROM iekabd.usuario where login = '"+usuario+"' and pass = '"+password+"'";
            ResultSet rs = querys.ejecutarSQLSelect(consulta);           
            while(rs.next()){
            
                existeUsuario = true;
               
               nombre = rs.getString("nombre");
               apellido = rs.getString("apellido");
            }
            hora =calendario.get(Calendar.HOUR_OF_DAY);
            if(existeUsuario){
                if (hora <14 || hora >22){
                    response.sendRedirect("inicio_sesion.jsp?msg= El sistema solo estara Disponible entre las 8:00 y las 22:00");
                }else
                response.sendRedirect("Administrador/home_administrador.jsp");
                 
            }else{
                out.println("Nombre de usuario o Contraseña Errada");
                response.sendRedirect("inicio_sesion.jsp?msg=Usuario y/o clave incorrectos "+hora);
               
                
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
            out1.println("Error");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(validar_sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
