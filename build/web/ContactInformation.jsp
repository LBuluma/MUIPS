<%-- 
    Document   : Registration
    Created on : Apr 4, 2019, 11:03:08 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">
        <link rel="stylesheet" href="resources/css/mdb.min.css">
        <link  rel="stylesheet"  href="muips.css" >
        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>

        <script type="text/javascript" src="resources/myjs.js"></script>


    </head>

    <body class="body1">
        <jsp:include page="Login.jsp">
            <jsp:param name="title" value="Dash"/>
        </jsp:include>
        <!--Navbar-->
        <nav class="navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar blue-gradient-rgba " >
            <div class="container" >
                <a class="navbar-brand" style="position: fixed; left:  0" href="#"><strong>MUIPS</strong></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-7" aria-controls="navbarSupportedContent-7" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent-7">
                    <ul class="navbar-nav mr-auto" style=" position: relative; left:  1000px">
                        <li class="nav-item active"   >
                            <a class="nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">About MUIPS</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="PersonalInformation.jsp">Register</a>
                        </li>

                        <li class="nav-item"  >
                            <a href="" class="nav-link" data-toggle="modal" data-target="#modalLoginForm" >Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container container1 border border-dark p-5" style="width: 50%;height: 600px; margin-top: 75px">
            <!-- Default form register -->
            <form class="text-center" action="RegisterUser" method="post">

                <p class="h4 mb-4"><strong>Contact Information</strong></p>
                <hr>
                <!-- E-mail -->
                <input type="email" name="email" id="defaultRegisterFormEmail" class="form-control mb-4" placeholder="E-mail" required>

                <!-- Phone number -->
                <input type="text"   name="phone" id="defaultRegisterPhonePassword" class="form-control mb-4" placeholder="Phone number" aria-describedby="defaultRegisterFormPhoneHelpBlock" style="margin-bottom:  20px" required>

                <!-- Address -->
                <input type="text" name="address" id="defaultRegisterFormEmail" class="form-control mb-4" placeholder="Address" required>

                <div class="form-row mb-4">

                    <div class="col">


                        <select id="inputCounty" class="form-control">
                            <option selected disabled> County</option>
                            <option>Nakuru</option>                           
                        </select>
                    </div>

                    <div class="col">
                        <select id="inputCon" class="form-control">
                            <option selected disabled>Constituency</option>
                            <option>Nakuru Town West</option>
                            <option>Subukia</option>
                            <option>Nakuru Town</option>
                            <option>Nakuru Town East</option>
                            <option>Kuresoi North</option>
                            <option>Kuresoi South</option>
                            <option>Rongai</option>
                            <option>Molo</option>
                        </select>
                    </div>
                </div>
                <div class="form-row mb-4">

                    <div class="col">
                        <!-- First name -->
                        <input type="text" name="ward" style="padding:15px 20px;" id="defaultRegisterFormFirstName" class="form-control" placeholder="Ward "required >
                    </div>
                    <div class="col">
                        <!-- Last name -->
                        <input type="text" name="village" id="defaultRegisterFormLastName" class="form-control" placeholder="village" required>
                    </div>
                </div>
                <hr>
                <div class="form-row form-inline">
                    <input type="text" hidden="true" name="regtype" value="contact">
                    <a href="PersonalInformation.jsp" class=" btn btn-grey form-inline" >Back</a>
                    
                    <button class=" btn btn-blue form-inline" type="submit"  style=" ">Finish</button>
                  
                </div>


            </form>
        </div>   
        <jsp:include page="footer.jsp"/>
    </body>
</html>
