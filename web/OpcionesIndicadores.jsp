<%-- 
    Document   : OpcionesIndicadores
    Created on : 24 mar 2023, 23:23:49
    Author     : Angel Jesus Zorrilla Cuevas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/opciones.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Indicadores de Salud</h1>
        <div class="container">

            <div class="form">
                <form action="IndicadorIMC.jsp">
                    <h2>Indice de masa corporal</h2>
                    <p>
                        Para la mayoría de las personas, el IMC es un indicador confiable de 
                        la gordura y se usa para identificar las categorías de 
                        peso que pueden llevar a problemas de salud.
                    </p>
                    <div class="form-action">
                        <input type="submit" value="Calcular IMC" name="imc">
                    </div>
                </form>
            </div>
            <div class="form">
                <form action="IndicadorCalorias.jsp" method="post">
                    <h2>Calorias Requeridas</h2>
                    <p>
                        Calcular cuantas calorias se requieren al dia
                    </p>
                    <div class="form-control">
                       
                    </div>
                    <div class="form-action">
                        <input type="submit" value="Calcular Calorias requeridas" name="calorias">
                    </div>
                </form>
            </div>
            <div class="form">
                <form action="IndicadorICC.jsp">
                    <h2>Indice de Cintura Cadera</h2>
                    <p>
                        El índice de cintura cadera (ICC) es un índice antropométrico que se utiliza para valorar el patrón de distribución de la grasa, así como la grasa intra-abdominal, a través de la relación entre el perímetro de la cintura y la cadera
                    </p>
                    <div class="form-action">
                        <input type="submit" value="Calcular ICC" name="icc">
                    </div>
                </form>
            </div>
        </div>

    </body>
</html>
