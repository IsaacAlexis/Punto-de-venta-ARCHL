
package Datos;

/**
 *
 * @author Alexis Maldonado88
 */
public class ProveedoresSQL {
    
    private String CodProvee;
    private String NomProvee;
    private String Direccion;
    private String Ciudad;
    private long Telefono;
    private String RFC;
    private int CP;
    private String Correo;

    public ProveedoresSQL(String CodProvee, String NomProvee, String Direccion, String Ciudad, long Telefono, String RFC, int CP, String Correo) {
        this.CodProvee = CodProvee;
        this.NomProvee = NomProvee;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Telefono = Telefono;
        this.RFC = RFC;
        this.CP = CP;
        this.Correo = Correo;
    }

    public String getCodProvee() {
        return CodProvee;
    }

    public void setCodProvee(String CodProvee) {
        this.CodProvee = CodProvee;
    }

    public String getNomProvee() {
        return NomProvee;
    }

    public void setNomProvee(String NomProvee) {
        this.NomProvee = NomProvee;
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
    
    
    
}
