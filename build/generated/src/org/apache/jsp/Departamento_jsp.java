package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Departamento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css\">\n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"js/modernizr.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script src=\"js/EliminarPrueba.js\"></script>\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    \n");
      out.write("     <script>\n");
      out.write("      //window.onpageshow =document.getElementById(\"pruebaDoc\").innerHTML = localStorage.getItem(\"storageName\");\n");
      out.write("     $( document ).ready(function() {\n");
      out.write("      if (localStorage.getItem(\"storageName\") != null) {\n");
      out.write("      document.getElementById(\"pruebaId\").value = localStorage.getItem(\"storageName\");\n");
      out.write("  //document.getElementById(\"pruebaDoc\").innerHTML = localStorage.getItem(\"storageName\");\n");
      out.write("      }else{\n");
      out.write("        console.log(\"Hubo un problema en la Consecución del usuario\")\n");
      out.write("      }       \n");
      out.write("});\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("       <div class=\"container\">\n");
      out.write("           <div id=\"pruebaDoc\"></div>\n");
      out.write("           \n");
      out.write("            <div class=\"page-header\">\n");
      out.write("              <h1 class=\"all-tittles\">Sistema de Ventas <small>Registro de Localidades</small></h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <ul class=\"nav nav-tabs nav-justified\"  style=\"font-size: 17px;\"> \n");
      out.write("               <li role=\"presentation\" class=\"active\"><a href=\"Controlador?menu=Departamento&accion=Listar\" target=\"myFrame\">Departamento</a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"Controlador?menu=Ciudad&accion=Listar\" target=\"myFrame\">Ciudad</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\"  style=\"margin: 50px 0;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-4 col-md-3\">\n");
      out.write("                    <img src=\"assets/undraw/map.svg\" alt=\"user\" class=\"img-responsive center-box\" style=\"max-width: 190px;\">\n");
      out.write("                    <!--antes los iconos en todos las ventanas eran de 110px-->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-8 col-md-8 text-justify lead\">\n");
      out.write("                    Bienvenido a la sección para registrar nuevos Departamentos, debes de llenar el siguiente formulario para registrar un Departamento\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 lead\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                      <li class=\"active\">Nuevo Departamento</li>\n");
      out.write("                      <li><a href=\"listcategory.html\">Listado de Departamentos</a></li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container-flat-form\">\n");
      out.write("                <div class=\"title-flat-form title-flat-blue\">Agregar un nuevo Departamento</div>\n");
      out.write("                <!--<form autocomplete=\"off\">-->\n");
      out.write("                <form autocomplete=\"off\" action=\"Controlador?menu=Departamento\" method=\"POST\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                       <div class=\"col-xs-12 col-sm-8 col-sm-offset-2\">\n");
      out.write("                             \n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departamento.getIdus()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"pruebaId\" name=\"txtidpr\"  class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el número del Departamento\"  required=\"\"   maxlength=\"20\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe el número del Departamento\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Número de IdUs:</label>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departamento.getNum_dep()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtnum\"  class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el número del Departamento\"  required=\"\"   maxlength=\"20\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe el número del Departamento\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Número de Departamento:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departamento.getNom_dep()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtnom\" class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el nombre del Departamento\" required=\"\" pattern=\"[a-zA-z0-9áéíóúÁÉÍÓÚñÑ ]{1,50}\" maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe el nombre del Departamento\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Nombre de Departamento:</label>\n");
      out.write("                            </div>\n");
      out.write("                            <p class=\"text-center\">\n");
      out.write("                                <button type=\"submit\" name=\"accion\" value=\"Actualizar\" class=\"btn btn-warning\" style=\"margin-right: 20px;\"><i class=\"zmdi zmdi-rotate-left\"></i> &nbsp;&nbsp; Actualizar</button>\n");
      out.write("                                <button type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"btn btn-success\"><i class=\"zmdi zmdi-floppy\"></i> &nbsp;&nbsp; Guardar</button>\n");
      out.write("                            </p> \n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("               <div class=\"col-sm-8\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <table id=\"example\" class=\"table table-hover table-responsive\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                     <th>ID</th>\n");
      out.write("                                    <th>Numero</th>\n");
      out.write("                                    <th>NOMBRES</th>\n");
      out.write("                                                                       \n");
      out.write("                                    <th>ACCIONES</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody> \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"ModalHelp\">\n");
      out.write("          <div class=\"modal-dialog modal-lg\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                    <h4 class=\"modal-title text-center all-tittles\">ayuda del sistema</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore dignissimos qui molestias ipsum officiis unde aliquid consequatur, accusamus delectus asperiores sunt. Quibusdam veniam ipsa accusamus error. Animi mollitia corporis iusto.\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\"><i class=\"zmdi zmdi-thumb-up\"></i> &nbsp; De acuerdo</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                 $('#example').DataTable( {\n");
      out.write("                  \"pagingType\": \"full_numbers\"\n");
      out.write("              } );\n");
      out.write("          } );\n");
      out.write("        </script>\n");
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
    _jspx_th_c_forEach_0.setVar("dep");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${departamentos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dep.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dep.getNum_dep()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dep.getNom_dep()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                             \n");
          out.write("                                        <td>\n");
          out.write("                                            <a class=\"btn btn-warning\" href=\"Controlador?menu=Departamento&accion=Editar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dep.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"zmdi zmdi-edit\"></i> &nbsp;&nbsp; Editar</a>\n");
          out.write("                                            <a class=\"btn btn-danger delete-system-button\" data-href=\"Controlador?menu=Departamento&accion=Delete&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dep.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></i> &nbsp;&nbsp; Eliminar</a>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
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
}
