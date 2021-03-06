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
        <title>More information</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">
        <link rel="stylesheet" href="resources/muips.css">
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



                    <div class="card shadow" style="height: 550px; width: 60% ">
                        <div class="card-header py-3" >
                             <p class="h4 mb-1 text-center"><strong>Location found</strong></p>
                        </div>
                        <div class="container" style="width: 70%;">
                        <!-- Default form register -->
                        <form  action="UnidentifiedPersonReport" method="post">
      
                            <div class="form-row mb-1" style="margin-top: 30px">
                                <label>County:</label>
                                <select id="inputType" class="form-control" name="county" required="">
                                
                                    <option>Nakuru</option>

                                </select>
                            </div>

                            <label>Constituency:</label>
                            <div class="form-row mb-1" >
                                <select id="inputCon" class="form-control" name="constituency" n required>

                                    <option selected>Nakuru Town West</option>
                                    <option>Subukia</option>
                                    <option>Nakuru Town</option>
                                    <option>Nakuru Town East</option>
                                    <option>Kuresoi North</option>
                                    <option>Kuresoi South</option>
                                    <option>Rongai</option>
                                    <option>Molo</option>
                                </select>
                            </div>

                         

                                <div class="form-row ">
                                    <label>Ward:</label>  
                                    <!-- First name -->
                                    <input type="text" name="ward" style="padding:15px 20px;" id="defaultRegisterFormFirstName" class="form-control"required >
                                </div>

                                <div class="form-row">
                                    <label>Village:</label>
                                    <!-- Last name -->
                                    <input type="text" name="village" id="defaultRegisterFormLastName" pattern="^[A-Za-z]+$" class="form-control"  required>
                                </div>

                            <!-- Distinct Feature-->
                            <div class="custom-control custom-checkbox custom-control-inline mb-1" style="margin-top: 20px; margin-right: 150px">
                                <input type="checkbox" name="distinct" value="dist" class="custom-control-input" id="defaultInline1">
                                <label class="custom-control-label" for="defaultInline1">Has distinct feature e.g tattoo</label>
                            </div>


                            <hr>

                            <input type="text" hidden="true" name="action" value="location">
                            <div class="form-row">

                                <div class="col text-right">
                                    <button class=" btn btn-primary" type="submit" >Finish</button>
                                </div>
                            </div>
                        </form>
                    </div>  
                </div>
                <jsp:include page="Footer.jsp"/>
            </div>
        </div>
        </div>


    </body>
</html>
