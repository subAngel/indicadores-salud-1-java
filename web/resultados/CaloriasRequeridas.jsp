<%-- 
    Document   : CaloriasRequeridas
    Created on : 25 mar 2023, 17:04:38
    Author     : Angel Jesus Zorrilla Cuevas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="calculos.IndicadorCaloriasReq"%>
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
            IndicadorCaloriasReq calorias = (IndicadorCaloriasReq) sesion.getAttribute("indicadorCalorias");
            ArrayList<IndicadorCaloriasReq> resultadosCalorias;
            if (sesion.getAttribute("resultadosCalorias") == null) {
                resultadosCalorias = new ArrayList<IndicadorCaloriasReq>();
            } else {
                resultadosCalorias = (ArrayList<IndicadorCaloriasReq>) sesion.getAttribute("resultadosCalorias");
            }
            resultadosCalorias.add(calorias);
            sesion.setAttribute("resultadosCalorias", resultadosCalorias);
        %>
        <h1>Calorias requeridas</h1>
        <table class="resultado">
            <thead>
                <tr>
                    <th colspan="2"><%= calorias.getUsuario().getNombre()%></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Peso</td>
                    <td><%= calorias.getUsuario().getPeso()%></td>
                </tr>
                <tr>
                    <td>Estatura</td>
                    <td><%= calorias.getUsuario().getEstatura()%></td>
                </tr>
                <tr>
                    <td>Calorias Requeridas</td>
                    <td><%= calorias.getCaloriasRequeridas()%></td>
                </tr>
                <tr>
                    <td>Fecha</td>
                    <td><%= calorias.getFecha()%></td>
                </tr>

            </tbody>
        </table>
        <a href="OpcionesIndicadores.jsp">Regresar</a>
        <h2>Historial de Resultados</h2>
        <table class="historial">
            <thead>
            <th>Peso</th>
            <th>Estatura</th>
            <th>Calorias Requeridas</th>
            <th>Fecha</th>
        </thead>
        <tbody>
            <%
                for (IndicadorCaloriasReq r : resultadosCalorias) {
            %>
            <tr>
                <td><%= r.getUsuario().getPeso()%></td>
                <td><%= r.getUsuario().getEstatura()%></td>
                <td><%= String.format("%.3f", r.getCaloriasRequeridas())%></td>
                <td><%= r.getFecha()%></td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>

</body>
</html>
