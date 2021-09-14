
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/*public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/sistema";
    String user="root";
    String pass="moller456";
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con;
    }
}*/
public class Conexion {
    
       public static Connection Conexion() {
          try  {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection
                      ("jdbc:mysql://localhost:3306/sistema",
                      "root","");
              return con;
          }
          catch(Exception ex) {
              System.out.println("Database.getConnection() Error -->" + ex.getMessage());
              return null;
          }
      }

       public static void close(Connection con) {
          try  {
              con.close();
          }
          catch(Exception ex) {
          }
      }
    
}
