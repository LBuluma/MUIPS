$(document).ready(function (e) {
                $("#form1").submit(function (e) {
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
                         alert("file uploaded successfully");
                        },
                        error: function (e)
                        {
                            alert("file failed to upload");
                        }
                        
                    });
                });
                ;
            });