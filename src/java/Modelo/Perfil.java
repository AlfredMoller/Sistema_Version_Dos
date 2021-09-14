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
public class Perfil {
   int id;
   String nombPerfil; 
   String idus;
   
   public Perfil(){
   }

    public Perfil(int id, String nombPerfil, String idus) {
        this.id = id;
        this.nombPerfil = nombPerfil;
        this.idus = idus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombPerfil() {
        return nombPerfil;
    }

    public void setNombPerfil(String nombPerfil) {
        this.nombPerfil = nombPerfil;
    }

    public String getIdus() {
        return idus;
    }

    public void setIdus(String idus) {
        this.idus = idus;
    }

    
   
}
