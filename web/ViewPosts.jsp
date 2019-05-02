<%-- 
    Document   : ViewPosts
    Created on : Apr 18, 2019, 3:18:24 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Cases</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">
        <link rel="stylesheet" href="resources/css/mdb.min.css" id="bootstrap-css">

        <link  rel="stylesheet"  href="resources/Table.css" >
        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="resources/js/popper.min.js"></script>

        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>

        <script type="text/javascript" src="resources/mynewjs.js"></script>



    </head>

    <body>
        <div class="col-3 " style="margin-right: 100px">
            <input type="text" class="search form-control " placeholder="Search">
        </div>
        <span class="counter pull-right"></span>
        <table class="table table-striped table-bordered table-sm  results">
            <thead>
                <tr>
                    <th>#</th>
                    <th class="th-sm">Name / Surname</th>
                    <th class="th-sm">Job</th>
                    <th class="th-sm">City</th>
                </tr>
                <tr class="warning no-result">
                    <td colspan="4"><i class="fa fa-warning"></i> No result</td>
                </tr>
            </thead>
            <tbody>
                
                    <tr>
                        <th scope="row"></th>
                        <td>${usrs['1']}</td>
                        <td>${usrs['1']}</td>
                        <td>22-19-2019</td>
                    </tr>
                    <tr>
                        <th scope="row"></th>
                        <td>${usrs['2']}</td>
                        <td>${usrs['2']}</td>
                        <td>Istanbul</td>
                    </tr>
                    <tr>
                        <th scope="row"></th>
                        <td>${usrs['3']}</td>
                        <td>${usrs['3']}</td>
                        <td>Istanbul</td>
                    </tr>
           
            </tbody>
        </table>

    </body>
</html>
