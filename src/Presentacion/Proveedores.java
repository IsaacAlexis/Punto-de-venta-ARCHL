package Presentacion;

import javax.swing.JOptionPane;


/**
 *
 * @author XxZaN
 */

public class Proveedores extends javax.swing.JFrame {

    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search_25px.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, 40));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Undo_25px.png"))); // NOI18N
        btnCerrar.setText("Regresar");
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 110, 40));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Plus_25px.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setMaximumSize(new java.awt.Dimension(93, 33));
        btnAgregar.setMinimumSize(new java.awt.Dimension(93, 33));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 40));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit_25px.png"))); // NOI18N
        btnModificar.setText("Editar");
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 100, 40));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Trash Can_25px.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 100, 40));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        jLabel9.setText("Agregar y Modificar Proveedores");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 370, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 0, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProvActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 460, -1));
        jPanel2.add(txtCodigoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 70, 20));

        jLabel1.setText("Código del Proveedor:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel2.add(txtDireccionProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 460, -1));

        jLabel3.setText("Dirección ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtRfcProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcProvKeyTyped(evt);
            }
        });
        jPanel2.add(txtRfcProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 290, -1));

        jLabel6.setText("RFC");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jPanel2.add(txtCorreoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 460, -1));

        jLabel8.setText("Correo");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setText("Ciudad");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));
        jPanel2.add(txtCiudadProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 110, 20));

        jLabel7.setText("Código Postal");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));
        jPanel2.add(txtPostalProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 110, -1));

        jLabel5.setText("Teléfono");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        txtTelefonoProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProvKeyTyped(evt);
            }
        });
        jPanel2.add(txtTelefonoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 110, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 840, 220));

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
        jScrollPane1.setViewportView(tblProveedores);
        if (tblProveedores.getColumnModel().getColumnCount() > 0) {
            tblProveedores.getColumnModel().getColumn(0).setMinWidth(45);
            tblProveedores.getColumnModel().getColumn(0).setMaxWidth(45);
            tblProveedores.getColumnModel().getColumn(1).setMinWidth(200);
            tblProveedores.getColumnModel().getColumn(1).setMaxWidth(200);
            tblProveedores.getColumnModel().getColumn(2).setMinWidth(150);
            tblProveedores.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 820, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 840, 140));

        jLabel10.setText("*Seleccione proveedor para editar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProvActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(Verificar()==true){
            
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

    
    
    public boolean Verificar()
    {
        boolean v;
        if(txtCodigoProv.getText().isEmpty()||txtNombreProv.getText().isEmpty()||txtDireccionProv.getText().isEmpty()||txtRfcProv.getText().isEmpty()
                ||txtCorreoProv.getText().isEmpty()||txtCiudadProv.getText().isEmpty()||txtTelefonoProv.getText().isEmpty()||txtPostalProv.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Porfavor de llenar todos los datos");
            v=false;
        }
        else
        {
            v=true;
        }
        return v;
    }
    
    
    public void Limpiar()
    {
        txtCiudadProv.setText("");
        txtCodigoProv.setText("");
        txtCorreoProv.setText("");
        txtDireccionProv.setText("");
        txtNombreProv.setText("");
        txtPostalProv.setText("");
        txtRfcProv.setText("");
        txtTelefonoProv.setText("");
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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
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
