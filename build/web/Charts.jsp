<!DOCTYPE HTML>
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
    window.onload = function() { 
     
    <% if(request.getAttribute("dataPoints") != null) { %>
    var chart = new CanvasJS.Chart("chartContainer", {
    	animationEnabled: true,
    	exportEnabled: true,
    	title: {
    		text: "JSP Column Chart from Database"
    	},
    	data: [{
    		type: "column", //change type to bar, line, area, pie, etc
    		dataPoints: <%out.print(request.getAttribute("dataPoints"));%>
    	}]
    });
    chart.render();
    <% } %> 
     
    };
    </script>
    </head>
    <body>
    <div id="chartContainer" style="height: 370px; width: 100%;"></div>
    <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
    </body>
    </html>        