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
            <% if (request.getAttribute("message") != null) {%>
            <%= request.getAttribute("message")%>
            <br>
            <br>
            <br>
            <% };%>
            <div class="containersign">
                   <img src="img/register.png">
               
                <table>
                    <form action="Signin" method="post" >
                        <tr>
                          <td><label></label></td>
                            <td><input type="text" name="name" placeholder="Nombre"></td><br>
                        </tr>
                        <tr>
                         <td><label></label></td>
                            <td><input type="text" name="username"placeholder="Nombre de Usuario"></td><br>
                        </tr>
                        <tr>
                          <td><label></label></td>
                            <td><input type="text" name="email"placeholder="Correo Electronico"></td><br>
                        </tr>
                        <tr>
                          <td><label></label></td>
                            <td><input type="password" name="password"placeholder="Constraseña"></td><br>
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