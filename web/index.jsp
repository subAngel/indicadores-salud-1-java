<%-- 
    Document   : index
    Created on : 21 mar 2023, 23:34:43
    Author     : Angel Jesus Zorrilla Cuevas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingrese sus datos para registrar un usuario</h1>
        <div>
            <form action="CrearUsuario" method="post">
                <div class="form-control">
                    <label>Nombre Completo: </label>
                    <input type="text" name="fullname" placeholder="Nombre completo">
                </div>
                <div class="form-control">
                    <label for="">Nombre de usuario: </label>
                    <input type="text" name="username" placeholder="Nombre de usuario" >
                </div>
                <div class="form-control">
                    <label>Contraseña: </label>
                    <input type="password" name="password" placeholder="Contraseña">
                </div>
                <div class="form-control">
                    <label>Sexo: </label>
                    <input type="radio" id="sexo" name="sexo" value="H">
                    <label for="sexo">Hombre</label>
                    <input type="radio" id="sexo" name="sexo" value="M">
                    <label for="sexo">Mujer</label>
                </div>
                <div class="form-control">
                    <label>Fecha de nacimiento: </label>
                    <input type="date" name="fechanac">
                </div>
                <div class="form-control">
                    <input type="submit" value="Registrar" name="submit">
                </div>
            </form>
        </div>
    </body>

</html>
