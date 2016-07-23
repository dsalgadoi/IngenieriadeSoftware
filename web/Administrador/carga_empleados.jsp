<%-- 
    Document   : cargar_tipoActividades
    Created on : 21/07/2016, 04:34:12 PM
    Author     : dsalgado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8"/>
<title>Cargar Empleados</title>

<link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
<link href="../css/fileinput.css" media="all" rel="stylesheet" type="text/css" />

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="../js/fileinput.min.js" type="text/javascript"></script>

</head>


<body>
<div class="container">
<h1>Seleccione el archivo a Cargar</h1>
<form enctype="multipart/form-data">
<div class="form-group">
<input id="file-1" type="file" class="file" multiple=true data-preview-file-type="any">
</div>
<div class="form-group">
    
<form action = "carga_archivo_empleados" method = "post">
<input class="btn btn-primary" type="submit" value="Cargar Empleados" />

<button class="btn btn-default" type="reset">Reset</button>
</div>
</form>
</div>
</body>

<script>
$("#file-3").fileinput({
showCaption: false,
browseClass: "btn btn-primary btn-lg",
fileType: "any"
});
</script>

&nbsp;

</html>