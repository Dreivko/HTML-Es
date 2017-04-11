
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layouts/head.jsp" %>
    <body>
        <%@include file="layouts/header.jsp" %>
        <section>
            <div class="login-form">
                <img src="img/login.png">
                <table>
                    <form action="Login" method="post" >
                        <tr>
                            <td><label for="name">Nombre:</label></td>
                            <td><input type="text" name="name"></td><br>
                        </tr>
                        <tr>
                            <td><label for="password">Contraseña:</label></td>
                            <td><input type="password" name="password"></td><br>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="Entrar"></td>
                        </tr>    
                    </form>
                </table>
            </div>
        </section>
        <%@include file="layouts/footer.jsp" %>  
    </body>
</html>
