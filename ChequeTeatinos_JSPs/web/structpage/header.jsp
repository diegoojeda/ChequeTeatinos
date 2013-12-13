<%-- 
    Document   : header
    Created on : 13-dic-2013, 9:24:26
    Author     : escabia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div id="logo">
        <div id="logo_text" class="logo_text bordenegro">
             <h1 class="mismalinea"><a href="#" id="logomalaga">Cheque<span class="logo_colour">Teatinos</span></a></h1>
             <img id="next" class="mismalinea nextprev" src="resources/media/images/next.png" alt="Siguiente" onclick="$.backstretch('next')"/>
             <img id="playpause" class="mismalinea playpause" src="resources/media/images/pause.png" alt="Play Pause" onclick="play()"/>
             <img id="prev" class="mismalinea nextprev" src="resources/media/images/prev.png" alt="Anterior" onclick="$.backstretch('prev')"/>

            <h2>Ofertas de establecimientos de Teatinos (Málaga).</h2>

        </div>         
    </div> 
    <nav>
        <ul id="menu">
            <li id="liinicio"><a href="home.jsp" id="inicio"><img id='home' src='http://www.u-phonik.com/images/res-img/home.png' alt='Inicio'/></a><br></li>
            <li id="lialojamiento"><a href="hotels.jsp" id="alojamiento">Alojamiento</a></li>
            <li id="liocio"><a href="#" id="ocio">Ocio</a></li>
            <li id="lirestaurantes"><a href="#" id="restaurantes">Restaurantes</a></li>
        </ul>
        <div class="loginaccount">
            <a href="login.jsp"><p>Login</p></a>
        </div>
    </nav>
</header>