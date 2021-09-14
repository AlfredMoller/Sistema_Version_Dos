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

public class InicioDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r; 
 
    
    //Operaciones CRUD
    
    public List listar(){
         String sql="SELECT(select count(id_departamento)from departamento)AS countDep, "
                + "(select count(id_ciudad) from ciudad)AS countCid," 
                + "(select count(IdEmpleado)from empleado)AS countEmp, "
                + "(select count(IdCliente) from cliente) AS countCli, "
                + "(select count(IdProveedor) from proveedor) AS countProv from dual";
        /*String sql="select count1,count2,count3 from   (select count(IdEmpleado) count1 from empleado) t1_count, "
                + "(select count(IdCliente) count2 from cliente) t2_count,"
                +"(select count (IdProveedor) count3 from proveedor) t3_count";*/
        List<Inicio>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
               Inicio in=new Inicio();
                in.setIddepartamento(rs.getInt("countDep"));
                in.setIdciudad(rs.getInt("countCid"));
                in.setIdempleado(rs.getInt("countEmp"));
                in.setIdcliente(rs.getInt("countCli"));
                in.setIdproveedor(rs.getInt("countProv"));
             
                lista.add(in);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
 
  