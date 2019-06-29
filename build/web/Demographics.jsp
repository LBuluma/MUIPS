<%-- 
    Document   : Demographics
    Created on : Apr 11, 2019, 5:46:57 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Person Information</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/muips.css">





    </head>
    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">


            <!-- End of Sidebar -->
            <jsp:include page="Sidebar.jsp"/>
            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>


                    <!-- End of Topbar -->


                    <div class="card shadow" style="width: 60%;  ">
                        <div class="card-header py-3" >
                            <p class="h4  text-center"><strong>Missing Person Details</strong></p>
                        </div>

                        <div class="container-fluid " style="width: 75%; margin-top: 30px">
                            <c:if test="${requestScope.errOb != null}">
                                <div class="alert alert-warning alert-dismissible fade show text-center" role="alert" style="margin:auto; width: 300px">
                                    <strong>${requestScope.errOb}</strong> 
                                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                            </c:if>
                            <!--Make post form-->
                            <form   action="ReportCase" method="post" >


                                <div class="form-row mb-1">
                                    <label for="inputEmail4">First Name:</label>
                                    <input type="text" name="fname" class="form-control" pattern="^[A-Za-z]+$" id="inputFname"  required >
                                </div>
                                <!--second name-->
                                <div class="form-row mb-1">
                                    <label for="inputPassword4">Second Name:</label>
                                    <input type="text" name="sname" class="form-control"  pattern="^[A-Za-z]+$" id="inputSname" required >
                                </div>
                                <!--OB-->
                                <div class="form-row mb-1">
                                    <label for="inputAddress">Police OB number:</label>
                                    <input type="text" name="ob" class="form-control"  id="inputAddress" required>
                                </div>
                                <div class=" form-row mb-1">
                                    <label for="inputPassword4">Age:</label>
                                    <input type="number" name="age" class="form-control" id="inputPassword4" required min="1" max="120" required>
                                </div>
                                <div class="form-check form-check-inline mb-1"  >
                                    <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male" required>
                                    <label class="form-check-label" for="inlineRadio1">Male</label>
                                </div>
                                <div class="form-check form-check-inline mb-1" >
                                    <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female" required>
                                    <label class="form-check-label" for="inlineRadio2">Female</label>
                                </div>  

                                <!--Ethnicity-->
                                <div class="form-row mb-1 " >

                                    <div class="form-group col-md-6">
                                        <label for="inputEthnicity">Ethnicity:</label>
                                        <select id="inputState" class="form-control" name="ethnic" required>
                                            <option selected>Maasai</option>
                                            <option>Kikiyu</option>
                                            <option>Luo</option>
                                            <option>European</option>
                                            <option>Asian</option>
                                            <option>Borana</option>
                                            <option>Turkana</option>
                                            <option>Luhya</option>
                                            <option>Meru</option>
                                            <option>Embu</option>
                                            <option>Other</option>

                                        </select>
                                    </div>

                                    <!--Tribe-->
                                    <div class="form-group col-md-6">
                                        <label for="inputEthnicity">Fluent language:</label>
                                        <input type="text" name="language" class="form-control" pattern="^[A-Za-z]+$" id="inputZip" required >

                                    </div>
                                </div>

                                <!--Physical Description-->
                                <div class="form-row mb-1" >
                                    <div class="form-group col-md-6" >
                                        <label for="inputZip">Height:</label>
                                        <input type="number"name="height" class="form-control" id="inputZip" min="1" max="12" placeholder="ft"  required>
                                    </div>
                                    <div class="form-group col-md-6" >
                                        <label for="inputZip">Weight:</label>
                                        <input type="number" name="weight" class="form-control" id="inputZip" placeholder="Kgs" min="1"  max="300"required>
                                    </div>
                                </div>

                                <hr>

                                <div class="text-right mb-1">
                                    <input type="text" name="action" value="demo" hidden="true">
                                    <button  class="btn btn-primary" type="submit" >Next</button>
                                </div>

                            </form>
                        </div>
                    </div>
                    <br>
                    <br>
                    <jsp:include page="Footer.jsp"/>
                </div>
            </div>

        </div>




    </body>
</html>
