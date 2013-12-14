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
            Home
            <c:forEach var="oferta" items="${ofertas.ofertas}">
                ${oferta.nombreOferta}
            </c:forEach>
        </section>
    </jsp:body>
</t:genericpage>