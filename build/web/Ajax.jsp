<%-- 
    Document   : Ajax
    Created on : May 22, 2019, 4:18:38 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <script type="text/javascript">
            $(document).ready(function (e) {
                $("#form").submit(function (e) {
                    e.preventDefault();
                    $.ajax({
                        url: "FileUpload",
                        type: "POST",
                        data: new FormData(this),
                        contentType: false,
                        cache: false,
                        processData: false,
                        beforeSend: function ()
                        {
                          
                        },
                        success: function (data)
                        {
                         alert("file uploaded");
                        },
                        error: function (e)
                        {
                            alert("file failed to upload");
                        }
                    });
                });
            });


        </script>
    </head>
   
<div class="container">
<div class="row">
<div class="col-md-8">
<h1><a href="#" target="_blank"><img src="logo.png" width="80px"/>Ajax File Uploading with Database MySql</a></h1>
<hr> 
<form id="form" action="FileUpload" method="post" enctype="multipart/form-data">

<input id="uploadImage" type="file" accept="image/*" name="image" />
<div id="preview"><img src="filed.png" /></div><br>
<input class="btn btn-success" type="submit" value="Upload" id="btn">
</form>
<div id="err"></div>
<hr>
<p><a href="https://www.cloudways.com" target="_blank">www.Cloudways.com</a></p>
</div>
</div>
</div>
</html>
