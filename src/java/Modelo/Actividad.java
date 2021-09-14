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
public class Actividad {
    int id;
    String nombact;
    
    public Actividad(){
    }

    public Actividad(int id, String nombact) {
        this.id = id;
        this.nombact = nombact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombact() {
        return nombact;
    }

    public void setNombact(String nombact) {
        this.nombact = nombact;
    }

     
    
    
}
