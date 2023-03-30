<%-- 
    Document   : Resultados
    Created on : 25 mar 2023, 16:22:09
    Author     : Angel Jesus Zorrilla Cuevas
--%>

<%@page import="adapters.FechaDate"%>
<%@page import="model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="calculos.IndicadorIMC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/resultados.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            IndicadorIMC imc = (IndicadorIMC) sesion.getAttribute("indicadorIMC");

//            ArrayList<IndicadorIMC> resultados = (ArrayList<IndicadorIMC>) session.getAttribute("resultadosIMC");
            ArrayList<IndicadorIMC> resultadosIMC;
            if (session.getAttribute("resultadosIMC") == null) {
                resultadosIMC = new ArrayList<IndicadorIMC>();
            } else {
                resultadosIMC = (ArrayList<IndicadorIMC>) sesion.getAttribute("resultadosIMC");
            }
            resultadosIMC.add(imc);
            sesion.setAttribute("resultadosIMC", resultadosIMC);

// ADAPTER
            FechaDate fecha = new FechaDate(imc.getFecha());
        %>
        <h1>
            Resultados IMC
        </h1>

        <table class="resultado">
            <thead>
                <tr>
                    <th colspan="2"><%= imc.getUsuario().getNombre()%>, <%= imc.getUsuario().getEdad()%> años</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Peso</td>
                    <td><%= imc.getPeso()%> kg</td>
                </tr>
                <tr>
                    <td>Estatura</td>
                    <td><%= imc.getEstatura()%> cm</td>
                </tr>
                <tr>
                    <td>IMC</td>
                    <td><%= imc.getIMC()%> kg/m<sup>2</sup></td>
                </tr>
                <tr>
                    <td>Situacion</td>
                    <td><%= imc.getSituacion()%></td>
                </tr>
                <tr>
                    <td>Fecha</td>
                    <td><%= imc.FormatearFecha(fecha) %></td>
                </tr>
            </tbody>
        </table>

        <a href="OpcionesIndicadores.jsp">Regresar</a>

        <br/>
        <br/>
        <h2>Historial de Resultados</h2>
        <table class="historial">
            <thead>
            <th>Peso</th>
            <th>Estatura</th>
            <th>IMC</th>
            <th>Situacion</th>
            <th>Fecha</th>
        </thead>
        <tbody>
            <%
                for (IndicadorIMC r : resultadosIMC) {
                FechaDate fds = new FechaDate(r.getFecha());
            %>
            <tr>
                <td><%= r.getPeso()%></td>
                <td><%= r.getEstatura()%></td>
                <td><%= String.format("%.3f", r.getIMC())%></td>
                <td><%= r.getSituacion()%></td>
                <td><%= r.FormatearFecha(fds) %></td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>

</body>
</html>
