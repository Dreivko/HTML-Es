
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layouts/head.jsp" %>
    <body>
        <%@include file="layouts/header.jsp" %>
        <section>
            <div>
            HTML-Es
            <br>
            <br>
            <br>
            <div>
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
