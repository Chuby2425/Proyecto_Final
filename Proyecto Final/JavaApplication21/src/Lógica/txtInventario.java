
package Lógica;


import Clases.DatosInventario;
import ProyectoFinal.Productos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;


public class txtInventario {
    
    public static void main(String[] args) throws IOException{
    
    File archivo = new File ("Inventarios.txt");
    BufferedWriter bw;
    if (!archivo.exists()){
        bw = new  BufferedWriter(new FileWriter(archivo));
    }
    Productos p = new Productos();
    p.setLocationRelativeTo(null);
    p.setVisible(true);



    }
}
    

  