<%-- 
    Document   : ReadData
    Created on : 22 mar 2023, 08:07:11
    Author     : Angel Jesus Zorrilla Cuevas
--%>

<%@page import="model.TipoActividad"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lectura de datos</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            Usuario user = (Usuario) sesion.getAttribute("usuario");
        %>
        <h1>Datos de <%= user.getNombre()%></h1>

        <div>
            <form action="CrearUsuario">
                <div class="form-control">
                    <label>Peso: </label>
                    <input type="number" name="peso" placeholder="kilogramos">
                </div>
                <div class="form-control">
                    <label for="">Estatura: </label>
                    <input type="number" name="estatura" placeholder="centimetros">
                </div>
                <div class="form-control">
                    <label for="">Cintura: </label>
                    <input type="number" name="cintura" placeholder="centimetros">
                </div>
                <div class="form-control">
                    <label for="">Cadera: </label>
                    <input type="number" name="cadera" placeholder="centimetros">
                </div>
                <div class="form-control">
                    <label for="actividad">Tipo de actividad: </label>
                    <% TipoActividad actividades = new TipoActividad(); %>
                    <select id="actividad" name="actividad">
                        <%
                            for (int i = 0; i < actividades.getActividades().length; i++) {
                        %>
                        <<option value="<%= i%>"><%= actividades.getActividades()[i]%></option>
                        <%
                            }
                        %>
                    </select>
                </div>
                <div class="form-control">
                    <label>Tipo de resultado:</label>
                    <div>
                        <input type="radio" id="indicador" name="tipoIndicador" value="basica">
                        <label>Basica</label>
                        <input type="radio" id="indicador" name="tipoIndicador" value="general">
                        <label>General</label>
                        <input type="radio" id="indicador" name="tipoIndicador" value="detallada">
                        <label>Detallada</label>
                    </div>
                </div>
                <div class="form-control">
                    <input type="submit" value="Ver resultados" name="resultados" />
                </div>
            </form>
        </div>
    </body>
</html>
