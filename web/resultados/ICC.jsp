<%-- 
    Document   : ICC
    Created on : 25 mar 2023, 17:52:30
    Author     : Angel Jesus Zorrilla Cuevas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="calculos.IndicadorICC"%>
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
            IndicadorICC icc = (IndicadorICC) sesion.getAttribute("indicadorICC");

            ArrayList<IndicadorICC> resultadosICC;
            if (sesion.getAttribute("resultadosICC") == null) {
                resultadosICC = new ArrayList<IndicadorICC>();
            } else {
                resultadosICC = (ArrayList<IndicadorICC>) sesion.getAttribute("resultadosICC");
            }
            resultadosICC.add(icc);
            sesion.setAttribute("resultadosICC", resultadosICC);
        %>
        <h1>Indice Cadera Cintura</h1>
        <table class="resultado">
            <thead>
                <tr>
                    <th colspan="2"><%= icc.getUsuario().getNombre()%></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Cintura</td>
                    <td><%= icc.getCintura()%></td>
                </tr>
                <tr>
                    <td>Cadera</td>
                    <td><%= icc.getCadera()%></td>
                </tr>
                <tr>
                    <td>Indice</td>
                    <td><%= icc.getICC()%></td>
                </tr>
                <tr>
                    <td>Riesgo</td>
                    <td><%= icc.getRiesgo()%></td>
                </tr>
                <tr>
                    <td>Fecha</td>
                    <td><%= icc.getFecha()%></td>
                </tr>
            </tbody>
        </table>
        <a href="OpcionesIndicadores.jsp">Regresar</a>

        <h2>Historial de Resultados</h2>
        <table class="historial">
            <thead>
            <th>Cintura</th>
            <th>Cadera</th>
            <th>Indice</th>
            <th>Riesgo</th>
            <th>Fecha</th>
        </thead>
        <tbody>
            <%
                for (IndicadorICC r : resultadosICC) {
            %>
            <tr>
                <td><%= r.getCintura()%></td>
                <td><%= r.getCadera()%></td>
                <td><%= String.format("%.3f", r.getICC())%></td>
                <td><%= r.getRiesgo()%></td>
                <td><%= r.getFecha()%></td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>

</body>
</html>
