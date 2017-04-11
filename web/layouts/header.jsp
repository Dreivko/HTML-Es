<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header>
    <div>
            HTML-Es LOGO
    </div>
    <div class="login">
        <ul>
            <li>
                <a href="index.jsp" > 
                    Pagina Principal
                </a>
            </li>
            <% if (request.getSession(false).getAttribute("name") == null) {%>
            <li>
                <a href="Login.jsp" title="Iniciar_Sesion" >
                    Iniciar Sesion 
                </a>
            </li>
            <li>
                <a href="Signin.jsp" title="Registrarse" >
                    Registrarse 
                </a>
            </li>
            <%} else if (request.getSession(false) != null) {%>
            <li>
                <a href="Profile.jsp" title="Perfil" >
                    Perfil
                </a>
            </li>

            <li>
                <a href="Logout" title="Salir" >
                    Salir
                </a>
            </li>
            <%};%>
        </ul>
    </div>  


</header>
