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
public class Categoria {
    int id;
    String refcat;
    String prodcat;
    String idus;
    
     public Categoria(){
       
   }

    public Categoria(int id, String refcat, String prodcat, String idus) {
        this.id = id;
        this.refcat = refcat;
        this.prodcat = prodcat;
        this.idus = idus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRefcat() {
        return refcat;
    }

    public void setRefcat(String refcat) {
        this.refcat = refcat;
    }

    public String getProdcat() {
        return prodcat;
    }

    public void setProdcat(String prodcat) {
        this.prodcat = prodcat;
    }

    public String getIdus() {
        return idus;
    }

    public void setIdus(String idus) {
        this.idus = idus;
    }

    
   
    
}
