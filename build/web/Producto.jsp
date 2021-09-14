<%-- 
    Document   : Producto
    Created on : 24-mar-2020, 1:29:29
    Author     : SAN MIGUEL
--%>

<%@page import="javafx.scene.control.RadioButton"%>
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
        <title>JSP Page</title>
        <style>
            .sortable-handler {
  touch-action: none;
}
        </style>
        <script>
             
            $(document).ready(function() {
        
                $(DevolverProd);   

                jQuery("#txtPrecio").keyup(setValue);
                jQuery('[type="radio"]').change(setValue);
                
                
                jQuery('[type="radio"]').change(busVal);
                        

                function setValue() {
                var txt_value = jQuery("#txtPrecio").val();
                var rad_val = jQuery('[type="radio"]:checked').val();
                $('#txtivav').val(rad_val);

                /*if (!txt_value.length || !rad_val.length) {
                return;
                }*/

                if(rad_val == '10%' ){
                var MBresult = txt_value / 11
                jQuery('#txtmonto_ivav').val(MBresult.toFixed(3));
                }

                else if(rad_val == '5%' ){
                var MBresult = txt_value / 21
                jQuery('#txtmonto_ivav').val(MBresult.toFixed(3));
                }

                else if(rad_val == '0' ){
                var MBresult = txt_value 
                jQuery('#txtmonto_ivav').val(MBresult);
                }
            }  
            
            function busVal() {
                //var txt_value = jQuery("#txtPrecio").val();
                var rad_Bus = jQuery('[name="customRadiosa"]:checked').val();
                $('#auxBus').val(rad_Bus);
                
                
             }
      });
        </script>
    
    </head>
    <body>        
       <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">Sistema de Ventas <small>Registros de Productos</small></h1>
            </div>
        </div>
        <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;"> 
              <li role="presentation"><a href="Controlador?menu=Catprod&accion=Listar" target="myFrame">Categorías</a></li>
              <li role="presentation" class="active"><a href="Controlador?menu=Producto&accion=Listar" target="myFrame">Registro de Productos</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/undraw/shopping_app.svg" alt="user" class="img-responsive center-box" style="max-width: 190px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para registrar nuevos productos, debes de llenar el siguiente formulario para registrar un producto
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Nuevp Producto</li>
                      <li><a href="listcategory.html">Listado de Productos</a></li>
                    </ol>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Agregar un nuevo Producto</div>
                <!--<form autocomplete="off">-->
                <form autocomplete="off" action="Controlador?menu=Producto" method="POST">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                           
                           <!--Input text para nombre-->
                            <div class="group-material">
                                <input type="text" value="${producto.getNom()}" id="txtNomb" name="txtNomb"  class="material-control tooltips-general" placeholder="Escribe aquí el nombre del producto"  required=""   maxlength="20" data-toggle="tooltip" data-placement="top" title="Escribe aquí el nombre del producto">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre del Producto:</label>
                            </div>
                                <!--Input con los radios incluidos-->
                            <div class="group-material">
                                <input type="text" value="${producto.getPre()}" id="txtPrecio" name="txtPrecio" class="material-control tooltips-general" placeholder="Escribe aquí el precio del producto" required=""  maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe aquí el precio del producto">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Precio:</label>
                         
                                  <!--Nuevo div para radios 10%-->    
                            <div class="custom-control custom-radio custom-control-inline">
                                <input type="radio" id="10por" name="customRadio" value="10%" class="material-control-input">
                                <span for="10por">Iva 10%</span>
                                
                                <input type="radio" id="5por" name="customRadio" value="5%" class="material-control-input">
                                <span for="5por">Iva 5%</span>
                                
                                <input type="radio" id="0por" name="customRadio" value="0" class="material-control-input">
                                <span for="0por">Excentas</span>
                            </div>
                                  
                             
                                  
                            </div>
                            
                           <div class="group-material">
                               <input type="hidden" value="${producto.getIvav()}" id="txtivav" name="txtivav" class="form-control">
                           </div> 
                           
                            <!--Input text para el monto del iva-->    
                           <div class="group-material">
                               <input type="text" value="${producto.getMonto_ivv()}" id="txtmonto_ivav" name="txtmonto_ivav" class="material-control tooltips-general" placeholder="Para rellenar el campo seleccione los botones de radios" required=""  maxlength="10" data-toggle="tooltip" data-placement="top" title="Para rellenar el campo seleccione los botones de radios">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Monto Iva:</label>
                            </div> 
                            
                            <!--Input text para el stock-->    
                            <div class="group-material">
                                <input type="text" value="${producto.getStock()}" name="txtStock" class="material-control tooltips-general" placeholder="Escribe aquí el cantidad del stock" required=""   maxlength="10" data-toggle="tooltip" data-placement="top" title="Escribe aquí la cantidad del stock">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                 <label>Stock:</label>
                            </div>
                                
                             <!--Input text para el estado-->   
                            <div class="group-material">
                                <input type="text" value="${producto.getEstado()}" name="txtEstado" class="material-control tooltips-general" placeholder="Escribe aquí el estado" required=""   maxlength="10" data-toggle="tooltip" data-placement="top" title="Escribe aquí el estado">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Estado:</label>
                            </div>       
                            
                                
                              <!--Input select para la categoriá de productos-->  
                            <div class="group-material">
                                <span>Categoría del Producto:</span>
                                <select id="combocat" name="combocat" class="material-control tooltips-general" data-toggle="tooltip" data-placement="top" title="Seleccione la Categoría" value="">
                                        <option value="0">Seleccione la Categoría</option>    
                                <c:forEach items="${categorias}" var="categorias">
                                    <c:choose>
                                        <c:when test="${producto.getIdprodcat() eq categorias.getId()}">
                                            <option value="${categorias.getId()}" selected="true">${categorias.getProdcat()} </option>
                                        </c:when>
                                        <c:otherwise>
                                            <option value="${categorias.getId()}">${categorias.getProdcat()} </option>
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
                        
                        <form id="fbuscar" action="Controlador?menu=Producto" method="POST">
                            <div class="group-material">
                                <input type="search" name="txtbuscarProd" id="busc">
                                <input type="hidden" id="auxBus" name="txtbuscarProds">
                                <button type="submit" name="accion" onclick="$('#fbuscar').submit()" value="Buscar" class="btn btn-default"><i class="zmdi zmdi-search"></i></button>
                            </div>
                        </form>
                         <div class="custom-control custom-radio custom-control-inline">
                             <label>Buscar por: </label>
                                <input type="radio" id="prodBus" name="customRadiosa" value="Prod" class="material-control-input">
                                <span for="prodBus">Producto</span>
                                
                                <input type="radio" id="catdBus" name="customRadiosa" value="Cate" class="material-control-input">
                                <span for="catBus">Categoria</span>
                         
                         </div>
            
                                
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                   <!-- <th>ID</th>-->
                                    <th>Nombres</th>
                                    <th>Precio</th>
                                    <th>Stock</th>                                    
                                    <th>ESTADO</th> 
                                    <th>CATEGORIA</th>
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="em" items="${productos}">
                                    <tr>
                                       <!-- <td>${em.getId()}</td>-->                                      
                                        <td>${em.getNom()}</td>
                                        <td>${em.getPre()}</td>
                                        <td>${em.getStock()}</td>
                                        <td>${em.getEstado()}</td> 
                                        <td>${em.getIdprodcat()}</td>
                                        <td>
                                            <a class="btn btn-warning" href="Controlador?menu=Producto&accion=Editar&id=${em.getId()}">Editar</a>
                                            <a class="btn btn-danger delete-system-button" data-href="Controlador?menu=Producto&accion=Delete&id=${em.getId()}">Delete</a>
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

