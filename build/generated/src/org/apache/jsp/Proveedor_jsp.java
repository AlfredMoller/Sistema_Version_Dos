package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Proveedor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Categorías</title>    \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"Shortcut Icon\" type=\"image/x-icon\" href=\"assets/icons/book.ico\" />\n");
      out.write("    <script src=\"js/sweet-alert.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/sweet-alert.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/material-design-iconic-font.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"js/modernizr.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script src=\"js/Devolver.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/EliminarPrueba.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("           $(document).ready(function() {\n");
      out.write("               \n");
      out.write("            $(DevolverDoc);\n");
      out.write("            $(DevolverTel);\n");
      out.write("            $(DevolverAux);\n");
      out.write("\n");
      out.write("            jQuery('#txtDoc').keyup(identficacion);\n");
      out.write("            jQuery('[name=\"identRadio\"]').change(identficacion);\n");
      out.write("\n");
      out.write("            jQuery('#txtTel').keyup(numtelefono);\n");
      out.write("            jQuery('[name=\"telRadio\"]').change(numtelefono);\n");
      out.write("\n");
      out.write("            jQuery('#txttelaux').keyup(auxtelefono);\n");
      out.write("            jQuery('[name=\"auxRadio\"]').change(auxtelefono);\n");
      out.write("\n");
      out.write("            /*[type=\"radio\"]*/\n");
      out.write("\n");
      out.write("            function identficacion() {\n");
      out.write("\n");
      out.write("            var rad_val = jQuery('[name=\"identRadio\"]:checked').val();\n");
      out.write("            /*[type=\"radio\"]*/\n");
      out.write("            $('#txtipoDoc').val(rad_val);\n");
      out.write("\n");
      out.write("            if(rad_val == 'CI' ){\n");
      out.write("                var ident1= $('#txtDoc')\n");
      out.write("                ident1.attr('maxlength','8')\n");
      out.write("\n");
      out.write("                let name = document.getElementById('txtDoc');\n");
      out.write("                name.value = name.value.slice(0, 9);\n");
      out.write("\n");
      out.write("                   $('#txtDoc').ready(function (event) {\n");
      out.write("\n");
      out.write("                    //if (event.which >= 37 && event.which <= 40) return;\n");
      out.write("                                // formato de numero\n");
      out.write("                                $('#txtDoc').val(function (index, value) {\n");
      out.write("                                    return value\n");
      out.write("                                    .replace(/\\D/g, \"\")\n");
      out.write("                                    .replace(/\\B(?=(\\d{3})+(?!\\d))/g, \".\");\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("\n");
      out.write("                                 });                   \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            else if(rad_val == 'DNI' ){\n");
      out.write("                var ident= $('#txtDoc')\n");
      out.write("                ident.attr('maxlength','10')\n");
      out.write("                $('#txtDoc').ready(function (event) {\n");
      out.write("                                if (event.which >= 37 && event.which <= 40) return;\n");
      out.write("                                // formato de numero\n");
      out.write("                                $('#txtDoc').val(function (index, value) {\n");
      out.write("                                    return value\n");
      out.write("                                    .replace(/\\D/g, \"\")\n");
      out.write("                                    .replace(/\\B(?=(\\d{3})+(?!\\d))/g, \".\") ;\n");
      out.write("                                });\n");
      out.write("                                 }); \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            else if(rad_val == 'RUC' ){\n");
      out.write("                var ident= $('#txtDoc')\n");
      out.write("                ident.attr('maxlength','9')\n");
      out.write("                $('#txtDoc').ready(function (event) {\n");
      out.write("                                if (event.which >= 37 && event.which <= 40) return;\n");
      out.write("                                // formato de numero\n");
      out.write("                                $('#txtDoc').val(function (index, value) {\n");
      out.write("                                    return value\n");
      out.write("                                    .replace(/\\D/g, \"\")\n");
      out.write("                                    .replace(/(\\d{7})(?=\\d)/g, '$1-');\n");
      out.write("                                });\n");
      out.write("                                 }); \n");
      out.write("            }\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        //Primer combo de radios\n");
      out.write("            function numtelefono() {\n");
      out.write("            //var ident= $('#txt_im')\n");
      out.write("            /*var txt_value = jQuery('input.number').val();*/\n");
      out.write("            var rad_val2 = jQuery('[name=\"telRadio\"]:checked').val();\n");
      out.write("            $('#txtipoTel').val(rad_val2);\n");
      out.write("\n");
      out.write("            if(rad_val2 == 'Linea Baja' ){\n");
      out.write("              var txtlinea= $('#txtTel')\n");
      out.write("\n");
      out.write("                $('#txtTel').ready(function (event) {\n");
      out.write("                                if (event.which >= 37 && event.which <= 40) return;\n");
      out.write("                                // formato de numero\n");
      out.write("                                $('#txtTel').val(function (index, value) {\n");
      out.write("                                    return value\n");
      out.write("                                    .replace(/\\D/g, \"\")\n");
      out.write("                                    .replace(/(\\d{3})(\\d{3})(\\d{3})(\\d{3})/, \"(+$1) $2 $3-$4\") ;\n");
      out.write("                                });\n");
      out.write("                                 });\n");
      out.write("                                if(txtlinea.val == 'Ninguno'){\n");
      out.write("                                    txtlinea.val(\"\")\n");
      out.write("                                } \n");
      out.write("\n");
      out.write("            } \n");
      out.write("             else if(rad_val2 == 'Celular' ){\n");
      out.write("              var txtlinea2= $('input.borrar')\n");
      out.write("              txtlinea2.valueOf(\"\")\n");
      out.write("\n");
      out.write("                $('#txtTel').ready(function (event) {\n");
      out.write("                                if (event.which >= 37 && event.which <= 40) return;\n");
      out.write("                                // formato de numero\n");
      out.write("                                $('#txtTel').val(function (index, value) {\n");
      out.write("                                    return value\n");
      out.write("                                    .replace(/\\D/g, \"\")\n");
      out.write("                                    .replace(/(\\d{3})(\\d{3})(\\d{3})(\\d{3})/, \"(+$1) $2 $3-$4\") ;\n");
      out.write("                                });\n");
      out.write("                                 });\n");
      out.write("                               /* if(txtlinea2.val == 'Ninguno'){\n");
      out.write("                                    txtlinea2.val(\"\")\n");
      out.write("                                } */                   \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            else if(rad_val2 == 'Ninguno' ){\n");
      out.write("                var tuto2= $('#txtTel')\n");
      out.write("                tuto2.val(rad_val2)\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        //Segundo combo de radios\n");
      out.write("            function auxtelefono() {\n");
      out.write("            //var ident= $('#txt_im')\n");
      out.write("            /*var txt_value = jQuery('input.number').val();*/\n");
      out.write("            var rad_val1 = jQuery('[name=\"auxRadio\"]:checked').val();\n");
      out.write("            $('#txtipoaux').val(rad_val1);\n");
      out.write("\n");
      out.write("\n");
      out.write("            if(rad_val1 == 'Linea Baja' ){\n");
      out.write("              var txtlinea= $('#txttelauxl')\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                $('#txttelaux').ready(function (event) {\n");
      out.write("                                if (event.which >= 37 && event.which <= 40) return;\n");
      out.write("                                // formato de numero\n");
      out.write("                                $('#txttelaux').val(function (index, value) {\n");
      out.write("                                    return value\n");
      out.write("                                    .replace(/\\D/g, \"\")\n");
      out.write("                                    .replace(/(\\d{3})(\\d{3})(\\d{3})(\\d{3})/, \"(+$1) $2 $3-$4\") ;\n");
      out.write("                                });\n");
      out.write("                                 });\n");
      out.write("                                if(txtlinea.val == 'Ninguno'){\n");
      out.write("                                    txtlinea.val(\"\")\n");
      out.write("                                } \n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            else if(rad_val1 == 'Celular' ){\n");
      out.write("              var txtlinea= $('#txttelauxl')\n");
      out.write("\n");
      out.write("                $('#txttelaux').ready(function (event) {\n");
      out.write("                                if (event.which >= 37 && event.which <= 40) return;\n");
      out.write("                                // formato de numero\n");
      out.write("                                $('#txttelaux').val(function (index, value) {\n");
      out.write("                                    return value\n");
      out.write("                                    .replace(/\\D/g, \"\")\n");
      out.write("                                    .replace(/(\\d{3})(\\d{3})(\\d{3})(\\d{3})/, \"(+$1) $2 $3-$4\") ;\n");
      out.write("                                });\n");
      out.write("                                 });\n");
      out.write("                                if(txtlinea.val == 'Ninguno'){\n");
      out.write("                                    txtlinea.val(\"\")\n");
      out.write("                                } \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            else if(rad_val1 == 'Ninguno' ){\n");
      out.write("                var tuto2= $('#txttelaux')\n");
      out.write("                tuto2.val(rad_val1)\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("           });\n");
      out.write("        </script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("       <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("              <h1 class=\"all-tittles\">Sistema de Ventas <small>Registro de Proveedores</small></h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <ul class=\"nav nav-tabs nav-justified\"  style=\"font-size: 17px;\">   \n");
      out.write("              <li role=\"presentation\" class=\"active\"><a href=\"Controlador?menu=Proveedor&accion=Listar\" target=\"myFrame\">Registro de Proveedores</a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"Controlador?menu=Cliente&accion=Listar\" target=\"myFrame\">Registro de Clientes</a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"Controlador?menu=Empleado&accion=Listar\" target=\"myFrame\">Registro de Empleados</a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"Controlador?menu=TipoProv&accion=Listar\" target=\"myFrame\">Registro de Tipos de Proveedores</a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"Controlador?menu=Actividad&accion=Listar\" target=\"myFrame\">Registro de Actividades</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\"  style=\"margin: 50px 0;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-4 col-md-3\">\n");
      out.write("                    <img src=\"assets/undraw/deliver.svg\" alt=\"user\" class=\"img-responsive center-box\" style=\"max-width: 200px;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-8 col-md-8 text-justify lead\">\n");
      out.write("                    Bienvenido a la sección para registrar nuevos proveedores, debes de llenar el siguiente formulario para registrar un proveedor\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 lead\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                      <li class=\"active\">Nuevo Proveedor</li>\n");
      out.write("                      <li><a href=\"listcategory.html\">Listado de Proveedores</a></li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container-flat-form\">\n");
      out.write("                <div class=\"title-flat-form title-flat-blue\">Agregar un nuevo Proveedor</div>\n");
      out.write("                <!--<form autocomplete=\"off\">-->\n");
      out.write("                <form autocomplete=\"off\" action=\"Controlador?menu=Proveedor\" method=\"POST\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                       <div class=\"col-xs-12 col-sm-8 col-sm-offset-2\">\n");
      out.write("                           \n");
      out.write("                           <!--Input text para nombre-->\n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getIdempresa()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtEmp\"  class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el nombre del cliente\"  required=\"\"   maxlength=\"20\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí el nombre del cliente\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Nombre de la Empresa</label>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                             <!--Input text para nombre del responsable-->\n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getPersfisica()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtPer\" class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el nombre del cliente\"  required=\"\"   maxlength=\"20\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí el nombre del cliente\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Nombre del Responsable</label>\n");
      out.write("                            </div>    \n");
      out.write("                                <!--Input con los radios incluidos-->\n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getDocumento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"txtDoc\" name=\"txtDoc\" class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el numero de documento\" required=\"\"  maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí el numero de documento\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Documento:</label>\n");
      out.write("                         \n");
      out.write("                                  <!--Nuevo div para radios 10%-->    \n");
      out.write("                            <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                                <input type=\"radio\"  id=\"ci\" name=\"identRadio\" value=\"CI\" class=\"material-control-input\">\n");
      out.write("                                <span for=\"ci\">CI</span>\n");
      out.write("                                \n");
      out.write("                                <input type=\"radio\" id=\"dni\" name=\"identRadio\" value=\"DNI\"class=\"material-control-input\">\n");
      out.write("                                <span for=\"dni\">DNI</span>\n");
      out.write("                                \n");
      out.write("                                <input type=\"radio\" id=\"ruc\" name=\"identRadio\" value=\"RUC\"class=\"material-control-input\">\n");
      out.write("                                <span for=\"ruc\">RUC</span>\n");
      out.write("                            </div> \n");
      out.write("                            </div>\n");
      out.write("                                <!--Input hidden para tipo doc-->\n");
      out.write("                                <div class=\"group-material\">\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getTipodoc()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  id=\"txtipoDoc\" name=\"txtipoDoc\" class=\"material-control-input\">\n");
      out.write("                                </div>  \n");
      out.write("                            \n");
      out.write("                             <!--Input con los radios de telefonos-->\n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"txtTel\" name=\"txtTel\" class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el telefono\" required=\"\"  maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí el telefono\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Telefono:</label>\n");
      out.write("                         \n");
      out.write("                                  <!--Nuevo div para radios 10%-->    \n");
      out.write("                            <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                                <input type=\"radio\"  id=\"tel_baja\" name=\"telRadio\" value=\"Linea Baja\" class=\"material-control-input\">\n");
      out.write("                                <span for=\"tel_baja\">Linea Baja</span>\n");
      out.write("                                \n");
      out.write("                                <input type=\"radio\" id=\"tel_cel\" name=\"telRadio\" value=\"Celular\" class=\"material-control-input\">\n");
      out.write("                                <span for=\"tel_cel\">Celular</span>\n");
      out.write("                                \n");
      out.write("                                <input type=\"radio\" id=\"tel_nin\" name=\"telRadio\" value=\"Ninguno\" class=\"material-control-input\">\n");
      out.write("                                <span for=\"tel_nin\">Ninguno</span>\n");
      out.write("                            </div> \n");
      out.write("                            </div>\n");
      out.write("                                <!--Input hidden para tipo doc-->\n");
      out.write("                                <div class=\"group-material\">\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getTipotel()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  id=\"txtipoTel\" name=\"txtipoTel\" class=\"material-control-input\">\n");
      out.write("                                </div>\n");
      out.write("                           \n");
      out.write("                             <!--Input con los radios de telefonos-aux-->\n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getTelaux()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"txttelaux\" name=\"txttelaux\" class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el precio del numero de telefono\" required=\"\"  maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí el numero de telefono\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Telefono-Aux:</label>\n");
      out.write("                         \n");
      out.write("                                  <!--Nuevo div para radios 10%-->    \n");
      out.write("                            <div class=\"custom-control custom-radio custom-control-inline\">\n");
      out.write("                                <input type=\"radio\"  id=\"auxlbaja\" name=\"auxRadio\" value=\"Linea Baja\" class=\"material-control-input\">\n");
      out.write("                                <span for=\"auxbaja\">Linea Baja</span>\n");
      out.write("                                \n");
      out.write("                                <input type=\"radio\" id=\"auxcel\" name=\"auxRadio\" value=\"Celular\" class=\"material-control-input\">\n");
      out.write("                                <span for=\"auxcel\">Celular</span>\n");
      out.write("                                \n");
      out.write("                                <input type=\"radio\" id=\"auxtel_nin\" name=\"auxRadio\" value=\"Ninguno\" class=\"material-control-input\">\n");
      out.write("                                <span for=\"auxtel_nin\">Ninguno</span>\n");
      out.write("                            </div> \n");
      out.write("                            </div>\n");
      out.write("                                <!--Input hidden para tipo doc-->\n");
      out.write("                                <div class=\"group-material\">\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getTipoaux()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"txtipoaux\" name=\"txtipoaux\" class=\"material-control-input\">\n");
      out.write("                                </div>\n");
      out.write("                             \n");
      out.write("                             <!--Input select para tipo actividad-->\n");
      out.write("                                <div class=\"group-material\">\n");
      out.write("                                <span>Tipo Actividad:</span>\n");
      out.write("                                <select id=\"comboAct\" name=\"comboAct\" class=\"material-control tooltips-general\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Seleccione la Actividad\" value=\"\">\n");
      out.write("                                        <option value=\"0\">Seleccione la Actividad</option>    \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            </div>      \n");
      out.write("                             \n");
      out.write("                             <!--Input select para tipo proveedor-->    \n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <span>Tipo Proveedor:</span>\n");
      out.write("                                <select id=\"comboTipo\" name=\"comboTipo\" class=\"material-control tooltips-general\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Seleccione la Categoría\" value=\"\">\n");
      out.write("                                        <option value=\"0\">Seleccione el Tipo de Proveedor</option>    \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                            </div> \n");
      out.write(" \n");
      out.write("                            <!--Input text para Direccion-->\n");
      out.write("                             <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtdirec\" class=\"material-control tooltips-general\" placeholder=\"Escribe aquí la direccion\" required=\"\"   maxlength=\"10\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí la direccion\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Direccion:</label>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <p class=\"text-center\">\n");
      out.write("                                <button type=\"submit\" name=\"accion\" value=\"Actualizar\" class=\"btn btn-warning\" style=\"margin-right: 20px;\"><i class=\"zmdi zmdi-rotate-left\"></i> &nbsp;&nbsp; Actualizar</button>\n");
      out.write("                                <button type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"btn btn-success\"><i class=\"zmdi zmdi-floppy\"></i> &nbsp;&nbsp; Guardar</button>\n");
      out.write("                            </p> \n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                 <div class=\"col-sm-8\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <table class=\"table table-hover table-responsive\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <!--<th>ID</th>-->\n");
      out.write("                                    <th>EMPRESA</th>\n");
      out.write("                                    <th>NOMBRES</th>\n");
      out.write("                                    <th>DOCUMENTO</th>\n");
      out.write("                                    <th>TELEFONO</th>\n");
      out.write("                                    <th>TEL.AUX</th>  \n");
      out.write("                                    <th>TIPO</th>\n");
      out.write("                                                                \n");
      out.write("                                    <th>ACCIONES</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody> \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${actividad}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("act");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getIdactividad() eq act.getId()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${act.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" selected=\"true\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${act.getNombact()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${act.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${act.getNombact()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoprv}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("tipo");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getIdtipoprov() eq tipo.getIdtipoprov()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo.getIdtipoprov()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" selected=\"true\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo.getTipo_proveedor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo.getIdtipoprov()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo.getTipo_proveedor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("pro");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedores}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <!--<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>-->\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getIdempresa()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getPersfisica()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getDocumento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getTelefono()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getTelaux()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <!--<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getIdactividad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getIdtipoprov()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>-->\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <a class=\"btn btn-warning\" href=\"Controlador?menu=Proveedor&accion=Editar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Editar</a>\n");
          out.write("                                            <a class=\"btn btn-danger delete-system-button\" data-href=\"Controlador?menu=Proveedor&accion=Delete&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
