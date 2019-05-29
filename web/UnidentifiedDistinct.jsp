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



                    <div class="card p-5" style="height: 550px; width: 55%">

                        <p class="h4 mb-1 text-center"><strong>Distinct Feature Information</strong></p>

                        <!-- Default form report -->
                        <form  action="UnidentifiedPersonReport" method="post" >             
                            <hr >
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

                            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm mb-1"><i class=""></i> Upload photo</a>


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
                <jsp:include page="Footer.jsp"/>
            </div>
        </div>

    </div>

</body>
</html>
