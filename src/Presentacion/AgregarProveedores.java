package Presentacion;

import Datos.ProveedoresSQL;
import Negocios.NegocioProveedores;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author XxZaN
 */
public class AgregarProveedores extends javax.swing.JFrame {

    ProveedoresSQL prov = new ProveedoresSQL();

    public AgregarProveedores() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        LlenarTabla();
        btnModificar.setEnabled(false);
        btnCancelarBusProd.setVisible(false);
        txtCodigoProv.grabFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNombreProv = new javax.swing.JTextField();
        txtCodigoProv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDireccionProv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRfcProv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreoProv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCiudadProv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPostalProv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoProv = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnCancelarBusProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGregar y Editar Proveedores");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search_25px.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, 40));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Undo_25px.png"))); // NOI18N
        btnCerrar.setText("Regresar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 130, 40));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plus_25px.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setMaximumSize(new java.awt.Dimension(93, 33));
        btnAgregar.setMinimumSize(new java.awt.Dimension(93, 33));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, 40));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit_25px.png"))); // NOI18N
        btnModificar.setText("Editar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 100, 40));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        jLabel9.setText("Agregar y Editar Proveedores");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 350, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 0, 18))); // NOI18N

        txtNombreProv.setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        txtNombreProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProvActionPerformed(evt);
            }
        });

        jLabel1.setText("Código del Proveedor:");

        jLabel2.setText("Nombre");

        jLabel3.setText("Dirección ");

        txtRfcProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcProvKeyTyped(evt);
            }
        });

        jLabel6.setText("RFC");

        jLabel8.setText("Correo");

        jLabel4.setText("Ciudad");

        jLabel7.setText("Código Postal");

        jLabel5.setText("Teléfono");

        txtTelefonoProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProvKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(17, 17, 17)
                                        .addComponent(txtRfcProv, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtDireccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(11, 11, 11)
                                        .addComponent(txtCorreoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCiudadProv)
                            .addComponent(txtPostalProv, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtCiudadProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtPostalProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDireccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtRfcProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtCorreoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 990, 240));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedores"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Dirección", "RFC", "Teléfono", "Ciudad", "C.P.", "Correo"
            }
        ));
        tblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedores);
        if (tblProveedores.getColumnModel().getColumnCount() > 0) {
            tblProveedores.getColumnModel().getColumn(0).setMinWidth(45);
            tblProveedores.getColumnModel().getColumn(0).setMaxWidth(45);
            tblProveedores.getColumnModel().getColumn(1).setMinWidth(200);
            tblProveedores.getColumnModel().getColumn(1).setMaxWidth(200);
            tblProveedores.getColumnModel().getColumn(2).setMinWidth(150);
            tblProveedores.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 970, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 1000, 170));

        jLabel10.setText("*Seleccione proveedor para editar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        btnCancelarBusProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Find and Replace_25px.png"))); // NOI18N
        btnCancelarBusProd.setText("Cancelar Busqueda");
        btnCancelarBusProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBusProdActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarBusProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, 40));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProvActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (Verificar() == true) {
            try {
                prov.setCodProv(txtCodigoProv.getText().toUpperCase());
                new NegocioProveedores().PuenteExiste(prov);

                if (prov.isStatusExist() == false) {

                    prov.setCodProv(txtCodigoProv.getText().toUpperCase());
                    prov.setProveedor(txtNombreProv.getText().toUpperCase());
                    prov.setDireccion(txtDireccionProv.getText().toUpperCase());
                    prov.setCiudad(txtCiudadProv.getText().toUpperCase());
                    prov.setTelefono(Long.parseLong(txtTelefonoProv.getText()));
                    prov.setRFC(txtRfcProv.getText().toUpperCase());
                    prov.setCP(Integer.parseInt(txtPostalProv.getText()));
                    prov.setCorreo(txtCorreoProv.getText().toLowerCase());

                    new NegocioProveedores().PuenteGuardarProv(prov);
                    Limpiar();
                    LlenarTabla();

                } else {
                    JOptionPane.showMessageDialog(null, "El Producto ya existe... Verifique su codigo de producto");
                    LlenarTabla();

                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(AgregarProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtRfcProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcProvKeyTyped
        int limite = 13;

        if (txtRfcProv.getText().length() == limite) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRfcProvKeyTyped

    private void txtTelefonoProvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProvKeyTyped
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(null, "Introduzca solo valores numericos");

        }
    }//GEN-LAST:event_txtTelefonoProvKeyTyped

    private void tblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedoresMouseClicked

        if (evt.getButton() == 1) {
            int fila = tblProveedores.getSelectedRow();

            txtCodigoProv.setText(tblProveedores.getValueAt(fila, 0).toString());
            txtNombreProv.setText(tblProveedores.getValueAt(fila, 1).toString());
            txtDireccionProv.setText(tblProveedores.getValueAt(fila, 2).toString());
            txtCiudadProv.setText(tblProveedores.getValueAt(fila, 3).toString());
            txtTelefonoProv.setText(tblProveedores.getValueAt(fila, 4).toString());
            txtRfcProv.setText(tblProveedores.getValueAt(fila, 5).toString());
            txtPostalProv.setText(tblProveedores.getValueAt(fila, 6).toString());
            txtCorreoProv.setText(tblProveedores.getValueAt(fila, 7).toString());

            btnModificar.setEnabled(true);
            btnAgregar.setEnabled(false);
        }

    }//GEN-LAST:event_tblProveedoresMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (Verificar() == true) {
            try {
                prov.setCodProv(txtCodigoProv.getText().toUpperCase());
                prov.setProveedor(txtNombreProv.getText().toUpperCase());
                prov.setDireccion(txtDireccionProv.getText().toUpperCase());
                prov.setCiudad(txtCiudadProv.getText().toUpperCase());
                prov.setTelefono(Long.parseLong(txtTelefonoProv.getText()));
                prov.setRFC(txtRfcProv.getText().toUpperCase());
                prov.setCP(Integer.parseInt(txtPostalProv.getText()));
                prov.setCorreo(txtCorreoProv.getText().toLowerCase());

                new NegocioProveedores().PuenteEditarProveedor(prov);
                Limpiar();
                LlenarTabla();

            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(AgregarProveedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        try {
            InterfazProveedoresSQL ipro = new InterfazProveedoresSQL();
            ipro.setVisible(true);
            this.dispose();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException ex) {
            Logger.getLogger(AgregarProveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String v = JOptionPane.showInputDialog(null,"Introduzca el nombre del Proveedor");
        
        if(v != null){
            try {
                ProveedoresSQL prov = new ProveedoresSQL();
                prov.setBus(v);

                NegocioProveedores npro = new NegocioProveedores();
                npro.PuenteMostrarTablaBuscar(tblProveedores,prov);

                btnCancelarBusProd.setVisible(true);

            } catch (IllegalAccessException | ClassNotFoundException | InstantiationException ex) {
                JOptionPane.showMessageDialog(null,"Error "+ex);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBusProdActionPerformed

        try {
            LlenarTabla();
            btnCancelarBusProd.setVisible(false);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCancelarBusProdActionPerformed

    public boolean Verificar() {
        boolean v;
        if (txtCodigoProv.getText().isEmpty() || txtNombreProv.getText().isEmpty() || txtDireccionProv.getText().isEmpty() || txtRfcProv.getText().isEmpty()
                || txtCorreoProv.getText().isEmpty() || txtCiudadProv.getText().isEmpty() || txtTelefonoProv.getText().isEmpty() || txtPostalProv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Porfavor de llenar todos los datos");
            v = false;
        } else {
            v = true;
        }
        return v;
    }

    public void Limpiar() {
        txtCiudadProv.setText("");
        txtCodigoProv.setText("");
        txtCorreoProv.setText("");
        txtDireccionProv.setText("");
        txtNombreProv.setText("");
        txtPostalProv.setText("");
        txtRfcProv.setText("");
        txtTelefonoProv.setText("");
    }

    private void LlenarTabla() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        NegocioProveedores nprov = new NegocioProveedores();
        nprov.PuenteMostrarTabla(tblProveedores);
    }

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
            java.util.logging.Logger.getLogger(AgregarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AgregarProveedores().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(AgregarProveedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarBusProd;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCiudadProv;
    private javax.swing.JTextField txtCodigoProv;
    private javax.swing.JTextField txtCorreoProv;
    private javax.swing.JTextField txtDireccionProv;
    private javax.swing.JTextField txtNombreProv;
    private javax.swing.JTextField txtPostalProv;
    private javax.swing.JTextField txtRfcProv;
    private javax.swing.JTextField txtTelefonoProv;
    // End of variables declaration//GEN-END:variables
}
