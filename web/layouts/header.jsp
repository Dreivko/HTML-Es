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
                <div class="dropdown">
                    <button onclick="dropdown()" class="dropbtn"> Mas </button>
                        <div id="myDropdown" class="dropdown-content">
                            <a href="Profile.jsp" title="Perfil" >
                                Perfil
                            </a>
                            <a href="Logout" title="Salir" >
                                Salir
                            </a>
                        </div>
                </div>
            </li>
            
            <%};%>
        </ul>
    </div>  


</header>
        <script type="text/javascript">
            /* When the user clicks on the button, 
            toggle between hiding and showing the dropdown content */
            function dropdown() {
                document.getElementById("myDropdown").classList.toggle("show");
            }

            // Close the dropdown menu if the user clicks outside of it
            window.onclick = function(event) {
                if (!event.target.matches('.dropbtn')) {
                    var dropdowns = document.getElementsByClassName("dropdown-content");
                    var i;
                    for (i = 0; i < dropdowns.length; i++) {
                        var openDropdown = dropdowns[i];
                        if (openDropdown.classList.contains('show')) {
                            openDropdown.classList.remove('show');
                        }
                    }
                }
            }
        </script>
        