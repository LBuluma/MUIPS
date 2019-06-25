<%-- 
    Document   : ViewPosts
    Created on : Apr 18, 2019, 3:18:24 PM
    Author     : justus
--%>

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

        <title>View posts</title>

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


            <!-- End of Sidebar -->
            <jsp:include page="ProfSidenav.jsp"/>
            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>


                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">



                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">


                                        <thead>
                                            <tr>

                                                <th class="th-sm">Case ID</th>

                                                <th class="th-sm">First name</th>
                                                <th class="th-sm">Second name</th>
                                                <th class="th-sm">Gender</th>
                                                <th class="th-sm">Status</th>
                                                <th class="th-sm">ID</th>
                                                <th class="th-sm">Date</th>
                                                <th class="th-sm">Investigating agency</th>
                                            </tr>

                                        </thead>
                                        <tbody>
                                            <c:forEach items="${caseList}" var="comp" >

                                                <tr>
                                                    <c:if test="${requestScope.type == 'unidentified'}">
                                                    <td><a href="RetriveCaseDetails?postId=${comp.case_id}&type=unidentified">${comp.case_id}</a></td>
                                                    </c:if>
                                                     <c:if test="${requestScope.type == 'missing'}">
                                                    <td><a href="RetriveCaseDetails?postId=${comp.case_id}&type=missing">${comp.case_id}</a></td>
                                                    </c:if>

                                                    <td>${comp.person_fname}</td>
                                                    <td>${comp.person_sname}</td>
                                                    <td>${comp.gender}</td>
                                                    <td>${comp.case_status}</td>
                                                    <td>${comp.case_reporter}</td>
                                                    <td>${comp.dateadded}</td>
                                                    <td>${comp.invest_agency}</td>




                                                </tr> 


                                            </c:forEach>    


                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <jsp:include page="Footer.jsp"/>

                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <a class="btn btn-primary" href="login.html">Logout</a>
                    </div>
                </div>
            </div>
        </div>






        <!-- Page level plugins -->
        <script src="resources/vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="resources/js/demo/datatables-demo.js"></script>

    </body>

</html>


