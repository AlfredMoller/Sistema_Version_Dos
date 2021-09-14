<%-- 
    Document   : GraficaVenta
    Created on : 02-may-2020, 10:28:30
    Author     : SAN MIGUEL
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.sql.*" %>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>
 
<%
Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();

Map<Object,Object> map2 = null;
List<Map<Object,Object>> listado = new ArrayList<Map<Object,Object>>();

Map<Object,Object> map3 = null;
List<Map<Object,Object>> listado2 = new ArrayList<Map<Object,Object>>();

Map<Object,Object> map4 = null;
List<Map<Object,Object>> listado3 = new ArrayList<Map<Object,Object>>();

String dataPoints = null;
String dataPoints2 = null;
String dataPoints3 = null;
String dataPoints4 = null;
String tr=null;

Statement stm,stm2,stm3,stm4;
ResultSet rs,rs2,rs3,rs4;
try{
	Class.forName("com.mysql.jdbc.Driver"); 
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema", "root", "moller456");
	stm = connection.createStatement();
        stm2 = connection.createStatement();
        stm3 = connection.createStatement();
        stm4 = connection.createStatement();
        
	String xVal, yVal, aVal, bVal, cVal, dVal, eVal,fVal;
	
	rs = stm.executeQuery("Select ventas.*,cliente.*, count(ventas.IdCliente) / (SELECT count(ventas.IdCliente) FROM ventas)*100 as percent "
                + "FROM ventas,cliente WHERE ventas.IdCliente = cliente.IdCliente  GROUP BY ventas.IdCliente");
        
        rs2= stm2.executeQuery("SELECT * from ventas,cliente,detalle_ventas "
                + "WHERE ventas.IdCliente = cliente.IdCliente "
                + "and detalle_ventas.IdVentas = ventas.IdVentas ");
        
        rs3= stm3.executeQuery("SELECT * from ventas,detalle_ventas "
                + "WHERE detalle_ventas.IdVentas = ventas.IdVentas ");
        
        rs4= stm4.executeQuery("SELECT SUM(Monto) as precio from ventas ");
        
	while(rs.next()){
		xVal = rs.getString("Nombres");
		yVal = rs.getString("percent");
		map = new HashMap<Object,Object>(); map.put("label", xVal); map.put("x", String.valueOf(xVal)); map.put("y",String.valueOf(yVal)); list.add(map);
		dataPoints = gsonObj.toJson(list);
	}
        
        
        while(rs2.next()){
		aVal = rs2.getString("Nombres");
		bVal = rs2.getString("Cantidad");
                cVal=  rs2.getString("FechaVentas");
		map = new HashMap<Object,Object>();  map.put("label", aVal); map.put("y", Double.parseDouble(bVal)); listado.add(map);
               
		dataPoints2 = gsonObj.toJson(listado);
	}
        
         
        while(rs3.next()){
		
		dVal = rs3.getString("Cantidad");
                eVal=  rs3.getString("FechaVentas");
		map = new HashMap<Object,Object>();  map.put("label", eVal); map.put("y", Double.parseDouble(dVal)); listado2.add(map);
               
		dataPoints3 = gsonObj.toJson(listado2);
	}
        
           while(rs4.next()){
		
		fVal = rs4.getString("precio");
                 
		map = new HashMap<Object,Object>(); map.put("x", Double.parseDouble(fVal)); listado3.add(map);
               
		//dataPoints4 = gsonObj.toJson(listado3).toString();
                dataPoints4= fVal;
               
                /*out.println("<span  >Servlet agregar at " + dataPoints4 + "</span>");*/
                

           }
        
	connection.close();
}
catch(SQLException e){
	out.println("<div  style='width: 50%; margin-left: auto; margin-right: auto; margin-top: 200px;'>Could not connect to the database. Please check if you have mySQL Connector installed on the machine - if not, try installing the same.</div>");
	dataPoints = null;
        dataPoints2 = null;
}
%>
<!DOCTYPE html>
<html lang="en">
	<head>
            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Categorías</title>    
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="Shortcut Icon" type="image/x-icon" href="assets/icons/book.ico" />
            <script src="js/sweet-alert.min.js"></script>
            <link rel="stylesheet" href="css/sweet-alert.css">
            <link rel="stylesheet" href="css/material-design-iconic-font.min.css">
            <link rel="stylesheet" href="css/normalize.css">
            <link rel="stylesheet" href="css/bootstrap.min.css">
            <link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
            <link rel="stylesheet" href="css/style.css">
            <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
            <script>window.jQuery || document.write('<script src="js/jquery-1.11.2.min.js"><\/script>')</script>
            <script src="js/modernizr.js"></script>
            <script src="js/bootstrap.min.js"></script>
            <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
            <script src="js/main.js"></script>
 
           <!-- <meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta http-equiv="x-ua-compatible" content="ie=edge">-->
		
		<title>Annual Sales - 2015</title>
		
		<!-- Bootstrap CSS -->
                <link href="assets/bootstrap4-alpha3.min.css" rel="stylesheet" type="text/css"/>
		
		<style>
			body {
				background-color: #fafafa;
				font-size: 16px;
				line-height: 1.5;
			}
			
			h1,h2,h3,h4,h5,h6 {
				font-weight: 400;	
			}
			
			#header {
				border-bottom: 5px solid #37474F;
				color: #37474F;
				margin-bottom: 1.5rem;
				padding: 1rem 0;
			}
			
			#revenue-tag {
				font-weight: inherit !important;
				border-radius: 0px !important;
			}
			
			.card {
				border: 0rem;
				border-radius: 0rem;
			}
			
			.card-header {
				background-color: #37474F;
				border-radius: 0 !important;
				color:	white;
				margin-bottom: 0;
				padding:	1rem;
			}
			
			.card-block {
				border: 1px solid #cccccc;	
			}
			
			.shadow {
				box-shadow: 0 6px 10px 0 rgba(0, 0, 0, 0.14),
										0 1px 18px 0 rgba(0, 0, 0, 0.12),
										0 3px 5px -1px rgba(0, 0, 0, 0.2);
			}
			
			#revenue-column-chart, #products-revenue-pie-chart, #orders-spline-chart {
				height: 300px;
				width: 100%;
			}			
		</style>
                
                <script src="assets/tether/tether.min.js" type="text/javascript"></script>
                <script src="assets/bootstrap4-alpha3.min.js" type="text/javascript"></script>
                <script src="js/jquery.canvasjs.min.js" type="text/javascript"></script>
	
		<script>
			$(function () {
                            console.log(<%=dataPoints4%>)
                            $('#revenue-tag').val(<%=dataPoints4%>)
                           
                            $('.hola').appendTo()
                        
                                $('.canvasjs-chart-credit').hide();
                                
				var totalRevenue = 15341110;
				
				// CanvasJS column chart to show revenue from Jan 2015 - Dec 2015
				var revenueColumnChart = new CanvasJS.Chart("revenue-column-chart", {
					animationEnabled: true,
					backgroundColor: "transparent",
					theme: "theme2",
					axisX: {
						labelFontSize: 14,
						valueFormatString: "MMM YYYY"
					},
					axisY: {
						labelFontSize: 14,
						prefix: "$"
					},
					toolTip: {
						borderThickness: 0,
						cornerRadius: 0
					},
					data: [
						{
							type: "column",
							yValueFormatString: "$###,###.##",
							dataPoints: <%out.print(dataPoints2);%>
						}
					]
				});
				
				revenueColumnChart.render();
				
				//CanvasJS pie chart to show product wise annual revenue for 2015
				var productsRevenuePieChart = new CanvasJS.Chart("products-revenue-pie-chart", {
					animationEnabled: true,
					theme: "theme2",
					legend: {
						fontSize: 14
					},
					toolTip: {
						borderThickness: 0,
						/*content: "<span style='\"'color: {color};'\"'>{name}</span>: ${y} (#percent%)",*/
						cornerRadius: 0
					},
					data: [
						{       
							indexLabelFontColor: "#676464",
							indexLabelFontSize: 14,
							legendMarkerType: "square",
							legendText: "{indexLabel}",
							showInLegend: true,
							startAngle:  90,
							type: "pie",
							dataPoints: <%out.print(dataPoints);%> 
						}
					]
				});
				
				productsRevenuePieChart.render();
				
				//CanvasJS spline chart to show orders from Jan 2015 to Dec 2015
				var ordersSplineChart = new CanvasJS.Chart("orders-spline-chart", {
					animationEnabled: true,
					backgroundColor: "transparent",
					theme: "theme2",
					axisX: {
						labelFontSize: 12,
						valueFormatString: "MMM YYYY"
					},
					axisY: {
                                                gridThickness: 0,
                                                lineThickness: 2,
						labelFontSize: 14,
						prefix: "$"
                                                
					},
					toolTip: {
						borderThickness: 0,
						cornerRadius: 0
					},
					data: [
						{
							type: "spline",
							yValueFormatString: "$###,###.##",
							dataPoints: <%out.print(dataPoints3);%>
						}
					]
				});

				ordersSplineChart.render();
			});
                        
		</script>
		
	</head>
	<body>
	 <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">Sistema de Ventas <small>Gráficas Estadísticas</small></h1>
            </div>
        </div>
        <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">   
                <li role="presentation" class="active"><a href="GraficaVenta.jsp" target="myFrame">Gráfica de Ventas</a></li>
              <li role="presentation"><a href="Controlador?menu=Perfil&accion=Listar" target="myFrame">Gráfica de Pedidos</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/undraw/all_the_data_h4ki.svg" alt="user" class="img-responsive center-box" style="max-width: 200px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para la visualización de gráficas de ventas hechas, 
                    en este formulario encontrará toda las información representadas en gráficas de las actividades referidas a las ventas.
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Nuevo Usuario</li>
                      <li><a href="listcategory.html">Listado de Usuarios</a></li>
                    </ol>
                </div>
            </div>
        </div>
        <div class="container-fluid">    
                           
                        <div class="row m-b-1">
				<div class="col-xs-12">
					<div class="card shadow">
                                            <h4 class="card-header">Cantidad de Productos Expedidos-Lineal <span class="tag tag-success" id="revenue-tag">Gs.<%=dataPoints4%></span></h4>
						<div class="card-block">
							<div id="revenue-column-chart"></div>
						</div>
					</div>
				</div>
			</div> 

			<div class="row m-b-1">
				<div class="col-lg-6">
					<div class="card shadow">
						<h4 class="card-header">Cantidad de Productos Expedidos</h4>
						<div class="card-block">
							<div id="products-revenue-pie-chart"></div>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="card shadow">
						<h4 class="card-header">Cantidad Vendidas por Fechas</h4>
						<div class="card-block">
							<div id="orders-spline-chart"></div>
						</div>
					</div>
				</div>        
                       </div>
	</body>
</html>