<%-- 
    Document   : IndicadorIMC
    Created on : 25 mar 2023, 10:46:10
    Author     : Angel Jesus Zorrilla Cuevas
--%>

<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/formularios.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            Usuario usuario = (Usuario)sesion.getAttribute("usuario");
        %>
        <h1>Indice de Masa Corporal</h1>
        <div class="form">
            <form action="ServletIndicadorIMC">
                    <label for="peso">Peso: </label>
                    <input type="number" id="peso" placeholder="kilogramos" name="peso" value="<%= usuario.getPeso() %>">
                    <label for="estatura">Estatura: </label>
                    <input type="number" name="estatura" id="estatura" placeholder="centimetros" value="<%= usuario.getEstatura()%>">
                    <button>
                        Calcular
                    </button>
                </div>
            </form>
        </div>
        <a class="btn-regresar" href="OpcionesIndicadores.jsp">
            <span>Regresar</span>
        </a>
    </body>
</html>
