
package Datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

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
    
    public void GuardarProvee(ProveedoresSQL prov) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        bd = new Conexion_SQL();
        
        try {
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "insert into ProveedoresTSQL(CodProv,Proveedor,Direccion,Ciudad,Telefono,RFC,CP,Correo) values ('"
                    + prov.getCodProv()+"','"+prov.getProveedor()+"','"+prov.getDireccion()+"','"+prov.getCiudad()+"',"
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
            
            String sql = "update ProveedoresTSQL set CodProv=?, Proveedor=?, Direccion=?, Ciudad=?, Telefono=?, RFC=?, CP=?, Correo=? where CodProv=?";
            PreparedStatement ps = bd.Conectarse().prepareStatement(sql);
            ps.setString(1, prov.getCodProv());
            ps.setString(2, prov.getProveedor());
            ps.setString(3, prov.getDireccion());
            ps.setString(4, prov.getCiudad());
            ps.setLong(5, prov.getTelefono());
            ps.setString(6, prov.getRFC());
            ps.setInt(7, prov.getCP());
            ps.setString(8, prov.getCorreo());
            ps.setString(9, prov.getCodProv());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente!");
                bd.CerrarConexion();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoProveedoresSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public JTable MostrarTabla(JTable tblProv) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        String sql;
        try{
            bd = new Conexion_SQL();
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sql = "SELECT * FROM ProveedoresTSQL";
            rs = sentenciaSQL.executeQuery(sql);
            rsm = rs.getMetaData();
            int col = rsm.getColumnCount();//Obtiene el numero de campos de la tabla de la BD
            modelo = new DefaultTableModel();
            
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Ciudad");
            modelo.addColumn("Telefono");
            modelo.addColumn("RFC");
            modelo.addColumn("C.P.");
            modelo.addColumn("Correo");
            
            while(rs.next()){//Mientras existan registros
                String fila[] = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j+1);
                }
                modelo.addRow(fila);
            }
            
            tblProv.setModel(modelo);
            
            //Cambiar el taamaño de las columnas de la tabla
            TableColumn colCodigo = tblProv.getColumn("Codigo");
            colCodigo.setPreferredWidth(50);
            colCodigo.setResizable(false);
            TableColumn colNombre = tblProv.getColumn("Nombre");
            colNombre.setPreferredWidth(200);
            colNombre.setResizable(false);
            TableColumn colDir = tblProv.getColumn("Direccion");
            colDir.setPreferredWidth(150);
            colDir.setResizable(false);
            TableColumn colRFC = tblProv.getColumn("RFC");
            colRFC.setPreferredWidth(100);
            colRFC.setResizable(false);
            TableColumn colTel = tblProv.getColumn("Telefono");
            colTel.setPreferredWidth(75);
            TableColumn colCiud = tblProv.getColumn("Ciudad");
            colCiud.setPreferredWidth(100);
            TableColumn colCP = tblProv.getColumn("C.P.");
            colCP.setPreferredWidth(50);
            TableColumn colCorreo = tblProv.getColumn("Correo");
            colCorreo.setMaxWidth(150);
            colCorreo.setMinWidth(150);
            
            
            rs.close();
            bd.CerrarConexion();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
        return tblProv;
    }
    
    public JTable MostrarTablaBuscar(JTable tblProv, ProveedoresSQL prov) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        try {
            String sql;
            
            bd = new Conexion_SQL();
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sql = "select * from ProveedoresTSQL where Proveedor like '%"+prov.getBus()+"%'";
            rs = sentenciaSQL.executeQuery(sql);
            rsm = rs.getMetaData();
            
            int col = rsm.getColumnCount();
            modelo = new DefaultTableModel();
            
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Direccion");
            modelo.addColumn("Ciudad");
            modelo.addColumn("Telefono");
            modelo.addColumn("RFC");
            modelo.addColumn("C.P.");
            modelo.addColumn("Correo");
            
            while(rs.next()){//Mientras existan registros
                String fila[] = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j+1);
                }
                modelo.addRow(fila);
            }
            
            tblProv.setModel(modelo);
            
            //Cambiar el taamaño de las columnas de la tabla
            TableColumn colCodigo = tblProv.getColumn("Codigo");
            colCodigo.setPreferredWidth(50);
            colCodigo.setResizable(false);
            TableColumn colNombre = tblProv.getColumn("Nombre");
            colNombre.setPreferredWidth(200);
            colNombre.setResizable(false);
            TableColumn colDir = tblProv.getColumn("Direccion");
            colDir.setPreferredWidth(150);
            colDir.setResizable(false);
            TableColumn colRFC = tblProv.getColumn("RFC");
            colRFC.setPreferredWidth(100);
            colRFC.setResizable(false);
            TableColumn colTel = tblProv.getColumn("Telefono");
            colTel.setPreferredWidth(75);
            TableColumn colCiud = tblProv.getColumn("Ciudad");
            colCiud.setPreferredWidth(100);
            TableColumn colCP = tblProv.getColumn("C.P.");
            colCP.setPreferredWidth(50);
            TableColumn colCorreo = tblProv.getColumn("Correo");
            colCorreo.setMaxWidth(150);
            colCorreo.setMinWidth(150);
            
            
            rs.close();
            bd.CerrarConexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoProveedoresSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tblProv;
    }
    
    
    public void SiExisteProv(ProveedoresSQL prov) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        try{
            bd = new Conexion_SQL();
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql ="Select CodProv from ProveedoresTSQL where CodProv='"+prov.getCodProv()+"'";  
            rs = sentenciaSQL.executeQuery(sql);

            if(rs.next()){
                prov.setStatusExist(true);
            }
            else{
                prov.setStatusExist(false);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
        finally{
                rs.close();
                bd.CerrarConexion();
        }
        
    }
    
}
