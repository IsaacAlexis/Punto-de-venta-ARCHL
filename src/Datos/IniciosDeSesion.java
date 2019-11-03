
package Datos;

public class IniciosDeSesion {
    
    private String Usuario;
    private String Contraseña;
    private boolean Status;

    public IniciosDeSesion(String Usuario, String Contraseña,boolean Status) {
        this.Status = false;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Status = Status;
    }
    
    public IniciosDeSesion(){
        this.Status = false;
        
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
    
    
    
    
}
