<!DOCTYPE html>
<html>
    <head>
        <title>Acceso a IEKA Soft</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="estilos/estilos.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

    </head>
    <body>
         <div class = "container">
            <div class="wrapper">
                <form method="post" action="validar_sesion" class="form-signin">   
                <h3 class="form-signin-heading">Sistema de Informacion IEKA</h3>
                <hr class="colorgraph"><br>
                Nombre de Usuario :<input type="text" name="user" class="form-control" required="" /><br/><br/>
                Contraseña :<input type="password" name="pass" class="form-control" required=""/><br/><br/>
                <input type="submit" value="Login"  class="btn btn-lg btn-primary btn-block" />
                <br><b><a style="color:red"><%= request.getParameter("msg")!=null?request.getParameter("msg"):""%></a></b>
                </form>
            </div>
             
        </div>
        
    </body>
</html>