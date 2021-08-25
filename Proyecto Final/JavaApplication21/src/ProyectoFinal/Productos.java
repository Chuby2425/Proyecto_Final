package ProyectoFinal;

import Clases.DatosInventario;
<<<<<<< Updated upstream
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
=======
import Clases.Producto;
import Lógica.txtProducto;
import Lógica.ListaProductos;
import java.util.ArrayList;
import java.util.Vector;
>>>>>>> Stashed changes
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JFrame {
    // esto es para el txt

<<<<<<< Updated upstream
    private ArrayList<DatosInventario> Lis;
=======
    Producto prod = new Producto();
    ListaProductos prodl = new ListaProductos();
    txtProducto txtProd = new txtProducto();


    DefaultTableModel mdlTablaInv;
    Vector cabeceras = new Vector();
>>>>>>> Stashed changes

    public Productos() {
        // para txt
        Lis = new ArrayList<DatosInventario>();
        initComponents();
<<<<<<< Updated upstream
        
       
        verDatos();
        cargar();

=======
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
>>>>>>> Stashed changes
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
<<<<<<< Updated upstream
=======
        jPanel2 = new javax.swing.JPanel();
        btnEliminarProducto = new javax.swing.JButton();
        lblElimminarNombre = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        txtEliminarProducto = new javax.swing.JTextField();
>>>>>>> Stashed changes
        jPanel3 = new javax.swing.JPanel();
        lblDatosProductos = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtNombredelProducto = new javax.swing.JTextField();
        lblNombreProducto = new javax.swing.JLabel();
        txtPrecioInterno = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblPrecioVenta = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInven = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lbllFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

<<<<<<< Updated upstream
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
=======
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
>>>>>>> Stashed changes

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

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
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
                .addGap(29, 29, 29)
                .addComponent(lblDatosProductos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
<<<<<<< Updated upstream
                        .addGap(39, 39, 39)
=======
                        .addGap(112, 112, 112)
                        .addComponent(btnGuardar)
                        .addGap(38, 38, 38)
                        .addComponent(btnMostraLista))
                    .addGroup(jPanel3Layout.createSequentialGroup()
>>>>>>> Stashed changes
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreProducto)
                            .addGroup(jPanel3Layout.createSequentialGroup()
<<<<<<< Updated upstream
                                .addGap(32, 32, 32)
                                .addComponent(lblCodigo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblCantidad))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecio)
                            .addComponent(lblPrecioVenta)
                            .addComponent(btnGuardar))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtNombredelProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecioInterno, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtPrecioVenta))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addGap(77, 77, 77))))
=======
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
>>>>>>> Stashed changes
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosProductos)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< Updated upstream
                    .addComponent(txtPrecioInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioVenta)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnRegresar))
                .addGap(25, 25, 25))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, -1));
=======
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
>>>>>>> Stashed changes

        tblInven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "N.Producto", "Cantidad", "P.Interno", "P.Venta"
            }
        ));
        jScrollPane1.setViewportView(tblInven);

<<<<<<< Updated upstream
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 400, 310));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));
=======
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
>>>>>>> Stashed changes

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        lbllFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo de productos.png"))); // NOI18N
        jPanel1.add(lbllFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void limpiar() {
        txtCodigo.setText("");
        txtNombredelProducto.setText("");
        txtCantidad.setText("");
        txtPrecioInterno.setText("");
        txtPrecioVenta.setText("");

    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
<<<<<<< Updated upstream
        // para el txt
        String cod, np, cant, pi, pv;
        try {

            cod = txtCodigo.getText();
            np = txtNombredelProducto.getText();
            cant = txtCantidad.getText();
            pi = txtPrecioInterno.getText();
            pv = txtPrecioVenta.getText();

            // no estamos seguros de que sea Datos Inventario
            Lis.add(new DatosInventario(cod, np, cant, pi, pv));
=======

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
>>>>>>> Stashed changes

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Verfique lo Datos ");
        }
        limpiar();
        verDatos();

    }//GEN-LAST:event_btnGuardarActionPerformed

<<<<<<< Updated upstream
    private void verDatos() {
        //se uso matrices para almacenar info
        String Mat[][] = new String[Lis.size()][5];

        // no estamos seguros de que sea Datos Inventario
        DatosInventario aux;
        for (int i = 0; i < Lis.size(); i++) {
            aux = Lis.get(i);
            Mat[i][0] = aux.getCodigo();
            Mat[i][1] = aux.getNombre();
            Mat[i][2] = aux.getCantidad();
            Mat[i][3] = aux.getPrecioInterno();
            Mat[i][4] = aux.getPrecioVenta();
        }
        // se copio de @SuppressWarnings("unchecked") 

        tblInven.setModel(new javax.swing.table.DefaultTableModel(
                Mat,
                new String[]{
                    "Codigo", "N.Producto", "Cantidad", "P.Interno", "P.Venta"
                }
        ));
    }
    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

=======
>>>>>>> Stashed changes
    private void txtPrecioInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioInternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioInternoActionPerformed

<<<<<<< Updated upstream
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

    }//GEN-LAST:event_btnRegresarActionPerformed
    public void prueba(){
        
        
    }
    // este metodo muestra todo lo que se tiene guardado en el txt

   
    public void cargar(){
        
        
        File Archivo = new File("Inventarios.txt");
        FileReader Leer;
        BufferedReader Almacen;
        
        DatosInventario dat,aux = new DatosInventario();
        
        try {
            
            Leer = new FileReader(Archivo);
            Almacen = new BufferedReader(Leer);
            dat = aux.cargar(Almacen);
            while (dat != null){
                Lis.add(dat);
                 dat = aux.cargar(Almacen);
            }
            Almacen.close();
            Leer.close();
                    
        } catch (Exception e) {
        }
        verDatos(); 
    }
     

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

// para numero de filas por eso int 
        int c;
        try {
            // para elimianr la fila de la tabla 
            c = tblInven.getSelectedRow();
            Lis.remove(c);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
        }
        verDatos();

    }//GEN-LAST:event_btnEliminarActionPerformed
    // pendiente como modificar mejor la tabla 

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int c, pi, cant;
        String pv;
        // no estamos seguros de que sea Datos Inventario
        DatosInventario aux;
        try {
            c = tblInven.getSelectedRow();
            aux = Lis.get(c);
            pv = JOptionPane.showInputDialog("Digite el nuevo precio de venta ");
            aux.setPrecioVenta(pv);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila");
        }
        verDatos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void guardar() {

        //metodo de crear txt si no esta echo, si esta echo lo deja normal  
        File file = new File("Inventarios.txt");
        PrintWriter Escribe;
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            DatosInventario aux;
            Escribe = new PrintWriter(file, "utf-8");
            for (int i = 0; i < Lis.size(); i++) {
                aux = Lis.get(i);
                aux.guardar(Escribe);
            }
            Escribe.close();
        } catch (Exception e) {
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // para que mustre el mensaje de si desea guardar antes de cerrar
        String botones[] = {"Si", "No"};
        int n = JOptionPane.showOptionDialog(null, "Desea guardar la informacion", "IMPORTANTE", 0, 0, null, botones, null);
        if (n == 0) {
            guardar();
        }


    }//GEN-LAST:event_formWindowClosing
=======
    private void txtNombredelProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombredelProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombredelProductoActionPerformed
>>>>>>> Stashed changes

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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
<<<<<<< Updated upstream
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
=======
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtblInventario;
    private javax.swing.JLabel lblBuscarProducto;
    private javax.swing.JLabel lblBusquedaporCodigo;
>>>>>>> Stashed changes
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDatosProductos;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioVenta;
<<<<<<< Updated upstream
    private javax.swing.JLabel lbllFondo;
    private javax.swing.JTable tblInven;
    private javax.swing.JTextField txtCantidad;
=======
    private javax.swing.JTextField txtBusquedaporCodigo;
>>>>>>> Stashed changes
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombredelProducto;
    private javax.swing.JTextField txtPrecioInterno;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables

}
