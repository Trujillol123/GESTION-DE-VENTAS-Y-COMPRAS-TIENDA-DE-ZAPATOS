package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    
    public Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/tiendazapatos1";
    private final String USER = "root";
    private final String PASS = "";
    
    public void Conectar() throws ClassNotFoundException {
    try {
        // Primero cargamos el driver
        Class.forName(JDBC_DRIVER);

        // Luego intentamos la conexión
        conexion = DriverManager.getConnection(DB_URL, USER, PASS);
    } catch (SQLException ex) {
        Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
    }
}

           
    public void Cerrar () throws SQLException{
        if (conexion != null) {
            if (!conexion.isClosed()){
                conexion.close();
            }
        }
    }
}
