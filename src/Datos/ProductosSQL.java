
package Datos;

public class ProductosSQL {
    
    private String IdProd;
    private String CodigoBar;
    private String Categoria;
    private String Descripcion;
    private float Precio;
    private int Existencia;
    private String Bus;

    public ProductosSQL(String IdProd, String CodigoBar, String Categoria, String Descripcion, float Precio, int Existencia, String Bus) {
        this.IdProd = IdProd;
        this.CodigoBar = CodigoBar;
        this.Categoria = Categoria;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Existencia = Existencia;
        this.Bus = Bus;
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
    
    
}
