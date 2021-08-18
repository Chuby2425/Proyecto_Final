
package Lógica;

import java.util.Vector;
import Clases.DatosInventario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class txtInventario {
    
    Vector vprincipal = new Vector();
    
    //Procedimiento para guardar en un vector 
    public void guardar (DatosInventario unDatosInventario){
        vprincipal.addElement(unDatosInventario);
        
    }
    //asi se guarda en un archivo txt
    public void guardarArchivo(DatosInventario datos){
        
        try {
            FileWriter fw = new FileWriter("Inventarios.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(datos.getCodigo());
            pw.print("|"+datos.getNombre());
            pw.print("|"+datos.getCantidad());
            pw.print("|"+datos.getPrecioInterno());
            pw.println("|"+datos.getPrecioVenta());
            pw.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // esto es para mostrar los datos en un jtable
    
    
    public DefaultTableModel listaProductos(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Codigo");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Cantidad");
        cabeceras.addElement("Precio Interno");
        cabeceras.addElement("Precio de Venta");
        
        
        // Creamos el vector que contenga los datos
        // Creamos el modelo de tabla para agregarel vector, en la ubicacion 0
        
        DefaultTableModel mdlTablaInv = new DefaultTableModel(cabeceras,0);
        
        try {
            
            FileReader fr = new FileReader("Inventarios.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine()) !=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x= new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());      
                }
                mdlTablaInv.addRow(x);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            
        }
        
      return mdlTablaInv;  
        
    }
        
        
    
    
    
}
