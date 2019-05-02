<%-- 
    Document   : CreateNewUser
    Created on : Mar 20, 2019, 10:59:05 PM
    Author     : luganu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css">

        <link rel="stylesheet" href="resources/css/mdb.min.css">
     <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new user</title>

    </head>

    
    <main style="height: 900px">
        <form action="AddUser" method="post"  >

            <div class="container text-center border border-light p-5" style="width: 700px;height: 800px;margin-top: 30px;">
                <div class="alert alert-warning alert-dismissible fade show" role="alert">
                     <p class="text-danger">${requestScope.usrerr}</p>
                     <p class="text-success">${requestScope.usrsuccess}</p>
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
               
                <p class="h4 mb-4"><strong>User Details </strong></p>
                <hr>
                <!-- ID-->
                <div class="form-row mb-4">
                    <label>ID:</label>
                    <i class="fas fa-user prefix grey-text"></i>
                    <input type="text" name="id" id="orangeForm-id" class="form-control validate" required placeholder="Employee ID">
                </div>
                <!-- first Name -->
                <div class="form-row mb-4">

                    <label>First Name:</label>
                    <i class="fas fa-user prefix grey-text"></i>
                    <input type="text" name="fname" id="orangeForm-fname" class="form-control validate" required placeholder="First Name">
                </div>
                <!-- second Name -->
                <div class="form-row mb-4">

                    <label>Second Name:</label>
                    <i class="fas fa-user prefix grey-text"></i>
                    <input type="text" name="sname" id="orangeForm-sname" class="form-control validate" required placeholder="Second Name">
                </div>
                <!-- E-mail -->
                <div class="form-row mb-4">
                    <label>Email:</label>
                    <i class="fas fa-user prefix grey-text"></i>
                    <input type="email" name="email" id="orangeForm-sname" class="form-control validate" required placeholder="Email">
                </div>
                <!-- phone number -->
                <div class="form-row mb-4">
                    <i class="fas fa-user prefix grey-text"></i>
                    <label>Phone:</label>
                    <input type="text" name="phone" id="orangeForm-sname" class="form-control validate" required placeholder="Phone Number">
                </div>

                
                <div class="modal-footer d-flex justify-content-center" style="position: relative; top: 20px">
                    <button class="btn btn-blue" type="submit" >Add</button>
                </div>

            </div>
        </form>
    </main>  

    <jsp:include page="footer.jsp"/>

</html>
