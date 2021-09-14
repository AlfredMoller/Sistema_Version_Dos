package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"Shortcut Icon\" type=\"image/x-icon\" href=\"assets/icons/graph.png\" />\n");
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
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"navbar-lateral full-reset\">\n");
      out.write("        <div class=\"visible-xs font-movile-menu mobile-menu-button\"></div>\n");
      out.write("        <div class=\"full-reset container-menu-movile custom-scroll-containers\">\n");
      out.write("            <div class=\"logo full-reset all-tittles\">\n");
      out.write("                <i class=\"visible-xs zmdi zmdi-close pull-left mobile-menu-button\" style=\"line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px;\"></i> \n");
      out.write("                sistema de ventas\n");
      out.write("            </div>\n");
      out.write("            <div class=\"full-reset\" style=\"background-color:#2B3D51; padding: 10px 0; color:#fff;\">\n");
      out.write("                <figure>\n");
      out.write("                    <img src=\"assets/img/logo.png\" alt=\"Biblioteca\" class=\"img-responsive center-box\" style=\"width:55%;\">\n");
      out.write("                </figure>\n");
      out.write("                <p class=\"text-center\" style=\"padding-top: 15px;\">Sistema de Ventas</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\" nav-lateral-list-menu\">\n");
      out.write("                <ul class=\"list-unstyled\">\n");
      out.write("                    <li><a href=\"Controlador?menu=Inicio&accion=Listar\" target=\"myFrame\"><i class=\"zmdi zmdi-home zmdi-hc-fw\"></i>&nbsp;&nbsp; Inicio</a></li>\n");
      out.write("                    <!--Registro de Datos de Localidades-->\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown-menu-button\"><i class=\"zmdi zmdi-city zmdi-hc-fw\"></i>&nbsp;&nbsp; Localidades<i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw\"></i></div>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                             \n");
      out.write("                            <li><a href=\"Controlador?menu=Departamento&accion=Listar\" target=\"myFrame\"><i class=\"zmdi zmdi-map zmdi-hc-fw\"></i>&nbsp;&nbsp; Departamentos</a></li>\n");
      out.write("                            <li><a href=\"Controlador?menu=Ciudad&accion=Listar\" target=\"myFrame\"><i class=\"zmdi zmdi-city-alt zmdi-hc-fw\"></i>&nbsp;&nbsp; Ciudades</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <!--Registro de Datos de Productos-->\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown-menu-button\"><i class=\"zmdi zmdi-assignment-o zmdi-hc-fw\"></i>&nbsp;&nbsp; Productos <i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw\"></i></div>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"Controlador?menu=Catprod&accion=Listar\" target=\"myFrame\"><i class=\"zmdi zmdi-bookmark-outline zmdi-hc-fw\"></i>&nbsp;&nbsp; Categoría</a></li>\n");
      out.write("                            <li><a href=\"Controlador?menu=Producto&accion=Listar\" target=\"myFrame\"><i class=\"zmdi zmdi-book zmdi-hc-fw\"></i>&nbsp;&nbsp;Registo de Productos</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <!--Registro de Datos para Gentío-->\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown-menu-button\"><i class=\"zmdi zmdi-account-add zmdi-hc-fw\"></i>&nbsp;&nbsp; Registro de Personas <i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw\"></i></div>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"Controlador?menu=Cliente&accion=Listar\" target=\"myFrame\"><i class=\"zmdi zmdi-accounts zmdi-hc-fw\"></i>&nbsp;&nbsp; Clientes</a></li>\n");
      out.write("                            <li><a href=\"personal.html\"><i class=\"zmdi zmdi-male-female zmdi-hc-fw\"></i>&nbsp;&nbsp; Empleados</a></li>\n");
      out.write("                            <li><a href=\"admin.html\"><i class=\"zmdi zmdi-truck zmdi-hc-fw\"></i>&nbsp;&nbsp; Proveedores</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <!--Registro de Datos de Gentío-->\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown-menu-button\"><i class=\"zmdi zmdi-case zmdi-hc-fw\"></i>&nbsp;&nbsp; Administración <i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw\"></i></div>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"institution.html\"><i class=\"zmdi zmdi-balance zmdi-hc-fw\"></i>&nbsp;&nbsp; Datos institución</a></li>\n");
      out.write("                            <li><a href=\"provider.html\"><i class=\"zmdi zmdi-truck zmdi-hc-fw\"></i>&nbsp;&nbsp; Nuevo proveedor</a></li>\n");
      out.write("                            <li><a href=\"Controlador?menu=Catprod&accion=Listar\" target=\"myFrame\"><i class=\"zmdi zmdi-bookmark-outline zmdi-hc-fw\"></i>&nbsp;&nbsp; Nueva categoría</a></li>\n");
      out.write("                            <li><a href=\"section.html\"><i class=\"zmdi zmdi-assignment-account zmdi-hc-fw\"></i>&nbsp;&nbsp; Nueva sección</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown-menu-button\"><i class=\"zmdi zmdi-alarm zmdi-hc-fw\"></i>&nbsp;&nbsp; Préstamos y reservaciones <i class=\"zmdi zmdi-chevron-down pull-right zmdi-hc-fw\"></i></div>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"loan.html\"><i class=\"zmdi zmdi-calendar zmdi-hc-fw\"></i>&nbsp;&nbsp; Todos los préstamos</a></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"loanpending.html\"><i class=\"zmdi zmdi-time-restore zmdi-hc-fw\"></i>&nbsp;&nbsp; Devoluciones pendientes <span class=\"label label-danger pull-right label-mhover\">7</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"loanreservation.html\"><i class=\"zmdi zmdi-timer zmdi-hc-fw\"></i>&nbsp;&nbsp; Reservaciones <span class=\"label label-danger pull-right label-mhover\">7</span></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"report.html\"><i class=\"zmdi zmdi-trending-up zmdi-hc-fw\"></i>&nbsp;&nbsp; Reportes y estadísticas</a></li>\n");
      out.write("                    <li><a href=\"advancesettings.html\"><i class=\"zmdi zmdi-wrench zmdi-hc-fw\"></i>&nbsp;&nbsp; Configuraciones avanzadas</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content-page-container full-reset custom-scroll-containers\">\n");
      out.write("        <nav class=\"navbar-user-top full-reset\">\n");
      out.write("            <ul class=\"list-unstyled full-reset\">\n");
      out.write("                <figure>\n");
      out.write("                   <img src=\"assets/img/user01.png\" alt=\"user-picture\" class=\"img-responsive img-circle center-box\">\n");
      out.write("                </figure>\n");
      out.write("                <li style=\"color:#fff; cursor:default;\">\n");
      out.write("                    <span class=\"all-tittles\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario.getUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                </li>\n");
      out.write("                <li  class=\"tooltips-general exit-system-button\" data-href=\"Login.jsp\" data-placement=\"bottom\" title=\"Salir del sistema\">\n");
      out.write("                    <i class=\"zmdi zmdi-power\"></i>\n");
      out.write("                </li>\n");
      out.write("                <li  class=\"tooltips-general search-book-button\" data-href=\"searchbook.html\" data-placement=\"bottom\" title=\"Buscar libro\">\n");
      out.write("                    <i class=\"zmdi zmdi-search\"></i>\n");
      out.write("                </li>\n");
      out.write("                <li  class=\"tooltips-general btn-help\" data-placement=\"bottom\" title=\"Ayuda\">\n");
      out.write("                    <!-- en el atributo li añadir accesskey=\"h\" <kbd>alt</kbd> + <kbd>H</kbd> -->\n");
      out.write("                    <i class=\"zmdi zmdi-help-outline zmdi-hc-fw\"></i>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mobile-menu-button visible-xs\" style=\"float: left !important;\">\n");
      out.write("                    <i class=\"zmdi zmdi-menu\"></i>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("         \n");
      out.write("        <div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"ModalHelp\"> \n");
      out.write("          <div class=\"modal-dialog modal-lg\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\"  class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
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
      out.write("        \n");
      out.write("         <div class=\"embed-responsives m-4\" style=\"height: 530px;\">\n");
      out.write("             <iframe class=\"embed-responsive-item\" name=\"myFrame\"  style=\"height: 100%; width: 100%; border:navy\"></iframe>\n");
      out.write("        </div>   \n");
      out.write("         \n");
      out.write("         <footer class=\"footer full-reset\">\n");
      out.write("             \n");
      out.write("            <div class=\"footer-copyright full-reset all-tittles\">© 2020 Administración de Ventas</div>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
