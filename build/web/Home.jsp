<%-- 
    Document   : Home
    Created on : Apr 4, 2019, 7:03:26 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MUIPS</title>
        <link rel="stylesheet" href="resources/css/bootstrap.min.css">

        <link rel="stylesheet" href="resources/css/mdb.min.css">
       
   </head>
   <body >
        <jsp:include page="Login.jsp">
            <jsp:param name="title" value="Dash"/>
        </jsp:include>
        <header>
            <!--Navbar-->
            <nav class="navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar" style=" width: 100%">
                <div class="container">
                    <a class="navbar-brand" style="position: relative; right: 530px" href="#"><strong>MUIPS</strong></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-7" aria-controls="navbarSupportedContent-7" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent-7">
                        <ul class="navbar-nav mr-auto" style="position: relative; left: 800px">
                            <li class="nav-item active">
                                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">About MUIPS</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="PersonalInformation.jsp">Register</a>
                            </li>
                        
                            <li class="nav-item">
                            <a href="" class="nav-link" data-toggle="modal" data-target="#modalLoginForm" >Login</a>
                        </li>
                            </ul>
                        
                        
                    </div>
                </div>
            </nav>
            <!--Carousel Wrapper-->
            <div id="carousel-example-2" class="carousel slide carousel-fade " data-ride="carousel">
                <!--Indicators-->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-2" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-2" data-slide-to="1"></li>
                    <li data-target="#carousel-example-2" data-slide-to="2"></li>
                </ol>
                <!--/.Indicators-->
                <!--Slides-->
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <div class="view">
                            <img class="d-block w-100" src="images/m1.jpg"  style="height: 650px" alt="First slide">
                            <div class="mask rgba-black-light"></div>
                        </div>
                        <div class="carousel-caption">

                            <p class="h3-responsive">"Hope is being able to see that there is light
                                despite all of the darkness."   - Desmond Tutu</p>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <!--Mask color-->
                        <div class="view">
                            <img class="d-block w-100" src="images/m5.jpg" style="height: 650px" alt="Second slide">
                            <div class="mask rgba-black-strong"></div>
                        </div>
                        <div class="carousel-caption">
                            <p class="h3-responsive">"No matter the number of times you fail you must be determined to succeed. 
                                You must not lose hope. Don’t stop in your storm. Don’t give up so easily."   -Tony Narams</p>

                        </div>
                    </div>
                    <div class="carousel-item">
                        <!--Mask color-->
                        <div class="view">
                            <img class="d-block w-100" src="images/image.adapt.480.low.kenya_icc_elizabeth_njeri.jpg"  style="height: 650px"alt="Third slide">
                            <div class="mask rgba-black-slight"></div>
                        </div>
                        <div class="carousel-caption">

                            <p class="h3-responsive">"Be prepared, work hard, and hope for a little luck. Recognize that the harder you work and the better 
                                prepared you are, the more luck you might have." -    Ed Bradley</p>
                        </div>
                    </div>
                </div>
                <!--/.Slides-->
                <!--Controls-->
                <a class="carousel-control-prev" href="#carousel-example-2" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carousel-example-2" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
                <!--/.Controls-->
            </div>
            <!--/.Carousel Wrapper-->
        </header>
            <!-- Main navigation -->
            <!--Main Layout-->
            <main>
                <div class="container" style="size: 100%">
                    <!--Grid row-->
                    <div class="row py-5">
                        <!--Grid column-->
                        <div class="col-md-12 text-center">
                            <p style="font-family: sans-serif; font-size: 20px;font-style: italic">"To be without hope is like
                                being without goals, what are you working towards?" </p>
                            <p><strong>Catherine Pulsife</strong></p>
                        </div>
                        <!--Grid column-->
                    </div>
                    <!--Grid row-->
                </div>
            </main>
            <!--Main Layout-->



    </body>
    <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="resources/js/popper.min.js"></script>
    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="resources/js/mdb.min.js"></script>


</html>
