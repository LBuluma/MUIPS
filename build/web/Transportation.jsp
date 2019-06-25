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
        <title>Transportation</title>

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
                    <div class="card shadow" style=" height: 750px; width: 60% " >
                           <div class="card-header py-3" >
                                 <p class="h4 mb-1 text-center" ><strong>Transportation Information</strong></p>
                            </div>
                        <div class="container" style="width: 70%; margin-top: 30px">
                        <!-- Default form register -->
                        <form  action="ReportCase" method="post">

                          
                       
                            <div class="form-row mb-1">
                            
                                    <label>Type</label>
                                    <select id="inputaTransType" class="form-control" name="transtype">
                                        <option selected disabled>select</option>

                                        <option>Bicycle</option>
                                        <option>Motorbike</option>
                                        <option>Scooter</option>
                                        <option>Vehicle</option>
                                        <option>Other</option>

                                    </select>
                                </div>
                          
                            <div class="form-row mb-1">
                                    <label>Color:</label>
                                    <select id="inputTransColor" class="form-control" name="transcolor">
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
                                    </select>
                                </div>

                            

                            
                            <div class="form-row mb-1">
                                <label>Model:</label>
                                <input type="text" name="model"  id="defaultRegisterFormFirstName" class="form-control"  required >
                            </div>

                           
                            <div class="form-row mb-1">
                                 <label>Make:</label>
                                <input type="text" name="make"  id="defaultRegisterFormFirstName" class="form-control" required >
                            </div>       


                            
                            <div class="form-row mb-1">
                            <label>Description:</label>
                                <textarea class="form-control  " name="transd" id="exampleFormControlTextarea6" rows="5" placeholder="Vehicle description, bike description etc"></textarea>
                            </div>
                             <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#uploadModal">
                                upload photo
                            </button>
                            <input type="text" hidden="true" name="action" value="trans">
                            <hr>
                            <div class="form-row">
                                <a href="DistinctFeature.jsp" class=" btn btn-info ">Back</a>
                                <div class="col text-right">
                                    <button class=" btn btn-primary" type="submit" >Next</button>
                                </div>
                            </div>


                        </form>
                    </div>
                </div>

                    <jsp:include page="Footer.jsp"/>
                </div>
            </div>
                

    </body>

</html>
