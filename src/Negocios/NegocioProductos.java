
package Negocios;

import Datos.MantenimientoProductosSQL;
import Datos.ProductosSQL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class NegocioProductos {
    
    //Objeto para llegar al mantenimiento de los productos
    MantenimientoProductosSQL mant = new MantenimientoProductosSQL();
    
    //Puente para llegar a Guardar de MantProductos
    public void PuenteGuardar(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
            try{
                mant = new MantenimientoProductosSQL();
                mant.Guardar(prod);
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error "+e);
            }
    }
    
    //Puente para llegar al metodo de mostrar tabla
    public JTable PuenteMostrarTabla(JTable tablaDatos) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalAccessException{
        mant = new MantenimientoProductosSQL();
        JTable tbl;
        tbl = mant.MostrarTabla(tablaDatos);
            
        return tbl; 
    }
    
    public JTable PuenteMostrarTablaBuscar(JTable tablaDatos,ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
            
            mant = new MantenimientoProductosSQL();
            JTable tbl;
            tbl = mant.MostrarTablaBuscar(tablaDatos,prod);
            
            return tbl; 
            
        }
    
    //Puente para el metodo mostrarCategorias de combobox
    public JComboBox PuenteCategoriasCombo(JComboBox comCatego) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        mant = new MantenimientoProductosSQL();
        JComboBox comb;
        comb = mant.MostrarCategorias(comCatego);
        
        return comb;
    }
    
    public JComboBox PuenteProveedoresCombo(JComboBox comProvee) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        mant = new MantenimientoProductosSQL();
        JComboBox comb;
        comb = mant.MostrarProveedores(comProvee);
        
        return comb;
    }
    
    public void PuenteCategorias(ProductosSQL prod){
        
        mant = new MantenimientoProductosSQL();
        
        try {
            mant.CambioNumeroCategorias(prod);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(NegocioProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void PuenteProveedor(ProductosSQL prod){
        
        mant = new MantenimientoProductosSQL();
        
        try {
            mant.CambioNumeroProveedor(prod);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(NegocioProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void PuenteExiste(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        mant = new MantenimientoProductosSQL();
        mant.SiExiste(prod);
    }
    
    public void PuenteNombreCategorias(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        mant = new MantenimientoProductosSQL();
        mant.CambioNombreCategorias(prod);
    }
    
    public void PuenteNombreProveedores(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        mant = new MantenimientoProductosSQL();
        mant.CambioNombreProveedores(prod);
    }
    
    public void PuenteEditarProducto(ProductosSQL prod) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        mant = new MantenimientoProductosSQL();
        mant.Editar(prod);
    }
}
