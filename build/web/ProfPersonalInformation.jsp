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
      
        <link href="resources/muips.css" rel="stylesheet" >
        <link rel="stylesheet" href="resources/css/mdb.min.css">
      
        <script type="text/javascript" src="resources/vendor/jquery/jquery.min.js"></script>

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
    <body  style="height: 900px" >


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

        <div class="card p-5"  style=" margin-top: 100px; height: 850px; width: 55%" >
            <!-- Default form register -->
            <form  action="RegisterUser" method="post">

                <p class="h4 text-center  mb-1"><strong> Registration</strong></p>
                <hr>

                <div class="form-row mb-1">

                    <div class="col ">
                        <!-- First name -->
                        <label>First name:</label>
                        <input type="text" name="fname" style="padding:15px 20px;" id="defaultRegisterFormFirstName" class="form-control" required >
                    </div>
                    <div class="col">
                        <!-- Last name -->
                        <label>Last name:</label>
                        <input type="text" name="sname" id="defaultRegisterFormLastName" class="form-control"  required>
                    </div>
                </div>
                <!-- E-mail -->
                <label>Employee Id:</label>
                <input type="text" name="id" id="defaultRegisterFormEmail" class="form-control mb-1" required>
                <!-- Password -->
                <!-- E-mail -->
                <label>Email:</label>
                <input type="email" name="email" id="defaultRegisterFormEmail" class="form-control mb-1" required>
                <div  class="text-danger" id="output" ></div>
                <!-- Phone number -->
                <label>Phone number:</label>
                <input type="text"   name="phone" id="defaultRegisterPhonePassword" class="form-control mb-1"  maxlength="10" minlength="10" required>
                
                      <label>Organization:</label>
                   <div class="form-row mb-1" >
                                <select id="inputCon" class="form-control" name="org" required>

                                    <option selected>Kasarani</option>
                                    <option>Bahati</option>
                                    <option>Rhoda</option>
                                    <option>Baraka</option>
                                    <option>Lanet</option>
                                    <option>Central police</option>
                                    <option>Bondeni</option>
                                    <option>CID HQ</option>
                                </select>
                            </div>


                <label>Password:</label>
                <input type="password" name="password" id="defaultRegisterFormPassword1" class="form-control mb-1" pattern="(?=.*\d)(?=.*[a-z]).{8,}" required>
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
                    <input type="text" hidden="true" name="regtype" value="prof" >
                </div>
            </form>
        </div>

       



    </body>
</html>
