/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

 
import config.Conexion;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author SAN MIGUEL
 */
public class Auditoria {
    Statement sent;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String us, acc, des, tab, obj1, obj2;
    String ip, no;
    
    
    public Auditoria() {
        con = Conexion.Conexion();

    }

    public String ipe() {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            ip = localHost.getHostAddress();
        } catch (Exception e) {

        }
        return ip;
    }


 public void audi( String usuario,String objeto, String evento, String tabla) {

        try {
            us = usuario;
            obj1 = objeto;
            acc = evento;
            des = "" + obj1;
            tab = tabla;
            String guardar = "INSERT INTO auditoria (fecha_audi,hora_audi, evento, tabla ,desc_audi,ip_maquina,IdUsuario) VALUES (now(),now(),?,?,?,?,?)";
            ps = con.prepareStatement(guardar);
            //ps.setString(1, us);
            ps.setString(1, acc);
            ps.setString(2, tab);
            ps.setString(3, des);
            ps.setString(4, ipe()); 
            ps.setString(5, us);
            int nn = ps.executeUpdate();
            if (nn > 0) {
               // JOptionPane.showMessageDialog(null, "AUDITORIA GUARDADO CON EXITO");
                ps.close();
            }
        } catch (Exception e) {
           //JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR AUDITORIA VERIFIQUE LOS DATOS: " + e.getMessage());
        }
    }
}
