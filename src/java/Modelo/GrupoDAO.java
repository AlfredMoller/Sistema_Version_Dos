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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author SAN MIGUEL
 */

public class GrupoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;  
     /*public GrupoDAO() {
    Conexion cn = new Conexion();
    Connection con;
     
    }*/
      

    public void verificarGrupo(Grupos grupo) {
        try {
            PreparedStatement ps = con.prepareStatement("select id_departamento from  departamento where id_departamento = ?");
            ps.setInt(1, grupo.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // encontrado
            {
                actualizarGrupo(grupo);
            } else {
                agregarGrupo(grupo);
            }
        } catch (Exception ex) {
            System.out.println("Error in check() -->" + ex.getMessage());
        } 
    }
    public void agregarGrupo(Grupos grupo) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("insert into departamento(id_departamento, nomb_depar) values (?, ? )");
            
            preparedStatement.setInt(1, grupo.getId());
            preparedStatement.setString(2, grupo.getGrupo());
             
           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarGrupo(String id) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("delete from departamento where id_departamento=?");
            // Parameters start with 1
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarGrupo(Grupos grupo) {
        try {
            PreparedStatement preparedStatement = con.prepareStatement("update departamento set nomb_depar=?  where id_departamento=?");

            // Parametros  empiezan en  1
            preparedStatement.setString(1, grupo.getGrupo());
            preparedStatement.setInt(2, grupo.getId());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Grupos> listarGrupo() {
        String sql="select * from departamento";
        List<Grupos>users=new ArrayList<Grupos>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Grupos grupo = new Grupos();
                grupo.setId(rs.getInt("id_departamento"));
                grupo.setGrupo(rs.getString("nomb_depar"));
                 
                users.add(grupo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public Grupos buscarGruposId(String id) {
        Grupos grupo = new Grupos();
        try {
            PreparedStatement preparedStatement = con.prepareStatement("select * from departamento where id_departamento=?");
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
               grupo.setId(rs.getInt("id_departamento"));
               grupo.setGrupo(rs.getString("nomb_depar"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return grupo;
    }
    
      public List<Grupos> listarGruposSeccion(String cod_seccion) {
        List<Grupos> users = new ArrayList<Grupos>();
        try {
             PreparedStatement preparedStatement = con.prepareStatement("select * from departamento where cod_seccion=?");
            preparedStatement.setString(1, cod_seccion);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Grupos grupo = new Grupos();
                grupo.setId(rs.getInt("id_departamento"));
                grupo.setGrupo(rs.getString("nomb_depar"));
                users.add(grupo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
      
      /*public List<Grupos> listarGrupos() {
        List<Grupos> group = new ArrayList<Grupos>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from grupos");
            while (rs.next()) {
                Grupos grupo = new Grupos();
                grupo.setId(rs.getInt("Id"));
                grupo.setGrupo(rs.getString("Grupo"));
                group.add(grupo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return group;
    }*/

}



/*public class GrupoDAO {
    private Connection connection;
    
     public GrupoDAO() {
        connection = BasedeDatos.getConnection();
     
    }

    public void verificarGrupo(Grupos grupo) {
        try {
            PreparedStatement ps = connection.prepareStatement("select num_depar from departamento where num_depar = ?");
            ps.setInt(1, grupo.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // encontrado
            {
                actualizarGrupo(grupo);
            } else {
                agregarGrupo(grupo);
            }
        } catch (Exception ex) {
            System.out.println("Error in check() -->" + ex.getMessage());
        } 
    }
    public void agregarGrupo(Grupos grupo) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into departamento(num_depar, nomb_depar) values (?, ? )");
            
            preparedStatement.setInt(1, grupo.getId());
            preparedStatement.setString(2, grupo.getGrupo());
             
           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarGrupo(String id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from departamento where num_depar=?");
            // Parameters start with 1
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarGrupo(Grupos grupo) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update departamento set nomb_depar=?  where num_depar=?");

            // Parametros  empiezan en  1
            preparedStatement.setString(1, grupo.getGrupo());
            preparedStatement.setInt(2, grupo.getId());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Grupos> listarGrupo() {
        List<Grupos> users = new ArrayList<Grupos>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from departamento");
            while (rs.next()) {
                Grupos grupo = new Grupos();
                grupo.setId(rs.getInt("num_depar"));
                grupo.setGrupo(rs.getString("nomb_depar"));
                 
                users.add(grupo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public Grupos buscarGruposId(String id) {
        Grupos grupo = new Grupos();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from departamento where num_depar=?");
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
               grupo.setId(rs.getInt("num_depar"));
               grupo.setGrupo(rs.getString("nomb_depar"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return grupo;
    }
    
      public List<Grupos> listarGruposSeccion(String cod_seccion) {
        List<Grupos> users = new ArrayList<Grupos>();
        try {
             PreparedStatement preparedStatement = connection.prepareStatement("select * from departamento where cod_seccion=?");
            preparedStatement.setString(1, cod_seccion);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Grupos grupo = new Grupos();
                grupo.setId(rs.getInt("num_depar"));
                grupo.setGrupo(rs.getString("nomb_depar"));
                users.add(grupo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
      
      /*public List<Grupos> listarGrupos() {
        List<Grupos> group = new ArrayList<Grupos>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from grupos");
            while (rs.next()) {
                Grupos grupo = new Grupos();
                grupo.setId(rs.getInt("Id"));
                grupo.setGrupo(rs.getString("Grupo"));
                group.add(grupo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return group;
    }*/

//}
