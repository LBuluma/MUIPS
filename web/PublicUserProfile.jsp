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
        <title>Case Details</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/mdb.min.css">
        <link rel="stylesheet" href="resources/css/mdb.lite.min.css">
        <link rel="stylesheet" href="muips.css">

        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>
    </head>
    <body class='body1' style="height: 900px">
        <jsp:include page="UserHeader.jsp">
            <jsp:param name="title" value="Dash"/>
        </jsp:include>

        <div class="container container1 border border-dark p-5" style="width: 50%;height: 800px; margin-top: 75px">
            <form  action="ReportCase" method="post" >
                <p class="h4" style="margin-left: 250px"   ><strong>Profile</strong></p>
                <hr>
              
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="inputEmail4">First Name</label>
                            <input class="form-control" id="inputEmail4" value="${list['1']}" readonly>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="inputPassword4">Second Name</label>
                            <input  class="form-control" id="inputPassword4" value="${list['2']}" readonly>
                        </div>
                    </div>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                             <label for="inputAddress">Email</label>
                            <input  class="form-control" id="inputAddress" value="${list['0']}" readonly>
                        </div>
                        <div class="form-group col-md-6" >
                             <label for="inputAddress">Phone</label>
                            <input  class="form-control" id="inputAddress" value="${list['3']}" readonly>
                        </div>
                    </div>
                    <div class="form-row">
                        <label for="inputAddress">National ID</label>
                        <input  class="form-control"  value="${list['4']}" readonly>
                    </div>
                    <div class="form-row">
                        <label for="inputAddress">Physical Address</label>
                        <input class="form-control" value="${list['5']}" readonly>
                    </div>
                    <div class="form-row">
                        <label for="inputAddress">County</label>
                        <input  class="form-control" value="${list['7']}" readonly>
                    </div>
                    <div class="form-row">
                        <label for="inputAddress">Constituency</label>
                        <input  class="form-control" value="${list['6']}" readonly>
                    </div>
                    <div class="form-row" >
                        <label for="inputAddress">Ward</label>
                        <input  class="form-control" value="${list['8']}" readonly>
                    </div>
               
                <hr style="margin-bottom: 30px">
            </form>
        </div>
    </body>
    <jsp:include page="footer.jsp"/>
</html>
