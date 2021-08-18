
package Clases;

public class DatosInventario {
    
    private String codigo, nombre, cantidad, precioInterno, precioVenta;

    public DatosInventario() {
    }

    public DatosInventario(String codigo, String nombre, String cantidad, String precioInterno, String precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioInterno = precioInterno;
        this.precioVenta = precioVenta;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecioInterno() {
        return precioInterno;
    }

    public void setPrecioInterno(String precioInterno) {
        this.precioInterno = precioInterno;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
    
}
