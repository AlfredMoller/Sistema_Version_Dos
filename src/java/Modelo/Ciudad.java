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
public class Ciudad {

    int id;
    String nomciu;
    String iddpear;
    String idus;

    public Ciudad() {

    }

    public Ciudad(int id, String nomciu, String iddpear, String idus) {
        this.id = id;
        this.nomciu = nomciu;
        this.iddpear = iddpear;
        this.idus = idus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomciu() {
        return nomciu;
    }

    public void setNomciu(String nomciu) {
        this.nomciu = nomciu;
    }

    public String getIddpear() {
        return iddpear;
    }

    public void setIddpear(String iddpear) {
        this.iddpear = iddpear;
    }

    public String getIdus() {
        return idus;
    }

    public void setIdus(String idus) {
        this.idus = idus;
    }

    

    
    
}
