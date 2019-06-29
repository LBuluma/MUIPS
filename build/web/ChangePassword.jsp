<%-- 
    Document   : ChangePassword
    Created on : May 20, 2019, 7:09:23 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change password</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/muips.css">


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

                    <form action='ChangePassword' method="post">
                        <c:if test="${requestScope.errpass != null}">
                            <div class="alert alert-warning alert-dismissible fade show text-center" role="alert" style="margin:auto; width: 400px">
                                <strong>${requestScope.errpass}</strong> 
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                        </c:if>

                        <div class="card1  border p-5" style="margin: auto; width: 43%; height: 450px; margin-top: 50px" >
                            <div class="form-row mb-1">
                                <label for="inputEmail4">Old password:</label>
                                <input type="password" name="oldPass" class="form-control " id="inputFname"  required>
                            </div>

                            <div class="form-row mb-1">
                                <label for="inputPassword4">New password:</label>
                                <input type="password" name="newPass" id="defaultRegisterFormPassword1" class="form-control mb-1" pattern="(?=.*\d)(?=.*[a-z]).{8,}" aria-describedby="defaultRegisterFormPasswordHelpBlock" required>
                                <small id="defaultRegisterFormPasswordHelpBlock" class="form-text text-muted mb-1"  style="color: blue">
                                    <strong> At least 8 characters and 1 digit</strong>
                                </small>
                                <!--second name-->
                            </div>

                            <!--OB-->
                            <div class="form-row mb-4">
                                <label for="inputAddress">Confirm password:</label>
                                <input type="password" name="confPass" class="form-control" id="inputAddress" required>
                            </div>
                            <div class="form-row mb-4">
                                <button class="btn btn-primary form-control" type="submit">change</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>



    </body>
</html>
