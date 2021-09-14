<%-- 
    Document   : ConsultaAudi
    Created on : 10-ago-2020, 21:28:18
    Author     : SAN MIGUEL
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
              <h1 class="all-tittles">Sistema de Ventas <small>Consulta Auditoria</small></h1>
            </div>
        </div>
        <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;"> 
               <li role="presentation" class="active"><a href="Controlador?menu=Auditoria&accion=Listar" target="myFrame">Consulta Auditoria</a></li>
              <li role="presentation"><a href="Controlador?menu=Usuario&accion=Listar" target="myFrame">Registro de Usuario</a></li>
               <li role="presentation"><a href="Controlador?menu=Pèrfil&accion=Listar" target="myFrame">Registro de Perfiles</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/undraw/folder_files_nweq.svg" alt="user" class="img-responsive center-box" style="max-width: 190px;">
                    <!--antes los iconos en todos las ventanas eran de 110px-->
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para visualizar los eventos del sistema, debes de seleccionar algunas de las opciones de las listas desplegables para poder visualizar el listado correspondiente a la selección
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Listado de Eventos del Sistema</li>
                      <!--<li><a href="listcategory.html">Listado de Departamentos</a></li>-->
                    </ol>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Auditoria de Eventos del Sistema</div>
                <!--<form autocomplete="off">-->
                <form autocomplete="off" action="Controlador?menu=Auditoria" method="POST">
                    <div class="row">
                      <!-- <div class="col-xs-10 col-sm-8 col-sm-offset-2">-->
                         <div class="col-sm-12 ">
                <div class="card">
                    <div class="card-body">
                        
                     <form id="fBuscar" action="Controlador?menu=Departamento" method="POST"> 
                            
                           <!--Input select para la categoriá de productos-->  
                            <div class="group-material">
                                <span style="font-weight:bold">Buscar por:</span>
                                <select id="combousu" name="combousu" class=" tooltips-general" data-toggle="tooltip" data-placement="top" title="Todos" value="" style="height:30px;width:150px;">
                                        <option value="0">Todos</option>    
                                <c:forEach items="${usuario}" var="usu">
                                    <c:choose>
                                        <c:when test="${auditorias.getIdusuario() eq usu.getId()}">
                                            <option value="${usu.getId()}" selected="true">${usu.getUser()} </option>
                                        </c:when>
                                        <c:otherwise>
                                            <option value="${usu.getId()}">${usu.getUser()} </option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>
                                                    
                                
                                <span style="font-weight: bold">Actividades:</span>
                                <select id="select_task" name="eventos" style="height:30px;width:100px;">
                                <option value="Todos">Todos</option>
                                <option value="Guardar">Guardar</option>
                                <option value="Editar">Editar</option>
                                <option value="Eliminar">Eliminar</option>
                                <option value="Eliminar">Ingreso</option>
                                <option value="Eliminar">Salida</option>
                                 
                            </select>
                           
                           <button type="submit" name="accion" onclick="$('#fBuscar').submit()" value="Buscar" class="btn btn-default"><i class="zmdi zmdi-search"></i> </button>                                                               
                         </div>                                                      
                        </form> 
                        
                        <div class="custom-control custom-radio custom-controls-inline">
                            <label>Buscar por:</label>
                            <input type="radio" id="depBus" name="radiobusVal" value="Dep" class="material-control-input">
                            <span for="depBus">Departamento</span>
                            
                            <input type="radio" id="numdepBus" name="radiobusVal" value="Numdep" class="material-control-input">
                            <span for="depBus">Nº Departamento</span>
                        <div>
                        
                        <table id="example" class="table table-hover table-responsive">
                            <thead>
                                <tr>
                                     <th>ID</th>
                                    <th>Fecha</th>
                                    <th>Ip Maquina</th>
                                    <th>Tabla</th>
                                    <th>Evento</th>
                                    <th>Hora</th>
                                    <th>Descripcion</th>
                                    <th>Usuario</th>
                                  
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="aud" items="${auditoria}">
                                    <tr>
                                        <td>${aud.getIdauditoria()}</td>
                                        <td>${aud.getFechaaudi()}</td>
                                        <td>${aud.getIpmaquina()}</td>
                                        <td>${aud.getNombtabla()}</td>
                                        <td>${aud.getTipoevento()}</td>
                                        <td>${aud.getHorauadi()}</td>
                                        <td>${aud.getDescaudi()}</td>
                                        <td>${aud.getIdusuario()}</td>
                                                                             
                                        <!--<td>
                                            <a class="btn btn-warning" href="Controlador?menu=Departamento&accion=Editar&id=${dep.getId()}"><i class="zmdi zmdi-edit"></i> &nbsp;&nbsp; Editar</a>
                                            <a class="btn btn-danger delete-system-button" data-href="Controlador?menu=Departamento&accion=Delete&id=${dep.getId()}"></i> &nbsp;&nbsp; Eliminar</a>
                                        </td>-->
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>   
                             
                       </div>
                    </div>
                              
                                 
                        <!-- <div class="group-material">
                                
                                <input type="search"  name="txtbuscar"  >
                                <button type="submit" name="accion" value="Buscar" class="btn btn-success"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Buscar</button>
                                
                            </div> -->        
                                
                </form>
                               
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
        <script>
            $(document).ready(function() {
                 $('#example').DataTable( {
                   searching:false,  
                  "pagingType": "full_numbers"
              } );
          } );
        </script>
    </body>
</html>

