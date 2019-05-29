<%-- 
    Document   : Demographics
    Created on : Apr 11, 2019, 5:46:57 PM
    Author     : justus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>

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

                   
                    <div class="row " style="margin-top: 20px" >

          

                        <div class="  card1 p-5 col  mb-4" style="margin-left: 50px" >
                            <p class=" h5 mb-4 text-center "><u><strong>Personal Information</strong></u></p>
                                <div class="form-row mb-1">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4">First Name:</label>
                                        <input class="form-control" id="inputEmail4" value="${list['1']}" readonly>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4">Second Name:</label>
                                        <input  class="form-control" id="inputPassword4" value="${list['2']}" readonly>
                                    </div>
                                </div>
                                <div class="form-row mb-1">
                                    <div class="form-group col-md-6">
                                        <label for="inputAddress">Email:</label>
                                        <input  class="form-control" id="inputAddress" value="${list['0']}" readonly>
                                    </div>
                                    <div class="form-group col-md-6" >
                                        <label for="inputAddress">Phone:</label>
                                        <input  class="form-control" id="inputAddress" value="${list['3']}" readonly>
                               
                                    </div>
                                </div>
                                <div class="form-row mb-1">
                                    <label for="inputAddress">Huduma ID:</label>
                                    <input  class="form-control"  value="${list['4']}" readonly>
                                            
                                </div>
                            </div>

                                <div class=" card1 p-5  col mb-4" style="margin-left: 30px; margin-right: 50px" >
                                     <p class="h5 mb-4 text-center "><u><strong>Contact Information</strong></u></p>
                                <div class="form-row mb-1">
                                    <label for="inputAddress">Physical Address:</label>
                                    <input class="form-control" value="${list['5']}" readonly>
                                </div>
                                <div class="form-row mb-1">
                                    <label for="inputAddress">County:</label>
                                    <input  class="form-control" value="${list['7']}" readonly>
                                </div>
                                <div class="form-row mb-1">
                                    <label for="inputAddress">Constituency:</label>
                                    <input  class="form-control" value="${list['6']}" readonly>
                                </div>
                                <div class="form-row mb-1" >
                                    <label for="inputAddress">Ward:</label>
                                    <input  class="form-control" value="${list['8']}" readonly>
                                </div>

                    </div>
                </div>
            </div>
            <jsp:include page="Footer.jsp"/>

        </div>
    </div>
</div>


</body>

</html>
