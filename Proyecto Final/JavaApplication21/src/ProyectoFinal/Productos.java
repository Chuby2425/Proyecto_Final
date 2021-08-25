package ProyectoFinal;

import Clases.DatosInventario;
import Clases.Producto;
import Lógica.txtProducto;
import Lógica.ListaProductos;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {

    Producto prod = new Producto();
    ListaProductos prodl = new ListaProductos();
    txtProducto txtProd = new txtProducto();


    DefaultTableModel mdlTablaInv;
    Vector cabeceras = new Vector();

    public Productos() {
        initComponents();
        prodl.setLisProducto(txtProd.CargarProductos()); 


        cabeceras.addElement("Código");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Precio Interno");
        cabeceras.addElement("Precio de Venta");

        mdlTablaInv = new DefaultTableModel(cabeceras, 0);
        jtblInventario.setModel(mdlTablaInv);
    }

    public void limpiar() {
        txtCodigo.setText("");
        txtNombredelProducto.setText("");
        txtPrecioInterno.setText("");
        txtPrecioVenta.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEliminarProducto = new javax.swing.JButton();
        lblElimminarNombre = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        txtEliminarProducto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblDatosProductos = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtNombredelProducto = new javax.swing.JTextField();
        lblNombreProducto = new javax.swing.JLabel();
        txtPrecioInterno = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnMostraLista = new javax.swing.JButton();
        lblPrecioVenta = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblInventario = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtBusquedaporCodigo = new javax.swing.JTextField();
        lblBuscarProducto = new javax.swing.JLabel();
        lblBusquedaporCodigo = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        lblElimminarNombre.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblElimminarNombre.setForeground(new java.awt.Color(0, 204, 204));
        lblElimminarNombre.setText("Nombre del Producto");

        lblEliminar.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(0, 204, 204));
        lblEliminar.setText("Eliminar en Lista");

        txtEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEliminar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblElimminarNombre)
                        .addGap(31, 31, 31)
                        .addComponent(txtEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnEliminarProducto)))
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblEliminar)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblElimminarNombre))
                    .addComponent(txtEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto))
                .addGap(107, 107, 107))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 210, 420, 176));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDatosProductos.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        lblDatosProductos.setForeground(new java.awt.Color(0, 204, 204));
        lblDatosProductos.setText("Datos del Producto");

        lblCodigo.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 204, 204));
        lblCodigo.setText("Codigo");

        txtNombredelProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombredelProductoActionPerformed(evt);
            }
        });

        lblNombreProducto.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblNombreProducto.setForeground(new java.awt.Color(0, 204, 204));
        lblNombreProducto.setText("Nombre del Producto");

        txtPrecioInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioInternoActionPerformed(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 204, 204));
        lblPrecio.setText("Precio Interno");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMostraLista.setText("Mostrar");
        btnMostraLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraListaActionPerformed(evt);
            }
        });

        lblPrecioVenta.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblPrecioVenta.setForeground(new java.awt.Color(0, 204, 204));
        lblPrecioVenta.setText("Precio de Venta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnGuardar)
                        .addGap(38, 38, 38)
                        .addComponent(btnMostraLista))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPrecioVenta)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(lblPrecio)))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPrecioInterno, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(txtPrecioVenta))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDatosProductos)
                            .addComponent(lblNombreProducto))
                        .addGap(18, 18, 18)
                        .addComponent(txtNombredelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosProductos)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreProducto)
                            .addComponent(txtNombredelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(lblPrecio))
                    .addComponent(txtPrecioInterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnMostraLista))
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, -1, 310));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtblInventario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtblInventario);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 495, 918, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblBuscarProducto.setFont(new java.awt.Font("Perpetua", 3, 18)); // NOI18N
        lblBuscarProducto.setForeground(new java.awt.Color(0, 204, 204));
        lblBuscarProducto.setText("Buscar Producto");

        lblBusquedaporCodigo.setFont(new java.awt.Font("Perpetua", 3, 14)); // NOI18N
        lblBusquedaporCodigo.setForeground(new java.awt.Color(0, 204, 204));
        lblBusquedaporCodigo.setText("Buscar por Codigo:");

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblBuscarProducto)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblBusquedaporCodigo)
                        .addGap(29, 29, 29)
                        .addComponent(txtBusquedaporCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblBuscarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusquedaporCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBusquedaporCodigo)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 361, -1, 130));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 660, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo de productos.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 940, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        ProyectoFinal pf = new ProyectoFinal();
        pf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed

        String prode = txtEliminarProducto.getText();
        prodl.eliminarProducto(prode);
        txtProd.guardarArchivo(prodl.getLisProducto());

    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        String cod = txtBusquedaporCodigo.getText();
        jtblInventario.setModel(prodl.buscarProductos(cod));

    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnMostraListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraListaActionPerformed
        jtblInventario.setModel(prodl.listarProductos());

    }//GEN-LAST:event_btnMostraListaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        mdlTablaInv = new DefaultTableModel();

        String codigo = txtCodigo.getText();
        String nombre = txtNombredelProducto.getText();
        String precioInterno = txtPrecioInterno.getText();
        String precioVenta = txtPrecioVenta.getText();

        prod.setCodigo(codigo);
        prod.setNombre(nombre);
        prod.setPrecioInterno(precioInterno);
        prod.setPrecioVenta(precioVenta);
        prodl.agregarProducto(prod);
        txtProd.guardarArchivo(prodl.getLisProducto());

        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPrecioInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioInternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioInternoActionPerformed

    private void txtNombredelProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombredelProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombredelProductoActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostraLista;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtblInventario;
    private javax.swing.JLabel lblBuscarProducto;
    private javax.swing.JLabel lblBusquedaporCodigo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDatosProductos;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblElimminarNombre;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JTextField txtBusquedaporCodigo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEliminarProducto;
    private javax.swing.JTextField txtNombredelProducto;
    private javax.swing.JTextField txtPrecioInterno;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
