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

/**
 *
 * @author pc
 */
public class BackUpTest {

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
    
     public String fechaBD(){
        java.util.Date fecha= new java.util.Date();
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd.MM.yyyy");
        return formatoFecha.format(fecha);
        //String fechaBD= formatoFecha.format(fecha);
        
        //return fechaBD();  
       
    }
    
    public String obtenerHora(){
       String horaAct= new SimpleDateFormat("HH.mm").format(Calendar.getInstance().getTime());
        return horaAct;
    }
    
    
     public void BackUp(){
        
        
        try {
            String db= "sistema";
            String user= "root";
            String password= "";
                                //En caso de cambiar direccion del archivo cambiar esto...
            String folderPath= System.getProperty("user.dir") + "\\backup";
            
            File fl= new File(folderPath);
            fl.mkdir();
            
            String savePath=  "C:\\Users\\pc\\Documents\\NetBeansProjects\\Sistema_Vesion_Dos" + "\\backup\\" + "tesinaBackup" + fechaBD() + "-" + obtenerHora() + ".sql";
            System.out.println(savePath);
            
            //String executeCmd = "C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysqldump.exe -u root -p moller123 -d tesina -r " + savePath;
            String executeCmd = "\"C:\\xampp\\mysql\\bin\\mysqldump.exe\" -uroot -p sistema -r "+ savePath;
            System.out.println(executeCmd);
            
             Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
             int processComplete = runtimeProcess.waitFor();
             System.out.println(processComplete);
            
           
        
            if(processComplete == 0){
                System.out.println("EL BACKUP SE HA REALIZADO EXITOSAMENTE...");
            }else{
                System.out.println("FALLO AL REALIZAR BACKUP");
            }
            
        } catch (IOException e) {
            System.out.println("Error"+e);
        } catch (InterruptedException ex){
            //Logger.getLogger(backup_restore.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

}
