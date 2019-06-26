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

                    <div class="card shadow" style="width: 60%;;height: 650px  ">
                        <div class="card-header py-3" >
                            <p class="h4 mb-1 text-center"><strong>Last Known Location</strong></p>
                        </div>


                        <div class="container" style="width: 80%; margin-top: 30px">
                            <!-- Default form register -->
                            <form  action="ReportCase" method="post">


                                <label>Police station of report:</label>
                                <div class="form-row mb-1" >
                                    <select name="org" class="form-control" >
                                        <c:forEach items="${list}" var="org" >

                                            <option value="${org.name}">${org.name}</option>

                                        </c:forEach>
                                    </select>
                                </div>

                                <div class="form-row mb-1" >

                                    <label>County:</label>
                                    <select id="inputType" class="form-control" name="county" required="">

                                        <option>Nakuru</option>

                                    </select>
                                </div>

                                <label>Constituency:</label>
                                <div class="form-row mb-1" >
                                    <select id="inputCon" class="form-control" name="constituency" required>

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

                                <div class="form-row ">
                                    <label>Village:</label>
                                    <!-- Last name -->
                                    <input type="text" name="village" id="defaultRegisterFormLastName" class="form-control mb-1"    required>
                                </div>






                                <!-- Distinct Feature-->
                                <div class="custom-control custom-checkbox custom-control-inline mb-1" style="margin-top: 20px;">
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
                    </div>
                </div>
                <jsp:include page="Footer.jsp"/>

            </div>
    </body>
</html>
