
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    
    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/tiendazapatos1";
    
    private final String USER = "Root";
    private final String PASS = "123456";
    
    public void Conectar () throws ClassNotFoundException { 
        try {
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        Class.forName(JDBC_DRIVER);
        
    }
           
    public void Cerrar () throws SQLException{
        if (conexion != null) {
            if (!conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
