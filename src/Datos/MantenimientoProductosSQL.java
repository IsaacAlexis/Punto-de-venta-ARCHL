
package Datos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MantenimientoProductosSQL {
    
    //Variables para la conexion con SQL
    private Statement sentenciaSQL;
    private Conexion_SQL bd;
    private ResultSet rs;
    
    ResultSetMetaData rsm;
    DefaultTableModel modelo;
    
    public void Guardar(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        bd = new Conexion_SQL();
        
        try{
            
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sentenciaSQL.executeUpdate("INSERT INTO tblProductosRefa(Id_Producto,Descripcion,Precio,Existencia) VALUES ('"
            +prod.getIdProd()+"','"+prod.getDescripcion()+"',"+prod.getPrecio()+","+prod.getExistencia()+")");
            
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            sentenciaSQL.close();
            bd.CerrarConexion();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
    }
    
    public JTable MostrarTabla(JTable tblDatos) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        String sql;
        try{
            bd = new Conexion_SQL();
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sql = "SELECT * FROM ProductosTSQL";
            rs = sentenciaSQL.executeQuery(sql);
            rsm = rs.getMetaData();
            int col = rsm.getColumnCount();//Obtiene el numero de campos de la tabla de la BD
            modelo = new DefaultTableModel();
            
            for (int i = 1; i <= col; i++) {
                modelo.addColumn(rsm.getColumnLabel(i));//Llena el encabezado de la tabla con los nombres de los campos de la base de datos
            }
            
            while(rs.next()){//Mientras existan registros
                String fila[] = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j+1);
                }
                modelo.addRow(fila);
            }
            
            tblDatos.setModel(modelo);
            rs.close();
            bd.CerrarConexion();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
        return tblDatos;
    }
    
}
