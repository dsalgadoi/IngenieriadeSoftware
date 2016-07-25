<%-- 
    Document   : home_administrador
    Created on : 21/07/2016, 12:39:26 PM
    Author     : dsalgado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador del Sistema</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

         <link rel="stylesheet" type="text/css" href="../estilos/estilosAdmin.css">
    </head>
   
    <body>
        <div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        <span class="glyphicon glyphicon-bookmark"></span>Modulos Administradorx</h3>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                          <a href="carga_trh.jsp" class="btn btn-primary  btn-lg btn-lg btn-block" role="button" disabled="disabled"><span class="glyphicon glyphicon-list-alt" ></span> <br/>Carga Tabla con relacion horas y costo<br></a>
                          <a href="carga_empleados.jsp" class="btn btn-primary  btn-lg btn-lg btn-block" role="button" disabled="disabled"><span class="glyphicon glyphicon-bookmark"></span> <br/>Carga de empleados</a>
                          <a href="cargar_tipoActividades.jsp" class="btn btn-primary btn-lg btn-lg btn-block"  role="button" disabled="disabled"><span class="glyphicon glyphicon-signal"></span> <br/>Cargar Tipo de Actividades</a>
                          
                        </div>
                        <div class="col-xs-6 col-md-6">
                          <a href="#" class="btn btn-warning btn-lg btn-lg btn-block" role="button" disabled="disabled"><span class="glyphicon glyphicon-file " ></span> <br/>Consultar Tabla con relacion horas y costo</a>
                          <a href="#" class="btn btn-warning  btn-lg btn-lg btn-block" role="button"disabled="disabled"><span class="glyphicon glyphicon-bookmark"></span> <br/>Gestionar Empleados</a>
                          <a href="#" class="btn btn-warning btn-lg btn-lg btn-block"  role="button"disabled="disabled"><span class="glyphicon glyphicon-signal"></span> <br/>Gestionar Tipo de Actividades</a>
                        </div>
                    </div>
                    <a href="reporte_actividades.jsp" class="btn btn-success btn-lg btn-block" role="button"><span class="glyphicon glyphicon-globe"></span>Consultar Reporte de Actividades</a>
                </div>
            </div>
        </div>
    </div>
</div>

    </body>
</html>
