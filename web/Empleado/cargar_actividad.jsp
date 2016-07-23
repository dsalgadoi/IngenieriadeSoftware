<%-- 
    Document   : cargar_actividad
    Created on : 23/07/2016, 10:29:01 AM
    Author     : dsalgado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
<link href="../css/fileinput.css" media="all" rel="stylesheet" type="text/css" />

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="../js/fileinput.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form class="form-horizontal" role="form" action = "../registrar_actividad">
  <div class="form-group">
    <label class="control-label col-sm-2" type="text">Actividad</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="actividad" placeholder="]Ingrese la actividad realizada">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Cantidad Horas</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="horas" placeholder="Ingrese la cantidad de horas">
    </div>
  </div>
  <div class="form-group">
    
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Enviar</button>
    </div>
  </div>
</form>
    </body>
</html>
