/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    $('.tooltips-general').tooltip('hide');
    $('.mobile-menu-button').on('click', function(){
        var mobileMenu=$('.navbar-lateral');	
        if(mobileMenu.css('display')=='none'){
            mobileMenu.fadeIn(300);
        }else{
            mobileMenu.fadeOut(300);
        }
    });
    $('.dropdown-menu-button').on('click', function(){
        var dropMenu=$(this).next('ul');
        dropMenu.slideToggle('slow');
    });
    $('.delete-system-button').on('click', function(e){
        e.preventDefault();
        var LinkDelSystem=$(this).attr("data-href");
        
        //aqui comienza
        swal({
            title: "¿Estás seguro?",
            text: "Desea Eliminar el Documento",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#5cb85c",
            confirmButtonText: "Si, salir",
            cancelButtonText: "No, cancelar",
            animation: "slide-from-top",
            closeOnConfirm: false 
           
        },function(isConfirm){
          if(isConfirm){
           $.playSound('audio/standby.wav') 
            swal({
              title: 'Eliminado!!!',
              text: 'La documentación ha sido eliminada con éxito!!!',
               type:'success',
               showConfirmButton: false
            })
            
           //No olvidar añadir una hilo en esta función para que se pueda cumplir la  siguiente accion
           window.setTimeout(function(){
                       //console.log("si dado") 
                     window.location=LinkDelSystem;
                  }, 2000);
                  
              }else{          
                 window.setTimeout(function(){
                    $.playSound('audio/select_error.wav') 
     
                    swal({
                           title: 'Cancelado!!!',
                           text: 'La documentación ha sido salvada!!!',
                           type:'error',
                           showConfirmButton:false,
                           timer:2000
                         })
                         
                  }, 500);
              }     
         //hasta aqui el else   
        }); 
        
        
     //aqui termina   
    });
   (function ($) {
    $.extend({
        playSound: function () {
            return $(
                   '<audio class="sound-player" autoplay="autoplay" style="display:none;">'
                     + '<source src="' + arguments[0] + '" />'
                     + '<embed src="' + arguments[0] + '" hidden="true" autostart="true" loop="false"/>'
                   + '</audio>'
                 ).appendTo('body');
        },
        stopSound: function () {
            $(".sound-player").remove();
        }
    });
})(jQuery);
});
 


 

 
    

