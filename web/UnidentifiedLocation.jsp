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
        <title>More information</title>

        <link rel="stylesheet" href="resources/css/bootstrap.min.css" id="bootstrap-css">
        <link rel="stylesheet" href="resources/css/mdb.min.css">
        <link rel="stylesheet" href="resources/css/mdb.lite.min.css">
        <link  rel="stylesheet"  href="muips.css" >
        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>


    </head>

    <body class="body1" style="height: 900px">
        <jsp:include page="UserHeader.jsp">
            <jsp:param name="title" value="Dash"/>
        </jsp:include>

        <div class="container container1 border border-dark p-5" style="width: 50%;height: 825px; margin-top: 75px">
            <!-- Default form register -->
            <form  action="ReportCase" method="post">
                <p class="h4 mb-4 text-center"><strong>Location found</strong></p>
                <hr>   
                
                <div class="form-row mb-4" style="margin-top: 30px">
                          <label>County:</label>
                        <select id="inputType" class="form-control" name="county">
                            <option selected disabled>Not selected...</option>
                            <option>Nakuru</option>
                            
                        </select>
                    </div>
                    
                      <label>Constituency:</label>
                    <div class="form-row mb-4" >
                        <select id="inputCon" class="form-control" required>
                        
                            <option selected>Nakuru Town West</option>
                            <option>Subukia</option>
                            <option>Nakuru Town</option>
                            <option>Nakuru Town East</option>
                            <option>Kuresoi North</option>
                            <option>Kuresoi South</option>
                            <option>Rongai</option>
                            <option>Molo</option>
                        </select>
                    </div>
              
                <div class="form-row mb-4">

                    <div class="col-6 ">
                       <label>Ward:</label>  
                        <!-- First name -->
                        <input type="text" name="ward" style="padding:15px 20px;" id="defaultRegisterFormFirstName" class="form-control"required >
                    </div>
                    
                    <div class="col-6 ">
                         <label>Village:</label>
                        <!-- Last name -->
                        <input type="text" name="village" id="defaultRegisterFormLastName" class="form-control"  required>
                    </div>

                </div> 
                <label>Investigation agency:</label>
                <input type="text" name="org" style="padding:15px 20px;" id="defaultRegisterFormFirstName" class="form-control mb-4" required >



               
                <!-- Distinct Feature-->
                <div class="custom-control custom-checkbox custom-control-inline mb-4" style="margin-top: 20px; margin-right: 150px">
                    <input type="checkbox" name="distinct" value="dist" class="custom-control-input" id="defaultInline1">
                    <label class="custom-control-label" for="defaultInline1">Has distinct feature e.g tattoo</label>
                </div>

               
                <hr>
                
                <input type="text" hidden="true" name="action" value="location">
                <div class="form-row">
                 
                <a href="PersonalInformation.jsp" class=" btn btn-grey"  >Back</a>
                <div class="col text-right">
                <button class=" btn btn-blue" type="submit" >Finish</button>
                </div>
                </div>
            </form>
        </div>   
        <jsp:include page="footer.jsp"/>
    </body>
</html>
