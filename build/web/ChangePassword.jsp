<%-- 
    Document   : ChangePassword
    Created on : May 20, 2019, 7:09:23 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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


            <!-- End of Sidebar -->
            <jsp:include page="Sidebar.jsp"/>
            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>

                    <form action='ChangePassword' method="post">

                        <div class="card1  border p-5" style="margin: auto; width: 600px" >
                            <div class="form-row mb-4">
                                <label for="inputEmail4">Old password:</label>
                                <input type="password" name="oldPass" class="form-control" id="inputFname"  required>
                            </div>

                            <div class="form-row mb-4">
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
                            <button class="btn btn-primary form-control" type="submit">change</button>
                        </div>
                    </form>
                </div>
            </div>


    </body>
</html>
