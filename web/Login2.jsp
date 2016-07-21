<%-- 
    Document   : login
    Created on : 21/07/2016, 09:31:26 AM
    Author     : dsalgado
--%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
 String path = request.getContextPath();
 String basePath = request.getScheme() + "://"
   + request.getServerName() + ":" + request.getServerPort()
   + path + "/";
   
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
  <base href="<%=basePath%>">

  <title>My JSP 'index.jsp' starting page</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <script type="text/javascript">
      
function validar(){
    var form = document.getElementById('formLogin');
    var login = form.login;
    var pass = form.pass;
    alert (form.toString());
    if(login.value != '' && pass.value != ''){
     form.submit(); 
     return true;             
    }
    
    alert('Por favor ingrese usuario o contraseña');
    return false;
   }
</script>
  
  <style type="text/css">
   body{
    font-family: Verdana;       
    padding: 25% 50% 25% 50%;
    border: thin solid #ccc;        
   }
   .login{        
    
   }
   table{
    border: thin solid #ccc; 
   }
   table tr:first-child{
    background-color: blue; 
    color: white; 
    text-align: center;
   } 
  </style>
 </head>

 <body>
  <div class="login">
   <div id="flash">
    <%             
     if(session.getAttribute("login") != null && !session.getAttribute("login").equals("")){
      response.sendRedirect("welcome.jsp");
     }     
    %>
   </div>
   <form id="formLogin" action="check" method="POST">
    <table>
     <tr>
      <td colspan="2">Ingreso</td>
     </tr>
     <tr>
      <td>Login:</td>
      <td><input type="text" name="login" /></td>
     </tr>    
     <tr>
      <td>Password:</td>
      <td><input type="password" name="pass" /></td>
     </tr>
     <tr>
      <td><input type="button" value="Ingresar" onclick="validar();"/></td>
     </tr>        
    </table>
   </form>
  </div>  
 </body>
</html>




/*


	
Data hosted with ? by Pastebin.com - Download Raw - See Original

/**
 *
 * @author sin_querer
 */
package unsch.efpis.Servlet;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import unsch.efpis.ConexionDB.Conexion;
 
public class HolaUsuarioServlet extends HttpServlet {
    Connection con = null;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            boolean existeUsuario = false;
            //Guardamos los datos enviados desde index
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            //Establecemos la conexion
            con = Conexion.getConexion();
            String consulta = "Select * from Usuario where usuario=? && password=?";
            ResultSet rs = null;
            PreparedStatement pst = null;
            pst = con.prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs = pst.executeQuery();
 
            String nombres="";
            String apellidos="";
            while(rs.next()){
                //En caso de existir una coincidencia
                existeUsuario = true;
                //Y reemplazamos los atributos de dicho Usuario
                nombres = rs.getString("nombres");
                apellidos = rs.getString("apellidos");
            }
 
            if(existeUsuario){
                //Para el usuario existente:
                //Reemplazamos atributos que luego obtendremos desde las páginas .jsp
                request.setAttribute("nombres", nombres);
                request.setAttribute("apellidos", apellidos);
                //Mandamos estos atributos a la página bienvenida.jsp
                request.getRequestDispatcher("/bienvenida.jsp").forward(request, response);
            }else{
                //De lo contrario vamos a la página errorLogin.jsp
                request.getRequestDispatcher("/errorLogin.jsp").forward(request, response);
            }
            out.close();
        } catch (SQLException ex) {
        out.println(ex.toString());
        }
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }

    }