<%-- 
    Document   : IndicadorICC
    Created on : 25 mar 2023, 10:59:12
    Author     : Angel Jesus Zorrilla Cuevas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/formularios.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Indice de Cadera Cintura</h1>
        <div class="form">
            <form action="ServletIndicadorICC">
                    <label for="cintura">Cintura: </label>
                    <input type="number" id="cintura" placeholder="centimetros" name="cintura">
                    <label for="cadera">Cadera: </label>
                    <input type="number" name="cadera" id="estatura" placeholder="cadera">
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
