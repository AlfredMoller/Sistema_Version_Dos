
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Cliente buscar(String dni){
        Cliente c=new Cliente();
        String sql="Select * from cliente where Dni="+dni;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));                
                c.setEs(rs.getString(5));                
            }
        } catch (Exception e) {
        }
        return c;
    }

//*******Operaciones CRUD***************//
    public List listar(){
        String sql="select * from cliente";
        List<Cliente>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Cliente cl=new Cliente();
                cl.setId(rs.getInt("IdCliente"));
                cl.setNom(rs.getString("Nombres"));
                cl.setDni(rs.getString("Dni"));
                cl.setTelefono(rs.getString("telefono"));
                cl.setAuxtel(rs.getString("telef_aux"));
                cl.setDir(rs.getString("Direccion"));
                                
                lista.add(cl);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int agregar(Cliente cl){ 
        String sql="insert into cliente(Nombres, Dni, tipo_doc, Direccion, Estado, telefono, tipo_tel, telef_aux, tipo_aux)values(?,?,?,?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, cl.getNom());
            ps.setString(2, cl.getDni());
            ps.setString(3, cl.getTipodoc());
            ps.setString(4, cl.getDir());
            ps.setString(5, cl.getEs());
            ps.setString(6, cl.getTelefono());
            ps.setString(7, cl.getTipotel());
            ps.setString(8, cl.getAuxtel());
            ps.setString(9, cl.getTipoaux());
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    public Cliente listarId(int id){
        Cliente cli=new Cliente();
        String sql="select * from cliente where IdCliente="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                cli.setNom(rs.getString("Nombres"));
                cli.setDni(rs.getString("Dni"));
                cli.setTipodoc(rs.getString("tipo_doc"));
                cli.setDir(rs.getString("Direccion"));
                cli.setTelefono(rs.getString("telefono"));
                cli.setTipotel(rs.getString("tipo_tel"));
                cli.setAuxtel(rs.getString("telef_aux"));
                cli.setTipoaux(rs.getString("tipo_aux"));
                cli.setEs(rs.getString("Estado"));
                
                 
            }
        } catch (Exception e) {
        }
        return cli;
    }
    public int actualizar(Cliente em){
        String sql="update cliente set  Nombres=?, Dni=?, tipo_doc=?, Direccion=?, Estado=?, telefono=?, tipo_tel=?, telef_aux=?, tipo_aux=? where IdCliente=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNom());
            ps.setString(2, em.getDni());
            ps.setString(3, em.getTipodoc());
            ps.setString(4, em.getDir());
            ps.setString(5, em.getEs());
            ps.setString(6, em.getTelefono());
            ps.setString(7, em.getTipotel());
            ps.setString(8, em.getAuxtel());
            ps.setString(9, em.getTipoaux());
            ps.setInt(10, em.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from cliente where IdCliente="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
