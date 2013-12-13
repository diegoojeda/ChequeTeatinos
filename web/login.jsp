<%-- 
    Document   : home
    Created on : 13-dic-2013, 9:20:12
    Author     : escabia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
    <jsp:attribute name="header">
        <jsp:include page="structpage/header.jsp" />      
    </jsp:attribute>

    <jsp:body>
        <jsp:include page="structpage/aside.jsp" />
        <section>
            <div id="formulario">
                <h2>Login</h2>          
                <form name="formcontacto" action="" method="post">
                  <div class="form_settings">
                    <p><span>Email</span><input class="contact" type="email" name="email" value="" required/></p>
                    <p><span>Contraseña</span><input class="contact" type="password" name="clave" value="" required/></p>
                    <p><input class="submit" type="submit" name="contact_submitted" value="Enviar" /></p>
                  </div>
                </form>                
            </div>
        </section>
    </jsp:body>
</t:genericpage>