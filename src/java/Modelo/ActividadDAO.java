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

public class ActividadDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Actividad buscar(String id){
        Actividad ac =new Actividad();
        String sql="Select * from tipo_actividad where Id_actividad="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                ac.setId(rs.getInt(1));
                ac.setNombact(rs.getString("nomb_actividad"));
                 
                               
            }
        } catch (Exception e) {
        }
        return ac;
    }

//*******Operaciones CRUD***************//
    public List listar(){
        String sql="select * from tipo_actividad";
        List<Actividad>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Actividad emp=new Actividad();
                emp.setId(rs.getInt(1));
                emp.setNombact(rs.getString("nomb_actividad"));
                   
                lista.add(emp);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int agregar(Actividad act){ 
        String sql="insert into tipo_actividad(nomb_actividad)values(?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, act.getNombact());
            //ps.setString(2, cat.getProdcat());
                     
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    public Actividad listarId(int id){
        Actividad acti=new Actividad();
        String sql="select * from tipo_actividad where Id_actividad="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                //cate.setRefcat(rs.getString("ref_categoria"));
                acti.setNombact(rs.getString("nomb_actividad"));
                              
            }
        } catch (Exception e) {
        }
        return acti;
    }
    public int actualizar(Actividad ac){
        String sql="update tipo_actividad set nomb_actividad=? where Id_actividad=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, ac.getNombact());
           // ps.setString(2, em.getProdcat());
                    
            ps.setInt(2, ac.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from tipo_actividad where Id_actividad="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}

