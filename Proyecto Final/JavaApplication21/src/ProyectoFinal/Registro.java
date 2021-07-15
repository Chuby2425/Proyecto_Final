/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

/**
 *
 * @author Francisco
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
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

        jPanel1 = new javax.swing.JPanel();
        pnlPricipal = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblNameUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblIconoUsername = new javax.swing.JLabel();
        lblIconoPassword = new javax.swing.JLabel();
        lblIconoEmail = new javax.swing.JLabel();
        lblIconoRegistro = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rsbtnRegistrase = new rsbuttom.RSButtonMetro();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlPricipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmail.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(102, 102, 102));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("E-mail");
        pnlPricipal.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 110, 30));

        lblNameUsuario.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        lblNameUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblNameUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameUsuario.setText("User Name");
        pnlPricipal.add(lblNameUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 108, 30));

        lblPassword.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password");
        pnlPricipal.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 107, 30));

        lblIconoUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        pnlPricipal.add(lblIconoUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 30));

        lblIconoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/candado.png"))); // NOI18N
        pnlPricipal.add(lblIconoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 30));

        lblIconoEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Icono correo.png"))); // NOI18N
        pnlPricipal.add(lblIconoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 30));

        lblIconoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Icono de registro2.png"))); // NOI18N
        pnlPricipal.add(lblIconoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));
        pnlPricipal.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 230, 200, 30));

        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        pnlPricipal.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 170, 200, 30));
        pnlPricipal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 290, 200, 30));

        rsbtnRegistrase.setBackground(new java.awt.Color(0, 0, 0));
        rsbtnRegistrase.setText("Registrarse");
        rsbtnRegistrase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnRegistraseActionPerformed(evt);
            }
        });
        pnlPricipal.add(rsbtnRegistrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 160, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo login.png"))); // NOI18N
        pnlPricipal.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPricipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addComponent(pnlPricipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void rsbtnRegistraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnRegistraseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rsbtnRegistraseActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIconoEmail;
    private javax.swing.JLabel lblIconoPassword;
    private javax.swing.JLabel lblIconoRegistro;
    private javax.swing.JLabel lblIconoUsername;
    private javax.swing.JLabel lblNameUsuario;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel pnlPricipal;
    private rsbuttom.RSButtonMetro rsbtnRegistrase;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
