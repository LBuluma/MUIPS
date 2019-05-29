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
        <title></title>

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



                    <div class="card p-5" style="height: 650px; width: 55%">
                        <!-- Default form register -->
                        <form  action="UnidentifiedPersonReport" method="post">

                            <p class="h4 text-center mb-1 "><strong>Unidentified Person Information</strong></p>
                            <hr>
                            <div class="form-row mb-1">

                                <div class="form-group col-md-6">
                                    <label>Color:</label>
                                    <select id="inputState" class="form-control" name="pcolor">
                                       
                                        <option>white</option>
                                        <option>Latino</option>
                                        <option>Black</option>
                                        <option>Indian</option>
                                        <option>Chocolate</option>
                                        <option>Asian</option>
                                        <option>Other</option>

                                    </select>
                                </div>
                                <div class="form-group col-md-6">
                                    <label>Hair color:</label>
                                    <select id="inputState" class="form-control" name="hcolor">
                                        <option selected > Black</option>
                                        <option >Brown</option>

                                        <option>Sandy</option>
                                        <option>Gray</option>
                                        <option>Red</option>
                                        <option>Blue</option>
                                        <option>Green</option>
                                        <option>Orange</option>
                                        <option>Purple</option>
                                        <option>Pink</option>
                                        <option>Bald</option>

                                    </select>
                                </div>
                            </div>
                            <div class="form-group mb-1">
                                <label>Eye color:</label>
                                <select id="inputState" class="form-control" name="ecolor">
                                    <option selected > Blue</option>
                                    <option >Black</option>
                                    <option>Blue</option>
                                    <option>Brown</option>
                                    <option>Green</option>
                                    <option>Hazel</option>
                                    <option>Pink</option>
                                    <option>Maroon</option>
                                    <option>Missing</option>


                                </select>
                            </div>

                            <div class="form-group  mb-1">
                                <label> Physical description:</label>
                                <textarea type="text" class="form-control mb-4 " name="pdesc" id="exampleFormControlTextarea6" rows="5" placeholder="Physical description..." required=""></textarea>
                            </div>

                            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm mb-1"><i class=""></i> Upload photo</a>

                            <hr >
                            <input type="text" hidden="true" name="action" value="info">
                            <div class="form-row mb-1">
                                <a href="UnidentifiedPersonDemographics.jsp" class=" btn btn-info"  >Back</a>

                                <div class="col text-right ">
                                    <button class=" btn btn-primary " type="submit" >Next</button>
                                </div>
                            </div>
                        </form>
                    </div>    
                    <jsp:include page="Footer.jsp"/>
                </div>
            </div>
        </div>

    </body>
</html>
