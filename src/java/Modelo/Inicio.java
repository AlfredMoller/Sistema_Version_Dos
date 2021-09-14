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
public class Inicio {
    int idempleado;
    int idcliente;
    int idproveedor;
    int iddepartamento;
    int idciudad;
    int idcatprod;
    int idprod;
    
    public Inicio(){
        
    }

    public Inicio(int idempleado, int idcliente, int idproveedor, int iddepartamento, int idciudad, int idcatprod, int idprod) {
        this.idempleado = idempleado;
        this.idcliente = idcliente;
        this.idproveedor = idproveedor;
        this.iddepartamento = iddepartamento;
        this.idciudad = idciudad;
        this.idcatprod = idcatprod;
        this.idprod = idprod;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public int getIdcatprod() {
        return idcatprod;
    }

    public void setIdcatprod(int idcatprod) {
        this.idcatprod = idcatprod;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }
    
}
