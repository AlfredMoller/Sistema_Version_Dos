/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tomcat.util.http.fileupload.FileUtils;

/**
 *
 * @author pc
 */
public class BackUpTest {

    public static String backup_dir = "C:\\Users\\pc\\Documents\\NetBeansProjects\\Sistema_Vesion_Dos\\backup\\";

    public void backup() {

        int resp;
        Calendar c = Calendar.getInstance();
        String fecha = String.valueOf(c.get(Calendar.DATE));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.MONTH));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.YEAR));

        try {
            Runtime runtime = Runtime.getRuntime();
            File backupFile = new File(
                    "C:\\Users\\pc\\Documents\\NetBeansProjects\\Sistema_Vesion_Dos" + "\\backup\\" + "_" + fecha + ".sql");
            FileWriter fw = new FileWriter(backupFile);
            Process child = runtime.exec("C:\\xampp\\mysql\\bin\\mysqldump --user=root --password=  "
                    + "sistema -R");
            InputStreamReader irs = new InputStreamReader(child.getInputStream());
            BufferedReader br = new BufferedReader(irs);

            String line;
            while ((line = br.readLine()) != null) {
                fw.write(line + "\n");
            }
            fw.close();
            irs.close();
            br.close();

        } catch (Exception e) {
            System.out.println("Error no se genero el archivo por el siguiente motivo:" + e.getMessage());
        }

    }

    public String fechaBD() {
        java.util.Date fecha = new java.util.Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd.MM.yyyy");
        return formatoFecha.format(fecha);
        //String fechaBD= formatoFecha.format(fecha);

        //return fechaBD();  
    }

    public String obtenerHora() {
        String horaAct = new SimpleDateFormat("HH.mm").format(Calendar.getInstance().getTime());
        return horaAct;
    }

    public void borrarbackup() {

        try {
            String path = "C:\\Users\\pc\\Documents\\NetBeansProjects\\Sistema_Vesion_Dos\\backup\\";
            File file = new File(path);
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isFile() && f.exists()) {
                    f.delete();
                    System.out.println("successfully deleted");
                } else {
                    System.out.println("cant delete a file due to open or error");
                }
                }     
            }catch (Exception ex) {
            Logger.getLogger(BackUpTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    }
