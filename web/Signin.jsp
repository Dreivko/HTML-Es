<%-- 
    Document   : Signin
    Created on : 9/04/2017, 08:04:15 PM
    Author     : juanf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layouts/head.jsp" %>
    <body>
        <%@include file="layouts/header.jsp" %>
        <section>
            <div class="signin-form">
                <img src="img/registrate.png">
                <table>
                    <form action="Signin" method="post" >
                        <tr>
                            <td><label for="name">Nombre:</label></td>
                            <td><input type="text" name="name"></td><br>
                        </tr>
                        <tr>
                            <td><label for="name">Nombre de Usuario:</label></td>
                            <td><input type="text" name="username"></td><br>
                        </tr>
                        <tr>
                            <td><label for="name">Email:</label></td>
                            <td><input type="text" name="email"></td><br>
                        </tr>
                        <tr>
                            <td><label for="password">Contraseña:</label></td>
                            <td><input type="password" name="password"></td><br>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Registrarse"></td>
                        </tr>    
                    </form>
            </table>
        </div>
        </section>
        <%@include file="layouts/footer.jsp" %>  
    </body>
        
</html>