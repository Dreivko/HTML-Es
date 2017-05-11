

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
                Bienvenido, <%= request.getSession(false).getAttribute("name")%>
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
            
            <div id="myProgress">
                <div id="myBar">0%</div>
            </div>
            
            <br>
            Ejercicio 1:
            <div id="h1">
                <form>
                    Probaremos el tag &#60 H1 &#62:<br>
                    <input type="text" id="tag">
                    <input type="submit" onclick="change_value()" value="run">
                </form>
            </div>
                 <br><br><br>
            
                
            
            
        </section>
            <%@include file="layouts/footer.jsp" %>
            
    </body> 
   <script type="text/javascript">

                function change_value(){
                    
                    var tag = document.getElementById("tag").value;
                    var expresion = /<h1>/;
                    var hallado = tag.match(expresion);
                    console.log(hallado);
                    if (hallado === 0 || hallado === null){
                        alert("Tag Incorrecto");
                    }else{
                        var first = hallado[0];
                        console.log(first);
                        var ju = "<h1>";
                        if(first === ju){
                            document.getElementById("h1").innerHTML = tag + "Bien Hecho !";  
                        }
                        /*Progress Bar*/
                        var elem = document.getElementById("myBar"); 
                        var width = 1;
                        var id = setInterval(frame, 10);
                        function frame() {
                            if (width >= 100) {
                                clearInterval(id);
                            } else {
                                width++; 
                                elem.style.width = width + '%'; 
                                elem.innerHTML = width * 1 + '%';
                            }
                        }
                    }
                }
                
                function move() {
                    
                }
                
                
   
    </script>
</html>
 

