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
public class Usuario {
    int id;
    String clave;
    String idemple;
    String copiaid;
    String idperfil;
    String nombusu;
    
    String copiadni;
    
    public Usuario(){   
    }

    public Usuario(int id, String clave, String idemple, String copiaid, String idperfil, String nombusu, String copiadni) {
        this.id = id;
        this.clave = clave;
        this.idemple = idemple;
        this.copiaid = copiaid;
        this.idperfil = idperfil;
        this.nombusu = nombusu;
        this.copiadni = copiadni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIdemple() {
        return idemple;
    }

    public void setIdemple(String idemple) {
        this.idemple = idemple;
    }

    public String getCopiaid() {
        return copiaid;
    }

    public void setCopiaid(String copiaid) {
        this.copiaid = copiaid;
    }

    public String getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(String idperfil) {
        this.idperfil = idperfil;
    }

    public String getNombusu() {
        return nombusu;
    }

    public void setNombusu(String nombusu) {
        this.nombusu = nombusu;
    }

    public String getCopiadni() {
        return copiadni;
    }

    public void setCopiadni(String copiadni) {
        this.copiadni = copiadni;
    }

    

   

     
    
    
    
    
}
