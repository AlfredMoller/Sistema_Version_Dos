package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("       <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("              <h1 class=\"all-tittles\">Sistema de Ventas <small>Registro de Perfil</small></h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <ul class=\"nav nav-tabs nav-justified\"  style=\"font-size: 17px;\">   \n");
      out.write("              <li role=\"presentation\" class=\"active\"><a href=\"Controlador?menu=Perfil&accion=Listar\" target=\"myFrame\">Registro de Perfiles/a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"Controlador?menu=Cliente&accion=Listar\" target=\"myFrame\">Registro de Clientes</a></li>\n");
      out.write("              <li role=\"presentation\"><a href=\"Controlador?menu=Proveedor&accion=Listar\" target=\"myFrame\">Registro de Proveedores</a></li>\n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\"  style=\"margin: 50px 0;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-4 col-md-3\">\n");
      out.write("                    <img src=\"assets/undraw/my_documents.svg\" alt=\"user\" class=\"img-responsive center-box\" style=\"max-width: 200px;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-8 col-md-8 text-justify lead\">\n");
      out.write("                    Bienvenido a la sección para registrar un nuevo perfil, debes de llenar el siguiente formulario para registrar un perfil\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 lead\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                      <li class=\"active\">Nuevo Perfil</li>\n");
      out.write("                      <li><a href=\"listcategory.html\">Listado de Perfiles</a></li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container-flat-form\">\n");
      out.write("                <div class=\"title-flat-form title-flat-blue\">Agregar un nuevo Perfil</div>\n");
      out.write("                <!--<form autocomplete=\"off\">-->\n");
      out.write("                <form autocomplete=\"off\" action=\"Controlador?menu=Perfil\" method=\"POST\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                       <div class=\"col-xs-12 col-sm-8 col-sm-offset-2\">\n");
      out.write("                           \n");
      out.write("                           <!--Input text para nombre-->\n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getNom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtNombres\"  class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el nombre del cliente\"  required=\"\"   maxlength=\"20\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí el nombre del cliente\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Nombre del Empleado:</label>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                             <!--Input text para nombre del responsable-->\n");
      out.write("                            <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getDni()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtDni\" class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el nombre del cliente\"  required=\"\"   maxlength=\"20\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí el nombre del cliente\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Documento:</label>\n");
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
      out.write("                               <!-- <div class=\"group-material\">\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${proveedor.getTipodoc()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  id=\"txtipoDoc\" name=\"txtipoDoc\" class=\"material-control-input\">\n");
      out.write("                                </div>  -->\n");
      out.write("                            \n");
      out.write("                             <!--Input con los radios de telefonos-->\n");
      out.write("                           <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getTel()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"txTel\" name=\"txtTel\"  class=\"material-control tooltips-general\" placeholder=\"Escribe aquí el telefono\" required=\"\"  maxlength=\"50\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí el telefono\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Telefono:</label>\n");
      out.write("                         \n");
      out.write("                                 <!--Nuevo div para radios 10%-->   \n");
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
      out.write("                              \n");
      out.write("                           \n");
      out.write("                             \n");
      out.write("                                \n");
      out.write("                            <!--Input text para Estado-->\n");
      out.write("                             <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtEstado\" class=\"material-control tooltips-general\" placeholder=\"Escribe aquí la direccion\" required=\"\"   maxlength=\"10\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí la direccion\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Estado:</label>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                            <!--Input text para Estado-->\n");
      out.write("                             <div class=\"group-material\">\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtUser\" class=\"material-control tooltips-general\" placeholder=\"Escribe aquí la direccion\" required=\"\"   maxlength=\"10\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Escribe aquí la direccion\">\n");
      out.write("                                <span class=\"highlight\"></span>\n");
      out.write("                                <span class=\"bar\"></span>\n");
      out.write("                                <label>Usuario:</label>\n");
      out.write("                            </div>    \n");
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
      out.write("                                    <th>NOMBRES</th>\n");
      out.write("                                    <th>DOCUMENTO</th>\n");
      out.write("                                    <th>TELEFONO</th>\n");
      out.write("                                    <th>ESTADO</th>\n");
      out.write("                                    <th>USER</th>\n");
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
    _jspx_th_c_forEach_0.setVar("em");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleados}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <!--<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>-->\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getNom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getDni()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getTel()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <a class=\"btn btn-warning\" href=\"Controlador?menu=Empleado&accion=Editar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Editar</a>\n");
          out.write("                                            <a class=\"btn btn-danger delete-system-button\" data-href=\"Controlador?menu=Empleado&accion=Delete&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a>\n");
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
