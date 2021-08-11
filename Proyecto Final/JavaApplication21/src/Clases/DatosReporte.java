package Clases;

public class DatosReporte {

    private String fecha, cantidad, preciouni, subtotal;

    public DatosReporte(String cantidad, String productos, String preciouni, String subtotal, String fecha,String rutaImagen) {
        
       
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.preciouni = preciouni;
        this.subtotal = subtotal;

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPreciouni() {
        return preciouni;
    }

    public void setPreciouni(String preciouni) {
        this.preciouni = preciouni;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

}
