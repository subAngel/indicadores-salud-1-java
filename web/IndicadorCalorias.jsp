<%-- 
    Document   : CalcularCalorias
    Created on : 25 mar 2023, 10:58:40
    Author     : Angel Jesus Zorrilla Cuevas
--%>

<%@page import="model.TipoActividad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/formularios.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calcular las calorias requeridas</h1>
        <div class="form">
            <form action="ServletIndicadorCalorias">
                <label for="peso">Peso: </label>
                <input type="number" id="peso" placeholder="kilogramos" name="peso">
                <label for="estatura">Estatura: </label>
                <input type="number" name="estatura" id="estatura" placeholder="centimetros">
                <label for="actividad">Actividad: </label>
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
                <label>Metodo:</label>
                <select name="metodo">
                    <option value="bh">Brian Haycock</option>
                    <option value="hb">Harris Genedict</option>
                    <option value="cs">Chris Shugart</option>
                </select>

                <button>
                    Calcular kilocalorias
                </button>
            </form>
        </div>
        <a class="btn-regresar" href="OpcionesIndicadores.jsp">
            <span>Regresar</span>
        </a>

    </body>
</html>
