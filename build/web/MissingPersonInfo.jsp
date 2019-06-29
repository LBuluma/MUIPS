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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css">

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
                    <div class="card shadow" style="width: 60%;  ">
                        <div class="card-header py-3" >
                            <p class="h4 mb-1 text-center"><strong>Missing Person Information</strong></p>
                        </div>
                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Person Information</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " id="info-tab" data-toggle="tab" href="#info" role="tab" aria-controls="info" aria-selected="false">Upload photo</a>
                            </li>

                        </ul>
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">

                                <div class="container" style="width: 80%; height: 600px; margin-top: 30px">

                                    <form  action="ReportCase" method="post">



                                        

                                        <label>Date of last contact:</label>
                                        <input type="text" id="datepicker" name="lastContact" class="form-control mb-1" required="">


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

                                            <div class="col text-right ">
                                                <button class=" btn btn-primary" type="submit" >Next</button>
                                            </div>
                                            <input type="text" hidden="true" name="action" value="info">
                                        </div>


                                    </form>



                                </div>
                            </div>

                            <div class="tab-pane fade" id="info" role="tabpanel" aria-labelledby="info-tab">
                                <div class="container border " style="width: 60%; margin-top: 50px; height: 100px"> 
                                <form id="form1" action="FileUpload" method="post" enctype="multipart/form-data">
                                    <div class="row" style=" margin-top: 30px; margin-left: 5px">
                                        <div class="col-7">
                                            <input id="uploadImage" type="file" accept="image/*" name="image" required/>
                                            <input  type="text"  name="type" value="missing" hidden />
                                        </div>
                                        <div class="col">
                                            <button type="submit" class="btn btn-primary" >
                                                upload 
                                            </button>
                                        </div>

                                    </div>
                                </form>
                            </div>
                            </div>
                        </div>




                    </div>
                    <jsp:include page="Footer.jsp"/>
                </div>
            </div>
        </div>

                
        <script type="text/javascript" src="resources/js/AjaxFileUpload.js"></script>
        <script type="text/javascript">
            $(function () {
                $("#datepicker").datepicker({maxDate: "D", dateFormat: "dd-mm-yy"});

            });
        </script>

    </body>
</html>
