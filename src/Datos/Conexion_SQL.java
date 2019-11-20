package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Conexion_SQL {
    
    private Connection conexion = null;
    private Statement sentenciaSQL;
    private ResultSet resultado;
    
    public Conexion_SQL() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        String controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Class.forName(controlador).newInstance();
        
        String url = "jdbc:sqlserver://DESKTOP-B49PDPN:1433;databaseName=BDPuntoVenta";
        String user = "sa";
        String password = "123";
        conexion = DriverManager.getConnection(url,user,password);
        
    }
    
    public Connection Conectarse(){
        return conexion;
    }
    
    public void CerrarConexion() throws SQLException{
        if(resultado != null) resultado.close();
        if(sentenciaSQL != null) sentenciaSQL.close();
        if(conexion != null) conexion.close();
    }
}
