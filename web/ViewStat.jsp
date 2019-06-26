<%-- 
    Document   : ViewPosts
    Created on : Apr 18, 2019, 3:18:24 PM
    Author     : justus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>View posts</title>

        <!-- Custom fonts for this template -->
        <link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css">

        <!-- Custom styles for this template -->
        <link href="resources/css/sb-admin-2.min.css" rel="stylesheet">

        <!-- Custom styles for this page -->
        <link href="resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
        <style>

            .map-container{
                overflow:hidden;
                padding-bottom:56.25%;
                position:relative;
                height:0;
            }
            .map-container iframe{
                left:0;
                top:0;
                height:100%;
                width:100%;
                position:absolute;
            }
        </style>

    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <c:if test="${sessionScope.role =='prof'}">
                <!-- End of Sidebar -->
                <jsp:include page="ProfSidenav.jsp"/>
                <!-- Content Wrapper -->
            </c:if>
            <c:if test="${sessionScope.role == 'publicuser'}">
                <!-- End of Sidebar -->
                <jsp:include page="Sidebar.jsp"/>
                <!-- Content Wrapper -->
            </c:if>
            <c:if test="${sessionScope.role == 'admin'}">
                <!-- End of Sidebar -->
                <jsp:include page="AdminSidenav.jsp"/>
                <!-- Content Wrapper -->
            </c:if>
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">
                    <jsp:include page="Navbar.jsp"/>


                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">
                        <form method="post" action="RetrieveStatistics">
                            <div class="form-row mb-4">
                                <div class="col-2 " >
                                    <label>Select constituency:</label>
                                    <select id="inputState" class="form-control" name="constituency">
                                        <option selected>Nakuru Town West</option>
                                        <option>Subukia</option>
                                        <option>Nakuru Town</option>
                                        <option>Nakuru Town East</option>
                                        <option>Kuresoi North</option>
                                        <option>Kuresoi South</option>
                                        <option>Rongai</option>
                                        <option>Molo</option>
                                        <option>Whole county</option>
                                    </select>

                                </div>
                                <div class="row" style="margin-left: 40px">
                                    <div class="col" >
                                        <label>Date from:</label>
                                        <input type="text" id="datepicker"  name="startDate" class="form-Inline" >
                                    </div>
                                    <div class="col" style="margin-top: 30px">
                                        <label>To:</label>
                                        <input type="text" id="datepicker1" name="stopDate" class="form-Inline">
                                    </div>
                                </div>
                                <div class="col-2  " style="margin-top: 30px" >
                                    <input type="submit" class="btn btn-primary" value="search" >
                                </div>
                            </div>

                            <input type="text" name="action" value="cons" hidden>
                        </form>
                        <form action="PrintReport" method="post">
                            <button type="submit" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"  id="btn1"><i class="fas fa-download fa-sm text-white-50"></i> Generate Report</button>

                            <input type="text" id="date1" name="startDate" hidden>
                            <input type="text" id="date2" name="stopDate" hidden>

                        </form>


                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                            </div>

                            <!--Card content-->
                            <div class="card-body">

                                <canvas id="myChart"></canvas>

                            </div>

                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- End of Main Content -->

        <!-- Footer -->
        <jsp:include page="Footer.jsp"/>

        <!-- End of Footer -->


        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="login.html">Logout</a>
                </div>
            </div>
        </div>
    </div>


    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>

    <script type="text/javascript" src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.8.2/js/mdb.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    <script type="text/javascript">
        // Animations initialization
        new WOW().init();

    </script>

    <script type="text/javascript">
        $(function () {
            $("#datepicker").datepicker({minDate: -20, maxDate: "D", dateFormat: "dd-mm-yy"});
            $("#datepicker1").datepicker({minDate: -20, maxDate: "D", dateFormat: "dd-mm-yy"});
        });
    </script>
    <script type="text/javascript">
       $("#btn1").click(function(){
            var x = $("#datepicker").val();
            var y = $("#datepicker1").val();
            $("#date1").val(x);
            $("#date2").val(y);
        });
    </script>



    <script>
        // Line
        var ctx = document.getElementById("myChart").getContext('2d');
        var myChart = new Chart(ctx, {
            type: 'bar',
            data: {
                labels: ["Missing open", "Unidentified Open", "Unidentified resolved", "Missing resolved"],
                datasets: [{
                        label: '# of Uploads',
                        data: [${openM}, ${openU}, ${resolvedU}, ${resolvedM}],
                        backgroundColor: [
                            'rgba(255, 99, 132, 0.2)',
                            'rgba(54, 162, 235, 0.2)',
                            'rgba(255, 206, 86, 0.2)',
                            'rgba(75, 192, 192, 0.2)',
                            'rgba(153, 102, 255, 0.2)',
                            'rgba(255, 159, 64, 0.2)'
                        ],
                        borderColor: [
                            'rgba(255,99,132,1)',
                            'rgba(54, 162, 235, 1)',
                            'rgba(255, 206, 86, 1)',
                            'rgba(75, 192, 192, 1)',
                            'rgba(153, 102, 255, 1)',
                            'rgba(255, 159, 64, 1)'
                        ],
                        borderWidth: 1
                    }]
            },
            options: {
                scales: {
                    yAxes: [{
                            ticks: {
                                beginAtZero: true
                            }
                        }]
                }
            }
        });
    </script>

</body>

</html>


