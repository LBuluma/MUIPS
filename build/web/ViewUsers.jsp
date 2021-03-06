<%-- 
    Document   : ViewPosts
    Created on : Apr 18, 2019, 3:18:24 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : ViewPosts
    Created on : Apr 18, 2019, 3:18:24 PM
    Author     : justus
--%>




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
            <jsp:include page="AdminSidenav.jsp"/>
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



                                                <th class="th-sm">First name</th>
                                                <th class="th-sm">Second name</th>
                                                <th class="th-sm">Date of application</th>
                                                <th class="th-sm">Organization</th>
                                                <th class="th-sm">Phone</th>
                                                <th class="th-sm">Email</th>
                                                <th class="th-sm"></th>
                                                    <c:if test="${requestScope.action == 'approve'}">
                                                    <th class="th-sm"></th>
                                                    </c:if>

                                            </tr>

                                        </thead>
                                        <tbody>

                                            <c:forEach items="${usr}" var="comp" >

                                                <tr>


                                                    <td>${comp.user_fname}</td>
                                                    <td>${comp.user_sname}</td>
                                                    <td>${comp.date_added}</td>
                                                    <td>${comp.user_org}</td>
                                                    <td>${comp.user_phone}</td>
                                                    <td>${comp.user_email}</td>
                                                    <td>
                                                        <c:if test="${requestScope.action == 'approve'}">

                                                            <form action="ProcessUser" method="post">
                                                                <input type="text" hidden value="approve" name="action">
                                                                <input type="text" hidden value="${comp.user_email}" name="email">
                                                                <input class="btn btn-primary btn-sm" type="submit" value="Approve">
                                                            </form>
                                                        </c:if>

                                                        <c:if test="${requestScope.action == 'revoked'}">
                                                            <form action="ProcessUser" method="post">
                                                                <input type="text" hidden value="approve" name="action">
                                                                <input type="text" hidden value="${comp.user_email}" name="email">
                                                                <input class="btn btn-primary" type="submit" value="Approve">
                                                            </form>
                                                        </c:if>
                                                        <c:if test="${requestScope.action == 'all'}">
                                                            <form action="ProcessUser" method="post">
                                                                <input type="text" hidden value="revoke" name="action">
                                                                <input type="text" hidden value="${comp.user_email}" name="email">
                                                                <input class="btn btn-primary" type="submit" value="Revoke">
                                                            </form>
                                                        </c:if>

                                                    </td>
                                                    <c:if test="${requestScope.action == 'approve'}">
                                                        <td><form action="ProcessUser" method="post">
                                                                <input type="text" hidden value="revoke" name="action">
                                                                <input type="text" hidden value="${comp.user_email}" name="email">
                                                                <input class="btn btn-primary btn-sm" type="submit" value="Revoke">

                                                            </form>
                                                        </td>
                                                    </c:if>

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








        <!-- Page level plugins -->
        <script src="resources/vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="resources/js/demo/datatables-demo.js"></script>

    </body>

</html>


