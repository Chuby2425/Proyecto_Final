//Estamos haciendo pruebas
//prueba
//Prueba 2.0
//Prueba 2.1
//prueba 2.2


package ProyectoFinal;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

/*import java.text.SimpleDateFormat;
import java.util.Date;*/

/**
 *
 * @author jeiso
 */
public class ProyectoFinal extends javax.swing.JFrame implements Runnable{
    String hora, minutos;
    Thread hilo;

    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    public ProyectoFinal() {
        initComponents();
        //Lo hizo antes de hacer el menu desplegable 
        this.setLocationRelativeTo(this);
        this.rsbtnMenu.setSelected(true);
        lblFecha.setText(fecha());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
        
            
        //Fecha del sistema 
        
       /*
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
        this.fecha.setText(formato.format(sistFecha));
        */
        
    }
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get
        (Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get
        (Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        //segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get
        //(Calendar.SECOND):"0"+calendario.get(Calendar.MINUTE);
    }
    
    public void run(){
        Thread current = Thread.currentThread();
        
        while (current==hilo){
            hora();
            lblHora.setText(hora+":"+minutos);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        Lbl_Imagen_central = new javax.swing.JLabel();
        PanelSuperior = new javax.swing.JPanel();
        rsbtnMenu = new rsbuttom.RSButtonMetro();
        rSButtonMetro5 = new rsbuttom.RSButtonMetro();
        lblTitulo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        panelLateral_I = new javax.swing.JPanel();
        rSbtnProductos = new rsbuttom.RSButtonMetro();
        rSbtnhome = new rsbuttom.RSButtonMetro();
        rSbtnventas1 = new rsbuttom.RSButtonMetro();
        rSbtnPower = new rsbuttom.RSButtonMetro();
        rSButtonInventario = new rsbuttom.RSButtonMetro();
        rSButtonReportes = new rsbuttom.RSButtonMetro();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSbtnhome1 = new rsbuttom.RSButtonMetro();
        rSbtnventas2 = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1360, 768));

        Lbl_Imagen_central.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MicrosoftTeams-image (1).png"))); // NOI18N

        PanelSuperior.setBackground(new java.awt.Color(2, 28, 30));

        rsbtnMenu.setBackground(new java.awt.Color(2, 28, 30));
        rsbtnMenu.setForeground(new java.awt.Color(2, 28, 30));
        rsbtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/menudo.png"))); // NOI18N
        rsbtnMenu.setColorHover(new java.awt.Color(2, 28, 30));
        rsbtnMenu.setColorNormal(new java.awt.Color(2, 28, 30));
        rsbtnMenu.setColorPressed(new java.awt.Color(2, 28, 30));
        rsbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnMenuActionPerformed(evt);
            }
        });

        rSButtonMetro5.setBackground(new java.awt.Color(2, 28, 30));
        rSButtonMetro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/calendar.png"))); // NOI18N
        rSButtonMetro5.setColorHover(new java.awt.Color(2, 28, 30));
        rSButtonMetro5.setColorNormal(new java.awt.Color(2, 28, 30));
        rSButtonMetro5.setColorPressed(new java.awt.Color(2, 28, 30));

        lblTitulo.setBackground(new java.awt.Color(0, 204, 204));
        lblTitulo.setFont(new java.awt.Font("Calisto MT", 1, 25)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 255, 255));
        lblTitulo.setText("INTER THINK");

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 255, 255));
        lblFecha.setText("DD/MM/YYYY");

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 255, 255));
        lblHora.setText("00:00");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rsbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonMetro5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rsbtnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo)
                    .addComponent(rSButtonMetro5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelLateral_I.setBackground(new java.awt.Color(0, 153, 153));
        panelLateral_I.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSbtnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        rSbtnProductos.setText("Compras");
        rSbtnProductos.setAutoscrolls(true);
        rSbtnProductos.setColorHover(new java.awt.Color(0, 204, 204));
        rSbtnProductos.setColorNormal(new java.awt.Color(0, 0, 0));
        rSbtnProductos.setColorPressed(new java.awt.Color(0, 204, 204));
        rSbtnProductos.setColorTextHover(new java.awt.Color(0, 204, 204));
        rSbtnProductos.setColorTextNormal(new java.awt.Color(0, 204, 204));
        rSbtnProductos.setColorTextPressed(new java.awt.Color(0, 204, 204));
        rSbtnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSbtnProductos.setIconTextGap(6);
        rSbtnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbtnProductosActionPerformed(evt);
            }
        });
        panelLateral_I.add(rSbtnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 118, 50));

        rSbtnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home (1).png"))); // NOI18N
        rSbtnhome.setText("Inicio");
        rSbtnhome.setColorNormal(new java.awt.Color(0, 0, 0));
        rSbtnhome.setColorPressed(new java.awt.Color(0, 204, 204));
        rSbtnhome.setColorTextHover(new java.awt.Color(0, 204, 204));
        rSbtnhome.setColorTextNormal(new java.awt.Color(0, 204, 204));
        rSbtnhome.setColorTextPressed(new java.awt.Color(5, 42, 45));
        rSbtnhome.setDefaultCapable(false);
        rSbtnhome.setDoubleBuffered(true);
        rSbtnhome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSbtnhome.setIconTextGap(13);
        rSbtnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbtnhomeActionPerformed(evt);
            }
        });
        panelLateral_I.add(rSbtnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 50));

        rSbtnventas1.setBackground(new java.awt.Color(0, 0, 0));
        rSbtnventas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito-de-compras.png"))); // NOI18N
        rSbtnventas1.setText("Ventas");
        rSbtnventas1.setToolTipText("");
        rSbtnventas1.setColorHover(new java.awt.Color(0, 0, 0));
        rSbtnventas1.setColorPressed(new java.awt.Color(0, 204, 204));
        rSbtnventas1.setColorTextHover(new java.awt.Color(0, 204, 204));
        rSbtnventas1.setColorTextNormal(new java.awt.Color(0, 204, 204));
        rSbtnventas1.setColorTextPressed(new java.awt.Color(0, 204, 204));
        rSbtnventas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSbtnventas1.setIconTextGap(13);
        rSbtnventas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbtnventas1ActionPerformed(evt);
            }
        });
        panelLateral_I.add(rSbtnventas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 118, 50));

        rSbtnPower.setBackground(new java.awt.Color(0, 0, 0));
        rSbtnPower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngwing.com.png"))); // NOI18N
        rSbtnPower.setAutoscrolls(true);
        rSbtnPower.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSbtnPower.setColorTextNormal(new java.awt.Color(0, 0, 0));
        rSbtnPower.setColorTextPressed(new java.awt.Color(0, 0, 0));
        rSbtnPower.setIconTextGap(13);
        rSbtnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbtnPowerActionPerformed(evt);
            }
        });
        panelLateral_I.add(rSbtnPower, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 40, 40));

        rSButtonInventario.setBackground(new java.awt.Color(0, 0, 0));
        rSButtonInventario.setForeground(new java.awt.Color(0, 204, 204));
        rSButtonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/e.png"))); // NOI18N
        rSButtonInventario.setText("Inventario");
        rSButtonInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonInventario.setIconTextGap(6);
        rSButtonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonInventarioActionPerformed(evt);
            }
        });
        panelLateral_I.add(rSButtonInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 118, 50));

        rSButtonReportes.setBackground(new java.awt.Color(0, 0, 0));
        rSButtonReportes.setForeground(new java.awt.Color(0, 204, 204));
        rSButtonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/y.png"))); // NOI18N
        rSButtonReportes.setText("Reportes");
        rSButtonReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonReportes.setIconTextGap(9);
        panelLateral_I.add(rSButtonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 118, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-futurista-moderno-abstracto_38127-6.jpg"))); // NOI18N
        panelLateral_I.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 130, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-futurista-moderno-abstracto_38127-6.jpg"))); // NOI18N
        panelLateral_I.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 130, 370));

        rSbtnhome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home (1).png"))); // NOI18N
        rSbtnhome1.setText("Inicio");
        rSbtnhome1.setColorNormal(new java.awt.Color(0, 0, 0));
        rSbtnhome1.setColorPressed(new java.awt.Color(0, 204, 204));
        rSbtnhome1.setColorTextHover(new java.awt.Color(0, 204, 204));
        rSbtnhome1.setColorTextNormal(new java.awt.Color(0, 204, 204));
        rSbtnhome1.setColorTextPressed(new java.awt.Color(5, 42, 45));
        rSbtnhome1.setDefaultCapable(false);
        rSbtnhome1.setDoubleBuffered(true);
        rSbtnhome1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSbtnhome1.setIconTextGap(13);
        rSbtnhome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbtnhome1ActionPerformed(evt);
            }
        });
        panelLateral_I.add(rSbtnhome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, 50));

        rSbtnventas2.setBackground(new java.awt.Color(0, 0, 0));
        rSbtnventas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito-de-compras.png"))); // NOI18N
        rSbtnventas2.setText("Ventas");
        rSbtnventas2.setToolTipText("");
        rSbtnventas2.setColorHover(new java.awt.Color(0, 0, 0));
        rSbtnventas2.setColorPressed(new java.awt.Color(0, 204, 204));
        rSbtnventas2.setColorTextHover(new java.awt.Color(0, 204, 204));
        rSbtnventas2.setColorTextNormal(new java.awt.Color(0, 204, 204));
        rSbtnventas2.setColorTextPressed(new java.awt.Color(0, 204, 204));
        rSbtnventas2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSbtnventas2.setIconTextGap(13);
        rSbtnventas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbtnventas2ActionPerformed(evt);
            }
        });
        panelLateral_I.add(rSbtnventas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 118, 50));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLateral_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(Lbl_Imagen_central, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addComponent(PanelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLateral_I, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_Imagen_central, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSbtnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbtnhomeActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rSbtnhomeActionPerformed

    private void rsbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnMenuActionPerformed
        //Hacer lo desplegable
        int posicion = this.panelLateral_I.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0,-188, 2, 2, panelLateral_I);
        }else{
        Animacion.Animacion.mover_derecha(-188,0, 2, 2, panelLateral_I);
        }
    }//GEN-LAST:event_rsbtnMenuActionPerformed

    private void rSbtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbtnProductosActionPerformed
        // Boton de productos falta completar
        Productos p = new Productos();
        p.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_rSbtnProductosActionPerformed

    private void rSbtnventas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbtnventas1ActionPerformed
        //Boton de ventas incompleto
        Ventas v = new Ventas();
        v.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_rSbtnventas1ActionPerformed

    private void rSbtnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbtnPowerActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSbtnPowerActionPerformed

    private void rSbtnhome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbtnhome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSbtnhome1ActionPerformed

    private void rSbtnventas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbtnventas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSbtnventas2ActionPerformed

    private void rSButtonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonInventarioActionPerformed

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
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Imagen_central;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelLateral_I;
    private rsbuttom.RSButtonMetro rSButtonInventario;
    private rsbuttom.RSButtonMetro rSButtonMetro5;
    private rsbuttom.RSButtonMetro rSButtonReportes;
    private rsbuttom.RSButtonMetro rSbtnPower;
    private rsbuttom.RSButtonMetro rSbtnProductos;
    private rsbuttom.RSButtonMetro rSbtnhome;
    private rsbuttom.RSButtonMetro rSbtnhome1;
    private rsbuttom.RSButtonMetro rSbtnventas1;
    private rsbuttom.RSButtonMetro rSbtnventas2;
    private rsbuttom.RSButtonMetro rsbtnMenu;
    // End of variables declaration//GEN-END:variables
}
