<%-- 
    Document   : Demographics
    Created on : Apr 11, 2019, 5:46:57 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Case Details</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/mdb.min.css">
 
        <link rel="stylesheet" href="muips.css">

        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>
    </head>
    <body style="height: 1050px; " >
        <jsp:include page="UserHeader.jsp">
            <jsp:param name="title" value="Dash"/>
        </jsp:include>

        <div class="container  border border-dark p-5" style="width: 50%;height: 900px; margin-top: 75px">

            <!--Make post form-->
            <form   action="ReportCase" method="get" >
                <p class="h4 mb-4 text-center"><strong>Unidentified Person Details</strong></p>
                <hr>

               

                    <!--first name-->
                    <div class="form-row mb-4">
                        <label for="inputEmail4">First Name:</label>
                        <input type="text" name="fname" class="form-control" id="inputFname"  >
                    </div>
                    <!--second name-->
                    <div class="form-row mb-4">
                        <label for="inputPassword4">Second Name:</label>
                        <input type="text" name="sname" class="form-control" id="inputSname" >
                    </div>
                

                
                    <!--OB-->
                    <div class="form-row mb-4">
                        <label for="inputAddress">Police OB number:</label>
                        <input type="text" name="ob" class="form-control" id="inputAddress" required>
                    </div>
                    <div class=" form-row mb-4">
                        <label for="inputPassword4">Age:</label>
                        <input type="number" name="age" class="form-control" id="inputPassword4" required min="1" max="120" required>
                    </div>

               


                <!--Gender-->
                <div class="form-check form-check-inline mb-4"  >
                    <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male" required>
                    <label class="form-check-label" for="inlineRadio1">Male</label>
                </div>
                <div class="form-check form-check-inline" >
                    <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female" required>
                    <label class="form-check-label" for="inlineRadio2">Female</label>
                </div>  

                <!--Ethnicity-->
                <div class="form-row " style="margin-top: 10px">

                    <div class="form-group col-md-6">
                        <label for="inputEthnicity">Ethnicity:</label>
                        <select id="inputState" class="form-control" name="ethnic">
                            <option selected>Bantu</option>
                            <option>Nilotic</option>
                            <option>Cushitic</option>
                            <option>European</option>
                            <option>Asian</option>
                             <option>Unknown</option>
                            <option>Other</option>

                        </select>
                    </div>

                    <!--Tribe-->
                    <div class="form-group col-md-6">
                        <label for="inputEthnicity">Fluent language:</label>
                        <input type="text" name="language" class="form-control" id="inputZip" >

                    </div>
                </div>

                <!--Physical Description-->
                <div class="form-row mb-4" >
                    <div class="form-group col-md-6" >
                        <label for="inputZip">Height:</label>
                        <input type="number"name="height" class="form-control" id="inputZip" placeholder="ft" min="0.5" max="10" required>
                    </div>
                    <div class="form-group col-md-6" >
                        <label for="inputZip">Weight:</label>
                        <input type="number" name="weight" class="form-control" id="inputZip" placeholder="Kgs" min="1"  max="300"required>
                    </div>
                </div>

                <hr>
                
                <div class="text-right">
                <input type="text" name="action" value="demo" hidden="true">
                <button  class="btn btn-blue " type="submit" >Next</button>
                </div>

            </form>
        </div>


        <jsp:include page="footer.jsp"/>
    </body>
</html>
