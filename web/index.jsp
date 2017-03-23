
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layouts/head.jsp" %>
    <body>
        <%@include file="layouts/header.jsp" %>
        <section class="principal">
            <div>
            
            <div class="message">
                <% if(request.getAttribute("message") != null){ %>
                    <%= request.getAttribute("message")%>
                    <% System.out.println("index " + session); %>
                <% }; %>
            </div>
            
        </div>
        </section>
        <%@include file="layouts/footer.jsp" %>
    </body>
</html>
