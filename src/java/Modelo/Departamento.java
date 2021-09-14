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
public class Departamento {
   int id;
   String num_dep;
   String nom_dep;
   String idus;

   public Departamento(){
       
   }

    public Departamento(int id, String num_dep, String nom_dep, String idus) {
        this.id = id;
        this.num_dep = num_dep;
        this.nom_dep = nom_dep;
        this.idus = idus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum_dep() {
        return num_dep;
    }

    public void setNum_dep(String num_dep) {
        this.num_dep = num_dep;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public String getIdus() {
        return idus;
    }

    public void setIdus(String idus) {
        this.idus = idus;
    }
   
    
   
   
}
