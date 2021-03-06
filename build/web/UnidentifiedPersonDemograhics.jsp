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
        <title>Post Unidentified person</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">
        <link rel="stylesheet" href="resources/muips.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css">
    </head>

    <body id="page-top">
        <!-- Page Wrapper -->
        <div id="wrapper">
            <!-- End of Sidebar -->
            <jsp:include page="ProfSidenav.jsp"/>
            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>

                    <!-- End of Topbar -->



                    <div class="card shadow " style="height: 820px; width: 60%">
                        <div class="card-header py-3" >
                            <p class="h4 mb-1 text-center"><strong>Demographics</strong></p>
                            
                        </div>
                        <div class="container" style="width: 70%">
                            <c:if test="${requestScope.oberr != null}">
                                <div class="alert alert-warning alert-dismissible fade show text-center" role="alert" style="margin:auto; width: 300px">
                                    <strong>${requestScope.oberr}</strong> 
                                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                            </c:if>

                            <!--Make post form-->
                            <form   action="UnidentifiedPersonReport" method="post" >


                                <!--first name-->
                                <div class="form-row mb-1" style="margin-top: 30px">
                                    <label for="inputEmail4">First Name:</label>
                                    <input type="text" name="fname" class="form-control" pattern="^[A-Za-z]+$" id="inputFname" required >
                                </div>
                                <!--second name-->
                                <div class="form-row mb-1">
                                    <label for="inputPassword4">Second Name:</label>
                                    <input type="text" name="sname" class="form-control" pattern="^[A-Za-z]+$" id="inputSname" required >
                                </div>
                                <div class="form-row mb-1">
                                    <label>Date found:</label>
                                    <input type="text" id="datepicker" name="dateFound" class="form-control" required="">

                                    <!--OB-->
                                </div>
                                <div class="form-row mb-1">
                                    <label for="inputAddress">Police OB number:</label>
                                    <input type="text" name="ob" class="form-control" id="inputAddress" required>
                                </div>
                                <div class=" form-row mb-1">
                                    <label for="inputPassword4">Age :</label>
                                    <input type="number" name="age" class="form-control" id="inputPassword4"  required>
                                </div>
                                <!--Gender-->
                                <div class="form-check form-check-inline mb-1"  >
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
                                        <input type="text" name="language" class="form-control" pattern="^[A-Za-z]+$" id="inputZip" required>

                                    </div>
                                </div>

                                <!--Physical Description-->
                                <div class="form-row mb-" >
                                    <div class="form-group col-md-6" >
                                        <label for="inputZip2">Height:</label>
                                        <input type="number"name="height" class="form-control" id="inputZip" placeholder="ft" min="1" max="10" required>
                                    </div>
                                    <div class="form-group col-md-6" >
                                        <label for="inputZip">Weight:</label>
                                        <input type="number" name="weight" class="form-control" id="inputZip" placeholder="Kgs" min="1"  max="300"required>
                                    </div>
                                </div>


                                <hr>

                                <div class="text-right">
                                    <input type="text" name="action" value="demo" hidden="true">
                                    <button  class="btn btn-primary  " type="submit" >Next</button>
                                </div>

                            </form>
                        </div>
                    </div>
                    <jsp:include page="Footer.jsp"/>
                </div>
            </div>
        </div>


        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script type="text/javascript">
            $(function () {
                $("#datepicker").datepicker({minDate: "-365", maxDate: "D", dateFormat: "dd-mm-yy"});

            });
        </script>

    </body>
</html>
