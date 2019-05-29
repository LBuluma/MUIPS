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
        <link  rel="stylesheet"  href="resources/muips.css" >
        <script type="text/javascript" src="resources/vendor/jquery/jquery.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
               $("#inputCounty").change(function(){
                   var formData = {
                       'county' : $('#inputCounty').val()
                   };
                   $.ajax({
                       type:"POST",
                       url:"RetriveConstituency",
                       data: formData,
                       dataType:'json',
                       encode: true
                       
                   })
                           .done(function(data){
                              $(output).text(data);
                   });
               });
                

            });
        </script>
       

    </head>

    <body style="height: 650px" >

        <!--Navbar-->
        <nav class="navbar navbar-expand-lg  fixed-top scrolling-navbar " style="background-color: #f0f0f0" >
            <div class="container" style="color: black" >
                <a class="navbar-brand" style="position: fixed; left:  10px" href="#"><strong>MUIPS</strong></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-7" aria-controls="navbarSupportedContent-7" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent-7">
                    <ul class="navbar-nav mr-auto" style=" position: relative; left:  100%">
                        <li class="nav-item active"   >
                            <a class="nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="Login.jsp">Login</a>
                        </li>


                    </ul>
                </div>
            </div>
        </nav>
        <div class="card  p-5" style="margin-top: 100px; width: 55%; height: 600px">
            <!-- Default form register -->
            <form  action="RegisterUser" method="post">

                <p class="h4 mb-1 text-center"><strong>Contact Information</strong></p>
                <hr>
                <!-- E-mail -->
                <label>Email:</label>
                <input type="email" name="email" id="defaultRegisterFormEmail" class="form-control mb-1" required>
                <div  class="text-danger" id="output" ></div>
                <!-- Phone number -->
                <label>Phone number:</label>
                <input type="text"   name="phone" maxlength="10" minlength="10" class="form-control mb-1"  style="margin-bottom:  20px" required>

                <!-- Address -->
                <label>Address:</label>
                <input type="text" name="address" id="defaultRegisterFormEmail" class="form-control mb-1" required>

                <div class="form-row mb-1">

                    <div class="col">

                        <label>County:</label>
                        <select id="inputCounty" class="form-control" name="county" required="">

                            <option selected>Nakuru</option>  
                   
                        </select>
                    </div>

                    <div class="col">
                          <label>Constituency:</label>
                          <select id="inputCon" class="form-control"  name="constituency" required>
                          
                            <option>Nakuru Town West</option>
                            <option selected>Subukia</option>
                            <option>Nakuru Town</option>
                            <option>Nakuru Town East</option>
                            <option>Kuresoi North</option>
                            <option>Kuresoi South</option>
                            <option>Rongai</option>
                            <option>Molo</option>
                        </select>
                    </div>
                </div>
                <div class="form-row mb-1">

                    <div class="col">
                        <!-- First name -->
                            <label>Ward:</label>
                        <input type="text" name="ward" style="padding:15px 20px;" id="defaultRegisterFormFirstName" class="form-control" required >
                    </div>
                    <div class="col">
                        <!-- Last name -->
                         <label>Village:</label>
                        <input type="text" name="village" id="defaultRegisterFormLastName" class="form-control" required>
                    </div>
                </div>
                <hr>
                <div class="form-row ">
                    <input type="text" hidden="true" name="regtype" value="contact">
                    <a href="PublicPersonalInformation.jsp" class=" btn btn-light" >Back</a>
                    <div class=" col text-right"> 
                        <button class=" btn btn-primary " type="submit"  style=" ">Finish</button>
                    </div>
                </div>


            </form>
            <div id="output">
                
            </div>
        </div>   
       
        

    </body>
</html>
