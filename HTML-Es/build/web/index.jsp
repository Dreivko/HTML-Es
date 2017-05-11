
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layouts/head.jsp" %>
    <body>
        <%@include file="layouts/header.jsp" %>
        <section class="principal">
            <div>

                <div class="message">
                    <% if (request.getAttribute("message") != null) {%>
                    <%= request.getAttribute("message")%>
                    <% System.out.println("index " + session); %>
                    <% };%>
                </div>

            </div>
                
           <div id="slider">
            
            <ul id='sliderul' class="slider-wrapper">
                <li class="slide-current">
                    <a href="firstSteps.jsp"><img src="img/superhero_shirt_2.jpg" alt="slider image 1"></a>
                    <div class="caption">
                        <h3 class="caption-title"> 1 </h3>
                        <p> Primeros Pasos </p>
                    </div>
                </li>
                
                <li>
                    <a href="#"><img src="img/html5-features.jpg" alt="slider image 1"></a>
                    <div class="caption">
                        <h3 class="caption-title"> 2 </h3>
                        <p> Usos </p>
                    </div>
                </li>
                
                <li>
                    <a href="#"><img src="img/html5.jpg" alt="slider image 1"></a>
                    <div class="caption">
                        <h3 class="caption-title"> 3 </h3>
                        <p> Actualidad </p>
                    </div>
                </li>
                
                <li>
                    <a href="#"><img src="img/html5_wallpaper_1680x1050.png" alt="slider image 1"></a>
                    <div class="caption">
                        <h3 class="caption-title"> 4 </h3>
                        <p> Futuro </p>
                    </div>
                </li>
            </ul>
            
               <div class="shadow">
                   
               </div>
            <!--Slider control-->
            <ul id="slider-controls" class="slider-controls">
                <li class="active"></li>
                <li></li>
                <li></li>
                <li></li>
            </ul>
            
        </div>     
           
        </section>
        <%@include file="layouts/footer.jsp" %>
    </body>
</html>

<script src="js/slider.js">
    
</script>