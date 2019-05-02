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
        <link rel="stylesheet" href="muips.css">         
        <link rel="stylesheet" href="resources/css/mdb.min.css">
        <link rel="stylesheet" href="resources/css/mdb.lite.min.css"
        <script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="resources/js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    </head>

    <body  class="body1" style="height: 950px">
        <jsp:include page="UserHeader.jsp">
            <jsp:param name="title" value="Dash"/>
        </jsp:include>

        <div class="container container1 border border-light p-5" style="width: 55%;height: 850px;margin-top: 75px">
            <!-- Default form register -->
            <form  action="ReportCase" method="post">

                <p class="h4 mb-4 text-center"><strong>Missing Person Information</strong></p>
                <hr>
                <!-- E-mail -->
                <label>Huduma Number:</label>
                <input type="text" name="pid" id="defaultRegisterFormEmail" class="form-control mb-4" required>

                <label>Date of last contact:</label>

                <input type="date" name="lastContact" id="defaultRegisterFormEmail" class="form-control mb-4" placeholder="Date of Last Contact" required>

                



                <div class="form-row mb-4" style="margin-top: 10px">

                    <div class="form-group col-md-6">

                        <select id="inputState" class="form-control" name="pcolor">
                            <option selected disabled="true">Color</option>
                            <option>Nilotic</option>
                            <option>Cushitic</option>
                            <option>European</option>
                            <option>Asian</option>
                            <option>Other</option>

                        </select>
                    </div>
                    <div class="form-group col-md-6">

                        <select id="inputState" class="form-control" name="hcolor">
                            <option selected disabled="true"> Hair Color</option>
                            <option >Nilotic</option>
                            <option>Cushitic</option>
                            <option>European</option>
                            <option>Asian</option>
                            <option>Other</option>

                        </select>
                    </div>
                </div>
                 <div class="form-group mb-4">

                        <select id="inputState" class="form-control" name="ecolor">
                            <option selected disabled="true"> Eye Color</option>
                            <option>Nilotic</option>
                            <option>Cushitic</option>
                            <option>European</option>
                            <option>Asian</option>
                            <option>Other</option>

                        </select>
                    </div>

                <div class="form-group  mb-4">

                    <textarea type="text" class="form-control " name="pdesc" id="exampleFormControlTextarea6" rows="5" placeholder="Physical description..." required=""></textarea>
                </div>
                 <div class="container mb-4 ">
                     
                    <label >Upload Photo of person:</label>
                    <div class="file-upload-wrapper" >
                
                        <input type="file" id="input-file-now" class="file-upload" accept=".png,.jpg,.jpeg"/>
                        
                       
                    </div>
                    
                </div>




                <hr style="margin-top: 30px">
                <input type="text" hidden="true" name="action" value="info">
                <div class="form-row mb-4">
                <a href="Demographics.jsp" class=" btn btn-grey form-inline"  >Back</a>
                
                <div class="col text-right ">
                <button class=" btn btn-blue form-inline text-right" type="submit" >Next</button>
                </div>
                </div>


            </form>
        </div>    
        <jsp:include page="footer.jsp"/>
    </body>
</html>
