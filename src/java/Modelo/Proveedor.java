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
public class Proveedor {
  int id;
  String idempresa;
  String persfisica;
  String documento;
  String  tipodoc;
  String telefono;
  String tipotel;
  String telaux;
  String tipoaux;
  String idactividad;
  String idtipoprov;
  String direccion;
  
  public Proveedor(){
  }

    public Proveedor(int id, String idempresa, String persfisica, String documento, String tipodoc, String telefono, String tipotel, String telaux, String tipoaux, String idactividad, String idtipoprov, String direccion) {
        this.id = id;
        this.idempresa = idempresa;
        this.persfisica = persfisica;
        this.documento = documento;
        this.tipodoc = tipodoc;
        this.telefono = telefono;
        this.tipotel = tipotel;
        this.telaux = telaux;
        this.tipoaux = tipoaux;
        this.idactividad = idactividad;
        this.idtipoprov = idtipoprov;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(String idempresa) {
        this.idempresa = idempresa;
    }

    public String getPersfisica() {
        return persfisica;
    }

    public void setPersfisica(String persfisica) {
        this.persfisica = persfisica;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipotel() {
        return tipotel;
    }

    public void setTipotel(String tipotel) {
        this.tipotel = tipotel;
    }

    public String getTelaux() {
        return telaux;
    }

    public void setTelaux(String telaux) {
        this.telaux = telaux;
    }

    public String getTipoaux() {
        return tipoaux;
    }

    public void setTipoaux(String tipoaux) {
        this.tipoaux = tipoaux;
    }

    public String getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(String idactividad) {
        this.idactividad = idactividad;
    }

    public String getIdtipoprov() {
        return idtipoprov;
    }

    public void setIdtipoprov(String idtipoprov) {
        this.idtipoprov = idtipoprov;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
  
  
     
     

     
 
    
}
