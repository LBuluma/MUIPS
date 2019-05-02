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
        <link href="mycss.css" rel="stylesheet" >
        <link href="muips.css" rel="stylesheet" >
        <link rel="stylesheet" href="resources/css/mdb.min.css">
        <link rel="stylesheet" href="resources/css/mdb.lite.min.css">
        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>

    </head>
    <body   class="body1">

        <jsp:include page="Login.jsp">
            <jsp:param name="title" value="Dash"/>
        </jsp:include>

        <!--Navbar-->
        <nav class="navbar navbar-expand-lg navbar-dark fixed-top scrolling-navbar blue-gradient-rgba " >
            <div class="container" >
                <a class="navbar-brand" style="position: relative; right: 70px" href="#"><strong>MUIPS</strong></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-7" aria-controls="navbarSupportedContent-7" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent-7">
                    <ul class="navbar-nav mr-auto" style="position: relative; left: 800px">
                        <li class="nav-item active">
                            <a class="nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
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


        <div class="container container1 border border-dark p-5" style="width: 50%;height: 530px; margin-top: 75px">
            <!-- Default form register -->
            <form class="text-center " action="RegisterUser" method="post">

                <p class="h4 mb-4"><strong>Personal Information</strong></p>
                <hr>

                <div class="form-row mb-4">

                    <div class="col">
                        <!-- First name -->
                        <input type="text" name="fname" style="padding:15px 20px;" id="defaultRegisterFormFirstName" class="form-control" placeholder="First name"required >
                    </div>
                    <div class="col">
                        <!-- Last name -->
                        <input type="text" name="sname" id="defaultRegisterFormLastName" class="form-control" placeholder="Last name" required>
                    </div>
                </div>
                <!-- E-mail -->
                <input type="text" name="id" id="defaultRegisterFormEmail" class="form-control mb-4" placeholder="Passport/ National ID" required>
                <!-- Password -->
                <input type="password" name="password" id="defaultRegisterFormPassword" class="form-control" placeholder="Password" aria-describedby="defaultRegisterFormPasswordHelpBlock" required>
                <small id="defaultRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4"  pattern="(?=.*\d)(?=.*[a-z]).{8,}" style="color: blue">
                    <strong> At least 8 characters and 1 digit</strong>
                </small>
                <input type="password"  name="cpassword" id="defaultRegisterFormPassword" class="form-control" placeholder=" Confirm Password" aria-describedby="defaultRegisterFormPasswordHelpBlock" required>
                <hr>
                <!-- Sign up button -->
                <button class=" btn btn-blue " type="submit" style="margin-top: 30px;position:relative; left: 200px;">Next</button>
                <input type="text" hidden="true" name="regtype" value="personal" >
            </form>
        </div> 

        <jsp:include page="footer.jsp"/>
    </body>
</html>
