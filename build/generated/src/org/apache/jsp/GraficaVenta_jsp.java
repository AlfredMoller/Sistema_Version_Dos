package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public final class GraficaVenta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");

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
	
	rs = stm.executeQuery("SELECT ventas.*,cliente.*,count(Dni)"  
             +"  FROM ventas,cliente WHERE ventas.IdCliente = cliente.IdCliente group by Dni");
        
        rs2= stm2.executeQuery("SELECT * from ventas,cliente,detalle_ventas "
                + "WHERE ventas.IdCliente = cliente.IdCliente "
                + "and detalle_ventas.IdVentas = ventas.IdVentas ");
        
        rs3= stm3.executeQuery("SELECT * from ventas,detalle_ventas "
                + "WHERE detalle_ventas.IdVentas = ventas.IdVentas ");
        
        rs4= stm4.executeQuery("SELECT SUM(Monto) as precio from ventas ");
        
	while(rs.next()){
		xVal = rs.getString("Nombres");
		yVal = rs.getString("count(Dni)");
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
               
		dataPoints4 = gsonObj.toJson(listado3);
                tr=dataPoints4.toString();
               
                out.println("<span  >Servlet agregar at " + tr + "</span>");
                

           }
        
	connection.close();
}
catch(SQLException e){
	out.println("<div  style='width: 50%; margin-left: auto; margin-right: auto; margin-top: 200px;'>Could not connect to the database. Please check if you have mySQL Connector installed on the machine - if not, try installing the same.</div>");
	dataPoints = null;
        dataPoints2 = null;
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("            \n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("            <title>Categorías</title>    \n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("            <link rel=\"Shortcut Icon\" type=\"image/x-icon\" href=\"assets/icons/book.ico\" />\n");
      out.write("            <script src=\"js/sweet-alert.min.js\"></script>\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/sweet-alert.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("            <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("            <script>window.jQuery || document.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("            <script src=\"js/modernizr.js\"></script>\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("            <script src=\"js/main.js\"></script>\n");
      out.write("         \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           <!-- <meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t\t<meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">-->\n");
      out.write("\t\t\n");
      out.write("\t\t<title>Annual Sales - 2015</title>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Bootstrap CSS -->\n");
      out.write("                <link href=\"assets/bootstrap4-alpha3.min.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("\t\t\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\tbody {\n");
      out.write("\t\t\t\tbackground-color: #fafafa;\n");
      out.write("\t\t\t\tfont-size: 16px;\n");
      out.write("\t\t\t\tline-height: 1.5;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\th1,h2,h3,h4,h5,h6 {\n");
      out.write("\t\t\t\tfont-weight: 400;\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#header {\n");
      out.write("\t\t\t\tborder-bottom: 5px solid #37474F;\n");
      out.write("\t\t\t\tcolor: #37474F;\n");
      out.write("\t\t\t\tmargin-bottom: 1.5rem;\n");
      out.write("\t\t\t\tpadding: 1rem 0;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#revenue-tag {\n");
      out.write("\t\t\t\tfont-weight: inherit !important;\n");
      out.write("\t\t\t\tborder-radius: 0px !important;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.card {\n");
      out.write("\t\t\t\tborder: 0rem;\n");
      out.write("\t\t\t\tborder-radius: 0rem;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.card-header {\n");
      out.write("\t\t\t\tbackground-color: #37474F;\n");
      out.write("\t\t\t\tborder-radius: 0 !important;\n");
      out.write("\t\t\t\tcolor:\twhite;\n");
      out.write("\t\t\t\tmargin-bottom: 0;\n");
      out.write("\t\t\t\tpadding:\t1rem;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.card-block {\n");
      out.write("\t\t\t\tborder: 1px solid #cccccc;\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.shadow {\n");
      out.write("\t\t\t\tbox-shadow: 0 6px 10px 0 rgba(0, 0, 0, 0.14),\n");
      out.write("\t\t\t\t\t\t\t\t\t\t0 1px 18px 0 rgba(0, 0, 0, 0.12),\n");
      out.write("\t\t\t\t\t\t\t\t\t\t0 3px 5px -1px rgba(0, 0, 0, 0.2);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#revenue-column-chart, #products-revenue-pie-chart, #orders-spline-chart {\n");
      out.write("\t\t\t\theight: 300px;\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t}\t\t\t\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Scripts -->\n");
      out.write("         \n");
      out.write("                <script src=\"assets/tether/tether.min.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script src=\"assets/bootstrap4-alpha3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script src=\"js/jquery.canvasjs.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(function () {\n");
      out.write("                            console.dir(");
out.print(tr);
      out.write(" )\n");
      out.write("                           \n");
      out.write("                            $('.hola').appendTo()\n");
      out.write("                        \n");
      out.write("                                $('.canvasjs-chart-credit').hide();\n");
      out.write("                                \n");
      out.write("\t\t\t\tvar totalRevenue = 15341110;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t// CanvasJS column chart to show revenue from Jan 2015 - Dec 2015\n");
      out.write("\t\t\t\tvar revenueColumnChart = new CanvasJS.Chart(\"revenue-column-chart\", {\n");
      out.write("\t\t\t\t\tanimationEnabled: true,\n");
      out.write("\t\t\t\t\tbackgroundColor: \"transparent\",\n");
      out.write("\t\t\t\t\ttheme: \"theme2\",\n");
      out.write("\t\t\t\t\taxisX: {\n");
      out.write("\t\t\t\t\t\tlabelFontSize: 14,\n");
      out.write("\t\t\t\t\t\tvalueFormatString: \"MMM YYYY\"\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\taxisY: {\n");
      out.write("\t\t\t\t\t\tlabelFontSize: 14,\n");
      out.write("\t\t\t\t\t\tprefix: \"$\"\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\ttoolTip: {\n");
      out.write("\t\t\t\t\t\tborderThickness: 0,\n");
      out.write("\t\t\t\t\t\tcornerRadius: 0\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tdata: [\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\ttype: \"column\",\n");
      out.write("\t\t\t\t\t\t\tyValueFormatString: \"$###,###.##\",\n");
      out.write("\t\t\t\t\t\t\tdataPoints: ");
out.print(dataPoints2);
      out.write("\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t]\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\trevenueColumnChart.render();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t//CanvasJS pie chart to show product wise annual revenue for 2015\n");
      out.write("\t\t\t\tvar productsRevenuePieChart = new CanvasJS.Chart(\"products-revenue-pie-chart\", {\n");
      out.write("\t\t\t\t\tanimationEnabled: true,\n");
      out.write("\t\t\t\t\ttheme: \"theme2\",\n");
      out.write("\t\t\t\t\tlegend: {\n");
      out.write("\t\t\t\t\t\tfontSize: 14\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\ttoolTip: {\n");
      out.write("\t\t\t\t\t\tborderThickness: 0,\n");
      out.write("\t\t\t\t\t\t/*content: \"<span style='\\\"'color: {color};'\\\"'>{name}</span>: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${y}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" (#percent%)\",*/\n");
      out.write("\t\t\t\t\t\tcornerRadius: 0\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tdata: [\n");
      out.write("\t\t\t\t\t\t{       \n");
      out.write("\t\t\t\t\t\t\tindexLabelFontColor: \"#676464\",\n");
      out.write("\t\t\t\t\t\t\tindexLabelFontSize: 14,\n");
      out.write("\t\t\t\t\t\t\tlegendMarkerType: \"square\",\n");
      out.write("\t\t\t\t\t\t\tlegendText: \"{indexLabel}\",\n");
      out.write("\t\t\t\t\t\t\tshowInLegend: true,\n");
      out.write("\t\t\t\t\t\t\tstartAngle:  90,\n");
      out.write("\t\t\t\t\t\t\ttype: \"pie\",\n");
      out.write("\t\t\t\t\t\t\tdataPoints: ");
out.print(dataPoints);
      out.write(" \n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t]\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tproductsRevenuePieChart.render();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t//CanvasJS spline chart to show orders from Jan 2015 to Dec 2015\n");
      out.write("\t\t\t\tvar ordersSplineChart = new CanvasJS.Chart(\"orders-spline-chart\", {\n");
      out.write("\t\t\t\t\tanimationEnabled: true,\n");
      out.write("\t\t\t\t\tbackgroundColor: \"transparent\",\n");
      out.write("\t\t\t\t\ttheme: \"theme2\",\n");
      out.write("\t\t\t\t\taxisX: {\n");
      out.write("\t\t\t\t\t\tlabelFontSize: 12,\n");
      out.write("\t\t\t\t\t\tvalueFormatString: \"MMM YYYY\"\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\taxisY: {\n");
      out.write("                                                gridThickness: 0,\n");
      out.write("                                                lineThickness: 2,\n");
      out.write("\t\t\t\t\t\tlabelFontSize: 14,\n");
      out.write("\t\t\t\t\t\tprefix: \"$\"\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\ttoolTip: {\n");
      out.write("\t\t\t\t\t\tborderThickness: 0,\n");
      out.write("\t\t\t\t\t\tcornerRadius: 0\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tdata: [\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\ttype: \"spline\",\n");
      out.write("\t\t\t\t\t\t\tyValueFormatString: \"$###,###.##\",\n");
      out.write("\t\t\t\t\t\t\tdataPoints: ");
out.print(dataPoints3);
      out.write("\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t]\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\tordersSplineChart.render();\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                var ordersSplineChart2 = new CanvasJS.Chart(\"orders-spline-chart\", {\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t\tdata: [\n");
      out.write("\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\ttype: \"spline\",\n");
      out.write("\t\t\t\t\t\t\tyValueFormatString: \"$###,###.##\",\n");
      out.write("\t\t\t\t\t\t\tdataPoints: ");
out.print(dataPoints3);
      out.write("\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t]\n");
      out.write("\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\tordersSplineChart.render();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("                        \n");
      out.write("\t\t</script>\n");
      out.write("\t\t\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("              <h1 class=\"all-tittles\">Sistema de Ventas <small>Gráficas Estadísticas</small></h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <ul class=\"nav nav-tabs nav-justified\"  style=\"font-size: 17px;\">   \n");
      out.write("                <li role=\"presentation\" class=\"active\"><a href=\"GraficaVenta.jsp\" target=\"myFrame\">Gráfica de Ventas</a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"Controlador?menu=Perfil&accion=Listar\" target=\"myFrame\">Gráfica de Pedidos</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\"  style=\"margin: 50px 0;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-4 col-md-3\">\n");
      out.write("                    <img src=\"assets/undraw/all_the_data_h4ki.svg\" alt=\"user\" class=\"img-responsive center-box\" style=\"max-width: 200px;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-8 col-md-8 text-justify lead\">\n");
      out.write("                    Bienvenido a la sección para la visualización de gráficas de ventas hechas, \n");
      out.write("                    en este formulario encontrará toda las información representadas en gráficas de las actividades hechas.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 lead\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                      <li class=\"active\">Nuevo Usuario</li>\n");
      out.write("                      <li><a href=\"listcategory.html\">Listado de Usuarios</a></li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("           <!-- <div class=\"container-flat-form\">-->\n");
      out.write("            <!-- <div class=\"title-flat-form title-flat-blue\">Agregar un nuevo Usuario</div>-->\n");
      out.write("                <!--<form autocomplete=\"off\">-->\n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                     <!--  <div class=\"col-xs-12 col-sm-8 col-sm-offset-2\">-->\n");
      out.write("          \n");
      out.write("                                     <!--Input select para empleado-->    \n");
      out.write("                           \n");
      out.write("                        <div class=\"row m-b-1\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12\">\n");
      out.write("\t\t\t\t\t<div class=\"card shadow\">\n");
      out.write("                                            <h4 class=\"card-header\">Cantidad de Productos Expedidos-Lineal <span class=\" hola tag tag-success\" id=\"revenue-tag\"></span></h4>\n");
      out.write("\t\t\t\t\t\t<div class=\"card-block\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"revenue-column-chart\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div> <!-- row -->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row m-b-1\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t<div class=\"card shadow\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-header\">Cantidad de Productos Expedidos</h4>\n");
      out.write("\t\t\t\t\t\t<div class=\"card-block\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"products-revenue-pie-chart\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-lg-6\">\n");
      out.write("\t\t\t\t\t<div class=\"card shadow\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"card-header\">Cantidad Vendidas por Fechas</h4>\n");
      out.write("\t\t\t\t\t\t<div class=\"card-block\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"orders-spline-chart\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>        \n");
      out.write("                       </div>\n");
      out.write("                    <!--</div>-->     \n");
      out.write("       <!-- </div>-->\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
