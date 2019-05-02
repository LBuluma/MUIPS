<%-- 
    Document   : Registration
    Created on : Apr 4, 2019, 11:03:08 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Distinct Feature</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">
        <link rel="stylesheet" href="muips.css">
        <link rel="stylesheet" href="resources/css/mdb.min.css">
        <link rel="stylesheet" href="resources/css/mdb.lite.min.css">

        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>

    </head>
    <body class="body1" style="height: 800px">

        <jsp:include page="UserHeader.jsp">
            <jsp:param name="title" value="Dash"/>
        </jsp:include>

        <div class="container container1 border border-light p-5" style="width: 50%;height: 700px;margin-top: 75px">

            <p class="h4 mb-4 text-center"><strong>Distinct Feature Information</strong></p>

            <!-- Default form report -->
            <form  action="ReportCase" method="post" style="margin-top: 20px">             
                <hr >
                <!-- Distinct feature type-->
                <div class="form-row  mb-4" style="margin-top: 20px" name="disttype">
                    <label for="inputType">Type</label>
                    <select id="inputType" class="form-control">
                        <option selected disabled>select</option>
                        <option>Tattoo</option>
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

                <!--Description of the feature-->
                <div class="form-row mb-4" style="margin-top: 30px">
                    <label for="inputType">Description</label>
                    <textarea type="text" class="form-control" id="exampleFormControlTextarea6" name="distd" rows="5" placeholder="Description..."></textarea>
                </div>

             
                    <label >Upload Photo:</label>
                    <div class="file-upload-wrapper">
                        <input type="file" id="input-file-now" class="file-upload" accept=".png,.jpg,.jpeg"/>
                    </div>
                
                <br>
                
                <hr>

                <!--navigation buttons-->
                <input type="text" hidden="true" name="action" value="distinct">
                <div class="form-row">
                <a href="MissingPersonInfo.jsp" class=" btn btn-grey" >Back</a>
                <div class="col text-right">
                <button class=" btn btn-blue" type="submit">Next</button>
                </div>
                </div>
            </form>
        </div>   
        <jsp:include page="footer.jsp"/>

    </body>
</html>
