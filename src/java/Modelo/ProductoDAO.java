package Modelo;

import config.Conexion;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    Auditoria auditoria = new Auditoria();
    Producto prod = new Producto();

    public Producto buscar(int id) {
        Producto p = new Producto();
        String sql = "select * from producto where IdProducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNom(rs.getString("Nombres"));
                p.setPre(rs.getDouble("Precio"));
                p.setStock(rs.getInt("Stock"));
                p.setEstado(rs.getString("Estado"));
                p.setIdprodcat(rs.getString("id_categoria"));
                p.setIvav(rs.getString("iva_venta"));
                p.setMonto_ivv(rs.getDouble("monto_ivaventa"));
            }
        } catch (Exception e) {
        }
        return p;
    }

    public int actualizarstock(int id, int stock) {
        String sql = "update producto set Stock=? where IdProducto=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    //*******Operaciones CRUD***************//    
    public List listar() {
        String sql = "select * from producto,cate_prod where producto.id_categoria = cate_prod.id_categoria";
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto em = new Producto();
                em.setId(rs.getInt(1));
                em.setNom(rs.getString("Nombres"));
                em.setPre(rs.getDouble("Precio"));
                em.setStock(rs.getInt("Stock"));
                em.setEstado(rs.getString("Estado"));
                em.setIdprodcat(rs.getString("nomb_categoria"));
                em.setIvav(rs.getString("iva_venta"));
                em.setMonto_ivv(rs.getDouble("monto_ivaventa"));
                lista.add(em);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int agregar(Producto p) {

        int count = 0;
        try {

            String query = "select count(Nombres) from producto where Nombres =? ";
            ps = con.prepareStatement(query);
            ps.setString(1, p.getNom());
            rs = ps.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count(Nombres)");

            }
        } catch (SQLException ex) {
            System.out.println("Error al verificar existencia de departamento" + " " + ex);
        }

        if (count == 0) {
            String sql = "insert into producto(Nombres, Precio,Stock,Estado,id_categoria,iva_venta,monto_ivaventa)values(?,?,?,?,?,?,?)";
            try {
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, p.getNom());
                ps.setDouble(2, p.getPre());
                ps.setInt(3, p.getStock());
                ps.setString(4, p.getEstado());
                ps.setString(5, p.getIdprodcat());
                ps.setString(6, p.getIvav());
                ps.setDouble(7, p.getMonto_ivv());
                int n = ps.executeUpdate();

                if (n > 0) {
                    String usuario = p.getIdus();
                    String objeto = "Producto Con Nombre:" + " " + p.getNom();
                    String evento = "Guardar";
                    String tabla = "producto";
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
    

    public Producto listarId(int id) {
        Producto pr = new Producto();
        String sql = "select * from producto where IdProducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pr.setId(rs.getInt(1));
                pr.setNom(rs.getString("Nombres"));
                pr.setPre(rs.getDouble("Precio"));
                pr.setStock(rs.getInt("Stock"));
                pr.setEstado(rs.getString("Estado"));
                pr.setIdprodcat(rs.getString("id_categoria"));
                pr.setIvav(rs.getString("iva_venta"));
                pr.setMonto_ivv(rs.getDouble("monto_ivaventa"));
            }
        } catch (Exception e) {
        }
        return pr;
    }

    public int actualizar(Producto pro) {
        String sql = "update producto set Nombres=?, Precio=?, Stock=?, Estado=?, id_categoria=?, iva_venta=?, monto_ivaventa=? where IdProducto=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNom());
            ps.setDouble(2, pro.getPre());
            ps.setInt(3, pro.getStock());
            ps.setString(4, pro.getEstado());
            ps.setString(5, pro.getIdprodcat());
            ps.setString(6, pro.getIvav());
            ps.setDouble(7, pro.getMonto_ivv());
            ps.setInt(8, pro.getId());
            int n = ps.executeUpdate();

            if (n > 0) {
                String usuario = pro.getIdus();
                String objeto = "Producto Con Nombre:" + " " + pro.getNom();
                String evento = "Editar";
                String tabla = "producto";
                auditoria.audi(usuario, objeto, evento, tabla);
            }
            ps.close();

        } catch (Exception e) {
        }
        return r;
    }

    public void delete(int id, String id_usu) {

        prod = listarId(id);

        String objeto = "Producto Con Nombre:" + " " + prod.getNom();
        String evento = "Eliminar";
        String tabla = "producto";
        auditoria.audi(id_usu, objeto, evento, tabla);

        String sql = "delete from producto where IdProducto=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            int n = ps.executeUpdate();

            if (n > 0) {

            }

            ps.close();
        } catch (Exception e) {
        }
    }

    public List buscarProducto(String nombProd) {
        List<Producto> prodlist = new ArrayList<>();
        String sql = "select * from producto,cate_prod where producto.id_categoria = cate_prod.id_categoria and Nombres like '%" + nombProd + "%' ";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pr = new Producto();
                pr.setId(rs.getInt(1));
                pr.setNom(rs.getString("Nombres"));
                pr.setPre(rs.getDouble("Precio"));
                pr.setStock(rs.getInt("Stock"));
                pr.setEstado(rs.getString("Estado"));
                pr.setIdprodcat(rs.getString("nomb_categoria"));
                pr.setIvav(rs.getString("iva_venta"));
                pr.setMonto_ivv(rs.getDouble("monto_ivaventa"));
                prodlist.add(pr);
            }

        } catch (Exception e) {
            System.out.println("Fallo al traer resultado de la tabla");
        }
        return prodlist;
    }

    public List buscarCatProd(String catProd) {
        List<Producto> prodlist = new ArrayList<>();
        String sql = "select * from producto,cate_prod where producto.id_categoria = cate_prod.id_categoria and nomb_categoria like '%" + catProd + "%' ";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pr = new Producto();
                pr.setId(rs.getInt(1));
                pr.setNom(rs.getString("Nombres"));
                pr.setPre(rs.getDouble("Precio"));
                pr.setStock(rs.getInt("Stock"));
                pr.setEstado(rs.getString("Estado"));
                pr.setIdprodcat(rs.getString("nomb_categoria"));
                pr.setIvav(rs.getString("iva_venta"));
                pr.setMonto_ivv(rs.getDouble("monto_ivaventa"));
                prodlist.add(pr);
            }

        } catch (Exception e) {
            System.out.println("Fallo al traer resultado de la tabla");
        }
        return prodlist;
    }

}
