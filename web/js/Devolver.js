/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   function DevolverProd(){
          var texto = $("#txtivav").val();
                         
                        if(texto =='10%') {
                      $("#10por").attr("checked",true).click();
                         
                     } else if(texto == '5%'){
                       $("#5por").attr("checked",true).click(); 
                     }else if(texto == '0'){
                       $("#0por").attr("checked",true).click(); 
                     }
    }


    function DevolverDoc() {
                    var texto = $("#txtipoDoc").val();
                         
                     if(texto =='CI') {
                      $("#ci").attr("checked",true).click();
                      console.log('llego')
                         
                     } else if(texto == 'DNI'){
                       $("#dni").attr("checked",true).click(); 
                     }else if(texto == 'RUC'){
                       $("#ruc").attr("checked",true).click(); 
                     }
                   }
                   
    function DevolverTel(){            
                     var numero = $("#txtipoTel").val();
                         
                     if(numero =='Linea Baja') {
                      $("#tel_baja").attr("checked",true).click();
                         
                     } else if(numero == 'Celular'){
                       $("#tel_cel").attr("checked",true).click(); 
                     }else if(numero == 'Ninguno'){
                       $("#tel_nin").attr("checked",true).click(); 
                     }
            }
            
    function DevolverAux(){
                      var aux = $("#txtipoaux").val();
                         
                        if(aux =='Linea Baja') {
                      $("#auxlbaja").attr("checked",true).click();
                         
                     } else if(aux == 'Celular'){
                       $("#auxcel").attr("checked",true).click(); 
                     }else if(aux == 'Ninguno'){
                       $("#auxtel_nin").attr("checked",true).click(); 
                     }
                     
                }
                
   function DevolverModal(){
       
       var table= $('#example').DataTable({searching: false,lengthChange:false ,"language":{"info":"Mostrando página _PAGE_ de _PAGES_"} });
        $(".usrin").click(function() {
            // Mark the element that triggered the modals. we'll need this later.0

            // Populate the modal fields.
            var codEmp= $(this).parents("tr").children("td:first").text();
            var nombEmp = $(this).parents("tr").children("td:nth-child(2)").text();
            //$(".fname").val(tdusrname);
            $('form').find("input[name='codigoempleado'][type='hidden']").val(codEmp);
            $('form').find("input[name='nombresempleado'][type='text']").val(nombEmp);

        });
   }            
                
                
                 