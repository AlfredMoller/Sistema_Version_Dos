/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PerfilDAO{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    Auditoria auditoria = new Auditoria();
    Perfil perf = new Perfil();
    
    public Perfil buscar(String perf){
        Perfil p =new Perfil();
        String sql="Select * from perfil where tipo_perfil="+perf;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNombPerfil(rs.getString("tipo_perfil"));
                
                               
            }
        } catch (Exception e) {
        }
        return p;
    }

//*******Operaciones CRUD***************//
    public List listar(){
        String sql="select * from perfil";
        List<Perfil>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Perfil per=new Perfil();
                per.setId(rs.getInt(1));
                per.setNombPerfil(rs.getString("tipo_perfil"));
                 
                lista.add(per);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    
    public int agregar(Perfil per){ 
       int count =0;
        try{
             
            String query="select count(tipo_perfil) from perfil where tipo_perfil=? ";
            ps=con.prepareStatement(query);
            ps.setString(1,per.getNombPerfil());
            rs=ps.executeQuery();

            while (rs.next()) {
                count=rs.getInt("count(tipo_perfil)");

            }
        } catch (SQLException ex) {
            
        }
        
        if(count==0){
        String sql="insert into perfil(tipo_perfil)values(?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, per.getNombPerfil());
             
            int n = ps.executeUpdate();

                if (n > 0) {
                    String usuario = per.getIdus();
                    String objeto = "Perfil Con Nombre:" + " " + per.getNombPerfil();
                    String evento = "Guardar";
                    String tabla = "Perfil";
                    auditoria.audi(usuario, objeto, evento, tabla);

                }
            ps.close();
        } catch (Exception e) {
        }
         
           }else{
           //System.out.println("user exists");
         out.println("<p style='color:red;'>El Nombre de Perfil Existe...</p>");
        }
        return r;
    }
    
    
    public Perfil listarId(int id){
        Perfil perf=new Perfil();
        String sql="select * from perfil where Id_perfil="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                perf.setNombPerfil(rs.getString("tipo_perfil"));
                
            }
        } catch (Exception e) {
        }
        return perf;
    }
    public int actualizar(Perfil em){
        String sql="update perfil set tipo_perfil=? where Id_perfil=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNombPerfil());
            
            ps.setInt(2, em.getId());
            int n = ps.executeUpdate();
            
            if(n > 0){
                String usuario = em.getIdus();
                String objeto = "Perfil Con Nombre:" + " " + em.getNombPerfil();
                String evento = "Editar";
                String tabla = "Perfil";
                auditoria.audi(usuario, objeto, evento, tabla);
            }
         ps.close();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id, String id_usu){
        
        perf = listarId(id);
        //String objeto= "Departamento Con Identificacion:"+" "+ eml.getTel();
        String objeto = "Perfil Con Nombre:" + " " + perf.getNombPerfil();
        String evento = "Eliminar";
        String tabla = "Perfil";
        auditoria.audi(id_usu, objeto, evento, tabla);
        
        String sql="delete from perfil where Id_perfil="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
        }
    }
    
      
}

