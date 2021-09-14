/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Usuario buscar(String id){
        Usuario us=new Usuario();
        String sql="Select * from usuario where Id_Usuario="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
               /* cd.setId(rs.getInt(1));
                cd.setNomciu(rs.getString(2));
                cd.setIddpear(rs.getString(3));*/
                us.setId(rs.getInt("Id_Usuario"));
                us.setNombusu(rs.getString("nomb_usuario"));
                us.setClave(rs.getString("clave"));
                us.setIdemple(rs.getString("IdEmpleado"));
                us.setIdperfil(rs.getString("Id_perfil"));
                            
            }
        } catch (Exception e) {
        }
        return us;
    }

//*******Operaciones CRUD***************//
    public List listar(){
        String sql="select * from usuario, perfil,empleado where usuario.Id_perfil = perfil.Id_perfil "
                + "and usuario.IdEmpleado=empleado.IdEmpleado";
        List<Usuario>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Usuario usu =new Usuario(); 
                
                usu.setId(rs.getInt("Id_Usuario"));
                usu.setNombusu(rs.getString("nomb_usuario"));
                usu.setClave(rs.getString("clave"));
                usu.setIdemple(rs.getString("Nombres"));
                //usu.setCopiaid(rs.getString("Nombres"));
                usu.setIdperfil(rs.getString("tipo_perfil"));
                             
                lista.add(usu);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int agregar(Usuario usu){ 
        String SalyPimienta="1987";
        String sql="insert into usuario(nomb_usuario,clave,IdEmpleado,Id_perfil)values(?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, usu.getNombusu());
            String PassEncrSave=getMD5(usu.getClave()+SalyPimienta);
            ps.setString(2, PassEncrSave);
            ps.setString(3, usu.getIdemple());
            ps.setString(4, usu.getIdperfil());
            
                    
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    public Usuario listarId(int id){
        Usuario usr = new Usuario();
        String sql="select * from usuario , perfil,empleado where usuario.Id_perfil = perfil.Id_perfil "
                + "and usuario.IdEmpleado=empleado.IdEmpleado and Id_Usuario="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
               /* ciu.setNomciu(rs.getString(2));
                ciu.setIddpear(rs.getString(3));*/
               
               //en otro caso sacar esto
               // ciu.setId(rs.getInt("id_ciudad"));
                //usr.setId(rs.getInt("Id_Usuario"));
                usr.setNombusu(rs.getString("nomb_usuario"));
                usr.setClave(rs.getString("clave"));
                usr.setIdemple(rs.getString("IdEmpleado"));
                 usr.setCopiaid(rs.getString("Nombres"));
                usr.setIdperfil(rs.getString("Id_perfil"));
                             
            }
        } catch (Exception e) {
        }
        return usr;
    }
    public int actualizar(Usuario em){
        String sql="update usuario set nomb_usuario=?, clave=?, IdEmpleado=?, Id_perfil=? where Id_Usuario=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            String SalyPimienta="1987";
            ps.setString(1, em.getNombusu());
            String PassEncrEdit=getMD5(em.getClave()+SalyPimienta);
            ps.setString(2, PassEncrEdit);
            ps.setString(3, em.getIdemple());
            ps.setString(4, em.getIdperfil());
               
            ps.setInt(5, em.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from usuario where Id_Usuario="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
     public Usuario listarempleid(int id){
        Usuario usr = new Usuario();
        String sql="select * from empleado where IdEmpleado="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
               /* ciu.setNomciu(rs.getString(2));
                ciu.setIddpear(rs.getString(3));*/
               
               //en otro caso sacar esto
               // ciu.setId(rs.getInt("id_ciudad"));
                //usr.setId(rs.getInt("Id_Usuario"));
                usr.setIdemple(rs.getString("IdEmpleado"));
                usr.setCopiaid(rs.getString("Nombres")); 
                usr.setCopiadni(rs.getString("Dni"));
               
                             
            }
        } catch (Exception e) {
        }
        return usr;
    }
     
     
   public List listaremple(){
        String sql="select * from empleado";
        List<Usuario>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Usuario usu =new Usuario(); 
                
                usu.setIdemple(rs.getString("IdEmpleado"));
                usu.setCopiaid(rs.getString("Nombres"));
                usu.setCopiadni(rs.getString("Dni"));
                                              
                lista.add(usu);
            }
        } catch (Exception e) {
        }
        return lista;
    }  
   
   
   public static String getMD5(String input) {
 try {
 MessageDigest md = MessageDigest.getInstance("MD5");
 byte[] messageDigest = md.digest(input.getBytes());
 BigInteger number = new BigInteger(1, messageDigest);
 String hashtext = number.toString(16);

 while (hashtext.length() < 32) {
 hashtext = "0" + hashtext;
 }
 return hashtext;
 }
 catch (NoSuchAlgorithmException e) {
 throw new RuntimeException(e);
 }
 }
   
    
}
