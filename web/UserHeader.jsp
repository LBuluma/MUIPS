<%-- 
    Document   : new
    Created on : Apr 15, 2019, 9:48:58 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">
        <link rel="stylesheet" href="resources/mycss.css" id="bootstrap-css">
        <link rel="stylesheet" href="resources/css/mdb.min.css">

        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>

        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>

        <script type="text/javascript" src="resources/myjs.js"></script>


    </head>
    <body>

        <div id="mySidenav" class="sidenav sidebar1 "   >
            
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            
            <img src="images/image (4).png" width="180px" height="100px" alt="Avatar" style="position: relative;left: 30px">
            <hr>
            
                     
            
            
            <ul class="nav navbar-nav side-nav" style=" margin-right: 50px">
                <li>
                    <a href="RetrieveProfile"><i class="fa fa-fw fa-user-plus"></i>  Profile</a>
                </li>
                <li>
                    <a href="#" data-toggle="collapse" data-target="#submenu-1"><i class="fa fa-fw fa-search"></i> Cases<i class="fa fa-fw fa-angle-down pull-right"></i></a>
                    <ul id="submenu-1" class="collapse">
                        <li><a href="#"><i class="fa fa-angle-double-right"></i> Missing</a></li>
                        <li><a href="#"><i class="fa fa-angle-double-right"></i> Unclaimed</a></li>
                        <li><a href="#"><i class="fa fa-angle-double-right"></i> Unidentified</a></li>
                    </ul>
                </li>
                 
                <li>
                    <a href="#" data-toggle="collapse" data-target="#submenu-2"><i class="fa fa-fw fa-star"></i>  MENU 2 <i class="fa fa-fw fa-angle-down pull-right"></i></a>
                    <ul id="submenu-2" class="collapse">
                        <li><a href="#"><i class="fa fa-angle-double-right"></i> SUBMENU 2.1</a></li>
                        <li><a href="#"><i class="fa fa-angle-double-right"></i> SUBMENU 2.2</a></li>
                        <li><a href="#"><i class="fa fa-angle-double-right"></i> SUBMENU 2.3</a></li>
                    </ul>
                </li>
                
                <li>
                    <a href="Demographics.jsp"><i class="fa fa-fw fa-paper-plane-o"></i> Post</a>
                </li>
                <li>
                    <a href="faq"><i class="fa fa-fw fa fa-question-circle"></i> MENU 5</a>
                </li>
            </ul>
        </div>
        
        <!-- /.navbar-collapse -->



    </div>
    <!--/. Sidebar navigation -->


    <nav class="navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar blue-gradient">
        <div class="float-left">
                <span style="font-size:30px;cursor:pointer" onclick="openNav()" class="button-collapse">&#9776;</span>
            </div>
        <div class="container">
            
            <a class="navbar-brand" style="position: fixed; left:  50px" href="#"><strong>MUIPS</strong></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-7" aria-controls="navbarSupportedContent-7" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent-7">
                <ul class="navbar-nav mr-auto">
                 
                    <li class="nav-item"  style="position: fixed; right:  0;top: 10px">
                        <a href="Home.jsp" class="nav-link"  >Logout</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>


</nav>
</body>
</html>
