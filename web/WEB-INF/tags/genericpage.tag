<%-- 
    Document   : genericpage
    Created on : 13-dic-2013, 10:43:37
    Author     : escabia
--%>

<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<html>
  <body>
      <header>
            <jsp:invoke fragment="header"/>
      </header>
    <div id="body">
      <jsp:doBody/>
    </div>
    <footer>
        <jsp:invoke fragment="footer"/>
    </footer>
  </body>
</html>