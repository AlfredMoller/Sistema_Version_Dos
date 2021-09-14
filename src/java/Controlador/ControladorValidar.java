package Controlador;

import Modelo.Auditoria;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorValidar extends HttpServlet {

    EmpleadoDAO edao = new EmpleadoDAO();
    Empleado em = new Empleado();
    Auditoria auditoria = new Auditoria();
    public static int dato_usu ;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*Ruta de Acceso de Server:
        http://localhost:8084/Sistema_Vesion_Dos/Validar?accion=Ingresar
        */
        String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("Ingresar")) {
            String user = request.getParameter("txtuser");
            String pass = request.getParameter("txtpass");
            //String SalPimienta="1987";
           // String ContEncriptada=getMD5(pass+SalP imienta);
            em = edao.validar(user, pass);
            
            String val_clipage = request.getParameter("valuepage");
            Boolean st_refpage = Boolean.parseBoolean(val_clipage);
            
            if (em.getUser() != null && !st_refpage) {
                request.setAttribute("usuario", em);
                dato_usu = em.getId();
                
                //Guardamos los datos del ingreso del usuario al sistema
                String user_log_id = String.valueOf(em.getId());
                String user_log = em.getUser();
                String objeto = "Usuario Ingresado con Nombre:" + " " + user_log;
                String evento = "Ingreso";
                String tabla = "usuario";
                auditoria.audi(user_log_id, objeto, evento, tabla);
                
                request.getRequestDispatcher("Controlador?menu=Principal").forward(request, response);
                 
            } else {
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        } else {
                //Guardamos los datos de salida del usuario al sistema
                String user_log_id = String.valueOf(em.getId());
                String user_log = em.getUser();
                String objeto = "Usuario Retirado con Nombre:" + " " + user_log;
                String evento = "Egreso";
                String tabla = "usuario";
                auditoria.audi(user_log_id, objeto, evento, tabla);
            
                request.getRequestDispatcher("Login.jsp").forward(request, response);
        }

    }
    //Contraseña de prueba 1236 y usuario adm01
       public static String getMD5(String input) {
    try {
             MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
             while (hashtext.length() < 32)
            {
                hashtext = "0" + hashtext;
            }
            return hashtext;
 }
 catch (NoSuchAlgorithmException e) 
    {
        throw new RuntimeException(e);
    }
 }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
   
    
    public static String enviar_idusu(){
       int dato_usus = dato_usu;
       String edit_id = String.valueOf(dato_usus);
       return edit_id;
    }

}
