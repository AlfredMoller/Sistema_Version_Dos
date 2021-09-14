package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;
import Modelo.Ciudad;
import Modelo.CiudadDAO;
import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.DeparDAO;
import Modelo.Departamento;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Actividad;
import Modelo.ActividadDAO;
import Modelo.AuditoriaDAO;
import Modelo.ConsAudi;
import Modelo.GrupoDAO;
import Modelo.Inicio;
import Modelo.InicioDAO;
import Modelo.Perfil;
import Modelo.PerfilDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import Modelo.TipoProveedor;
import Modelo.TipoProveedorDAO;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Modelo.Venta;
import Modelo.VentaDAO;
import config.GenerarSerie;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.control.Alert;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;
 
public class Controlador extends HttpServlet {
    
    Empleado em = new Empleado();
    EmpleadoDAO edao = new EmpleadoDAO();
    
    Cliente c = new Cliente();
    ClienteDAO cdao = new ClienteDAO();
    
    Producto p = new Producto();
    ProductoDAO pdao = new ProductoDAO();
    
    Departamento d= new Departamento();
    DeparDAO ddao= new DeparDAO();
    List<Departamento>listadepa=new ArrayList<>();
    
    Ciudad cd= new Ciudad();
    CiudadDAO cidao= new CiudadDAO();
    
    Categoria ct= new Categoria();
    CategoriaDAO cadao= new CategoriaDAO();
    
    Perfil pf= new Perfil();
    PerfilDAO pedao= new PerfilDAO();
    
    Usuario us= new Usuario();
    UsuarioDAO usdao= new UsuarioDAO();
    
    Proveedor pro= new Proveedor();
    ProveedorDAO prodao= new ProveedorDAO();
    
    Actividad acti= new Actividad();
    ActividadDAO actidao= new ActividadDAO();
    
    TipoProveedor tipopr= new TipoProveedor();
    TipoProveedorDAO tipprdao= new TipoProveedorDAO();
    
    Inicio ini= new Inicio();
    InicioDAO inidao= new InicioDAO();
    
    ConsAudi consaud= new ConsAudi();
    AuditoriaDAO auddao= new AuditoriaDAO();
    
            
    int ide;
    int idc;
    int idp;
    int idd;
    int idcd;
    int idct;
    int idpf;
    int idusr;
    int idusr1;
    int idpro;
    int idact;
    int idtpr;
    
    Venta v = new Venta();
    List<Venta> lista = new ArrayList<>();
    int item;
    int cod;
    String descripcion;
    double precio;
    int cant;
    double subtotal;
    double totalPagar;
    
    String numeroserie="";
    VentaDAO vdao = new VentaDAO();
     
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          response.setHeader("Cache-Control","no-cache");  //Para evitar el cache
        response.setHeader("Pragma","no-cache");
        response.setDateHeader ("Expires", 0);
        response.setContentType("application/pdf");
        
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
            String strUsername = request.getParameter("one");
            out.println(strUsername);
            /*String hola= request.getParameter("hola1");
           String a = String.valueOf(hola);
            System.out.println(a);*/
        }
        if (menu.equals("Empleado")) {
            switch (accion) {
                case "Listar":
                    List lista = edao.listar();
                    request.setAttribute("empleados", lista);
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtDni");
                    String nom = request.getParameter("txtNombres");
                    String tel = request.getParameter("txtTel");
                    String est = request.getParameter("txtEstado");
                    String user = request.getParameter("txtUser");
                    em.setDni(dni);
                    em.setNom(nom);
                    em.setTel(tel);
                    em.setEstado(est);
                    em.setUser(user);
                    edao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Empleado e = edao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                     
                case "Actualizar":
                    String dni1 = request.getParameter("txtDni");
                    String nom1 = request.getParameter("txtNombres");
                    String tel1 = request.getParameter("txtTel");
                    String est1 = request.getParameter("txtEstado");
                    String user1 = request.getParameter("txtUser");
                    em.setDni(dni1);
                    em.setNom(nom1);
                    em.setTel(tel1);
                    em.setEstado(est1);
                    em.setUser(user1);
                    em.setId(ide);
                    edao.actualizar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    edao.delete(ide);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);
        }
        if (menu.equals("Cliente")) {
            switch (accion) {
                case "Listar":
                    List lista = cdao.listar();
                    request.setAttribute("clientes", lista);
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtDoc");
                    String nom = request.getParameter("txtNombres");
                    String est = request.getParameter("txtEstado");
                    String dir= request.getParameter("txtDir");
                    String tipodoc= request.getParameter("txtipoDoc");
                    String telefono= request.getParameter("txtTel");
                    String tipotel= request.getParameter("txtipoTel");
                    String autel= request.getParameter("txttelaux");
                    String tipoaux= request.getParameter("txtipoaux");
                    
                    c.setDni(dni);
                    c.setNom(nom);
                    c.setEs(est);
                    c.setDir(dir);
                    c.setTipodoc(tipodoc);
                    c.setTelefono(telefono);
                    c.setTipotel(tipotel);
                    c.setAuxtel(autel);
                    c.setTipoaux(tipoaux);
                    
                    cdao.agregar(c);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idc = Integer.parseInt(request.getParameter("id"));
                    Cliente cl = cdao.listarId(idc);
                    request.setAttribute("cliente", cl);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String dnil = request.getParameter("txtDoc");
                    String noml = request.getParameter("txtNombres");
                    String estl = request.getParameter("txtEstado");
                    String dirl= request.getParameter("txtDir");
                    String tipodocl= request.getParameter("txtipoDoc");
                    String telefonol= request.getParameter("txtTel");
                    String tipotell= request.getParameter("txtipoTel");
                    String autell= request.getParameter("txttelaux");
                    String tipoauxl= request.getParameter("txtipoaux");
                    
                    c.setDni(dnil);
                    c.setNom(noml);
                    c.setEs(estl);
                    c.setDir(dirl);
                    c.setTipodoc(tipodocl);
                    c.setTelefono(telefonol);
                    c.setTipotel(tipotell);
                    c.setAuxtel(autell);
                    c.setTipoaux(tipoauxl);
                    c.setId(idc);
                    cdao.actualizar(c);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idc = Integer.parseInt(request.getParameter("id"));
                    cdao.delete(idc);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }
        if (menu.equals("Producto")) {
            switch (accion) {
                case "Listar":
                    List lista = pdao.listar();
                    request.setAttribute("productos", lista);
                    
                    request.setAttribute("categorias", cadao.listar());
                    break;
                case "Agregar":
                    String nomb = request.getParameter("txtNomb");
                    double pre = Double.parseDouble(request.getParameter("txtPrecio"));
                    int st = Integer.parseInt(request.getParameter("txtStock"));
                    String est = request.getParameter("txtEstado");
                    String cprod= request.getParameter("combocat");
                    String  ivv= request.getParameter("txtivav");
                    double mviv = Double.parseDouble(request.getParameter("txtmonto_ivav"));
                    String id_addusu = ControladorValidar.enviar_idusu();
                    p.setNom(nomb);
                    p.setPre(pre);
                    p.setStock(st);
                    p.setEstado(est);
                    p.setIdprodcat(cprod);
                    p.setIvav(ivv);
                    p.setMonto_ivv(mviv);
                    p.setIdus(id_addusu);
                    pdao.agregar(p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idp = Integer.parseInt(request.getParameter("id"));
                    Producto pr = pdao.listarId(idp);
                    request.setAttribute("producto", pr);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nombl = request.getParameter("txtNomb");
                    double pre1 = Double.parseDouble(request.getParameter("txtPrecio"));
                    int st1 = Integer.parseInt(request.getParameter("txtStock"));
                    String est1 = request.getParameter("txtEstado");
                    String cprodl= request.getParameter("combocat");
                    String  ivvl= request.getParameter("txtivav");
                    double mvivl = Double.parseDouble(request.getParameter("txtmonto_ivav"));
                    String id_editusu = ControladorValidar.enviar_idusu();
                    p.setNom(nombl);
                    p.setPre(pre1);
                    p.setStock(st1);
                    p.setEstado(est1);
                    p.setIdprodcat(cprodl);
                    p.setIvav(ivvl);
                    p.setMonto_ivv(mvivl);
                    p.setId(idp);
                    p.setIdus(id_editusu);
                    pdao.actualizar(p);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idp = Integer.parseInt(request.getParameter("id"));
                    String id_delusu = ControladorValidar.enviar_idusu();
                    pdao.delete(idp, id_delusu);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                case "Buscar":
                    String datoProd= request.getParameter("txtbuscarProd");
                    String txtdf= request.getParameter("txtbuscarProds");
                    String a = txtdf;
                    
                     if(a.equals("Prod")){ 
                     List <Producto> prodlista= pdao.buscarProducto(datoProd);
                     request.setAttribute("productos", prodlista);
                         System.out.println("prod");
                   }else{
                       List <Producto> catProd= pdao.buscarCatProd(datoProd);
                       request.setAttribute("productos", catProd);  
                         System.out.println("cate");
                     }
                    break;
 
                default:                    
                    throw new AssertionError();
            }
            
            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }
        if (menu.equals("NuevaVenta")) {           
            switch (accion) {
                case "BuscarCliente":
                    String dni = request.getParameter("codigocliente");
                    c.setDni(dni);
                    c = cdao.buscar(dni);
                    request.setAttribute("c", c);
                    request.setAttribute("nserie", numeroserie);
                    break;
                case "BuscarProducto":
                    int id = Integer.parseInt(request.getParameter("codigoproducto"));
                    p = pdao.listarId(id);                    
                    request.setAttribute("c", c);
                    request.setAttribute("producto", p);                    
                    request.setAttribute("lista", lista);                    
                    request.setAttribute("totalpagar", totalPagar);
                    request.setAttribute("nserie", numeroserie);
                    break;
                case "Agregar":
                    request.setAttribute("nserie", numeroserie);
                    request.setAttribute("c", c);
                    totalPagar = 0.0;
                    item = item + 1;
                    cod = p.getId();
                    descripcion = request.getParameter("nomproducto");
                    precio = Double.parseDouble(request.getParameter("precio"));
                    cant = Integer.parseInt(request.getParameter("cant"));
                    subtotal = precio * cant;
                    v = new Venta();
                    v.setItem(item);
                    v.setIdproducto(cod);
                    v.setDescripcionP(descripcion);
                    v.setPrecio(precio);
                    v.setCantidad(cant);
                    v.setSubtotal(subtotal);
                    lista.add(v);
                    for (int i = 0; i < lista.size(); i++) {
                        totalPagar = totalPagar + lista.get(i).getSubtotal();
                    }
                    request.setAttribute("totalpagar", totalPagar);
                    request.setAttribute("lista", lista);                    
                    break;
                case "GenerarVenta":
                    //Actualizacion del Stock
                    for (int i = 0; i < lista.size(); i++) {
                        Producto pr=new Producto();
                        int cantidad=lista.get(i).getCantidad();
                        int idproducto=lista.get(i).getIdproducto();
                        ProductoDAO aO=new ProductoDAO();
                        pr=aO.buscar(idproducto);
                        int sac=pr.getStock()-cantidad;
                        aO.actualizarstock(idproducto, sac);
                    }
                    //Guardar Venta
                    v.setIdcliente(c.getId());
                    v.setIdempleado(2);
                    v.setNumserie(numeroserie);
                    v.setFecha("2019-06-14");
                    v.setMonto(totalPagar);
                    v.setEstado("1");
                    vdao.guardarVenta(v);
                    //Guardar Detalle ventas
                    int idv=Integer.parseInt(vdao.IdVentas());
                    for (int i = 0; i < lista.size(); i++) {
                        v=new Venta();
                        v.setId(idv);
                        v.setIdproducto(lista.get(i).getIdproducto());
                        v.setCantidad(lista.get(i).getCantidad());
                        v.setPrecio(lista.get(i).getPrecio());
                        vdao.guardarDetalleventas(v);
                    }
                    lista=new ArrayList<>();
                    break;
                default:                    
                    v = new Venta();
                    lista = new ArrayList<>();
                    item = 0;
                    totalPagar = 0.0;                    
                    numeroserie = vdao.GenerarSerie();
                    if (numeroserie == null) {
                        numeroserie = "000000001";                        
                        request.setAttribute("nserie", numeroserie);
                    } else {
                        int incrementar = Integer.parseInt(numeroserie);
                        GenerarSerie gs = new GenerarSerie();
                        numeroserie = gs.NumeroSerie(incrementar);
                        request.setAttribute("nserie", numeroserie);
                    }
                    request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
            }
            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
        }
        
        //Departamento
        if (menu.equals("Departamento")) {
            switch (accion) {
                case "Listar":
                    List lista = ddao.listar();
                    request.setAttribute("departamentos", lista);
                    break;
                case "Agregar":
                    String ndep = request.getParameter("txtnum");
                    String nodep = request.getParameter("txtnom");
                    String id_addusu = ControladorValidar.enviar_idusu();
                  
                    d.setNum_dep(ndep);
                    d.setNom_dep(nodep);
                    d.setIdus(id_addusu); 
                    ddao.agregar(d);
                    request.getRequestDispatcher("Controlador?menu=Departamento&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idd = Integer.parseInt(request.getParameter("id"));
                    Departamento dep = ddao.listarId(idd);
                    request.setAttribute("departamento", dep);
                    request.getRequestDispatcher("Controlador?menu=Departamento&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String ndepl = request.getParameter("txtnum");
                    String nodepl = request.getParameter("txtnom");
                    String id_editusu = ControladorValidar.enviar_idusu();
                    
                    d.setNum_dep(ndepl);
                    d.setNom_dep(nodepl);
                    d.setIdus(id_editusu);
                    
                    d.setId(idd);
                    ddao.actualizar(d);
                    request.getRequestDispatcher("Controlador?menu=Departamento&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idd = Integer.parseInt(request.getParameter("id"));
                    String id_delusu = ControladorValidar.enviar_idusu();
                    ddao.delete(idd,id_delusu);
                    request.getRequestDispatcher("Controlador?menu=Departamento&accion=Listar").forward(request, response);
                    break;
                 case "Buscar":
                    
                    String dato = request.getParameter("txtbuscar");
                    String txtdepb= request.getParameter("txtbuscarDeps");
                    String a = txtdepb;
                    
                    if(a.equals("Dep")){ 
                        List <Departamento>  listasdep = ddao.buscadepa(dato);
                        request.setAttribute("departamentos", listasdep);
                      }else{
                        List <Departamento>  listasnumdep = ddao.buscnumdepa(dato);
                        request.setAttribute("departamentos", listasnumdep);
                      }
                     break;
                 /*case "Imprimir":
                     Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //se carga el driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema",
                      "root","moller456");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
         
        ServletOutputStream servletOutputStream = response.getOutputStream();
        File reportFile = new File(getServletConfig().getServletContext().getRealPath("C:\\Users\\SAN MIGUEL\\Documents\\Sistema_Vesion_Dos\\web\\Reportes\\Depar.jasper"));
 
        Map parameters = new HashMap();
 
//        int ci;
//        String num;
//        num=request.getParameter("codigo");
//        ci=Integer.parseInt(num);
//        parameters.put("Codigo",ci); //envio de parametros al reporte
 
        byte[] bytes = null;
 
        try {
            bytes = JasperRunManager.runReportToPdf(reportFile.getPath(),null, conn);
          //  bytes = JasperRunManager.runReportToPdf(reportFile.getPath(),parameters, conn);
            
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
 
            servletOutputStream.write(bytes, 0, bytes.length);
            servletOutputStream.flush();
            servletOutputStream.close();
        } catch (JRException e){
            // display stack trace in the browser
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            e.printStackTrace(printWriter);
            response.setContentType("text/plain");
            response.getOutputStream().print(stringWriter.toString());
        }
                     
                     
                      break;*/
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Departamento.jsp").forward(request, response);
        }
        
        //Ciudad
        if (menu.equals("Ciudad")) {
            switch (accion) {
                case "Listar":
                    request.setAttribute("ciudades", cidao.listar());
                    request.setAttribute("dep", ddao.listar());
                     //List lista = cidao.listar();
                   //request.setAttribute("ciudades", lista);
                   // request.setAttribute("grupo", gdao.listarGrupo());

                    break;
                case "Agregar":
                    String nciud = request.getParameter("txtnciu");
                    String nudep = request.getParameter("combodep");
                    String id_addusu = ControladorValidar.enviar_idusu();
                    
                    cd.setNomciu(nciud);
                    cd.setIddpear(nudep);
                    cd.setIdus(id_addusu);
                    cidao.agregar(cd);
                    request.getRequestDispatcher("Controlador?menu=Ciudad&accion=Listar").forward(request, response);
                    
                    break;
                case "Editar":
                    idcd = Integer.parseInt(request.getParameter("id"));
                    Ciudad ci = cidao.listarId(idcd);
                    request.setAttribute("ciudad", ci);
                    request.getRequestDispatcher("Controlador?menu=Ciudad&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nciudl = request.getParameter("txtnciu");
                    String nudepl = request.getParameter("combodep");
                    String id_editusu = ControladorValidar.enviar_idusu();
                    cd.setNomciu(nciudl);
                    cd.setIddpear(nudepl);
                    cd.setIdus(id_editusu);
                    cd.setId(idcd);
                    cidao.actualizar(cd);
                    
                    request.getRequestDispatcher("Controlador?menu=Ciudad&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idcd = Integer.parseInt(request.getParameter("id"));
                    String id_delusu = ControladorValidar.enviar_idusu();
                    cidao.delete(idcd, id_delusu);
                    request.getRequestDispatcher("Controlador?menu=Ciudad&accion=Listar").forward(request, response);
                    break;
                    
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Ciudad.jsp").forward(request, response);
        }
        
          //Categoria Producto
        if (menu.equals("Catprod")) {
            switch (accion) {
                case "Listar":
                    List lista = cadao.listar();
                    request.setAttribute("categorias", lista);
                    break;
                case "Agregar":
                    String rcat = request.getParameter("txtnumcat");
                    String nocat = request.getParameter("txtnomcat");
                    String id_addusu = ControladorValidar.enviar_idusu();
                    ct.setRefcat(rcat);
                    ct.setProdcat(nocat);
                    ct.setIdus(id_addusu);
                    cadao.agregar(ct);
                    request.getRequestDispatcher("Controlador?menu=Catprod&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idct = Integer.parseInt(request.getParameter("id"));
                    Categoria cate = cadao.listarId(idct);
                    request.setAttribute("categoria", cate);
                    request.getRequestDispatcher("Controlador?menu=Catprod&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String rcatl = request.getParameter("txtnumcat");
                    String nocatl = request.getParameter("txtnomcat");
                    ct.setRefcat(rcatl);
                    ct.setProdcat(nocatl);
                    String id_editusu = ControladorValidar.enviar_idusu();
                    ct.setId(idct);
                    ct.setIdus(id_editusu);
                    cadao.actualizar(ct);
                    request.getRequestDispatcher("Controlador?menu=Catprod&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idct = Integer.parseInt(request.getParameter("id"));
                    String id_delusu = ControladorValidar.enviar_idusu();
                    cadao.delete(idct,id_delusu);
                    request.getRequestDispatcher("Controlador?menu=Catprod&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Categoria.jsp").forward(request, response);
        }
        
         //Perfil
        if (menu.equals("Perfil")) {
            switch (accion) {
                case "Listar":
                    List lista = pedao.listar();
                    request.setAttribute("perfiles", lista);
                    break;
                    
                case "Agregar":
                    String noperf = request.getParameter("txtperf"); 
                    String id_addusu = ControladorValidar.enviar_idusu();
                    pf.setNombPerfil(noperf);
                    pf.setIdus(id_addusu);
                    
                    pedao.agregar(pf);
                    request.getRequestDispatcher("Controlador?menu=Perfil&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idpf = Integer.parseInt(request.getParameter("id"));
                    Perfil per = pedao.listarId(idpf);
                    request.setAttribute("perfil", per);
                    request.getRequestDispatcher("Controlador?menu=Perfil&accion=Listar").forward(request, response);
                    break;
                case "Actualizar": 
                    String noperfl = request.getParameter("txtperf"); 
                    String id_editusu = ControladorValidar.enviar_idusu();
                    pf.setNombPerfil(noperfl); 
                    pf.setId(idpf);
                    pf.setIdus(id_editusu);
                    
                    pedao.actualizar(pf);
                    request.getRequestDispatcher("Controlador?menu=Perfil&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idpf = Integer.parseInt(request.getParameter("id"));
                    String id_delusu = ControladorValidar.enviar_idusu();
                    pedao.delete(idpf,id_delusu);
                    request.getRequestDispatcher("Controlador?menu=Perfil&accion=Listar").forward(request, response);
                    break;
              
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Perfil.jsp").forward(request, response);
        
        }
        
        if (menu.equals("Usuario")) {
            switch (accion) {
                case "Listar":
                    List lista = usdao.listar();
                    request.setAttribute("usuarios", lista);
                    request.setAttribute("perfil", pedao.listar());
                    request.setAttribute("listado", edao.listar());
                    request.setAttribute("listados", usdao.listaremple());
                     //En caso de mal funcionamiento quitar esto
                    //request.setAttribute("listado", usdao.listaremple());
                    
                    break;
                /*case "BuscarEmpleado":
                    String dni = request.getParameter("codigoempleado");
                    em.setDni(dni);
                    em = edao.buscar(dni);
                    request.setAttribute("em", em);
                    request.setAttribute("perfil", pedao.listar());
                     
                    break;*/
                case "Agregar":
                    String idem = request.getParameter("codigoempleado");
                    String nombus = request.getParameter("txtnombusu");
                    String contra = request.getParameter("txtclave");
                    String pf = request.getParameter("comboper");
                   
                    //us.setIdemple(em.getId());
                    us.setIdemple(idem);
                    us.setNombusu(nombus);
                    us.setClave(contra);
                    us.setIdperfil(pf);
                    usdao.agregar(us);
                    request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    break;
                case "Enviar":
                    idusr1 = Integer.parseInt(request.getParameter("id1"));
                    Usuario usu = usdao.listarempleid(idusr1);
                    
                    request.setAttribute("usuario", usu);
                    request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    break;   
                case "Editar":
                    idusr = Integer.parseInt(request.getParameter("id"));
                    Usuario usl = usdao.listarId(idusr);
                    
                    request.setAttribute("usuario", usl);
                     //request.setAttribute("em", em);
                    request.setAttribute("listados", usdao.listaremple());
                    //En caso de mal funcionamiento eliminar a partir de esta linea
                    
                    List listar = usdao.listar();
                    request.setAttribute("usuarios", listar);
                    request.setAttribute("perfil", pedao.listar());
                    request.setAttribute("listado", edao.listar());
                    //y seguir hasta aqui y descomentar la de abajo
                    
                    //request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    break;
                case "Actualizar": 
                    String ideml = request.getParameter("codigoempleado");
                    String nombusl = request.getParameter("txtnombusu");
                    String contral = request.getParameter("txtclave");
                    String pfl = request.getParameter("comboper");
                    
                    us.setIdemple(ideml);
                    us.setNombusu(nombusl);
                    us.setClave(contral);
                    us.setIdperfil(pfl);
                    us.setId(idusr);
                    usdao.actualizar(us);
                    request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idusr = Integer.parseInt(request.getParameter("id"));
                    usdao.delete(idusr);
                    request.getRequestDispatcher("Controlador?menu=Usuario&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
                    
            }
            request.getRequestDispatcher("Usuario.jsp").forward(request, response);
        }
       //Proveedor
       if (menu.equals("Proveedor")) {
            switch (accion) {
                case "Listar":
                    List lista = prodao.listar();
                    request.setAttribute("proveedores", lista);
                    
                    request.setAttribute("actividad", actidao.listar());
                    request.setAttribute("tipoprv",tipprdao.listar());
                    
                    ///request.setAttribute("empresa", emprdao.listar());
                    break;
                case "Agregar":
                    String emp = request.getParameter("txtEmp");
                    String pers = request.getParameter("txtPer");
                    String docu = request.getParameter("txtDoc");
                    String tipo_doc = request.getParameter("txtipoDoc");
                    String telef = request.getParameter("txtTel");
                    String tipotel= request.getParameter("txtipoTel");
                    String telaux = request.getParameter("txttelaux");
                    String tipoaux = request.getParameter("txtipoaux");
                    String comboact= request.getParameter("comboAct");
                    String comboTipo= request.getParameter("comboTipo");
                    String direcc = request.getParameter("txtdirec");  
                       
                   
                    //us.setIdemple(em.getId());
                    pro.setIdempresa(emp);
                    pro.setPersfisica(pers);
                    pro.setDocumento(docu);
                    pro.setTipodoc(tipo_doc);
                    pro.setTelefono(telef);
                    pro.setTipotel(tipotel);
                    pro.setTelaux(telaux);
                    pro.setTipoaux(tipoaux);
                    pro.setIdactividad(comboact);
                    pro.setIdtipoprov(comboTipo);
                    pro.setDireccion(direcc);
                    prodao.agregar(pro);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;   
                case "Editar":
                    idpro = Integer.parseInt(request.getParameter("id"));
                    Proveedor prov = prodao.listarId(idpro);
                    
                    request.setAttribute("proveedor", prov); 
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Actualizar": 
                    String empl = request.getParameter("txtEmp");
                    String persl = request.getParameter("txtPer");
                    String docul = request.getParameter("txtDoc");
                    String tipo_docl = request.getParameter("txtipoDoc");
                    String telefl = request.getParameter("txtTel");
                    String tipotell = request.getParameter("txtipoTel");
                    String telauxl = request.getParameter("txttelaux");
                    String tipoauxl = request.getParameter("txtipoaux");
                    String comboactl= request.getParameter("comboAct");
                    String comboTipol= request.getParameter("comboTipo");
                    String direccl = request.getParameter("txtdirec");  
                    
                    pro.setIdempresa(empl);
                    pro.setPersfisica(persl);
                    pro.setDocumento(docul);
                    pro.setTipodoc(tipo_docl);
                    pro.setTelefono(telefl);
                    pro.setTipotel(tipotell);
                    pro.setTelaux(telauxl);
                    pro.setTipoaux(tipoauxl);
                    pro.setIdactividad(comboactl);
                    pro.setIdtipoprov(comboTipol);
                    pro.setDireccion(direccl);
                    
                    pro.setId(idpro);
                    prodao.actualizar(pro);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idpro = Integer.parseInt(request.getParameter("id"));
                    prodao.delete(idpro);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
                    
            }
            request.getRequestDispatcher("Proveedor.jsp").forward(request, response);
        }
       
         //Tipo Proveedor
        if (menu.equals("TipoProv")) {
            switch (accion) {
                case "Listar":
                    List lista = tipprdao.listar();
                    request.setAttribute("tiposprov", lista);
                    break;
                case "Agregar":
                    String tipo_prov = request.getParameter("txttprov");
                    tipopr.setTipo_proveedor(tipo_prov);
                     
                    tipprdao.agregar(tipopr);
                    request.getRequestDispatcher("Controlador?menu=TipoProv&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idtpr = Integer.parseInt(request.getParameter("id"));
                    TipoProveedor tproveedor= tipprdao.listarId(idtpr);
                    request.setAttribute("tprv",tproveedor );
                    request.getRequestDispatcher("Controlador?menu=TipoProv&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String tipo_prv = request.getParameter("txttprov");
                    tipopr.setTipo_proveedor(tipo_prv);
                    
                    tipopr.setIdtipoprov(idtpr);
                    tipprdao.actualizar(tipopr);
                    request.getRequestDispatcher("Controlador?menu=TipoProv&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idtpr = Integer.parseInt(request.getParameter("id"));
                    tipprdao.delete(idtpr);
                    request.getRequestDispatcher("Controlador?menu=TipoProv&accion=Listar").forward(request, response);
                    break; 
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Tipo_Proveedor.jsp").forward(request, response);
        }
       
        //Actividad
        if (menu.equals("Actividad")) {
            switch (accion) {
                case "Listar":
                    List lista = actidao.listar();
                    request.setAttribute("actividades", lista);
                     
                    break;
                case "Agregar":
                    String tipo_act = request.getParameter("txtactividad");
                    acti.setNombact(tipo_act);
                     
                    actidao.agregar(acti);
                    request.getRequestDispatcher("Controlador?menu=Actividad&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idact = Integer.parseInt(request.getParameter("id"));
                    Actividad actvidad= actidao.listarId(idact);
                    request.setAttribute("actvd",actvidad );
                    request.getRequestDispatcher("Controlador?menu=Actividad&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String tipo_actl = request.getParameter("txtactividad");
                    acti.setNombact(tipo_actl);
                    
                    acti.setId(idact);
                    actidao.actualizar(acti);
                    request.getRequestDispatcher("Controlador?menu=Actividad&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idact = Integer.parseInt(request.getParameter("id"));
                    actidao.delete(idact);
                    request.getRequestDispatcher("Controlador?menu=Actividad&accion=Listar").forward(request, response);
                    break; 
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Actividad_Proveedor.jsp").forward(request, response);
        }
        
        
        //Inicio
        if (menu.equals("Inicio")) {
            switch (accion) {
                case "Listar":
                    List lista = inidao.listar();
                    request.setAttribute("conteo", lista);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Inicio.jsp").forward(request, response);
        }
        
         //Auditoria
        if (menu.equals("Auditoria")) {
            switch (accion) {
                 case "Listar":
                     List listaaudi = auddao.listarAudi();
                     request.setAttribute("auditoria", listaaudi);
                     request.setAttribute("usuario", edao.listar());
                     break;
                  case "Buscar":
                    String datoDep= request.getParameter("eventos");
                   
                    /*En caso de volver a modificar en futuro sacar las lineas de abajo ya que falta incluir al tipo de usuario*/
                     if(!datoDep.equals("Todos")){
                        List <ConsAudi> audlista= auddao.buscaAudi(datoDep);
                        request.setAttribute("auditoria", audlista);
                        System.out.println("cualquier evento");
                      
                     }else{
                          List listaaudi2 = auddao.listarAudi();
                          request.setAttribute("auditoria", listaaudi2); 
                          System.out.println("evento todos");
                     }
                    break; 
                    
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("ConsultaAudi.jsp").forward(request, response);
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

}
