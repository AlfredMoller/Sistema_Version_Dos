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
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TipoProveedorDAO{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public TipoProveedor buscar(String id){
        TipoProveedor tp =new TipoProveedor();
        String sql="Select * from tipo_proveedor where Id_tipoprov="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                tp.setIdtipoprov(rs.getInt(1));
                tp.setTipo_proveedor(rs.getString("descripcion"));
                 
                               
            }
        } catch (Exception e) {
        }
        return tp;
    }

//*******Operaciones CRUD***************//
    public List listar(){
        String sql="select * from tipo_proveedor";
        List<TipoProveedor>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                TipoProveedor tpr=new TipoProveedor();
                tpr.setIdtipoprov(rs.getInt(1));
                tpr.setTipo_proveedor(rs.getString("descripcion"));
                   
                lista.add(tpr);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int agregar(TipoProveedor tpr){ 
        String sql="insert into tipo_proveedor(descripcion)values(?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, tpr.getTipo_proveedor());
            //ps.setString(2, cat.getProdcat());
                     
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    public TipoProveedor listarId(int id){
        TipoProveedor tpro=new TipoProveedor();
        String sql="select * from tipo_proveedor where Id_tipoprov="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                //cate.setRefcat(rs.getString("ref_categoria"));
                tpro.setTipo_proveedor(rs.getString("descripcion"));
                              
            }
        } catch (Exception e) {
        }
        return tpro;
    }
    public int actualizar(TipoProveedor tp){
        String sql="update tipo_proveedor set descripcion=? where Id_tipoprov=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, tp.getTipo_proveedor());
           // ps.setString(2, em.getProdcat());
                    
            ps.setInt(2, tp.getIdtipoprov());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from tipo_proveedor where Id_tipoprov="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}