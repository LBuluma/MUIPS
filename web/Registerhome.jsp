<%-- 
    Document   : Registerhome
    Created on : May 14, 2019, 2:59:03 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">
        <link rel="stylesheet" href="resources/css/mdb.min.css" id="bootstrap-css">
       

    </head>
    <body >
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
        <div class="container border border-light " style="border-radius:  1.5em; height: 650px; 
             width: 50%; margin-top: 100px; background-color: white">
            <div class="h2-responsive text-center " style="margin-top: 20px"><strong> User Registration</strong></div>
            <hr>
            <div style="margin-left: 30px; margin-top: 30px">
            <p> Select your user type:</p>
            <!-- Default unchecked -->
            <form action="RegisterUser" method="post">
            <div class="custom-control custom-radio">
                <input type="radio" name="usrtype"  value="public" class="custom-control-input" id="defaultUnchecked" name="defaultExampleRadios" required>
                <label class="custom-control-label  mb-4" for="defaultUnchecked">Public user</label>
            </div>

            <!-- Default checked -->
            <div class="custom-control custom-radio">
                <input type="radio"  name="usrtype" class="custom-control-input" id="defaultChecked" name="defaultExampleRadios" checked required>
                <label class="custom-control-label  mb-4"  value="Professional" for="defaultChecked">Professional user</label>
            </div>
          
            <p><strong>Public user:</strong>  This users include the victims' family members, victim's guardian, 
                victim's friend, and other members of the public who are over 18 years of age. Registering as a Public User 
                allows one access to enter new missing person cases or contribute relevant information to MUIPS feedback on posts, 
                which will be vetted with the investigating agency prior to publication in the system, 
                as well as provides the user with permission to view and search non-sensitive information in MUIPS.</p>
            
            <br>
            
            <p><strong>Professional users:</strong> include law enforcement officers, medical examiners,
                coroners, and other allied professionals. 
                Professional User registration requires clearance from the administrator, and once vetted,
                the user will be granted  permissions within the MUIPS system, as appropriate; to access secure
                information, manage agency cases.</p>
            <input  type="text" value="type" name="regtype" hidden>
            <input class="btn-blue btn-block form-control" type="submit" value="Start Registration">
            </form>
            </div>

        </div>
      
    </body>
   
</html>
