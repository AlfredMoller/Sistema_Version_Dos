<%-- 
    Document   : Usuario
    Created on : 15-abr-2020, 10:26:59
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
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery-1.11.2.min.js"><\/script>')</script>
    <script src="js/modernizr.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/Devolver.js" type="text/javascript"></script>
    <script src="js/EliminarPrueba.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.css"/>
        <!--<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"/>
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>-->
     
        <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.16/datatables.min.js"></script> 
        <title>JSP Page</title>
           
    <script type="text/javascript">
       
        
        $(document).ready(function(){
  $(".ventanaMerg").click(function(){
     $("#myModal").modal();
    
  });
});
            
    </script>    
            
     
    
    <style>
    .field-icon {
          float: right;
          margin-left: -25px;
          margin-top: -25px;
          position: relative;
          z-index: 2;
    }
    
   .modal-header, h4, .close {
    background-color: #5cb85c;
    color:white !important;
    text-align: center;
     
    font-size: 30px;
   
  }
  .modal-footer {
    background-color: #f9f9f9;
  }
  .modal-backdrop {
   background-color: transparent;
}
.modal-body{
    overflow: hidden;
}
    
    </style>   
    </head>
    <body>        
       <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">Sistema de Ventas <small>Administracion</small></h1>
            </div>
        </div>
        <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">   
              <li role="presentation" class="active"><a href="Controlador?menu=Usuario&accion=Listar" target="myFrame">Registro de Usuarios</a></li>
              <li role="presentation"><a href="Controlador?menu=Perfil&accion=Listar" target="myFrame">Registro de Perfiles</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/undraw/interaction_design.svg" alt="user" class="img-responsive center-box" style="max-width: 200px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para registrar nuevos usuarios, debes de llenar el siguiente formulario para registrar un usuario
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Nuevo Usuario</li>
                      <li><a href="listcategory.html">Listado de Usuarios</a></li>
                    </ol>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Agregar un nuevo Usuario</div>
                <!--<form autocomplete="off">-->
                <form autocomplete="off" action="Controlador?menu=Usuario" method="POST">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
          
                                     <!--Input select para empleado-->    
                            <div class="group-material">
                                <input type="text" value="${usuario.getNombusu()}"name="txtnombusu"  class="material-control tooltips-general" placeholder="Escribe aquí el nombre del cliente"  required=""   maxlength="20" data-toggle="tooltip" data-placement="top" title="Escribe aquí el nombre del cliente">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre de Usuario:</label>
                            </div> 
               
                            
                                      <% String accion = request.getParameter("accion");
                System.out.println(accion);
            %>
            <% if (accion.equalsIgnoreCase("Editar")) {%>
          <div class="group-material">
                                 <input type="password" value="${usuario.getClave()}"name="txtclave" id="password"  class="material-control tooltips-general" 
                                        placeholder="Escribe aquí la calve de usuario"  required=""   maxlength="20" data-toggle="tooltip" data-placement="top" title="Escribe aquí la clave de usuario">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Clave de Usuario:</label>
                                 <span toggle="#password" class="zmdi zmdi-eye-off zmdi-hc-fw field-icon toggle-password"></span>
                                 <span style="color:red;display:block">Recomendamos eliminar la Clave anterior</span> 
                            </div>  
            <%} else {%>
           <div class="group-material">
                                 <input type="password" value="${usuario.getClave()}"name="txtclave" id="password"  class="material-control tooltips-general" 
                                        placeholder="Escribe aquí la calve de usuario"  required=""   maxlength="20" data-toggle="tooltip" data-placement="top" title="Escribe aquí la clave de usuario">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Clave de Usuario:</label>
                                 <span toggle="#password" class="zmdi zmdi-eye-off zmdi-hc-fw field-icon toggle-password"></span>
                                 <span style="color:red;display:none">Recomendamos eliminar la Clave anterior</span> 
                            </div>
            <%}%>
                            <!--input que permita traer resultados por medio de un modal-->
                            <div class="group-material">
                                <input type="hidden" value="${usuario.getIdemple()}" name="codigoempleado" >  
                            </div>
                                
                            <div class="group-material">
                                <input type="text" value="${usuario.getCopiaid()}" name="nombresempleado"  class="material-control tooltips-general" placeholder="Para traer el nombre del empleado haga click en el botón"  required=""   maxlength="20" data-toggle="tooltip" data-placement="top" title="Para traer el nombre del empleado haga click en el botón">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Empleado:</label>
                                 <span toggle="#empleado"  class="zmdi zmdi-search zmdi-hc-fw field-icon ventanaMerg"></span> 
                            </div>
          
                                
                                     <!--Input select para empleado-->    
                            <div class="group-material">
                                <span>Empleado:</span>
                                <select id="comboper" name="comboper" class="material-control tooltips-general" data-toggle="tooltip" data-placement="top" title="Seleccione el Tipo de Perfil" value="">
                                        <option value="0">Seleccione el Tipo de Perfil:</option>    
                                <c:forEach items="${perfil}" var="perfil">
                                    <c:choose>
                                        <c:when test="${usuario.getIdperfil() eq perfil.getId()}">
                                            <option value="${perfil.getId()}" selected="true">${perfil.getNombPerfil()}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option value="${perfil.getId()}">${perfil.getNombPerfil()}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>
                            </div>  
                                     
                                 
                           <script>
                            
                            $(".toggle-password").click(function() {

                                $(this).toggleClass(" zmdi-eye ");
                                var input = $($(this).attr("toggle"));
                                if (input.attr("type") == "password") {
                                  input.attr("type", "text");
                                } else {
                                  input.attr("type", "password");
                                }
                              });
                            
                        </script>    
                            <p class="text-center">
                                <button type="submit" name="accion" value="Actualizar" class="btn btn-warning" style="margin-right: 20px;"><i class="zmdi zmdi-rotate-left"></i> &nbsp;&nbsp; Actualizar</button>
                                <button type="submit" name="accion" value="Agregar" class="btn btn-success"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Guardar</button>
                            </p> 
                       </div>
                    </div>
                </form>
            </div>
                                
                                
                 <div class="col-sm-8">
                <div class="card">
                    <div class="card-body">
                        <table class="table table-hover table-responsive">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>EMPLEADO</th>
                                    <th>DNI</th> 
                                    <th>ENVIAR</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="us" items="${usuarios}">
                                    <tr>
                                        <td>${us.getId()}</td>
                                        <td>${us.getNombusu()}</td>
                                        <td>${us.getIdemple()}</td>
                                        <td>${us.getIdperfil()}</td>
                                        <td>
                                            <a class="btn btn-warning" href="Controlador?menu=Usuario&accion=Editar&id=${us.getId()}">Editar</a>
                                            <a class="btn btn-danger delete-system-button" data-href="Controlador?menu=Usuario&accion=Delete&id=${us.getId()}">Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
       
     <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
    
      <!-- Modal content-->
      <div class="modal-content">
          <div class="modal-header" style="padding:35px 50px;">
            <h4><span class="fa fa-user-o"></span> Listado de Empleados</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          
        </div>
        <div class="modal-body" style="padding:40px 50px;"  style="overflow: auto">
          <form role="form">
            <!--La tabla empieza aquí--->
            
            <div id="collapse1">
                <table  id="example" class="col-sm-12 table-hover">
                          <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>EMPLEADO</th>
                                    <th>DNI</th> 
                                    <th>ACCION</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="us" items="${listados}">
                                    <tr>
                                        <td>${us.getIdemple()}</td>
                                        <td>${us.getCopiaid()}</td>
                                        <td>${us.getCopiadni()}</td>   
                                        <td >
                                        <!--<a href="#" data-target="#usract"><span class="usrin btn btn-primary btn-default pull-left zmdi zmdi-search zmdi-hc-fw " data-dismiss="modal" title="Activate"></span></a>--> 
                                        <button type="button"  data-target="#usract "name="accion" value="Buscar" class="usrin btn btn-primary" style="margin-right: 20px;size:15px" data-dismiss="modal"><i class="zmdi zmdi-plus"></i></button>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                </div>
            <!--La tabla finaliza aquí--->        
          </form>
        </div>
          <div class="modal-footer">
              <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> Cancel</button>
          <!--<p>Not a member? <a href="#">Sign Up</a></p>
          <p>Forgot <a href="#">Password?</a></p>-->
        </div>
      </div>
      
    </div>
  </div> 
                                 
          <script type="text/javascript">
         $(DevolverModal());
        </script>                        
    </body>
</html>

