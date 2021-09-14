package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container\">\n");
      out.write("            <div class=\"page-header\">\n");
      out.write("              <h1 class=\"all-tittles\">Sistema de Ventas <small>Inicio</small></h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <section class=\"full-reset text-center\" style=\"padding: 40px 0;\">\n");
      out.write("            \n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("         \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
    _jspx_th_c_forEach_0.setVar("con");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conteo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-map\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">Departamentos</div>\n");
          out.write("                <div class=\"tile-num full-reset\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${con.getIddepartamento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>  \n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-city-alt\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">Ciudades</div>\n");
          out.write("                <div class=\"tile-num full-reset\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${con.getIdciudad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>  \n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-male-female\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">Empleados</div>\n");
          out.write("                <div class=\"tile-num full-reset\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${con.getIdempleado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>  \n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-accounts\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">Clientes</div>\n");
          out.write("                <div class=\"tile-num full-reset\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${con.getIdcliente()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-truck\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">Proveedores</div>\n");
          out.write("                <div class=\"tile-num full-reset\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${con.getIdproveedor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-face\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\" style=\"width: 90%;\">Usuarios</div>\n");
          out.write("                <div class=\"tile-num full-reset\">17</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-truck\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">proveedores</div>\n");
          out.write("                <div class=\"tile-num full-reset\">21</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-book\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">libros</div>\n");
          out.write("                <div class=\"tile-num full-reset\">77</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-bookmark-outline\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">categorías</div>\n");
          out.write("                <div class=\"tile-num full-reset\">11</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-assignment-account\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">secciones</div>\n");
          out.write("                <div class=\"tile-num full-reset\">17</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-timer\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">reservaciones</div>\n");
          out.write("                <div class=\"tile-num full-reset\">10</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-time-restore\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\" style=\"width: 90%;\">devoluciones pendientes</div>\n");
          out.write("                <div class=\"tile-num full-reset\">9</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-calendar\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\">préstamos</div>\n");
          out.write("                <div class=\"tile-num full-reset\">7</div>\n");
          out.write("            </article>\n");
          out.write("            <article class=\"tile\">\n");
          out.write("                <div class=\"tile-icon full-reset\"><i class=\"zmdi zmdi-trending-up\"></i></div>\n");
          out.write("                <div class=\"tile-name all-tittles\" style=\"width: 90%;\">reportes y estadísticas</div>\n");
          out.write("                <div class=\"tile-num full-reset\">&nbsp;</div>\n");
          out.write("            </article>\n");
          out.write("            ");
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
