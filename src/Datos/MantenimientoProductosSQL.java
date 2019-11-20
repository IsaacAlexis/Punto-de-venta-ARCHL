
package Datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class MantenimientoProductosSQL {
    
    //Variables para la conexion con SQL
    private Statement sentenciaSQL;
    private Conexion_SQL bd;
    private ResultSet rs;
    
    ResultSetMetaData rsm;
    DefaultTableModel modelo;
    DefaultComboBoxModel<Object> mod;
    
    //Guarda un registro en la tabla ProductosTSQL
    public void Guardar(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        bd = new Conexion_SQL();
        
        try{
            
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sentenciaSQL.executeUpdate("INSERT INTO ProductosTSQL(CodigoProd,CodigoDeBarras,NumCategoP,Descripcion,Precio,Existencia,NumProveeP) VALUES ('"
            +prod.getIdProd()+"','"+prod.getCodigoBar()+"','"+prod.getNumCatego()+"','"+prod.getDescripcion()+"',"+prod.getPrecio()+","+prod.getExistencia()
            +",'"+prod.getNumProveedorProd()+"')");
            
            JOptionPane.showMessageDialog(null, "Registro Guardado");
            sentenciaSQL.close();
            bd.CerrarConexion();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
    }
    
    public void Editar(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        try{
            bd = new Conexion_SQL();
        
            String sql = "update ProductosTSQL set CodigoProd=?,CodigoDeBarras=?,NumCategoP=?,Descripcion=?,Precio=?,Existencia=?,NumProveeP=? where CodigoProd=?";
            PreparedStatement ps = bd.Conectarse().prepareStatement(sql);
            ps.setString(1, prod.getIdProd());
            ps.setString(2, prod.getCodigoBar());
            ps.setString(3, prod.getNumCatego());
            ps.setString(4, prod.getDescripcion());
            ps.setFloat(5, prod.getPrecio());
            ps.setInt(6, prod.getExistencia());
            ps.setString(7, prod.getNumProveedorProd());
            ps.setString(8, prod.getIdProd());
            
            int n = ps.executeUpdate();
            
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente!");
                bd.CerrarConexion();
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error "+e);
        }
        
    }
    
    //Muestra todos los registros de la tabla ProductosTSQL
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
            
            while(rs.next()){//Mientras existan registros
                String fila[] = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j+1);
                }
                modelo.addRow(fila);
            }
            
            tblDatos.setModel(modelo);
            
            TableColumn colCod = tblDatos.getColumn("Codigo del Producto");
            colCod.setPreferredWidth(100);
            colCod.setResizable(false);
            TableColumn colCodB = tblDatos.getColumn("Codigo de Barras");
            colCodB.setPreferredWidth(100);
            colCodB.setResizable(false);
            TableColumn colCat = tblDatos.getColumn("Categoria");
            colCat.setPreferredWidth(75);
            colCat.setResizable(false);
            TableColumn colDes = tblDatos.getColumn("Descripcion");
            colDes.setPreferredWidth(250);
            colDes.setResizable(false);
            TableColumn colPre = tblDatos.getColumn("Precio");
            colPre.setPreferredWidth(75);
            colPre.setResizable(false);
            TableColumn colEx = tblDatos.getColumn("Existencia");
            colEx.setPreferredWidth(85);
            colEx.setResizable(false);
            TableColumn colPro = tblDatos.getColumn("Proveedor");
            colPro.setPreferredWidth(75);
            colPro.setResizable(false);
            
            rs.close();
            bd.CerrarConexion();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
        return tblDatos;
    }
    
    public JTable MostrarTablaBuscar(JTable tblDatos,ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        try {
            String sql;
            
            bd = new Conexion_SQL();
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sql = "select * from ProductosTSQL where Descripcion like '%"+prod.getBus()+"%'";
            rs = sentenciaSQL.executeQuery(sql);
            rsm = rs.getMetaData();
            
            int col = rsm.getColumnCount();
            modelo = new DefaultTableModel();
            
            modelo.addColumn("Codigo del Producto");
            modelo.addColumn("Codigo de Barras");
            modelo.addColumn("Categoria");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Precio");
            modelo.addColumn("Existencia");
            modelo.addColumn("Proveedor");
            
            while(rs.next()){
                String fila[] = new String[col];
                for (int j = 0; j < col; j++) {
                    fila[j] = rs.getString(j+1);
                }
                modelo.addRow(fila);
            }
            
            tblDatos.setModel(modelo);
            
            TableColumn colCod = tblDatos.getColumn("Codigo del Producto");
            colCod.setPreferredWidth(100);
            colCod.setResizable(false);
            TableColumn colCodB = tblDatos.getColumn("Codigo de Barras");
            colCodB.setPreferredWidth(100);
            colCodB.setResizable(false);
            TableColumn colCat = tblDatos.getColumn("Categoria");
            colCat.setPreferredWidth(75);
            colCat.setResizable(false);
            TableColumn colDes = tblDatos.getColumn("Descripcion");
            colDes.setPreferredWidth(250);
            colDes.setResizable(false);
            TableColumn colPre = tblDatos.getColumn("Precio");
            colPre.setPreferredWidth(75);
            colPre.setResizable(false);
            TableColumn colEx = tblDatos.getColumn("Existencia");
            colEx.setPreferredWidth(85);
            colEx.setResizable(false);
            TableColumn colPro = tblDatos.getColumn("Proveedor");
            colPro.setPreferredWidth(75);
            colPro.setResizable(false);
            
            rs.close();
            bd.CerrarConexion();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
        return tblDatos;
    }
    
    //Muestra las categorias en el combobox
    public JComboBox MostrarCategorias(JComboBox comCatego) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        String sql;
        
        try {
            
            bd = new Conexion_SQL();
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sql = "select NombreCat from Categorias";
            rs = sentenciaSQL.executeQuery(sql);
            
            mod = new DefaultComboBoxModel<Object>();
            
            while(rs.next()){
                String campo = rs.getString(1);
                mod.addElement(campo);
            }
            comCatego.setModel(mod);
            rs.close();
            bd.CerrarConexion();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
        
        return comCatego;
    }
    
    //Muestra los proveedores en el combobox
    public JComboBox MostrarProveedores(JComboBox comProvee) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        String sql;
        
        try {
            
            bd = new Conexion_SQL();
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            sql = "select Proveedor from ProveedoresTSQL";
            rs = sentenciaSQL.executeQuery(sql);
            
            mod = new DefaultComboBoxModel<Object>();
            
            while(rs.next()){
                String campo = rs.getString(1);
                mod.addElement(campo);
            }
            comProvee.setModel(mod);
            rs.close();
            bd.CerrarConexion();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
        
        return comProvee;
    }
    
    //Cambia el nombre de la categoria del combobox por el numero de esa misma categoria
    public void CambioNumeroCategorias(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        bd = new Conexion_SQL();
        String sql;
        
        sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        sql = "select NumCatego from Categorias where NombreCat='"+prod.getCategoria()+"'";
        rs = sentenciaSQL.executeQuery(sql);
        
        while(rs.next()){
            prod.setNumCatego(rs.getString(1));
        }
        rs.close();
        bd.CerrarConexion();
    }
    
    //Cambia el nombre del proveedor por el numero del combobox
    public void CambioNumeroProveedor(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        bd = new Conexion_SQL();
        String sql;
        
        sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        sql = "select CodProv from ProveedoresTSQL where Proveedor='"+prod.getProveedorProd()+"'";
        rs = sentenciaSQL.executeQuery(sql);
        
        while(rs.next()){
            prod.setNumProveedorProd(rs.getString(1));
        }
        rs.close();
        bd.CerrarConexion();
    }
    
    //Cambia el numero por el nombre de una categoria
    public void CambioNombreCategorias(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        bd = new Conexion_SQL();
        String sql;
        
        sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        sql = "select NombreCat from Categorias where NumCatego='"+prod.getNumCatego()+"'";
        rs = sentenciaSQL.executeQuery(sql);
        
        while(rs.next()){
            prod.setCategoria(rs.getString(1));
        }
        rs.close();
        bd.CerrarConexion();
    }
    
    //Cambia el numero del proveedor por el nombre de dicho proveedor
    public void CambioNombreProveedores(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        bd = new Conexion_SQL();
        String sql;
        
        sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        sql = "select Proveedor from ProveedoresTSQL where CodProv='"+prod.getNumProveedorProd()+"'";
        rs = sentenciaSQL.executeQuery(sql);
        
        while(rs.next()){
            prod.setProveedorProd(rs.getString(1));
        }
        rs.close();
        bd.CerrarConexion();
    }
    
    //Verifica si el producto existe antes de guardarlo
    public void SiExiste(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        try {
            bd = new Conexion_SQL();
            sentenciaSQL = bd.Conectarse().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "select CodigoProd from ProductosTSQL where CodigoProd ='"+prod.getIdProd()+"'";
            rs = sentenciaSQL.executeQuery(sql);
            
            if(rs.next()){
                prod.setStatusExist(true);
            }
            else{
                prod.setStatusExist(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex);
        }
        finally{
                rs.close();
                bd.CerrarConexion();
        }
        
    }
}
