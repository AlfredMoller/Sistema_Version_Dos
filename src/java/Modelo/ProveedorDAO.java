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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProveedorDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r; 
    
       public Proveedor buscar(String dni){
        Proveedor pr =new Proveedor();
        String sql="Select * from proveedor where documento="+dni;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                pr.setId(rs.getInt("IdProveedor"));
                pr.setDocumento(rs.getString("documento"));
                pr.setPersfisica(rs.getString("nombre"));
                               
            }
        } catch (Exception e) {
        }
        return pr;
    }
    
    //Operaciones CRUD
    
    public List listar(){
        String sql="Select * from proveedor,tipo_actividad,tipo_proveedor where proveedor.Id_actividad=tipo_actividad.Id_Actividad "
                + "AND proveedor.Id_tipoprov=tipo_proveedor.Id_tipoprov";
        List<Proveedor>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Proveedor pr=new Proveedor();
                pr.setId(rs.getInt("IdProveedor"));
                pr.setPersfisica(rs.getString("nombre"));
                pr.setIdempresa(rs.getString("nomb_empresa"));
                pr.setDocumento(rs.getString("documento"));
                pr.setTelefono(rs.getString("telefono"));
                pr.setTelaux(rs.getString("telef_aux"));
                pr.setIdactividad(rs.getString("nomb_actividad"));
                pr.setIdtipoprov(rs.getString("descripcion"));
                pr.setDireccion(rs.getString("direccion"));
                lista.add(pr);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int agregar(Proveedor pr){ 
        String sql="insert into proveedor(nombre, nomb_empresa, documento, tipo_doc, telefono, tipo_tel, telef_aux, tipo_aux, Id_actividad,Id_tipoprov, direccion)values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, pr.getPersfisica());
            ps.setString(2, pr.getIdempresa());
            ps.setString(3, pr.getDocumento());
            ps.setString(4, pr.getTipodoc());
            ps.setString(5, pr.getTelefono());
            ps.setString(6, pr.getTipotel());
            ps.setString(7, pr.getTelaux());
            ps.setString(8, pr.getTipoaux());
            ps.setString(9, pr.getIdactividad());
            ps.setString(10, pr.getIdtipoprov());
            ps.setString(11, pr.getDireccion());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    public Proveedor listarId(int id){
        Proveedor pro=new Proveedor();
        String sql="Select * from proveedor where IdProveedor="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                 //pr.setId(rs.getInt("IdProveedor"));
                pro.setPersfisica(rs.getString("nombre"));
                pro.setIdempresa(rs.getString("nomb_empresa"));
                pro.setDocumento(rs.getString("documento"));
                pro.setTipodoc(rs.getString("tipo_doc"));
                pro.setTelefono(rs.getString("telefono"));
                pro.setTipotel(rs.getString("tipo_tel"));
                pro.setTelaux(rs.getString("telef_aux"));
                pro.setTipoaux(rs.getString("tipo_aux"));
                pro.setIdactividad(rs.getString("Id_actividad"));
                pro.setIdtipoprov(rs.getString("Id_tipoprov"));
                pro.setDireccion(rs.getString("direccion"));
            }
        } catch (Exception e) {
        }
        return pro;
    }
    public int actualizar(Proveedor pr){
        String sql="update proveedor set nombre=?, nomb_empresa=?, documento=?, tipo_doc=?, telefono=?, tipo_tel=?, telef_aux=?, tipo_aux=?, Id_actividad=? , Id_tipoprov=?,direccion=?  where IdProveedor=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1,pr.getPersfisica());
            ps.setString(2, pr.getIdempresa());
            ps.setString(3, pr.getDocumento());
            ps.setString(4, pr.getTipodoc());
            ps.setString(5, pr.getTelefono());
            ps.setString(6, pr.getTipotel());
            ps.setString(7, pr.getTelaux());
            ps.setString(8, pr.getTipoaux());
            ps.setString(9, pr.getIdactividad());
            ps.setString(10, pr.getIdtipoprov());
            ps.setString(11, pr.getDireccion());
            ps.setInt(12, pr.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from proveedor where IdProveedor="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
