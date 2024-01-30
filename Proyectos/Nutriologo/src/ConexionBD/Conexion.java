
package ConexionBD;
import java.sql.*;

public class Conexion {
    public static Connection conectar(){
    try{
        Connection HA = DriverManager.getConnection("jdbc:mysql://localhost/bd_pds", "root", "");
    return HA;
}catch(SQLException e){
        System.out.println("Error de conexion local" + e);
}
    return (null);
}
}
