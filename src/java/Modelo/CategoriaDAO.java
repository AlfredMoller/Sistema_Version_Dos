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

public class CategoriaDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    Auditoria auditoria = new Auditoria();
    Categoria categ = new Categoria();

    public Categoria buscar(String numd) {
        Categoria ct = new Categoria();
        String sql = "Select * from cate_prod where ref_categoria=" + numd;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ct.setId(rs.getInt(1));
                ct.setRefcat(rs.getString("ref_categoria"));
                ct.setProdcat(rs.getString("nomb_categoria"));

            }
        } catch (Exception e) {
        }
        return ct;
    }

//*******Operaciones CRUD***************//
    public List listar() {
        String sql = "select * from cate_prod";
        List<Categoria> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setId(rs.getInt(1));
                cat.setRefcat(rs.getString("ref_categoria"));
                cat.setProdcat(rs.getString("nomb_categoria"));

                lista.add(cat);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Categoria cat) {
        int count = 0;
        try {

            String query = "select count(nomb_categoria) from cate_prod where nomb_categoria=? ";
            ps = con.prepareStatement(query);
            ps.setString(1, cat.getProdcat());
            rs = ps.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count(nomb_categoria)");

            }
        } catch (SQLException ex) {
            System.out.println("Error al verificar existencia de departamento" + " " + ex);
        }
        if (count == 0) {
            String sql = "insert into cate_prod(ref_categoria,nomb_categoria)values(?,?)";
            try {
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, cat.getRefcat());
                ps.setString(2, cat.getProdcat());

                int n = ps.executeUpdate();

                if (n > 0) {
                    String usuario = cat.getIdus();
                    String objeto = "Categoria de Producto Con Nombre:" + " " + cat.getProdcat();
                    String evento = "Guardar";
                    String tabla = "cate_prod";
                    auditoria.audi(usuario, objeto, evento, tabla);

                }
                ps.close();
            } catch (Exception e) {
                 System.out.println("Error al realizar guardado de categoria de producto"+" "+e);
            }

        } else {

            out.println("<p style='color:red;'>El Número de Departamento Existe...</p>");
        }
        return r;

    }

    public Categoria listarId(int id) {
        Categoria cate = new Categoria();
        String sql = "select * from cate_prod where id_categoria=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cate.setRefcat(rs.getString("ref_categoria"));
                cate.setProdcat(rs.getString("nomb_categoria"));

            }
        } catch (Exception e) {
        }
        return cate;
    }

    public int actualizar(Categoria cat) {
        String sql = "update cate_prod set ref_categoria=?,nomb_categoria=? where id_categoria=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cat.getRefcat());
            ps.setString(2, cat.getProdcat());
            ps.setInt(3, cat.getId());

            int n = ps.executeUpdate();

            if (n > 0) {
                String usuario = cat.getIdus();
                String objeto = "Categoria Con Nombre:" + " " + cat.getProdcat();
                String evento = "Editar";
                String tabla = "cate_prod";
                auditoria.audi(usuario, objeto, evento, tabla);
            }
            ps.close();
        } catch (Exception e) {
             System.out.println("Error al realizar modificacion de categoria de producto"+" "+e);
        }
        return r;
    }

    public void delete(int id, String id_usu) {

        categ = listarId(id);

        String objeto = "Categoria de Producto Con Nombre:" + " " + categ.getProdcat();
        String evento = "Eliminar";
        String tabla = "cate_prod";
        auditoria.audi(id_usu, objeto, evento, tabla);

        String sql = "delete from cate_prod where id_categoria=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            if (n > 0) {
                System.out.println("categoria eliminada");
            }

            ps.close();
        } catch (Exception e) {
            System.out.println("Error al realizar supresion de categoria de producto"+" "+e);
        }
    }

}
