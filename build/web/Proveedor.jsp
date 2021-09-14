<%-- 
    Document   : Empleado
    Created on : 30-mar-2020, 10:48:56
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
        <title>JSP Page</title>
        
        <script>
           $(document).ready(function() {
               
            $(DevolverDoc);
            $(DevolverTel);
            $(DevolverAux);

            jQuery('#txtDoc').keyup(identficacion);
            jQuery('[name="identRadio"]').change(identficacion);

            jQuery('#txtTel').keyup(numtelefono);
            jQuery('[name="telRadio"]').change(numtelefono);

            jQuery('#txttelaux').keyup(auxtelefono);
            jQuery('[name="auxRadio"]').change(auxtelefono);

            /*[type="radio"]*/

            function identficacion() {

            var rad_val = jQuery('[name="identRadio"]:checked').val();
            /*[type="radio"]*/
            $('#txtipoDoc').val(rad_val);

            if(rad_val == 'CI' ){
                var ident1= $('#txtDoc')
                ident1.attr('maxlength','8')

                let name = document.getElementById('txtDoc');
                name.value = name.value.slice(0, 9);

                   $('#txtDoc').ready(function (event) {

                    //if (event.which >= 37 && event.which <= 40) return;
                                // formato de numero
                                $('#txtDoc').val(function (index, value) {
                                    return value
                                    .replace(/\D/g, "")
                                    .replace(/\B(?=(\d{3})+(?!\d))/g, ".");
                                });


                                 });                   
            }

            else if(rad_val == 'DNI' ){
                var ident= $('#txtDoc')
                ident.attr('maxlength','10')
                $('#txtDoc').ready(function (event) {
                                if (event.which >= 37 && event.which <= 40) return;
                                // formato de numero
                                $('#txtDoc').val(function (index, value) {
                                    return value
                                    .replace(/\D/g, "")
                                    .replace(/\B(?=(\d{3})+(?!\d))/g, ".") ;
                                });
                                 }); 
            }

            else if(rad_val == 'RUC' ){
                var ident= $('#txtDoc')
                ident.attr('maxlength','9')
                $('#txtDoc').ready(function (event) {
                                if (event.which >= 37 && event.which <= 40) return;
                                // formato de numero
                                $('#txtDoc').val(function (index, value) {
                                    return value
                                    .replace(/\D/g, "")
                                    .replace(/(\d{7})(?=\d)/g, '$1-');
                                });
                                 }); 
            }

        }

        //Primer combo de radios
            function numtelefono() {
            //var ident= $('#txt_im')
            /*var txt_value = jQuery('input.number').val();*/
            var rad_val2 = jQuery('[name="telRadio"]:checked').val();
            $('#txtipoTel').val(rad_val2);

            if(rad_val2 == 'Linea Baja' ){
              var txtlinea= $('#txtTel')

                $('#txtTel').ready(function (event) {
                                if (event.which >= 37 && event.which <= 40) return;
                                // formato de numero
                                $('#txtTel').val(function (index, value) {
                                    return value
                                    .replace(/\D/g, "")
                                    .replace(/(\d{3})(\d{3})(\d{3})(\d{3})/, "(+$1) $2 $3-$4") ;
                                });
                                 });
                                if(txtlinea.val == 'Ninguno'){
                                    txtlinea.val("")
                                } 

            } 
             else if(rad_val2 == 'Celular' ){
              var txtlinea2= $('input.borrar')
              txtlinea2.valueOf("")

                $('#txtTel').ready(function (event) {
                                if (event.which >= 37 && event.which <= 40) return;
                                // formato de numero
                                $('#txtTel').val(function (index, value) {
                                    return value
                                    .replace(/\D/g, "")
                                    .replace(/(\d{3})(\d{3})(\d{3})(\d{3})/, "(+$1) $2 $3-$4") ;
                                });
                                 });
                               /* if(txtlinea2.val == 'Ninguno'){
                                    txtlinea2.val("")
                                } */                   
            }

            else if(rad_val2 == 'Ninguno' ){
                var tuto2= $('#txtTel')
                tuto2.val(rad_val2)

            }

            }

        //Segundo combo de radios
            function auxtelefono() {
            //var ident= $('#txt_im')
            /*var txt_value = jQuery('input.number').val();*/
            var rad_val1 = jQuery('[name="auxRadio"]:checked').val();
            $('#txtipoaux').val(rad_val1);


            if(rad_val1 == 'Linea Baja' ){
              var txtlinea= $('#txttelauxl')



                $('#txttelaux').ready(function (event) {
                                if (event.which >= 37 && event.which <= 40) return;
                                // formato de numero
                                $('#txttelaux').val(function (index, value) {
                                    return value
                                    .replace(/\D/g, "")
                                    .replace(/(\d{3})(\d{3})(\d{3})(\d{3})/, "(+$1) $2 $3-$4") ;
                                });
                                 });
                                if(txtlinea.val == 'Ninguno'){
                                    txtlinea.val("")
                                } 


            }

            else if(rad_val1 == 'Celular' ){
              var txtlinea= $('#txttelauxl')

                $('#txttelaux').ready(function (event) {
                                if (event.which >= 37 && event.which <= 40) return;
                                // formato de numero
                                $('#txttelaux').val(function (index, value) {
                                    return value
                                    .replace(/\D/g, "")
                                    .replace(/(\d{3})(\d{3})(\d{3})(\d{3})/, "(+$1) $2 $3-$4") ;
                                });
                                 });
                                if(txtlinea.val == 'Ninguno'){
                                    txtlinea.val("")
                                } 
            }

            else if(rad_val1 == 'Ninguno' ){
                var tuto2= $('#txttelaux')
                tuto2.val(rad_val1)
            }

            }

           });
        </script>
    
    </head>
    <body>        
       <div class="container">
            <div class="page-header">
              <h1 class="all-tittles">Sistema de Ventas <small>Registro de Personas</small></h1>
            </div>
        </div>
        <div class="container-fluid">
            <ul class="nav nav-tabs nav-justified"  style="font-size: 17px;">   
              <li role="presentation" class="active"><a href="Controlador?menu=Proveedor&accion=Listar" target="myFrame">Registro de Proveedores</a></li>
              <li role="presentation"><a href="Controlador?menu=Cliente&accion=Listar" target="myFrame">Registro de Clientes</a></li>
              <li role="presentation"><a href="Controlador?menu=Empleado&accion=Listar" target="myFrame">Registro de Empleados</a></li>
              <li role="presentation"><a href="Controlador?menu=TipoProv&accion=Listar" target="myFrame">Registro de Tipos de Proveedores</a></li>
              <li role="presentation"><a href="Controlador?menu=Actividad&accion=Listar" target="myFrame">Registro de Actividades</a></li>
            </ul>
        </div>
        <div class="container-fluid"  style="margin: 50px 0;">
            <div class="row">
                <div class="col-xs-12 col-sm-4 col-md-3">
                    <img src="assets/undraw/deliver.svg" alt="user" class="img-responsive center-box" style="max-width: 200px;">
                </div>
                <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                    Bienvenido a la sección para registrar nuevos proveedores, debes de llenar el siguiente formulario para registrar un proveedor
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 lead">
                    <ol class="breadcrumb">
                      <li class="active">Nuevo Proveedor</li>
                      <li><a href="listcategory.html">Listado de Proveedores</a></li>
                    </ol>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="container-flat-form">
                <div class="title-flat-form title-flat-blue">Agregar un nuevo Proveedor</div>
                <!--<form autocomplete="off">-->
                <form autocomplete="off" action="Controlador?menu=Proveedor" method="POST">
                    <div class="row">
                       <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                           
                           <!--Input text para nombre-->
                            <div class="group-material">
                                <input type="text" value="${proveedor.getIdempresa()}" name="txtEmp"  class="material-control tooltips-general" placeholder="Escribe aquí el nombre del cliente"  required=""   maxlength="20" data-toggle="tooltip" data-placement="top" title="Escribe aquí el nombre del cliente">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre de la Empresa</label>
                            </div>
                                
                             <!--Input text para nombre del responsable-->
                            <div class="group-material">
                                <input type="text" value="${proveedor.getPersfisica()}" name="txtPer" class="material-control tooltips-general" placeholder="Escribe aquí el nombre del cliente"  required=""   maxlength="20" data-toggle="tooltip" data-placement="top" title="Escribe aquí el nombre del cliente">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Nombre del Responsable</label>
                            </div>    
                                <!--Input con los radios incluidos-->
                            <div class="group-material">
                                <input type="text" value="${proveedor.getDocumento()}" id="txtDoc" name="txtDoc" class="material-control tooltips-general" placeholder="Escribe aquí el numero de documento" required=""  maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe aquí el numero de documento">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Documento:</label>
                         
                                  <!--Nuevo div para radios 10%-->    
                            <div class="custom-control custom-radio custom-control-inline">
                                <input type="radio"  id="ci" name="identRadio" value="CI" class="material-control-input">
                                <span for="ci">CI</span>
                                
                                <input type="radio" id="dni" name="identRadio" value="DNI"class="material-control-input">
                                <span for="dni">DNI</span>
                                
                                <input type="radio" id="ruc" name="identRadio" value="RUC"class="material-control-input">
                                <span for="ruc">RUC</span>
                            </div> 
                            </div>
                                <!--Input hidden para tipo doc-->
                                <div class="group-material">
                                    <input type="hidden" value="${proveedor.getTipodoc()}"  id="txtipoDoc" name="txtipoDoc" class="material-control-input">
                                </div>  
                            
                             <!--Input con los radios de telefonos-->
                            <div class="group-material">
                                <input type="text" value="${proveedor.getTelefono()}" id="txtTel" name="txtTel" class="material-control tooltips-general" placeholder="Escribe aquí el telefono" required=""  maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe aquí el telefono">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Telefono:</label>
                         
                                  <!--Nuevo div para radios 10%-->    
                            <div class="custom-control custom-radio custom-control-inline">
                                <input type="radio"  id="tel_baja" name="telRadio" value="Linea Baja" class="material-control-input">
                                <span for="tel_baja">Linea Baja</span>
                                
                                <input type="radio" id="tel_cel" name="telRadio" value="Celular" class="material-control-input">
                                <span for="tel_cel">Celular</span>
                                
                                <input type="radio" id="tel_nin" name="telRadio" value="Ninguno" class="material-control-input">
                                <span for="tel_nin">Ninguno</span>
                            </div> 
                            </div>
                                <!--Input hidden para tipo doc-->
                                <div class="group-material">
                                    <input type="hidden" value="${proveedor.getTipotel()}"  id="txtipoTel" name="txtipoTel" class="material-control-input">
                                </div>
                           
                             <!--Input con los radios de telefonos-aux-->
                            <div class="group-material">
                                <input type="text" value="${proveedor.getTelaux()}" id="txttelaux" name="txttelaux" class="material-control tooltips-general" placeholder="Escribe aquí el precio del numero de telefono" required=""  maxlength="50" data-toggle="tooltip" data-placement="top" title="Escribe aquí el numero de telefono">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Telefono-Aux:</label>
                         
                                  <!--Nuevo div para radios 10%-->    
                            <div class="custom-control custom-radio custom-control-inline">
                                <input type="radio"  id="auxlbaja" name="auxRadio" value="Linea Baja" class="material-control-input">
                                <span for="auxbaja">Linea Baja</span>
                                
                                <input type="radio" id="auxcel" name="auxRadio" value="Celular" class="material-control-input">
                                <span for="auxcel">Celular</span>
                                
                                <input type="radio" id="auxtel_nin" name="auxRadio" value="Ninguno" class="material-control-input">
                                <span for="auxtel_nin">Ninguno</span>
                            </div> 
                            </div>
                                <!--Input hidden para tipo doc-->
                                <div class="group-material">
                                    <input type="hidden" value="${proveedor.getTipoaux()}" id="txtipoaux" name="txtipoaux" class="material-control-input">
                                </div>
                             
                             <!--Input select para tipo actividad-->
                                <div class="group-material">
                                <span>Tipo Actividad:</span>
                                <select id="comboAct" name="comboAct" class="material-control tooltips-general" data-toggle="tooltip" data-placement="top" title="Seleccione la Actividad" value="">
                                        <option value="0">Seleccione la Actividad</option>    
                                <c:forEach items="${actividad}" var="act">
                                    <c:choose>
                                        <c:when test="${proveedor.getIdactividad() eq act.getId()}">
                                            <option value="${act.getId()}" selected="true">${act.getNombact()}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option value="${act.getId()}">${act.getNombact()}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>
                            </div>      
                             
                             <!--Input select para tipo proveedor-->    
                            <div class="group-material">
                                <span>Tipo Proveedor:</span>
                                <select id="comboTipo" name="comboTipo" class="material-control tooltips-general" data-toggle="tooltip" data-placement="top" title="Seleccione la Categoría" value="">
                                        <option value="0">Seleccione el Tipo de Proveedor</option>    
                                <c:forEach items="${tipoprv}" var="tipo">
                                    <c:choose>
                                        <c:when test="${proveedor.getIdtipoprov() eq tipo.getIdtipoprov()}">
                                            <option value="${tipo.getIdtipoprov()}" selected="true">${tipo.getTipo_proveedor()}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option value="${tipo.getIdtipoprov()}">${tipo.getTipo_proveedor()}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>
                            </div> 
 
                            <!--Input text para Direccion-->
                             <div class="group-material">
                                <input type="text" value="${proveedor.getDireccion()}" name="txtdirec" class="material-control tooltips-general" placeholder="Escribe aquí la direccion" required=""   maxlength="10" data-toggle="tooltip" data-placement="top" title="Escribe aquí la direccion">
                                <span class="highlight"></span>
                                <span class="bar"></span>
                                <label>Direccion:</label>
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
                                    <!--<th>ID</th>-->
                                    <th>EMPRESA</th>
                                    <th>NOMBRES</th>
                                    <th>DOCUMENTO</th>
                                    <th>TELEFONO</th>
                                    <th>TEL.AUX</th>  
                                    <th>TIPO</th>
                                                                
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="pro" items="${proveedores}">
                                    <tr>
                                        <!--<td>${pro.getId()}</td>-->
                                        <td>${pro.getIdempresa()}</td>
                                        <td>${pro.getPersfisica()}</td>
                                        <td>${pro.getDocumento()}</td>
                                        <td>${pro.getTelefono()}</td>
                                        <td>${pro.getTelaux()}</td>
                                        <!--<td>${pro.getIdactividad()}</td>
                                        <td>${pro.getIdtipoprov()}</td>-->
                                        <td>${pro.getDireccion()}</td>
                                        <td>
                                            <a class="btn btn-warning" href="Controlador?menu=Proveedor&accion=Editar&id=${pro.getId()}">Editar</a>
                                            <a class="btn btn-danger delete-system-button" data-href="Controlador?menu=Proveedor&accion=Delete&id=${pro.getId()}">Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
       
    </body>
</html>

