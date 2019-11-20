
package Datos;

/**
 *
 * @author Alexis Maldonado88
 */

public class ProveedoresSQL {
    private String CodProv;
    private String Proveedor;
    private String Direccion;
    private String Ciudad;
    private long Telefono;
    private String RFC;
    private int CP;
    private String Correo;
    private String Bus;
    private boolean StatusExist;
    
    public ProveedoresSQL(){
        this.StatusExist = false;
    }

    public ProveedoresSQL(String CodProv, String Proveedor, String Direccion, String Ciudad, long Telefono, String RFC, int CP, String Correo,String Bus, boolean StatusExist) {
        this.CodProv = CodProv;
        this.Proveedor = Proveedor;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Telefono = Telefono;
        this.RFC = RFC;
        this.CP = CP;
        this.Correo = Correo;
        this.Bus = Bus;
        this.StatusExist = StatusExist;
        this.StatusExist = false;
    }

    public String getCodProv() {
        return CodProv;
    }

    public void setCodProv(String CodProv) {
        this.CodProv = CodProv;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getBus() {
        return Bus;
    }

    public void setBus(String Bus) {
        this.Bus = Bus;
    }

    public boolean isStatusExist() {
        return StatusExist;
    }

    public void setStatusExist(boolean StatusExist) {
        this.StatusExist = StatusExist;
    }
    
    
}
