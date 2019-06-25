<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Advance search</title>

        <!-- Custom fonts for this template -->
        <link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="resources/css/sb-admin-2.min.css" rel="stylesheet">

        <!-- Custom styles for this page -->
        <link href="resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <c:if test="${sessionScope.role == 'prof'}">
                <!-- End of Sidebar -->
                <jsp:include page="ProfSidenav.jsp"/>
                <!-- Content Wrapper -->
            </c:if>
            <c:if test="${sessionScope.role == 'publicuser'}">
                <!-- End of Sidebar -->
                <jsp:include page="Sidebar.jsp"/>
                <!-- Content Wrapper -->
            </c:if>
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>


                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">




                        <!-- DataTales Example -->
                        <div class="card shadow " style="height: 750px; ">
                            <div class="card-header py-3" >
                                <p class="h4 mb-1 text-center"><strong>Advanced Search</strong></p>
                            </div>
                            <div class="container" style="margin-top: 30px">

                                <form action="AdvanceSearch" method="post"> 
                                    <div class="form-row" >
                                        <div class=" form-group col-5">
                                            <div class="form-group col">
                                                <label for="inputEthnicity">Case type:</label>
                                                <select id="inputState" class="form-control" name="type">
                                                    <option selected>missing</option>
                                                    <option>unidentified</option>
                                                </select>
                                            </div>

                                            <div class="form-group col">
                                                <label for="inputEmail4">First Name:</label>
                                                <input type="text" name="fname" class="form-control" id="inputFname"  >
                                            </div>
                                            <!--second name-->
                                            <div class="form-group col">
                                                <label for="inputPassword4">Second Name:</label>
                                                <input type="text" name="sname" class="form-control" id="inputSname" >
                                            </div>
                                            <div class="form-group col">
                                                <label for="inputEthnicity">Ethnicity:</label>
                                                <select id="inputState" class="form-control" name="ethnicity">
                                                    <option selected>Maasai</option>
                                                    <option>Kikuyu</option>
                                                    <option>Luo</option>
                                                    <option>European</option>
                                                    <option>Asian</option>
                                                    <option>Borana</option>
                                                    <option>Turkana</option>
                                                    <option>Luhya</option>
                                                    <option>Meru</option>
                                                    <option>Embu</option>
                                                    <option>Other</option>

                                                </select>
                                            </div>
                                            
                                            <div class="form-group col">
                                                <label>Color:</label>
                                                <select id="inputState" class="form-control" name="color">

                                                    <option>white</option>
                                                    <option>Latino</option>
                                                    <option>Black</option>
                                                    <option>Indian</option>
                                                    <option>Chocolate</option>
                                                    <option>Asian</option>
                                                    <option>Other</option>

                                                </select>
                                            </div>


                                            <div class="form-group col" >
                                                <label>Constituency:</label>
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
                                        </div>
                                        <div class="form-group col-5" style="margin-left: 70px">

                                            <div class="form-group col"  >
                                                <label for="inputType">Feature type:</label>
                                                <select id="inputType" class="form-control" name="feature" required> 

                                                    <option selected>Tattoo</option>
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


                                            <div class="form-group col"  >
                                                <div class="form-check form-check-inline "  >
                                                    <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male" required>
                                                    <label class="form-check-label" for="inlineRadio1">Male</label>
                                                </div>
                                                <div class="form-check form-check-inline " >
                                                    <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female" required>
                                                    <label class="form-check-label" for="inlineRadio2">Female</label>
                                                </div> 
                                            </div>
                                            <div class="form-row col" >

                                                <div class="form-group col">
                                                    <label for="inputEthnicity">Age from:</label>
                                                    <input type="number" name="minAge" class="form-control" id="inputZip" >

                                                </div>
                                                <div class="form-group col">
                                                    <label for="inputEthnicity">To:</label>
                                                    <input type="number" name="maxAge" class="form-control" id="inputZip" >

                                                </div>
                                            </div>
                                            <div class="form-row col">

                                                <div class="form-group col">
                                                    <label for="inputEthnicity">Weight from:</label>
                                                    <input type="number" name="minW" class="form-control" id="inputZip" >

                                                </div>
                                                <div class="form-group col">
                                                    <label for="inputEthnicity">To:</label>
                                                    <input type="number" name="maxW" class="form-control" id="inputZip" >

                                                </div>
                                            </div>
                                            <div class="form-row col">

                                                <div class="form-group col">
                                                    <label for="inputEthnicity">Height from:</label>
                                                    <input type="number" name="minH" class="form-control" id="inputZip" >

                                                </div>
                                                <div class="form-group col">
                                                    <label for="inputEthnicity">To:</label>
                                                    <input type="number" name="maxH" class="form-control" id="inputZip" >

                                                </div>
                                            </div>
                                            <div class="col">
                                                <input class="btn btn-primary " type="submit" value="Search" >
                                            </div>
                                        </div>

                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>



                </body>
                </html>
