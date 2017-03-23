
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layouts/head.jsp" %>
    <body>
        <%@include file="layouts/header.jsp" %>
        
        <div class="login-form">
            <img src="img/login.png">
            <form action="Login" method="post" >
                <div class="form-group">
                    <label for="name">Nombre:</label>
                    <input type="text" name="name"><br>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" name="password"><br>
                </div>
                <input type="submit" value="Entrar">  
            </form>
            <strong>User: Admin</strong>
            <strong>Password: foobarfoo</strong>
        </div>
        
        <%@include file="layouts/footer.jsp" %>  
    </body>
</html>
