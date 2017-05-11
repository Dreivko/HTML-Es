
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layouts/head.jsp" %>
    <body>
        <%@include file="layouts/header.jsp" %>
        <section>
            <div class="container">
                <img src="img/person.png">
                <table>
                    <form action="Login" method="post" >
                        <tr>
                            <td><label></label></td>
                            <td><input type="text" name="name" placeholder="Ingresa Nombre"></td><br>
                        </tr>
                        <tr>
                            <td><label></label></td>
                            <td><input type="password" name="password" placeholder="Ingresa Password"></td><br>
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
