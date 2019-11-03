
package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MantenimientoSesiones {
    
    private Statement sentenciaSQL;
    private Conexion_SQL bd;
    private ResultSet rs;
    
    public void IniciarSesion(IniciosDeSesion ini) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        String sql;
        
        try{
            bd = new Conexion_SQL();
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sql = "select * from Sesiones where Usuario = '"+ini.getUsuario()+"' and Contraseña = '"+ini.getContraseña()+"'";
            rs = sentenciaSQL.executeQuery(sql);
            
            if(rs.next()){
                ini.setStatus(true);
            }
            else{
                ini.setStatus(false);
            }
            
            rs.close();
            bd.CerrarConexion();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de Conexion al iniciar sesion..."+e);
        }
    }
    
    public void ConectarDB() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        try{
            bd = new Conexion_SQL();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos..."+e);
        }
    }
    
}
