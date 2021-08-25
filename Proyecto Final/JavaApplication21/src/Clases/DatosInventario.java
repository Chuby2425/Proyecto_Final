
package Clases;

import java.io.BufferedReader;
import java.io.PrintWriter;
<<<<<<< Updated upstream

public class DatosInventario {
    
    private String codigo, nombre, cantidad, precioInterno, precioVenta;

    
    
    
    
    
    public DatosInventario(String codigo, String nombre, String cantidad, String precioInterno, String precioVenta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioInterno = precioInterno;
        this.precioVenta = precioVenta;
    }

    public DatosInventario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   

 
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
=======


public class DatosInventario {
    
    private Producto producto;
    private int cantidad;

>>>>>>> Stashed changes

    
    public DatosInventario(Producto pproducto, int pcantidad) {
        this.producto = pproducto;
        this.cantidad = pcantidad;
    }

    public DatosInventario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Producto getProducto(){
        return this.producto;    
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int pcantidad) {
        this.cantidad = pcantidad;
    }

<<<<<<< Updated upstream
    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void guardar(PrintWriter Escribe) {
        Escribe.println(codigo);
        Escribe.println(nombre);
        Escribe.println(cantidad);
        Escribe.println(precioInterno);
        Escribe.println(precioVenta);
    }
// este metodo es para poder mostrar la informacion de la tablq
    public DatosInventario cargar(BufferedReader Almacen) {
        
        
        String codi;
        String nomP;
        String canti;
        String pInter;
        String pVenta;
        try {
            codi = Almacen.readLine();
            nomP = Almacen.readLine();
            canti = Almacen.readLine();
            pInter = Almacen.readLine();
            pVenta = Almacen.readLine();
            return new DatosInventario(codi,nomP,canti,pInter,pVenta);    
        } catch (Exception e) {
        }
        return null;
    }
    
    
    
    
}
=======
}
>>>>>>> Stashed changes
