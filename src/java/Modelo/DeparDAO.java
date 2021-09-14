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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DeparDAO implements Metodos {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    Auditoria auditoria = new Auditoria();
    Departamento depr = new Departamento();

//*******Operaciones CRUD***************//
    public List listar() {
        String sql = "select * from departamento";
        List<Departamento> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Departamento dep = new Departamento();
                dep.setId(rs.getInt(1));
                dep.setNum_dep(rs.getString("num_depar"));
                dep.setNom_dep(rs.getString("nomb_depar"));

                lista.add(dep);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Departamento dep) {
        int count = 0;
        try {

            String query = "select count(num_depar) from departamento where num_depar=? ";
            ps = con.prepareStatement(query);
            ps.setString(1, dep.getNum_dep());
            rs = ps.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count(num_depar)");

            }
        } catch (SQLException ex) {
            System.out.println("Error al verificar existencia de departamento"+" "+ex);
        }
        
        if (count == 0) {
            String sql = "insert into departamento(num_depar,nomb_depar)values(?,?)";
            try {
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, dep.getNum_dep());
                ps.setString(2, dep.getNom_dep());

                //ps.executeUpdate();
                int n = ps.executeUpdate();

                if (n > 0) {
                    String usuario = dep.getIdus();
                    String objeto = "Departamento Con Nombre:" + " " + dep.getNom_dep();
                    String evento = "Guardar";
                    String tabla = "departamento";
                    auditoria.audi(usuario, objeto, evento, tabla);

                }
                ps.close();
            } catch (Exception e) {
                 System.out.println("Error al realizar guardado de departamento"+" "+e);
            }

        } else {

            //System.out.println("user exists");
            out.println("<p style='color:red;'>El Número de Departamento Existe...</p>");
        }
        return r;
    }
    //aqui finaliza agregar

    public Departamento listarId(int id) {
        Departamento depa = new Departamento();
        String sql = "select * from departamento where id_departamento=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                depa.setNum_dep(rs.getString("num_depar"));
                depa.setNom_dep(rs.getString("nomb_depar"));

            }
        } catch (Exception e) {
        }
        return depa;
    }

    public int actualizar(Departamento em) {
        String sql = "update departamento set num_depar=?,nomb_depar=? where id_departamento=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getNum_dep());
            ps.setString(2, em.getNom_dep());
            // ps.setString(3, em.getIdus());       
            ps.setInt(3, em.getId());

            //ps.executeUpdate();
            int n = ps.executeUpdate();
            if (n > 0) {
                String usuario = em.getIdus();
                String objeto = "Departamento Con Nombre:" + " " + em.getNom_dep();
                String evento = "Editar";
                String tabla = "departamento";
                auditoria.audi(usuario, objeto, evento, tabla);
            }
            ps.close();

        } catch (Exception e) {
             System.out.println("Error al realizar modificacion de departamento"+" "+e);
        }
        return r;
    }

    public void delete(int id, String id_usu) {

        /*Datos guardados de manera provisioria hasta que descubramos como funciona*/
        depr = listarId(id);
        //String objeto= "Departamento Con Identificacion:"+" "+ eml.getTel();
        String objeto = "Departamento Con Nombre:" + " " + depr.getNom_dep();
        String evento = "Eliminar";
        String tabla = "departamento";
        auditoria.audi(id_usu, objeto, evento, tabla);

        String sql = "delete from departamento where id_departamento=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            //ps.executeUpdate();

            int n = ps.executeUpdate();
            /* if (n > 0) {
                
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
             System.out.println("Error al realizar supresion de departamento"+" "+e);
        }
    }

    public List buscadepa(String texto) {
        List<Departamento> listas = new ArrayList<>();
        String sql = "Select * from departamento where nomb_depar LIKE  '%" + texto + "%' ";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Departamento d = new Departamento();
                d.setId(rs.getInt(1));
                d.setNum_dep(rs.getString("num_depar"));
                d.setNom_dep(rs.getString("nomb_depar"));
                listas.add(d);
            }
        } catch (Exception e) {
        }
        return listas;
    }

    public List buscnumdepa(String texto) {
        List<Departamento> listdepa = new ArrayList<>();
        String sql = "Select * from departamento where num_depar like '%" + texto + "%'  ";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Departamento ldep = new Departamento();
                ldep.setId(rs.getInt(1));
                ldep.setNum_dep(rs.getString("num_depar"));
                ldep.setNom_dep(rs.getString("nomb_depar"));
                listdepa.add(ldep);
            }

        } catch (Exception e) {
        }
        return listdepa;
    }

}
