<%-- 
    Document   : ProfHelp
    Created on : Jun 26, 2019, 12:17:54 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prof Help</title>
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <jsp:include page="ProfSidenav.jsp"/>




            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>
                    <div class="card shadow" style="width: 80%; margin: auto ">
                        <div class="card-header py-3" >
                                    <div class="accordion" id="accordionExample">
                                        <div class="card">
                                            <div class="card-header" id="headingOne">
                                                <h2 class="mb-0">
                                                    <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                                      How to add a new case?
                                                    </button>
                                                </h2>
                                            </div>

                                            <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    
                                                    <p>1. Click on "New post" in the side navigation </p>
                                                    <p>2. Fill in the unidentified person information and click next</p>
                                                    <p> 3. Fill the form for describing the unidentified person and click next</p>
                                                    <p> 4. Fill the location information </p>
                                                    <p>(make sure to check the distinct feature option if the person has any unique feature, e.g spectacles, tattoo)</p>
                                                    <p> 5. Optional if "has distinct feature was selected" . Fill  the feature description and upload photo.</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="card">
                                            <div class="card-header" id="headingTwo">
                                                <h2 class="mb-0">
                                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapse2" aria-expanded="false" aria-controls="collapseTwo">
                                                         How to view posts?
                                                        </button>
                                                </h2>
                                            </div>
                                            <div id="collapse2" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    <p>1. Click on the "Posts" option to view station post and your posts</p>
                                                    <p>2. Click on the "View posts" option to missing or unidentified person posts </p>
                                                     
                                                </div>
                                            </div>
                                        </div>
                                        <div class="card">
                                            <div class="card-header" id="headingThree">
                                                <h2 class="mb-0">
                                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                                        How to filter posts to a few posts?
                                                    </button>
                                                </h2>
                                            </div>
                                            <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    <p>1. Click on the "search" link on the side navigation </p>
                                                    <p>2.Enter the description of the person you are searching for</p>
                                                    <p>3. Click the "search" button to view results</p>
                                                </div>
                                            </div>
                                        </div>
                                           <div class="card">
                                            <div class="card-header" id="headingThree">
                                                <h2 class="mb-0">
                                                    <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseThree">
                                                        How to view statistics?
                                                    </button>
                                                </h2>
                                            </div>
                                            <div id="collapseFour" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
                                                <div class="card-body">
                                                    <p>1. Click on the "Statistics" option on the side navigation </p>
                                                    <p>2. Select the constituency</p>
                                                    <p>3. Select the date range that is desired </p>
                                                    <p>4. Click "search" or click "generate report" button</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            
        


    </body>
</html>