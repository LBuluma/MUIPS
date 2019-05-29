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
            <jsp:include page="Sidebar.jsp"/>
            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column" style="background-color: white"> 

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>


                    <div class="card  p-5"style="height: 600px; width: 60%" >
                        <!-- Default form register -->
                        <form  action="ReportCase" method="post">
                            <p class="h4 mb-1 text-center"><strong>Last Known Location</strong></p>
                            <hr>   

                            <div class="form-row mb-1" style="margin-top: 30px">
                                <label>County:</label>
                                <select id="inputType" class="form-control" name="county" required="">
                                  
                                    <option>Nakuru</option>

                                </select>
                            </div>

                            <label>Constituency:</label>
                            <div class="form-row mb-1" >
                                <select id="inputCon" class="form-control" required>

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

                            <div class="form-row mb-1">

                                <div class="col-6 ">
                                    <label>Ward:</label>  
                                    <!-- First name -->
                                    <input type="text" name="ward" style="padding:15px 20px;" id="defaultRegisterFormFirstName" class="form-control"required >
                                </div>

                                <div class="col-6 ">
                                    <label>Village:</label>
                                    <!-- Last name -->
                                    <input type="text" name="village" id="defaultRegisterFormLastName" class="form-control mb-1"    required>
                                </div>

                            </div> 
                            <label>Investigation agency:</label>
                            <input type="text" name="org" style="padding:15px 20px;" id="defaultRegisterFormFirstName" class="form-control mb-1" required >




                            <!-- Distinct Feature-->
                            <div class="custom-control custom-checkbox custom-control-inline mb-1" style="margin-top: 20px; margin-right: 150px">
                                <input type="checkbox" name="distinct" value="dist" class="custom-control-input" id="defaultInline1">
                                <label class="custom-control-label" for="defaultInline1">Had distinct feature e.g tattoo</label>
                            </div>

                            <!-- Default inline 2-->
                            <div class="custom-control custom-checkbox custom-control-inline">
                                <input type="checkbox" name="transp" value="trans" class="custom-control-input" id="defaultInline2">
                                <label class="custom-control-label" for="defaultInline2">Had transportation e.g bike</label>
                            </div>
                            <hr>

                            <input type="text" hidden="true" name="action" value="location">
                            <div class="form-row">

                                <a href="MissingPersonInfo.jsp" class=" btn btn-info"  >Back</a>
                                <div class="col text-right">
                                    <button class=" btn btn-primary" type="submit" >Next</button>
                                </div>
                            </div>
                        </form>
                    </div>   
                    <jsp:include page="Footer.jsp"/>
                </div>
            </div>
    </body>
</html>
