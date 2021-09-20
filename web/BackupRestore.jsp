<%-- 
    Document   : BackupRestore
    Created on : Sep 18, 2021, 11:54:48 PM
    Author     : pc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categorías</title>    
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="Shortcut Icon" type="image/x-icon" href="assets/icons/book.ico" />
        <script src="js/sweet-alert.min.js"></script>
        <link rel="stylesheet" href="css/sweet-alert.css">
        <link rel="stylesheet" href="css/material-design-iconic-font.min.css">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/jquery-1.11.2.min.js"><\/script>')</script>
        <script src="js/modernizr.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="js/main.js"></script>
        <script src="js/EliminarPrueba.js"></script>
        <script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>



        <title>JSP Page</title>
    </head>
    <body>        
        <div class="container">
            <div id="pruebaDoc"></div>

            <div class="page-header">
                <h1 class="all-tittles">Sistema de Ventas <small>Configuraciones Avanzadas</small></h1>
            </div>
        </div>
        <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;"> 
                <li role="presentation" class="active"><a href="Controlador?menu=ConfAdv&accion=Backup" target="myFrame">Crear Respaldo</a></li>
                <li role="presentation"><a href="Controlador?menu=ConfAdv&accion=Restaurar" target="myFrame">Restaurar Sistema</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/undraw/uploading.svg" alt="user" class="img-responsive center-box" style="max-width: 190px;">
                    <!--antes los iconos en todos las ventanas eran de 110px-->
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para registrar nuevos Departamentos, debes de llenar el siguiente formulario para registrar un Departamento
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                        <li class="active">Realizar Copia de Seguridad</li>
                    </ol>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="container-flat-form">
                  <form   action="Controlador?menu=ConfAdv" method="POST"> 
                      <button type="submit" name="accion" onclick="$('#fBorrarbackup').submit()" value="Borrarbackup" class="btn btn-default"><i class="zmdi zmdi-search"></i> </button>
                    <div class="row">
                        <div class="col-xs-12 col-md-6" onclick="$('#fBackup').submit()" value="Backup">
                            <div class="report-content">
                                <p class="text-center"><i class="zmdi zmdi-cloud-download zmdi-hc-4x"></i></p>
                                <h3 class="text-center all-tittles">realizar copia de seguridad</h3>
                            </div>
                        </div>
                        <div class="col-xs-12 col-md-6" >
                            <div class="report-content">
                                <p class="text-center"><i class="zmdi zmdi-cloud-upload zmdi-hc-4x"></i></p>
                                <h3 class="text-center all-tittles">restaurar el sistema</h3>
                            </div>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <div class="report-content">
                                <p class="text-center"><i class="zmdi zmdi-cloud-off zmdi-hc-4x"></i></p>
                                <h3 class="text-center all-tittles">borrar copias de seguridad</h3>
                             </div>
                        </div>
                    </div>
                 </form> 
            </div>
            
     

    </div>

    <div class="modal fade" tabindex="-1" role="dialog" id="ModalHelp">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
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

</body>
</html>


