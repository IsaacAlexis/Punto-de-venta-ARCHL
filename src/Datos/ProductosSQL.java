
package Datos;

public class ProductosSQL {
    
    private String IdProd;
    private String CodigoBar;
    private String Categoria;
    private String NumCatego;
    private String Descripcion;
    private float Precio;
    private int Existencia;
    private String Bus;
    private String ProveedorProd;
    private String NumProveedorProd;
    private boolean statusExist;
    
    public ProductosSQL(){
        this.statusExist = false;
    }

    public ProductosSQL(boolean statusExist, String IdProd, String CodigoBar, String Categoria, String NumCatego, String Descripcion, float Precio, int Existencia, String Bus, String ProveedorProd, String NumProveedorProd) {
        this.statusExist = false;
        this.IdProd = IdProd;
        this.CodigoBar = CodigoBar;
        this.Categoria = Categoria;
        this.NumCatego = NumCatego;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Existencia = Existencia;
        this.Bus = Bus;
        this.ProveedorProd = ProveedorProd;
        this.NumProveedorProd = NumProveedorProd;
        this.statusExist = statusExist;
    }

    public String getIdProd() {
        return IdProd;
    }

    public void setIdProd(String IdProd) {
        this.IdProd = IdProd;
    }

    public String getCodigoBar() {
        return CodigoBar;
    }

    public void setCodigoBar(String CodigoBar) {
        this.CodigoBar = CodigoBar;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNumCatego() {
        return NumCatego;
    }

    public void setNumCatego(String NumCatego) {
        this.NumCatego = NumCatego;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public String getBus() {
        return Bus;
    }

    public void setBus(String Bus) {
        this.Bus = Bus;
    }

    public String getProveedorProd() {
        return ProveedorProd;
    }

    public void setProveedorProd(String ProveedorProd) {
        this.ProveedorProd = ProveedorProd;
    }

    public String getNumProveedorProd() {
        return NumProveedorProd;
    }

    public void setNumProveedorProd(String NumProveedorProd) {
        this.NumProveedorProd = NumProveedorProd;
    }

    public boolean isStatusExist() {
        return statusExist;
    }

    public void setStatusExist(boolean statusExist) {
        this.statusExist = statusExist;
    }
    
    
}
