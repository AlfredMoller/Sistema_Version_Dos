/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SAN MIGUEL
 */
public class AuditoriaDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    
     public List listarAudi(){
         String sql = "select * from auditoria,empleado where auditoria.IdUsuario=empleado.IdEmpleado";
        //String sql="select * from auditoria,usuario where auditoria.IdUsuario= usuario.Id_Usuario";
        List<ConsAudi>listaAud=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                ConsAudi aud=new ConsAudi();
                aud.setIdauditoria(rs.getInt(1));
                aud.setFechaaudi(rs.getString("fecha_audi"));
                aud.setIpmaquina(rs.getString("ip_maquina"));
                aud.setNombtabla(rs.getString("tabla"));
                aud.setTipoevento(rs.getString("evento"));
                aud.setHorauadi(rs.getString("hora_audi"));
                aud.setDescaudi(rs.getString("desc_audi"));
                aud.setIdusuario(rs.getString("User"));
                   
                listaAud.add(aud);
            }
        } catch (Exception e) {
        }
        return listaAud;
    }
     
    public List buscaAudi(int id_usu ,String actividad){
        List<ConsAudi> listas= new ArrayList<>();
        
        String sql="Select * from auditoria,empleado where auditoria.IdUsuario=empleado.IdEmpleado and auditoria.IdUsuario = '"+id_usu+"'  AND evento = '"+actividad+"'  ";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
             while (rs.next()) {
                ConsAudi aud=new ConsAudi();
                aud.setIdauditoria(rs.getInt(1));
                aud.setFechaaudi(rs.getString("fecha_audi"));
                aud.setIpmaquina(rs.getString("ip_maquina"));
                aud.setNombtabla(rs.getString("tabla"));
                aud.setTipoevento(rs.getString("evento"));
                aud.setHorauadi(rs.getString("hora_audi"));
                aud.setDescaudi(rs.getString("desc_audi"));
                aud.setIdusuario(rs.getString("User"));
                listas.add(aud);
            }
        } catch (Exception e) {
        }
        return listas;
    }   
}
