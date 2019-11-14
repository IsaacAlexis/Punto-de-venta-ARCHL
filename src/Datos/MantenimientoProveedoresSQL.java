
package Datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexis Maldonado88
 */
public class MantenimientoProveedoresSQL {
    
    //Variables para la conexion con SQL
    private Statement sentenciaSQL;
    private Conexion_SQL bd;
    private ResultSet rs;
    
    ResultSetMetaData rsm;
    DefaultTableModel modelo;
    DefaultComboBoxModel<Object> mod;
    
    public void GuardarProvee(ProveedoresSQL prov) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        try {
            bd = new Conexion_SQL();
            
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "insert into ProveedoresTSQL(CodProv,Proveedor,Direccion,Ciudad,Telefono,RFC,CP,Correo) values ('"
                    + prov.getCodProvee()+"','"+prov.getNomProvee()+"','"+prov.getDireccion()+"','"+prov.getCiudad()+"',"
                    + prov.getTelefono()+",'"+prov.getRFC()+"',"+prov.getCP()+",'"+prov.getCorreo()+"')";
            sentenciaSQL.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            sentenciaSQL.close();
            bd.CerrarConexion();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
    }
    
    //Editar Productos de la tabla ProveedoresTSQL
    public void Editar(ProveedoresSQL prov) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        try {
            bd = new Conexion_SQL();
            
            String sql = "update ProveedoresSQL set CodProd=?, Proveedor=?, Direccion=?, Ciudad=?, Telefono=?, RFC=?, CP=?, Correo=? where CodProd=?";
            PreparedStatement ps = bd.Conectarse().prepareStatement(sql);
            ps.setString(1, prov.getCodProvee());
            ps.setString(2, prov.getNomProvee());
            ps.setString(3, prov.getDireccion());
            ps.setString(4, prov.getCiudad());
            ps.setLong(5, prov.getTelefono());
            ps.setString(6, prov.getRFC());
            ps.setInt(7, prov.getCP());
            ps.setString(8, prov.getCorreo());
            ps.setString(9, prov.getCodProvee());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente!");
                bd.CerrarConexion();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoProveedoresSQL.class.getName()).log(Level.SEVERE, null, ex);
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
            
            modelo.addColumn("Codigo del Producto");
            modelo.addColumn("Codigo de Barras");
            modelo.addColumn("Categoria");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Precio");
            modelo.addColumn("Existencia");
            modelo.addColumn("Proveedor");
            
//            for (int i = 1; i <= col; i++) {
//                modelo.addColumn(rsm.getColumnLabel(i));//Llena el encabezado de la tabla con los nombres de los campos de la base de datos
//            }


            
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
