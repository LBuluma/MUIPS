<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags-->
        <meta charset="UTF-8">


        <!-- Title Page-->
        <title>Login</title>


        <link href="resources/css/bootstrap.min.css" rel="stylesheet" >




    </head>

    <body class="bg-gradient-primary">

        <div class="container border border p-5" style="width: 600px; border-radius: 1em; margin-top: 100px;height: 475px; background-color: white">
            <div class="container" style="width: 500px;height: 450px; margin-top: 20px; ">
                <label class=" h4 mb-4 " style="margin-left: 145px; font-size: 20px" >MUIPS Login</label>
                <form action="Login" method="post">
                <label>Email:</label>
                <input type="email" name="email" class="form-control mb-1" id="inputSname" required>
                <label>Password:</label>
                <input type="password" name="password" class="form-control mb-4 " id="inputSname" required >
                <input type="submit" value="sign in" class="btn btn-primary  form-control mb-2">
                <p>
                    Don't you have account?
                    <a href="Registerhome.jsp">Sign Up Here</a>
                </p>
            </form>
            </div>
        </div>

    </body>

</html>
<!-- end document-->