<%-- 
    Document   : newjsp
    Created on : May 20, 2019, 1:04:10 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="resources/vendor/jquery/jquery.min.js"></script>
        <script>
            $(document).ready(function () {
                $("#btn").click(function () {
                    var name = $("#trial").val();
                    $.post("AJaxTrialServlet",
                            {
                                name: name
                               
                            },
                            function (responseText) {
                                alert(responseText);
                            });
                });
            });
        </script>
    </head>
    <body>
       
            <input type="text" name="trail" id="trial">
            <button type="submit" id="btn">submit</button>
     
    </body>
</html>
