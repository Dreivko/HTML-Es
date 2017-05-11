
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="layouts/head.jsp" %>
    <body>
        <%@include file="layouts/header.jsp" %>
        <section class="principal">

            <div id="slider">

                <ul id='sliderul' class="slider-wrapper">
                    <li class="slide-current">
                        <img src="img/fs/fs-1.JPG" alt="slider image 1">
                        <div class="caption">
                            <h3 class="caption-title"> Paso 1: </h3>
                            <p> Registrate </p>
                        </div>
                    </li>

                    <li>
                        <img src="img/fs/fs-2.JPG" alt="slider image 1">
                        <div class="caption">
                            <h3 class="caption-title"> Paso 2: </h3>
                            <p> Llena el Formulario </p>
                        </div>
                    </li>

                    <li>
                        <img src="img/fs/fs-3.JPG" alt="slider image 1">
                        <div class="caption">
                            <h3 class="caption-title"> Paso 3: </h3>
                            <p> Ingresa </p>
                        </div>
                    </li>
                    
                    <li>
                        <img src="img/fs/fs-4.JPG" alt="slider image 1"></a>
                        <div class="caption">
                            <h3 class="caption-title"> Paso 4: </h3>
                            <p> Realiza el Ejercicio </p>
                        </div>
                    </li>
                    
                    <li>
                        <img src="img/fs/fs-5.JPG" alt="slider image 1"></a>
                        <div class="caption">
                            <h3 class="caption-title"> Paso 5: </h3>
                            <p> Acumula Puntos </p>
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