<%-- 
    Document   : Ciudad
    Created on : 21-mar-2020, 1:28:17
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
    <script src="js/EliminarPrueba.js"></script>
        <title>JSP Page</title>
              <script>
      //window.onpageshow =document.getElementById("pruebaDoc").innerHTML = localStorage.getItem("storageName");
     /*$( document ).ready(function() {
      if (localStorage.getItem("storageName") != null) {
  document.getElementById("pruebaDoc").innerHTML = localStorage.getItem("storageName");
}
});*/
  
 
    </script>
    
    </head>
    <body>        
       <div class="container">
           <div id="pruebaDoc"></div>
            <div class="page-header">
              <h1 class="all-tittles">Sistema de Ventas <small>Registro de Localidades</small></h1>
            </div>
        </div>
        <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;"> 
               <li role="presentation"><a href="Controlador?menu=Departamento&accion=Listar" target="myFrame">Departamento</a></li>
               <li role="presentation" class="active"><a href="Controlador?menu=Ciudad&accion=Listar" target="myFrame">Ciudad</a></li>
               
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/undraw/city.svg" alt="user" class="img-responsive center-box" style="max-width: 190px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para registrar nuevas Ciudades, debes de llenar el siguiente formulario para registrar una Ciudad
                </div>
                
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Nueva Ciudad</li>
                      <li><a href="listcategory.html">Listado de Ciudades</a></li>
                    </ol>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Agregar una nueva Ciudad</div>
                <!--<form autocomplete="off">-->
                 
                <form autocomplete="off" action="Controlador?menu=Ciudad" method="POST">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                            <div class="group-material">
                                <input type="text" value="${ciudad.getNomciu()}" name="txtnciu"  class="material-control tooltips-general" placeholder="Escribe aquí el nombre de la Ciudad"  required=""   maxlength="20" data-toggle="tooltip" data-placement="top" title="Escribe aquí el nombre de la Ciudad">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre de la Ciudad:</label>
                            </div>
                            <div class="group-material">
                                <span>Nombre del Departamento:</span>
                                <select id="combodep" name="combodep" class="material-control tooltips-general" data-toggle="tooltip" data-placement="top" title="Seleccione el Departamento" value="">
                                        <option value="0">Seleccione el Departamento</option>    
                                    <c:forEach items="${dep}" var="dep">
                                        <c:choose>
                                            <c:when test="${ciudad.getIddpear() eq dep.getId()}">
                                                <option value="${dep.getId()}" selected="true">${dep.getNom_dep()} </option>
                                            </c:when>
                                            <c:otherwise>
                                                <option value="${dep.getId()}">${dep.getNom_dep()} </option>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                            </select>
                            </div>
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
                                    <th>CIUDAD</th>
                                    <th>DEPARTAMENTO</th>
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="ciu" items="${ciudades}">
                                    <tr>
                                        <td>${ciu.getId()}</td>
                                        <td>${ciu.getNomciu()}</td>
                                        <td>${ciu.getIddpear()}</td>
                                                                             
                                        <td>
                                            <a class="btn btn-warning" href="Controlador?menu=Ciudad&accion=Editar&id=${ciu.getId()}"><i class="zmdi zmdi-edit"></i> &nbsp;&nbsp; Editar</a>
                                            <a class="btn btn-danger delete-system-button"  data-href="Controlador?menu=Ciudad&accion=Delete&id=${ciu.getId()}"></i> &nbsp;&nbsp; Eliminar</a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
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

