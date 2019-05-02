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
        <title></title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">
        <link rel="stylesheet" href="resources/css/mdb.min.css">
      
         <link href="mycss.css" rel="stylesheet" >
        <link rel="stylesheet" href="muips.css">

        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="resources/myjs.js"></script>


    </head>
    

    <body class='body1' style="height: 900px">
         <jsp:include page="UserHeader.jsp">
            <jsp:param name="title" value="Dash"/>
        </jsp:include>
        <main > 

        <div class="container border border-light p-5" style="background-color: #fff; width: 50%; height: 800px; margin-top: 75px;" >
            <!-- Default form register -->
            <form  action="ReportCase" method="post">

                <p class="h4 mb-4 text-center" ><strong>Transportation Information</strong></p>
                <hr>
                <div class="form-row mb-4">
                    <div class="col-md-6" >
                        <label>Type</label>
                        <select id="inputaTransType" class="form-control" name="transtype">
                            <option selected disabled>select</option>
                            
                            <option>Bicycle</option>
                            <option>Motorbike</option>
                            <option>Scooter</option>
                            <option>Vehicle</option>
                            <option>Other</option>

                        </select>
                    </div>
                    <div class="col-md-6 ">
                        <label>Color:</label>
                        <select id="inputTransColor" class="form-control" name="transcolor">
                            <option selected disabled="true">select</option>
                            <option>Bicycle</option>
                            <option>Motorbike</option>
                            <option>Scooter</option>
                            <option>Vehicle</option>
                            <option>Other</option>

                        </select>
                    </div>

                </div>
                
                 <label>Model:</label>
                <div class="form-row mb-4">
                    <input type="text" name="model"  id="defaultRegisterFormFirstName" class="form-control"  required >
                </div>

                  <label>Make:</label>
                <div class="form-row mb-4">
                    <input type="text" name="make"  id="defaultRegisterFormFirstName" class="form-control" required >
                </div>       
                 
                  
                 <label>Description:</label>
                <div class="form-group mb-4">

                    <textarea class="form-control z-depth-1 " name="transd" id="exampleFormControlTextarea6" rows="5" placeholder="Vehicle description, bike description etc"></textarea>
                </div>


               
                    <label  >Upload Photo:</label>
                    <div class="file-upload-wrapper">
                        <input type="file" id="input-file-now" class="file-upload" />
                    </div>

                <br>
                 <hr>

                <input type="text" hidden="true" name="action" value="trans">
                <div class="form-row">
                <a href="DistinctFeature.jsp" class=" btn btn-grey" >Back</a>
                <div class="col text-right">
                <button class=" btn btn-blue" type="submit" >Next</button>
                </div>
                </div>


            </form>
        </div>   
         
        </main>
        <jsp:include page="footer.jsp"/>

    </body>
    
</html>
