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
        <title>Distinct Feature</title>


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



                    <div class="card shadow" style="height: 550px; width: 50%">
                        <div class="card-header py-3" >
                            <p class="h4 mb-1 text-center"><strong>Distinct Feature Information</strong></p>
                        </div>
                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Feature Information</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " id="info-tab" data-toggle="tab" href="#info" role="tab" aria-controls="info" aria-selected="false">Upload photo</a>
                            </li>

                        </ul>
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <div class="container" style="width: 80%; margin-top: 30px">


                                    <!-- Default form report -->
                                    <form  action="UnidentifiedPersonReport" method="post" >             

                                        <!-- Distinct feature type-->
                                        <div class="form-row  mb-1" name="disttype">
                                            <label for="inputType">Type</label>
                                            <select id="inputType" class="form-control">
                                                <option selected disabled>select</option>
                                                <option>Tattoo</option>
                                                <option>Piercing</option>
                                                <option>Scars and marks</option>
                                                <option>Jewelry</option>
                                                <option>Amputation</option>
                                                <option>Clothing</option>
                                                <option>Eye wear</option>
                                                <option>footwear</option>
                                                <option>Accessories</option>                                              
                                                <option>Other</option>

                                            </select>
                                        </div>

                                        <!--Description of the feature-->
                                        <div class="form-row mb-1" >
                                            <label for="inputType">Description</label>
                                            <textarea type="text" class="form-control" id="exampleFormControlTextarea6" name="distd" rows="5" placeholder="Description..."></textarea>
                                        </div>
                                       

                                        <!--<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#uploadModal">
                                             upload photo
                                         </button>-->

                                        <hr>

                                        <!--navigation buttons-->
                                        <input type="text" hidden="true" name="action" value="distinct">
                                        <div class="form-row">
                                            <a href="MissingPersonInfo.jsp" class=" btn btn-info" >Back</a>
                                            <div class="col text-right">
                                                <button class=" btn btn-primary" type="submit">Next</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            <div class="tab-pane fade" id="info" role="tabpanel" aria-labelledby="info-tab">
                                <form id="form" action="FileUpload" method="post" enctype="multipart/form-data">
                                    <div class="row" style=" margin-top: 30px; margin-left: 30px">
                                        <div class="col-4">
                                            <input id="uploadImage" type="file" accept="image/*" name="image" />
                                            <input  type="text"  name="type" value="distinct" hidden />
                                        </div>
                                        <div class="col">
                                            <button type="submit" class="btn btn-primary" >
                                                upload photo
                                            </button>
                                        </div>

                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <jsp:include page="Footer.jsp"/>
                </div>
            </div>

        </div>
                

        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="resources/js/AjaxFileUpload.js"></script>
    </body>
</html>
