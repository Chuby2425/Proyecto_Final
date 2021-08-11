
package ProyectoFinal;

import Clases.DatosFactura;
import Lógica.txtfactura;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import Clases.DatosReporte;
import Lógica.Reportes;
import java.util.Date;


public class Ventas extends javax.swing.JFrame {
    
    
// esto es para el txt de ventas 
    DatosFactura dato = new DatosFactura();
    txtfactura fac = new txtfactura();
    DefaultTableModel mdlTabla;
    Vector vcabeceras = new Vector();
    
    // apartado de reportes 
    ArrayList<DatosReporte> FacturaR;
    
    
    
    
    public Ventas() {
        initComponents();
        
        // apartado txt
        vcabeceras.addElement("Codigo");
        vcabeceras.addElement("Cantidad");
        vcabeceras.addElement("Productos");
        vcabeceras.addElement("Precio");
        vcabeceras.addElement("P.Total");
        mdlTabla = new DefaultTableModel(vcabeceras,0);
        tblFac.setModel(mdlTabla);
        tblFac.setModel(fac.listaProductos());
        
        
        // esto es para los reportes 
        FacturaR = new ArrayList<DatosReporte>();
        
        
        
        
        
    }
    
    
    //fran se cargo en medio proyecto 30/6/2021 
    // fran se echo el github  2/8/2021  
    // Fran se echo la pc ahora -_- y a empesar con toda la configuracion 4/8/2021
    
    
    
    
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblPrecioTotal = new javax.swing.JLabel();
        txtfCantidad = new javax.swing.JTextField();
        txtfPrecio = new javax.swing.JTextField();
        txtfPrecioTotal = new javax.swing.JTextField();
        lblSubTotal = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cbxProductos = new javax.swing.JComboBox<>();
        lblFactura = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFac = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        lblSTotal = new javax.swing.JLabel();
        lblDes = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblIVAm = new javax.swing.JLabel();
        lblTot = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        rbtnSinpe = new javax.swing.JRadioButton();
        rbtnTarjertas = new javax.swing.JRadioButton();
        rbtnEfectivo = new javax.swing.JRadioButton();
        btnBotonBorrar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCantidad.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 255, 255));
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCantidad.setText("CANTIDAD");
        lblCantidad.setToolTipText("");
        lblCantidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlPrincipal.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, -1));

        lblProductos.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(0, 255, 255));
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductos.setText("PRODUCTOS");
        pnlPrincipal.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 110, 20));

        lblPrecio.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 255, 255));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("PRECIO");
        pnlPrincipal.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 100, -1));

        lblPrecioTotal.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblPrecioTotal.setForeground(new java.awt.Color(0, 255, 255));
        lblPrecioTotal.setText("PRECIO TOTAL");
        pnlPrincipal.add(lblPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, 20));
        pnlPrincipal.add(txtfCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 80, -1));
        pnlPrincipal.add(txtfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, -1));
        pnlPrincipal.add(txtfPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 100, -1));

        lblSubTotal.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(0, 255, 255));
        lblSubTotal.setText("Sub Total");
        pnlPrincipal.add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        lblDescuento.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblDescuento.setForeground(new java.awt.Color(0, 255, 255));
        lblDescuento.setText("Descuento");
        pnlPrincipal.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 255, 255));
        lblTotal.setText("Total");
        pnlPrincipal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 60, -1));

        lblCodigo.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 255, 255));
        lblCodigo.setText("Codigo ");
        pnlPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));
        pnlPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, -1));

        cbxProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlPrincipal.add(cbxProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 110, -1));

        lblFactura.setFont(new java.awt.Font("Perpetua", 3, 48)); // NOI18N
        lblFactura.setForeground(new java.awt.Color(0, 255, 255));
        lblFactura.setText("Factura...");
        pnlPrincipal.add(lblFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, -1));

        tblFac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblFac);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 550, 90));

        btnCalcular.setText("Calcular ");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 110, 30));

        lblSTotal.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(lblSTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 60, 20));

        lblDes.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(lblDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 60, -1));

        lblIVA.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblIVA.setForeground(new java.awt.Color(0, 255, 255));
        lblIVA.setText("I.V.A");
        pnlPrincipal.add(lblIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        lblIVAm.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(lblIVAm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        lblTot.setForeground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.add(lblTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 80, 20));

        btnEliminar.setText("Eliminar Fila ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        rbtnSinpe.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        rbtnSinpe.setForeground(new java.awt.Color(0, 255, 255));
        rbtnSinpe.setText("Sinpe Movil");
        pnlPrincipal.add(rbtnSinpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 120, -1));

        rbtnTarjertas.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        rbtnTarjertas.setForeground(new java.awt.Color(0, 255, 255));
        rbtnTarjertas.setText("Tarjertas");
        pnlPrincipal.add(rbtnTarjertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 100, -1));

        rbtnEfectivo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        rbtnEfectivo.setForeground(new java.awt.Color(0, 255, 255));
        rbtnEfectivo.setText("Efectivo");
        pnlPrincipal.add(rbtnEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 100, -1));

        btnBotonBorrar.setText("Reiniciar Tabla");
        btnBotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotonBorrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnBotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 350, 170, -1));

        btnPagar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 350, 90, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Prueba1.jpg"))); // NOI18N
        pnlPrincipal.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       //Esto es para hacer el boton de calcular del txt
       
        String codigo = txtCodigo.getText();
        String cantidad = txtfCantidad.getText();
        String productos = cbxProductos.getSelectedItem().toString();
        String precio = txtfPrecio.getText();
        String ptot = txtfPrecioTotal.getText();
        
        int subtotal = Integer.parseInt(cantidad)*Integer.parseInt(precio);
        
        double IVA = subtotal * 0.13;
        double preTot = subtotal + IVA;
        
        //descuentos segun el metodo de pago seleccionado (los decuentos son una prueba para ver si funcionan)
        double descSinpe = preTot - (preTot * 0.04 / 100);
        double descEfectivo = preTot - (preTot * 0.06 / 100);
        double descTarjeta = preTot - (preTot * 0.08 / 100);
        
        double precioTotal = 0;
        
        if (rbtnSinpe.isSelected()) {
            precioTotal = descSinpe;
        }else if (rbtnEfectivo.isSelected()) {
            precioTotal = descEfectivo;
        }else if (rbtnTarjertas.isSelected()) {
            precioTotal = descTarjeta;
        }
        
        lblSTotal.setText(""+subtotal);
        lblTot.setText(""+precioTotal);
        
        dato.setCodigo(codigo);
        dato.setCantidad(cantidad);
        dato.setProductos(productos);
        dato.setPrecio(precio);
        dato.setPrecioTotal(""+precioTotal);
        
        //aquí se debería sumar las columnas pero esta dando problemas
        // ??????????????
        
        /*double S = 0, tot;
        String precioT = lblTot.getText();
        double pT = Double.parseDouble(precioT);
        
        for (int i = 0; i < tblFac.getRowCount(); i++) {
            S = S + Double.parseDouble(mdlTabla.getValueAt(i, 4).toString());        
        }
        tot = pT += S;
        lblTot.setText(""+tot);
        */
        
        
        
        
        fac.guardar(dato);
        fac.guardarArchivo(dato);
        
        
        tblFac.setModel(fac.listaProductos());
        
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*int fila = tblFac.getSelectedRow();
        if (fila>=0) {
            mdlTabla.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Seleccione una fila");
        }
        */
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotonBorrarActionPerformed
        // TODO add your handling code here:
        /*int fila = tblFac.getSelectedRowCount();
        for (int i = fila-1; i < 10; i--) {
            mdlTabla.removeRow(i);
        }
        */
    }//GEN-LAST:event_btnBotonBorrarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
    
        //Reportes mas imagen 
        Reportes Facturacion = new Reportes(lblFactura.getText(),
                new Date().toString(),
                FacturaR,
                "J:\\Documentos\\Universidad\\Programacion de computadoras 1\\Repositorios\\Proyecto_Final\\Proyecto Final\\JavaApplication21\\src\\Iconos\\Logo F.png");
        Facturacion.crearReportes();
        
    }//GEN-LAST:event_btnPagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBotonBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cbxProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblIVAm;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblSTotal;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTot;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JRadioButton rbtnEfectivo;
    private javax.swing.JRadioButton rbtnSinpe;
    private javax.swing.JRadioButton rbtnTarjertas;
    private javax.swing.JTable tblFac;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtfCantidad;
    private javax.swing.JTextField txtfPrecio;
    private javax.swing.JTextField txtfPrecioTotal;
    // End of variables declaration//GEN-END:variables
}
