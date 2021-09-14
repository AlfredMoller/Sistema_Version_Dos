/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author SAN MIGUEL
 */
public class TipoProveedor {
    int idtipoprov;
    String tipo_proveedor;
    
 public TipoProveedor(){
     
 }  

    public TipoProveedor(int idtipoprov, String tipo_proveedor) {
        this.idtipoprov = idtipoprov;
        this.tipo_proveedor = tipo_proveedor;
    }

    public int getIdtipoprov() {
        return idtipoprov;
    }

    public void setIdtipoprov(int idtipoprov) {
        this.idtipoprov = idtipoprov;
    }

    public String getTipo_proveedor() {
        return tipo_proveedor;
    }

    public void setTipo_proveedor(String tipo_proveedor) {
        this.tipo_proveedor = tipo_proveedor;
    }

  
    
}
