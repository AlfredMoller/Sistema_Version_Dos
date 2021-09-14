<%-- 
    Document   : Principal
    Created on : 19-mar-2020, 10:08:03
    Author     : SAN MIGUEL
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="Shortcut Icon" type="image/x-icon" href="assets/icons/graph.png" />
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
        <script>
            /*window.onload = function() {
             var getInput = document.getElementById("one").value
             localStorage.setItem("storageName",getInput);
             }*/
             $(document).ready(function() {
              
                  let status = '${usuario.getUser()}'; 
                  let pics = "logos.png" 
                  let main_path = "assets/repo/";
                  let low_caseuser =  status.toLowerCase();
                  console.log(status)
                  let final_path = main_path+low_caseuser+"/"+pics
                  
                 document.getElementById("prof_pic").src = final_path ;
                  document.getElementById("prof_picsmall").src = final_path ;
             
 
             });
             
        </script>
    </head>
    <body>
        <div class="navbar-lateral full-reset">
            <div class="visible-xs font-movile-menu mobile-menu-button"></div>
            <div class="full-reset container-menu-movile custom-scroll-containers">
                <div class="logo full-reset all-tittles">
                    <i class="visible-xs zmdi zmdi-close pull-left mobile-menu-button" style="line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px;"></i> 
                    sistema de ventas
                </div>
                <div class="full-reset" style="background-color:#2B3D51; padding: 10px 0; color:#fff;">
                    <figure>
                        <img id="prof_pic" onerror="javascript:this.src='assets/repo/nobody/logos.png'"  alt="Biblioteca" class="img-responsive center-box" style="width:55%;">
                    </figure>
                    <p class="text-center" style="padding-top: 15px;"><strong>A bordo:</strong> ${usuario.getNom()} </p>

                    <!--${usuario.getUser()}-->
                </div>
                <div class=" nav-lateral-list-menu">
                    <ul class="list-unstyled">
                        <li><a href="Controlador?menu=Inicio&accion=Listar" target="myFrame"><i class="zmdi zmdi-home zmdi-hc-fw"></i>&nbsp;&nbsp; Inicio</a></li>
                        <!--Registro de Datos de Localidades-->
                        <li>
                            <div class="dropdown-menu-button"><i class="zmdi zmdi-city zmdi-hc-fw"></i>&nbsp;&nbsp; Localidades<i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                            <ul class="list-unstyled">

                                <li><a href="Controlador?menu=Departamento&accion=Listar" target="myFrame"><i class="zmdi zmdi-map zmdi-hc-fw"></i>&nbsp;&nbsp; Departamentos</a>  </li>
                                <li><a href="Controlador?menu=Ciudad&accion=Listar"  target="myFrame"><i class="zmdi zmdi-city-alt zmdi-hc-fw"></i>&nbsp;&nbsp; Ciudades</a></li>
                            </ul>
                        </li>

                        <!--Registro de Datos de Productos-->
                        <li>
                            <div class="dropdown-menu-button"><i class="zmdi zmdi-assignment-o zmdi-hc-fw"></i>&nbsp;&nbsp; Productos <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                            <ul class="list-unstyled">
                                <li><a href="Controlador?menu=Catprod&accion=Listar" target="myFrame"><i class="zmdi zmdi-bookmark-outline zmdi-hc-fw"></i>&nbsp;&nbsp; Categoría</a></li>
                                <li><a href="Controlador?menu=Producto&accion=Listar" target="myFrame"><i class="zmdi zmdi-book zmdi-hc-fw"></i>&nbsp;&nbsp;Registo de Productos</a></li>
                            </ul>
                        </li>

                        <!--Registro de Datos para Gentío-->
                        <li>
                            <div class="dropdown-menu-button"><i class="zmdi zmdi-account-add zmdi-hc-fw"></i>&nbsp;&nbsp; Registro de Personas <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                            <ul class="list-unstyled">
                                <li><a href="Controlador?menu=Cliente&accion=Listar" target="myFrame"><i class="zmdi zmdi-accounts zmdi-hc-fw"></i>&nbsp;&nbsp; Clientes</a></li>

                                <c:if test="${usuario.getEstado() eq 'Administrador'}">
                                    <li><a href="Controlador?menu=Empleado&accion=Listar" target="myFrame"><i class="zmdi zmdi-male-female zmdi-hc-fw"></i>&nbsp;&nbsp; Empleados</a></li>
                                    </c:if>

                                <c:if test="${usuario.getEstado() eq 'Empleado'}">
                                    <li style="display: none"><a href="Controlador?menu=Empleado&accion=Listar" target="myFrame"><i class="zmdi zmdi-male-female zmdi-hc-fw"></i>&nbsp;&nbsp; Empleados</a></li>
                                    </c:if>    

                                <!--Sub-menu con Sub-listas dentro del Menu de Gentíos-->
                                <li class="dropdown-submenu">
                                    <a tabindex="-1" href="#" class="dropdown-menu-button"><i class="zmdi zmdi-truck zmdi-hc-fw"></i>&nbsp;&nbsp; Proveedores <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></a>
                                    <ul class="list-unstyled">

                                        <li><a href="Controlador?menu=Proveedor&accion=Listar" target="myFrame"><i class="zmdi zmdi-account-add zmdi-hc-fw"></i>&nbsp;&nbsp; Registro de Proveedores</a></li>
                                        <li><a href="Controlador?menu=TipoProv&accion=Listar" target="myFrame"><i class="zmdi zmdi-case zmdi-hc-fw"></i>&nbsp;&nbsp; Tipo Proveedores</a></li>
                                        <li><a href="Controlador?menu=Actividad&accion=Listar" target="myFrame"><i class="zmdi zmdi-cocktail zmdi-hc-fw"></i>&nbsp;&nbsp; Actividad</a></li>
                                    </ul>
                                </li>
                                <!--Hasta aquí el Sub-Menu con Sub-listas-->
                            </ul>
                        </li>



                        <!--Registro de Datos de Gentío | Comprobamos si el usuario esta con privilegio de Administrador -->
                        <c:if test="${usuario.getEstado() eq 'Administrador'}">
                            <li >
                                <div class="dropdown-menu-button"><i class="zmdi zmdi-case zmdi-hc-fw"></i>&nbsp;&nbsp; Administración <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                                <ul class="list-unstyled"><li><a href="Controlador?menu=Usuario&accion=Listar" target="myFrame"><i class="zmdi zmdi-accounts zmdi-hc-fw"></i>&nbsp;&nbsp; Registro de Usuario</a></li>
                                    <li><a href="Controlador?menu=Perfil&accion=Listar" target="myFrame"><i class="zmdi zmdi-account-circle zmdi-hc-fw"></i>&nbsp;&nbsp; Registro de Perfiles</a></li>  
                                    <li><a href="Controlador?menu=Auditoria&accion=Listar" target="myFrame"><i class="zmdi zmdi-assignment zmdi-hc-fw"></i>&nbsp;&nbsp;Consulta Auditoria</a></li>  

                                </ul>
                            </li>
                        </c:if>

                        <c:if test="${usuario.getEstado() eq 'Empleado'}">
                            <li style="display: none">
                                <div class="dropdown-menu-button"><i class="zmdi zmdi-case zmdi-hc-fw"></i>&nbsp;&nbsp; Administración <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                                <ul class="list-unstyled"><li><a href="Controlador?menu=Usuario&accion=Listar" target="myFrame"><i class="zmdi zmdi-accounts zmdi-hc-fw"></i>&nbsp;&nbsp; Registro de Usuario</a></li>
                                    <li><a href="Controlador?menu=Perfil&accion=Listar" target="myFrame"><i class="zmdi zmdi-account-circle zmdi-hc-fw"></i>&nbsp;&nbsp; Registro de Perfiles</a></li>  
                                    <li><a href="Controlador?menu=Auditoria&accion=Listar" target="myFrame"><i class="zmdi zmdi-assignment zmdi-hc-fw"></i>&nbsp;&nbsp;Consulta Auditoria</a></li>  

                                </ul>
                            </li>
                        </c:if>


                        <li>
                            <div class="dropdown-menu-button"><i class="zmdi zmdi-trending-up zmdi-hc-fw"></i>&nbsp;&nbsp; Gráficas Estadíticas <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw"></i></div>
                            <ul class="list-unstyled">
                                <li><a href="GraficaVenta.jsp" target="myFrame"><i class="zmdi zmdi-shopping-cart zmdi-hc-fw"></i>&nbsp;&nbsp;Gráfica de Ventas</a></li>
                                <li><a href=" " target="myFrame"><i class="zmdi zmdi-file-plus zmdi-hc-fw"></i>&nbsp;&nbsp;Gráfica de Pedidos</a></li>

                                <c:if test="${usuario.getEstado() eq 'Administrador'}"> 
                                    <li><a href=" " target="myFrame"><i class="zmdi zmdi-money zmdi-hc-fw"></i>&nbsp;&nbsp;Movimientos Monetarios</a></li>
                                    </c:if>
                                    
                                 <c:if test="${usuario.getEstado() eq 'Empleado'}"> 
                                     <li style="display:none"><a href=" " target="myFrame"><i class="zmdi zmdi-money zmdi-hc-fw"></i>&nbsp;&nbsp;Movimientos Monetarios</a></li>
                                    </c:if>    

                                <!--<li>
                                    <a href="loanpending.html"><i class="zmdi zmdi-time-restore zmdi-hc-fw"></i>&nbsp;&nbsp; Devoluciones pendientes <span class="label label-danger pull-right label-mhover">7</span></a>
                                </li>
                                <li>
                                    <a href="loanreservation.html"><i class="zmdi zmdi-timer zmdi-hc-fw"></i>&nbsp;&nbsp; Reservaciones <span class="label label-danger pull-right label-mhover">7</span></a>
                                </li>-->
                            </ul>
                        </li>
                        <!--<li><a href="report.html"><i class="zmdi zmdi-trending-up zmdi-hc-fw"></i>&nbsp;&nbsp; Reportes y estadísticas</a></li>-->
                        <li><a href="advancesettings.html"><i class="zmdi zmdi-wrench zmdi-hc-fw"></i>&nbsp;&nbsp; Configuraciones avanzadas</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="content-page-container full-reset custom-scroll-containers">
            <nav class="navbar-user-top full-reset">
                <ul class="list-unstyled full-reset">
                    <figure>
                        <img id="prof_picsmall" onerror="javascript:this.src='assets/repo/nobody/logos.png'" alt="user-picture" class="img-responsive img-circle center-box">
                    </figure>
                    <li style="color:#fff; cursor:default;">
                         <!-- Traemos el Usuario en un span-->
                        <span class="all-tittles">${usuario.getUser()}</span>
                    </li>

                    <script>

                        //$(function () {font
                        // var $src = $('#one'),
                        //   $dst = $('#two');
                        //$src.on('click', function () {
                        //  $dst.val($src.val());
                        //alert('me llamo'+$src.val())
                        // });
                        //});
                    </script> 
                    </script>
                    <li  class="tooltips-general exit-system-button" data-href="Validar?accion=Salir" data-placement="bottom" title="Salir del sistema">
                        <i class="zmdi zmdi-power"></i>
                    </li>
                    <li  class="tooltips-general search-book-button" data-href="searchbook.html" data-placement="bottom" title="Buscar libro">
                        <i class="zmdi zmdi-search"></i>
                    </li>

                    <li  class="tooltips-general btn-help" data-placement="bottom" title="Ayuda">
                        <i class="zmdi zmdi-help-outline zmdi-hc-fw"></i>
                    </li>
                    <!-- en el atributo li añadir accesskey="h" <kbd>alt</kbd> + <kbd>H</kbd> -->

                    <li class="mobile-menu-button visible-xs" style="float: left !important;">
                        <i class="zmdi zmdi-menu"></i>
                    </li>
                </ul>
            </nav>

            <div class="modal fade" tabindex="-1" role="dialog" id="ModalHelp"> 
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button"  class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title text-center all-tittles">ayuda del sistema</h4>
                        </div>
                        <div class="modal-body">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore dignissimos qui molestias ipsum officiis unde aliquid consequatur, accusamus delectus asperiores sunt. Quibusdam veniam ipsa accusamus error. Animi mollitia corporis iusto.
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="zmdi zmdi-thumb-up"></i> &nbsp; De acuerdo</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="embed-responsives m-4" style="height: 570px;">
                <iframe class="embed-responsive-item" name="myFrame"  style="height: 100%; width: 100%; border:navy"></iframe>
            </div>   

            <footer class="footer full-reset">

                <div class="footer-copyright full-reset all-tittles">© 2020 Administración de Ventas</div>
            </footer>
        </div>
    </body>
</html>