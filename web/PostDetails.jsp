<%-- 
    Document   : PostDetails
    Created on : Jun 15, 2019, 1:27:35 AM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">
            <c:if test="${sessionScope.role =='prof'}">
                <!-- End of Sidebar -->
                <jsp:include page="ProfSidenav.jsp"/>
                <!-- Content Wrapper -->
            </c:if>
            <c:if test="${sessionScope.role == 'publicuser'}">
                <!-- End of Sidebar -->
                <jsp:include page="Sidebar.jsp"/>
                <!-- Content Wrapper -->
            </c:if>
            <c:if test="${sessionScope.role == 'admin'}">
                <!-- End of Sidebar -->
                <jsp:include page="AdminSidenav.jsp"/>
                <!-- Content Wrapper -->
            </c:if>

            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>

                    <div class="card shadow" style="width: 100%;height: 650px  ">
                        <div class="card-header py-3" >
                            <p class="h5  text-center"><strong> Details</strong></p>
                        </div>

                        <div class="container-fluid " style="width: 90%; margin-top: 10px">
                            <ul class="nav nav-tabs" id="myTab" role="tablist">
                                <li class="nav-item">
                                    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Person Information</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link " id="info-tab" data-toggle="tab" href="#info" role="tab" aria-controls="info" aria-selected="false">More Information</a>
                                </li>
                                <c:if test="${requestScope.trans.trans_type != null}">
                                    <li class="nav-item">
                                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Distinct Feature</a>
                                    </li>
                                </c:if>
                                <c:if test="${requestScope.trans.trans_type != null}">
                                    <li class="nav-item">
                                        <a class="nav-link" id="trans-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="trans" aria-selected="false">Transportation</a>
                                    </li>
                                </c:if>
                                <li class="nav-item">
                                    <a class="nav-link" id="org-tab" data-toggle="tab" href="#org" role="tab" aria-controls="org" aria-selected="false">Organization Information</a>
                                </li>
                            </ul>

                            <div class="tab-content" id="myTabContent">

                                <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">

                                    <div class="card shadow mb-4">
                                        <div class="card-header py-3">
                                            <h6 class="m-0 font-weight-bold text-primary"></h6>
                                        </div>
                                        <div class="form-row">
                                            <div class="container col-md-5" >
                                                <div class="card-body">


                                                    <div style="margin-left: 20px">
                                                        <Label><strong>First name:</strong></label><p>${person.person_fname}</p>
                                                        <label><strong>Second name:</strong></label><p>${person.person_sname}</p>
                                                        <Label><strong>Language:</strong></label><p>${person.language}</p>
                                                            <c:if test="${requestScope.path2 != null}">

                                                            <form action="File" >
                                                                <input type="text" value="${requestScope.path2}" name="path" hidden >
                                                                <button class=" btn btn-primary " type="submit">View image</button> 
                                                            </form>
                                                        </c:if>
                                                        <c:if test="${requestScope.path3 != null}">
                                                            <input type="text" value="${requestScope.path3}" name="path" hidden >
                                                            <form action="File" >
                                                                <button class=" btn btn-primary " type="submit">View image</button> 
                                                            </form>
                                                        </c:if>
                                                    </div>

                                                </div>
                                            </div>
                                            <div class="container  col-md-5" style="margin-top: 25px" >
                                                <c:if test="${requestScope.type == 'missing'}">
                                                    <label> <strong>Last Contact:</strong></label>
                                                    <p>${person.last_contact}</p>
                                                </c:if>
                                                <c:if test="${requestScope.type == 'unidentified'}">
                                                    <label> <strong>Date found:</strong></label>
                                                    <p>${person.dateFound}</p>
                                                </c:if>



                                                <label> <strong>Age:</strong></label>
                                                <p>${descri.age_range}</p>

                                                <label><strong>Gender:</strong></label>
                                                <p>${person.gender}</p>


                                                <label> <strong>Ethnicity:</strong></label>
                                                <p>${person.ethnicity}</p>


                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="tab-pane fade" id="info" role="tabpanel" aria-labelledby="info-tab">
                                    <div class="card shadow mb-4">
                                        <div class="card-header py-3">
                                            <h6 class="m-0 font-weight-bold text-primary"></h6>
                                        </div>
                                        <div class="form-row">
                                            <div class="container col-md-5" >
                                                <div class="card-body">

                                                    <div style="margin-left: 25px">
                                                        <label><strong>County:</strong></label><p>${location.county}</p>
                                                        <label><strong>Constituency:</strong></label><p>${location.constituency}</p>
                                                        <label><strong>Ward:</strong></label><p>${location.ward}</p>
                                                        <label><strong>Village:</strong></label><p>${location.village}</p>
                                                        <label> <strong>Height:</strong></label>
                                                        <p>${descri.height} ft</p>

                                                        <label> <strong>Weight:</strong></label>
                                                        <p>${descri.weight} kgs</p>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="container  col-md-5" style="margin-top: 25px" >
                                                <label> <strong>Color:</strong></label>
                                                <p>${descri.color}</p>

                                                <label> <strong>Eye color:</strong></label>
                                                <p>${descri.eye_color}</p>

                                                <label> <strong>Hair color:</strong></label>
                                                <p>${descri.hair_color}</p>




                                                <label> <strong>Description:</strong></label>
                                                <p>${descri.person_desc}</p>




                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <c:if test="${requestScope.feature != null}">
                                    <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                                        <div class="card shadow mb-4">
                                            <div class="card-header py-3">
                                                <h6 class="m-0 font-weight-bold text-primary"></h6>
                                            </div>
                                            <div class="container" style="width: 40%; margin-right:  675px">
                                                <div class="card-body">

                                                    <div style="margin-left: 25px">
                                                        <Label><strong>Type:</strong></label><p>${feature.distinctive_feature}</p>
                                                        <label><strong>Description:</strong></label><p>${feature.description_feature}</p>
                                                        <c:if test="${requestScope.path != null}">

                                                            <form action="File" >
                                                                <input type="text" value="${requestScope.path}" name="path" hidden >
                                                                <button class=" btn btn-primary " type="submit">View image</button> 
                                                            </form>
                                                        </c:if>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:if>

                                <c:if test="${requestScope.trans.trans_type != null}">
                                    <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="trans-tab">

                                        <div class="card shadow mb-4">
                                            <div class="card-header py-3">
                                                <h6 class="m-0 font-weight-bold text-primary"></h6>
                                            </div>
                                            <div class="form-row">
                                                <div class="container col-md-5"  >
                                                    <div class="card-body">
                                                        <div class="text-center">
                                                            <img class="img-fluid px-3 px-sm-4 mt-3 mb-4" style="width: 25rem; margin-right: 30px" src="images/b.jpg" alt="">
                                                        </div>

                                                    </div>
                                                </div>
                                                <div class=" container col-md-5" style="margin-top: 40px">
                                                    <label> <strong>Type:</strong></label>
                                                    <p>${trans.trans_type}</p>

                                                    <label> <strong>Color:</strong></label>
                                                    <p>${trans.color}</p>

                                                    <label> <strong>Model:</strong></label>
                                                    <p>${trans.model}</p>

                                                    <label> <strong>Make:</strong></label>
                                                    <p>${trans.make}</p>

                                                    <label> <strong>Description:</strong></label>
                                                    <p>${trans.description}</p>


                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:if>


                                <div class="tab-pane fade" id="org" role="tabpanel" aria-labelledby="org-tab">
                                    <div class="card shadow mb-4">
                                        <div class="card-header py-3">
                                            <h6 class="m-0 font-weight-bold text-primary"></h6>
                                        </div>
                                        <div class="form-row">

                                            <div class="container col-md-5" >
                                                <div class="card-body">

                                                    <div style="margin-left: 25px">
                                                        <label> <strong>Name:</strong></label>
                                                        <p>${org.name}</p>

                                                        <label> <strong>County:</strong></label>
                                                        <p>${org.county}</p>

                                                        <label> <strong>Constituency:</strong></label>
                                                        <p>${org.constituency}</p>


                                                    </div>
                                                </div>
                                            </div>

                                            <div class="container col-md-5">
                                                <label> <strong>Ward:</strong></label>
                                                <p>${org.ward}</p>
                                                <label><strong>Address:</strong></label><p>${org.address}</p>

                                                <label> <strong>Telephone:</strong></label>
                                                <p>${org.telephone}</p>

                                                <label> <strong>Email:</strong></label>
                                                <p>${org.email}</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <jsp:include page="Footer.jsp"/>
                </div>
            </div>
        </div>




        <script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
    </body>
</html>
