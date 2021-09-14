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
public class ConsAudi {
    int idauditoria;
    String idusuario;
    String fechaaudi;
    String ipmaquina;
    String nombtabla;
    String tipoevento;
    String horauadi;
    String descaudi;
    
    public ConsAudi(){
    }

    public ConsAudi(int idauditoria, String idusuario, String fechaaudi, String ipmaquina, String nombtabla, String tipoevento, String horauadi, String descaudi) {
        this.idauditoria = idauditoria;
        this.idusuario = idusuario;
        this.fechaaudi = fechaaudi;
        this.ipmaquina = ipmaquina;
        this.nombtabla = nombtabla;
        this.tipoevento = tipoevento;
        this.horauadi = horauadi;
        this.descaudi = descaudi;
    }

    public int getIdauditoria() {
        return idauditoria;
    }

    public void setIdauditoria(int idauditoria) {
        this.idauditoria = idauditoria;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getFechaaudi() {
        return fechaaudi;
    }

    public void setFechaaudi(String fechaaudi) {
        this.fechaaudi = fechaaudi;
    }

    public String getIpmaquina() {
        return ipmaquina;
    }

    public void setIpmaquina(String ipmaquina) {
        this.ipmaquina = ipmaquina;
    }

    public String getNombtabla() {
        return nombtabla;
    }

    public void setNombtabla(String nombtabla) {
        this.nombtabla = nombtabla;
    }

    public String getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(String tipoevento) {
        this.tipoevento = tipoevento;
    }

    public String getHorauadi() {
        return horauadi;
    }

    public void setHorauadi(String horauadi) {
        this.horauadi = horauadi;
    }

    public String getDescaudi() {
        return descaudi;
    }

    public void setDescaudi(String descaudi) {
        this.descaudi = descaudi;
    }

    
     
    
}
