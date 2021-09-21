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
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    Auditoria auditoria = new Auditoria();
    Ciudad ciud = new Ciudad();

    public Ciudad buscar(String id) {
        Ciudad cd = new Ciudad();
        String sql = "Select * from ciudad where id_ciudad=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                /* cd.setId(rs.getInt(1));
                cd.setNomciu(rs.getString(2));
                cd.setIddpear(rs.getString(3));*/
                cd.setId(rs.getInt("id_ciudad"));
                cd.setNomciu(rs.getString("nomb_ciu"));
                cd.setIddpear(rs.getString("id_departamento"));

            }
        } catch (Exception e) {
        }
        return cd;
    }

//*******Operaciones CRUD***************//
    public List listar() {
        String sql = "select * from ciudad, departamento where ciudad.id_departamento = departamento.id_departamento";
        List<Ciudad> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ciudad ci = new Ciudad();
                /*ci.setId(rs.getInt(1));
                ci.setNomciu(rs.getString(2));
                ci.setIddpear(rs.getString(3));*/
                ci.setId(rs.getInt("id_ciudad"));
                ci.setNomciu(rs.getString("nomb_ciu"));
                ci.setIddpear(rs.getString("nomb_depar"));

                lista.add(ci);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Ciudad ci) {
        int count = 0;
        try {
            String query = "Select count(nomb_ciu) from ciudad where nomb_ciu=";
            ps = con.prepareStatement(query);
            ps.setString(1, ci.getNomciu());
            rs = ps.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count(nomb_ciu)");
            }

        } catch (Exception e) {
            System.out.println("Error al verificar existencia de ciudad" + " " + e);
        }

        if (count == 0) {
            String sql = "insert into ciudad(nomb_ciu,id_departamento)values(?,?)";
            try {
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, ci.getNomciu());
                ps.setString(2, ci.getIddpear());

                int n = ps.executeUpdate();

                if (n > 0) {
                    String usuario = ci.getIdus();
                    String objeto = "Ciudad Con Nombre:" + " " + ci.getNomciu();
                    String evento = "Guardar";
                    String tabla = "ciudad";
                    auditoria.audi(usuario, objeto, evento, tabla);

                }
            } catch (Exception e) {
                System.out.println("Error al realizar guardado de ciudad" + " " + e);
            }
        } else {

            //System.out.println("user exists");
            out.println("<p style='color:red;'>El Número de Departamento Existe...</p>");
        }
        return r;

    }

    public Ciudad listarId(int id) {
        Ciudad ciu = new Ciudad();
        String sql = "select * from ciudad where id_ciudad=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ciu.setNomciu(rs.getString("nomb_ciu"));
                ciu.setIddpear(rs.getString("id_departamento"));

            }
        } catch (Exception e) {
        }
        return ciu;
    }

    public int actualizar(Ciudad ci) {
        String sql = "update ciudad set nomb_ciu=?, id_departamento=? where id_ciudad=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ci.getNomciu());
            ps.setString(2, ci.getIddpear());

            ps.setInt(3, ci.getId());
            int n = ps.executeUpdate();

            if (n > 0) {
                String usuario = ci.getIdus();
                String objeto = "Ciudad Con Nombre:" + " " + ci.getNomciu();
                String evento = "Editar";
                String tabla = "ciudad";
                auditoria.audi(usuario, objeto, evento, tabla);
            }

        } catch (Exception e) {
            System.out.println("Error al realizar modificacion de ciudad" + " " + e);
        }
        return r;
    }
    
    
    

    public List<Ciudad> listarCiudaddep(String id_dep) {
        List<Ciudad> ciud_dep = new ArrayList<>();
        try {
            String sql= "select * from ciudad where id_departamento =? ";
            con = cn.Conexion();
            ps.setString(1, id_dep);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Ciudad ciud = new Ciudad();
                ciud.setId(rs.getInt("id_ciudad"));
                ciud.setNomciu(rs.getString("nomb_ciu"));
                ciud.setIddpear(rs.getString("id_departamento"));
                ciud_dep.add(ciud);
            }

        } catch (Exception e) {
            System.out.println("No se pudo traer los resultados del combo ciudad" + " " + e);
        }
        return ciud_dep;
    }
    
    
    

    public void delete(int id, String id_usu) {

        /*Datos guardados de manera provisioria hasta que descubramos como funciona*/
        ciud = listarId(id);
        //String objeto= "Departamento Con Identificacion:"+" "+ eml.getTel();
        String objeto = "Ciudad Con Nombre:" + " " + ciud.getNomciu();
        String evento = "Eliminar";
        String tabla = "ciudad";
        auditoria.audi(id_usu, objeto, evento, tabla);

        String sql = "delete from ciudad where id_ciudad=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            //ps.executeUpdate();

            int n = ps.executeUpdate();
            if (n > 0) {

            }

            /*
                  String id_data = String.valueOf(id);
                  String usuario = "2";
                  String usuarios = "1";
                  //String dni = "123"; 
                  //eml = emp_dao.validar(usuarios,dni);
                  
                  int idsusu = 4;
                  depr = validar_depar(idsusu);
                  //String objeto= "Departamento Con Identificacion:"+" "+ eml.getTel();
                  String objeto= "Departamento Con Identificacion:"+" "+ depr.getNom_dep();
                  String evento= "Eliminar";
                  String tabla=  "Departamento";
                  auditoria.audi(usuarios,objeto, evento, tabla);
                   }*/
            ps.close();

        } catch (Exception e) {
            System.out.println("Error al realizar supresion de ciudad" + " " + e);
        }
    }

}
