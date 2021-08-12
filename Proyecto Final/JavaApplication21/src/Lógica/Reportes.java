package Lógica;

import Clases.DatosReporte;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import javax.swing.JOptionPane;

public class Reportes {

    String nombreEmpresa;
    String Fecha;
    String rutaImagen;

    ArrayList<DatosReporte> productos;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo,
            ubicacion,
            codigoPostal;
                 
    public Reportes(String nombreEmpresa, String Fecha, ArrayList<DatosReporte> productos, String rutaImagen) {
        this.nombreEmpresa = nombreEmpresa;
        this.rutaImagen = rutaImagen;
        this.Fecha = Fecha;
        this.productos = productos;
        
        documento = new Document();
        titulo = new Paragraph("REPORTE DE VENTAS ");
        ubicacion = new Paragraph("Ubicacion: San José,Puriscal,Santiago");
        codigoPostal = new Paragraph("Codigo Postal: 10401");
       
    }

    public Reportes() {

    }

    public void crearReportes() {

        try {

            archivo = new FileOutputStream(nombreEmpresa + ".pdf");
            PdfWriter.getInstance(documento, archivo);

            documento.open();

            //alineaciones 
            titulo.setAlignment(Element.ALIGN_LEFT);
            documento.add(Chunk.NEWLINE);   
            ubicacion.setAlignment(Element.ALIGN_LEFT);
            documento.add(Chunk.NEWLINE);
            codigoPostal.setAlignment(Element.ALIGN_LEFT);
           
            // para agregar imagenes y darle posicion 
            Image imagen = null;

            try {
                imagen = Image.getInstance(rutaImagen);
                imagen.scaleAbsolute(150, 120);
                imagen.setAbsolutePosition(415, 715);
            } catch (Exception e) {
            }
            //con esto lo mostramos en el PDF

            documento.add(imagen);
            documento.add(titulo);
            documento.add(ubicacion);
            documento.add(codigoPostal);
            documento.close();
            JOptionPane.showMessageDialog(null, "El reporte se a generado -_-");

        } catch (Exception e) {
        }

    }
}
