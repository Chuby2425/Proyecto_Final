
package Lógica;

import Clases.DatosReporte;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;


public class Reportes {
    
    
    String nombreEmpresa;
    String Fecha;
    ArrayList <DatosReporte> productos;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public Reportes(String nombreEmpresa, String Fecha, ArrayList<DatosReporte> productos) {
        this.nombreEmpresa = nombreEmpresa;
        this.Fecha = Fecha;
        this.productos = productos;
        
       documento = new Document();
       titulo = new Paragraph("Reporte de Ventas");
       
       
    }
    
    public void crearReportes(){
        
        try {
            
         archivo = new FileOutputStream(nombreEmpresa+".pdf");
         PdfWriter.getInstance(documento, archivo);
         documento.open();
         
         titulo.setAlignment(1);
         documento.add(titulo);
         documento.close();
            
            
            
        } catch (Exception e) {
        }
        
        
    }
    
}

