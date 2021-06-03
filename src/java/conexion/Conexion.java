package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    //Atributos
    Connection con;
    

    //Constructor
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //AQUI TIENE QUE TENER TU CONEXION
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/after_pizzap", "root", "");
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Conexion fallida");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
}
