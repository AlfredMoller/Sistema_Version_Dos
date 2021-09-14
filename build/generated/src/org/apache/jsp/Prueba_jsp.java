package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public final class Prueba_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    // --- String Join Function
    public String join(ArrayList<?> arr, String del)
    {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < arr.size(); i++)
        {
            if (i > 0) output.append(del);
            
            // --- Quote strings, only, for JS syntax
            if (arr.get(i) instanceof String) output.append("\"");
            output.append(arr.get(i));
            if (arr.get(i) instanceof String) output.append("\"");
        }
        return output.toString();
    }

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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>MySQL Demo</title>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://cdn.zingchart.com/zingchart.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <script>\n");
      out.write("        ");

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            final String host = "jdbc:mysql://localhost/" + "deteccion";
            final Connection conn = DriverManager.getConnection(host, "root", "moller456");
            final Statement stmt = conn.createStatement();
            final ResultSet rs = stmt.executeQuery("Select * from personas");
            ArrayList<String> months = new ArrayList<String>();
            ArrayList<Integer> users = new ArrayList<Integer>();
            while(rs.next())
            {
                months.add(rs.getString("Personal"));
                users.add(Integer.parseInt(rs.getString("Usuarios")));
            }
            conn.close();
        
      out.write("\n");
      out.write("        var monthData = [");
      out.print( join(months, ",") );
      out.write("];\n");
      out.write("        var userData = [");
      out.print( join(users, ",") );
      out.write("];\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("    window.onload = function()\n");
      out.write("    {\n");
      out.write("        zingchart.render\n");
      out.write("        ({\n");
      out.write("            id:\"myChart\",\n");
      out.write("            width:\"100%\",\n");
      out.write("            height:400,\n");
      out.write("            data:\n");
      out.write("            {\n");
      out.write("                \"type\":\"bar\",\n");
      out.write("                \"title\":\n");
      out.write("                {\n");
      out.write("                    \"text\":\"Data Pulled from MySQL Database\"\n");
      out.write("                },\n");
      out.write("                \"scale-x\":\n");
      out.write("                {\n");
      out.write("                    \"labels\": monthData\n");
      out.write("                },\n");
      out.write("                \"plot\":\n");
      out.write("                {\n");
      out.write("                    \"line-width\":1\n");
      out.write("                },\n");
      out.write("                \"series\":\n");
      out.write("                [\n");
      out.write("                    {\n");
      out.write("                      \"values\":userData\n");
      out.write("                    }\n");
      out.write("                ]\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    };\n");
      out.write("    </script>\n");
      out.write("    <h1>Data from MySQL Database</h1>\n");
      out.write("    <div id=\"myChart\"></div>\n");
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
