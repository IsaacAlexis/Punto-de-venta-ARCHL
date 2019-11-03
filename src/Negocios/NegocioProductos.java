
package Negocios;

import Datos.MantenimientoProductosSQL;
import javax.swing.JTable;

public class NegocioProductos {
    
    //Puente para llegar al mantenimiento de los productos
    MantenimientoProductosSQL mant = new MantenimientoProductosSQL();
    
    public void PuenteGuardar(){
        
    }
    
    public JTable PuenteMostrarTabla(JTable tablaDatos) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalAccessException{
        mant = new MantenimientoProductosSQL();
        JTable tbl;
        tbl = mant.MostrarTabla(tablaDatos);
            
        return tbl; 
    }
    
}
