/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

/**
 *
 * @author jeiso
 */
public class Ventas extends javax.swing.JFrame {

    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        lblInterthink = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblPrecioTotal = new javax.swing.JLabel();
        txtfCantidad1 = new javax.swing.JTextField();
        txtfCantidad2 = new javax.swing.JTextField();
        txtfProducto1 = new javax.swing.JTextField();
        txtfProducto2 = new javax.swing.JTextField();
        txtfPrecio1 = new javax.swing.JTextField();
        txtfPrecio2 = new javax.swing.JTextField();
        txtfPrecioTotal1 = new javax.swing.JTextField();
        txtfPrecioTotal2 = new javax.swing.JTextField();
        lblSubTotal = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtfDescuentoR = new javax.swing.JTextField();
        txtfTotalR = new javax.swing.JTextField();
        txtfSubTotalR = new javax.swing.JTextField();
        tbtnFacturar = new javax.swing.JToggleButton();
        tbtnHome = new javax.swing.JToggleButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInterthink.setFont(new java.awt.Font("Poor Richard", 3, 36)); // NOI18N
        lblInterthink.setForeground(new java.awt.Color(142, 48, 142));
        lblInterthink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInterthink.setText("INTER THINK");
        pnlPrincipal.add(lblInterthink, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 280, 30));

        lblCantidad.setForeground(new java.awt.Color(0, 255, 255));
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCantidad.setText("CANTIDAD");
        lblCantidad.setToolTipText("");
        lblCantidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlPrincipal.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, -1));

        lblProductos.setForeground(new java.awt.Color(0, 255, 255));
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductos.setText("PRODUCTOS");
        pnlPrincipal.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, 20));

        lblPrecio.setForeground(new java.awt.Color(0, 255, 255));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("PRECIO");
        pnlPrincipal.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 100, -1));

        lblPrecioTotal.setForeground(new java.awt.Color(0, 255, 255));
        lblPrecioTotal.setText("PRECIO TOTAL");
        pnlPrincipal.add(lblPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, 20));
        pnlPrincipal.add(txtfCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 50, -1));
        pnlPrincipal.add(txtfCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, -1));
        pnlPrincipal.add(txtfProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, -1));
        pnlPrincipal.add(txtfProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));
        pnlPrincipal.add(txtfPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 100, -1));
        pnlPrincipal.add(txtfPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 100, -1));
        pnlPrincipal.add(txtfPrecioTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 100, -1));
        pnlPrincipal.add(txtfPrecioTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 100, -1));

        lblSubTotal.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(0, 255, 255));
        lblSubTotal.setText("Sub Total");
        pnlPrincipal.add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        lblDescuento.setForeground(new java.awt.Color(0, 255, 255));
        lblDescuento.setText("Descuento");
        pnlPrincipal.add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        lblTotal.setForeground(new java.awt.Color(0, 255, 255));
        lblTotal.setText("Total");
        pnlPrincipal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, 20));

        txtfDescuentoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfDescuentoRActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtfDescuentoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 90, -1));
        pnlPrincipal.add(txtfTotalR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 90, -1));
        pnlPrincipal.add(txtfSubTotalR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 90, -1));

        tbtnFacturar.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        tbtnFacturar.setText("Facturar");
        tbtnFacturar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbtnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnFacturarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(tbtnFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 160, 60));

        tbtnHome.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        tbtnHome.setText("Limpiar");
        tbtnHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPrincipal.add(tbtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 160, 60));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo de ventas.png"))); // NOI18N
        pnlPrincipal.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 670, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfDescuentoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfDescuentoRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDescuentoRActionPerformed

    private void tbtnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnFacturarActionPerformed
       double pro1,pro2,vup1,vup2,vtp1,vtp2,subtotal = 0,descuento = 0,vtotal;
       
       pro1=Double.parseDouble(txtfCantidad1.getText());
       pro2=Double.parseDouble(txtfCantidad2.getText());
       vup1=Double.parseDouble(txtfPrecio1.getText());
       vup2=Double.parseDouble(txtfPrecio2.getText());
       vtp1=pro1*vup1;
       vtp2=pro2*vup2;
       
       String valt1 = vtp1 +"";
       String valt2 = vtp2 +"";
       txtfPrecioTotal1.setText(valt1);
       txtfPrecioTotal2.setText(valt2);
       subtotal= vtp1+vtp2;
       String st = subtotal+"";
       txtfSubTotalR.setText(st);
       vtotal= subtotal - descuento;
       String vt = vtotal+"";
       txtfTotalR.setText(vt);
       
       
    }//GEN-LAST:event_tbtnFacturarActionPerformed

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
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblInterthink;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JToggleButton tbtnFacturar;
    private javax.swing.JToggleButton tbtnHome;
    private javax.swing.JTextField txtfCantidad1;
    private javax.swing.JTextField txtfCantidad2;
    private javax.swing.JTextField txtfDescuentoR;
    private javax.swing.JTextField txtfPrecio1;
    private javax.swing.JTextField txtfPrecio2;
    private javax.swing.JTextField txtfPrecioTotal1;
    private javax.swing.JTextField txtfPrecioTotal2;
    private javax.swing.JTextField txtfProducto1;
    private javax.swing.JTextField txtfProducto2;
    private javax.swing.JTextField txtfSubTotalR;
    private javax.swing.JTextField txtfTotalR;
    // End of variables declaration//GEN-END:variables
}
