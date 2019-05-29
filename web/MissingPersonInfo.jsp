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
        <title> Person Information</title>
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="resources/muips.css" rel="stylesheet">

    </head>
    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">


            <!-- End of Sidebar -->
            <jsp:include page="Sidebar.jsp"/>
            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column"  style="background-color: white">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>


                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="card p-5" style="height: 750px" >



                        <form  action="ReportCase" method="post">

                            <p class="h4 mb-1 text-center"><strong>Missing Person Information</strong></p>
                            <hr>
                            <!-- E-mail -->
                            <label>Huduma Number:</label>
                            <input type="text" name="pid" id="defaultRegisterFormEmail" class="form-control mb-1" required>

                            <label>Date of last contact:</label>

                            <input type="date" name="lastContact" id="defaultRegisterFormEmail" class="form-control mb-1" placeholder="Date of Last Contact" required>

                            <div class="form-row mb-1" style="margin-top: 10px">

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

                                        <option >Brown</option>
                                        <option>Black</option>
                                        <option>Sandy</option>
                                        <option>Gray/partially gray</option>
                                        <option>Red/Auburn</option>
                                        <option>Blue</option>
                                        <option>Green</option>
                                        <option>Orange</option>
                                        <option>Purple</option>
                                        <option>Pink</option>
                                        <option>Completely bald</option>

                                    </select>
                                </div>
                            </div>
                            <div class="form-group mb-1">
                                <label>Eye color:</label>
                                <select id="inputState" class="form-control" name="ecolor">

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
                            <label>Description:</label>
                            <div class="form-group  mb-1">

                                <textarea type="text" class="form-control " name="pdesc" id="exampleFormControlTextarea6" rows="5" placeholder="Physical description..." required=""></textarea>
                            </div>
                          




                            <hr>
                            <div class="form-row mb-1">
                                <a href="Demographics.jsp" class=" btn btn-info"  >Back</a>

                                <div class="col text-right ">
                                    <button class=" btn btn-primary" type="submit" >Next</button>
                                </div>
                                <input type="text" hidden="true" name="action" value="info">
                            </div>


                        </form>
                          <form id="form" action="FileUpload" method="post" enctype="multipart/form-data">

                                <input id="uploadImage" type="file" accept="image/*" name="image" />
                                <input  type="text"  name="type" value="missing" hidden />
                                <input class="btn btn-success" type="submit" value="Upload" id="btn">
                            </form>


                    </div>    
                    <jsp:include page="Footer.jsp"/>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="resources/js/AjaxFileUpload.js"></script>

    </body>
</html>
