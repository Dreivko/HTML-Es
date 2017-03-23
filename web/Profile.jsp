

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
      <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <%@include file="layouts/head.jsp" %>
    <body>
      
        <%@include file="layouts/header.jsp" %>
        <section>
            HTML-Es
            <br>
            <% if (request.getSession(false).getAttribute("name") != null) {%>
                Hello <%= request.getSession(false).getAttribute("name")%>
            <%} else {%>
                La Sesion en Null
            <% };%>
            <br>
            <% if (request.getAttribute("message") != null) {%>
            <%= request.getAttribute("message")%>
            <br>
            <br>
            <br>
            <% };%>
            Example 1:
            <div id="hu">
            <form>
                    Probaremos el tag &#60 H1 &#62:<br>
                    <input type="text" id="tag">
                    <input type="submit" onclick="change_value()" value="run">
                    </form>
                </div>
                 <br><br><br>
                 
                
                 <div id="no" hidden="no">
                     Tag incorrecto
                 </div>
            
        </section>
            <%@include file="layouts/footer.jsp" %>
            
    </body> 
   <script type="text/javascript">

                function change_value(){
                    
                   var a= document.getElementById("tag").value;
                 var expresion = /<h1>/;
                 var hallado = a.match(expresion);
                //console.log(hallado);
                var first= hallado[0];
                //console.log(first);
                var ju= "<h1>";
               if(first===ju){
                      document.getElementById("hu").innerHTML=a;  
                  
        } else{
                  alert($("#no").html());
               
                }
            }
            
                </script>
</html>
 



