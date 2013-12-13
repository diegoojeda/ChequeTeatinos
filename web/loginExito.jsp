<%-- 
    Document   : loginExito
    Created on : 13-dic-2013, 17:07:23
    Author     : diegoojedagarcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login exitoso</title>
    </head>
    <body>
        Hola mundo<br>
        ${login.cli.email}
        <c:out value="${login.cli.email}" />
    </body>
</html>
