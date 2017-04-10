<%-- 
    Document   : Signin
    Created on : 9/04/2017, 08:04:15 PM
    Author     : juanf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%@include file="layouts/header.jsp" %>
        
        <div class="signin-form">
            <form action="Signin method="post" >
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" name="name"><br>
                </div>
                  <div class="form-group">
                    <label for="name">Username:</label>
                    <input type="text" name="username"><br>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" name="password"><br>
                </div>
                  <div class="form-group">
                    <label for="name">Email:</label>
                    <input type="text" name="email"><br>
                </div>
                <input type="submit" value="Entrar">  
            </form>
            
        </div>
        
        <%@include file="layouts/footer.jsp" %>  
    </body>
        
</html>
