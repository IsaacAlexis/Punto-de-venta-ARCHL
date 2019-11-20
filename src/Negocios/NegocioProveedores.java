
package Negocios;

import Datos.MantenimientoProveedoresSQL;
import Datos.ProveedoresSQL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Alexis Maldonado88
 */
public class NegocioProveedores {
    
    MantenimientoProveedoresSQL manto = new MantenimientoProveedoresSQL();
    
    public void PuenteGuardarProv(ProveedoresSQL prov) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
            manto = new MantenimientoProveedoresSQL();
            manto.GuardarProvee(prov);
    }
    
    public JTable PuenteMostrarTabla(JTable tblProv) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        manto = new MantenimientoProveedoresSQL();
        JTable tbl;
        tbl = manto.MostrarTabla(tblProv);
        
        return tbl;
    }
    
    public void PuenteExiste(ProveedoresSQL prov) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        manto  = new MantenimientoProveedoresSQL();
        manto.SiExisteProv(prov);
    }
    
    public void PuenteEditarProveedor(ProveedoresSQL prov) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        manto = new MantenimientoProveedoresSQL();
        manto.Editar(prov);
    }
    
    public void PuenteMostrarTablaBuscar(JTable tblProv, ProveedoresSQL prov) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        manto = new MantenimientoProveedoresSQL();
        manto.MostrarTablaBuscar(tblProv, prov);
    }
    
}
