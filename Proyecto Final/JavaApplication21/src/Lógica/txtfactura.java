
package Lógica;

import java.util.Vector;
import Clases.DatosFactura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class txtfactura {
    
    Vector vprincipal = new Vector();
    
    //Procedimiento para guardar en un vector 
    public void guardar (DatosFactura unDatosFactura){
        vprincipal.addElement(unDatosFactura);
        
    }
    //asi se guarda en un archivo txt
    public void guardarArchivo(DatosFactura datos){
        
        try {
            FileWriter fw = new FileWriter("Productos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(datos.getCodigo());
            pw.print("|"+datos.getProductos());
            pw.print("|"+datos.getCantidad());
            pw.print("|"+datos.getPrecio());
            pw.println("|"+datos.getPrecioTotal());
            pw.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // esto es para mostrar los datos en un jtable
    
    
    public DefaultTableModel listaProductos(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Codigo");
        cabeceras.addElement("Productos");
        cabeceras.addElement("Cantidad");
        cabeceras.addElement("Precio");
        cabeceras.addElement("P.Total");
        
        
        // Creamos el vector que contenga los datos
        // Creamos el modelo de tabla para agregarel vector, en la ubicacion 0
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
        try {
            
            FileReader fr = new FileReader("Productos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine()) !=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x= new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());      
                }
                mdlTabla.addRow(x);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            
        }
        
      return mdlTabla;  
        
    }
        
        
    
    
    
}
