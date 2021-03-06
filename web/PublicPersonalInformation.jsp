<%-- 
    Document   : Registration
    Created on : Apr 4, 2019, 11:03:08 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">

        <link rel="stylesheet" href="resources/muips.css">
        <script type="javascript/text" src="resources/vendor/jquery/jquery.min.js"></script>
         <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>


        <script type="text/javascript">
            $(document).ready(function () {
                $("#defaultRegisterFormPassword").blur(function () {
                    var pass = $("#defaultRegisterFormPassword1").val();
                    var cpass = $("#defaultRegisterFormPassword").val();
                    if (cpass !== pass) {
                        $("#passOut").text("Confirm password should match password field");
                    }
                });

            });
        </script>

    </head>
    <body style="height: 600px"  >


        <!--Navbar-->
        <nav class="navbar navbar-expand-lg fixed-top scrolling-navbar  " style="background-color: whitesmoke;height: 70px" >
            <div class="container"  >
                <a class="navbar-brand" style="position: absolute; left:  10px; top: 20px" href="#"><strong>MUIPS</strong></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-7" aria-controls="navbarSupportedContent-7" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent-7">
                    <ul class="navbar-nav mr-auto" style=" position: absolute; right: 10px; top: 20px">


                        <li class="nav-item"  >
                            <a href="Login.jsp" class="nav-link"  >Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>


        <div class="card p-5" style="margin-top: 100px; height: 700px; width: 55%">
            <!-- Default form register -->
            <form  action="RegisterUser" method="post">

                <p class="h4 text-center  mb-1"><strong>Personal Information</strong></p>
                <hr>
                <c:if test="${requestScope.usrMsg != null}">
                    <div class="alert alert-warning alert-dismissible fade show text-center" role="alert" style="margin:auto; width: 300px">
                        <strong>${requestScope.usrMsg}</strong> 
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                </c:if>
                <div class="form-row mb-1">

                    <div class="col ">
                        <!-- First name -->
                        <label>First name:</label>
                        <input type="text" name="fname" style="padding:15px 20px;" id="defaultRegisterFormFirstName" pattern="^[A-Za-z]+$" class="form-control" required >
                    </div>
                    <div class="col">
                        <!-- Last name -->
                        <label>Last name:</label>
                        <input type="text" name="sname" id="defaultRegisterFormLastName" pattern="^[A-Za-z]+$" class="form-control"  required>
                    </div>
                </div>
                <label>Email:</label>
                <input type="email" name="email" id="defaultRegisterFormEmail" class="form-control mb-1" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required>
                <div  class="text-danger" id="output" ></div>
                <!-- Phone number -->
                <label>Phone number:</label>
                <input type="text"   name="phone" maxlength="10" minlength="10" class="form-control mb-1" pattern="^07\d{8}$"   style="margin-bottom:  20px" required>
                <!-- E-mail -->
                <label>ID number:</label>
                <input type="text" name="id" id="defaultRegisterFormEmail" class="form-control mb-1" required>
                <!-- Password -->
                <label>Password</label>
                <input type="password" name="password" id="defaultRegisterFormPassword1" class="form-control mb-1" pattern="(?=.*\d)(?=.*[a-z]).{8,}" aria-describedby="defaultRegisterFormPasswordHelpBlock" required>
                <small id="defaultRegisterFormPasswordHelpBlock" class="form-text text-muted mb-1"  style="color: blue">
                    <strong> At least 8 characters and 1 digit</strong>
                </small>
                <label>Confirm Password:</label>
                <input type="password"  name="cpassword" id="defaultRegisterFormPassword" class="form-control mb-1"  aria-describedby="defaultRegisterFormPasswordHelpBlock" required>
                <p class="text-danger" id="passOut"></p>
                <hr >
                <!-- Sign up button -->
                <div class="form-row text-right">
                    <button class=" btn btn-primary " type="submit">Sign up</button>
                    <input type="text" hidden="true" name="regtype" value="personal" >
                </div>
            </form>
        </div>





    </body>
</html>
