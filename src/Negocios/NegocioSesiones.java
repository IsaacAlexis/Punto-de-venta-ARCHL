
package Negocios;

import Datos.IniciosDeSesion;
import Datos.MantenimientoSesiones;

public class NegocioSesiones {
    IniciosDeSesion ses = new IniciosDeSesion();
    
    MantenimientoSesiones manto = new MantenimientoSesiones();
    
    public void PuenteInicioSesion(IniciosDeSesion ini) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        manto = new MantenimientoSesiones();
        manto.IniciarSesion(ini);
    }
    
    public void PuenteConectarDB() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        manto = new MantenimientoSesiones();
        manto.ConectarDB();
    }
    
}
