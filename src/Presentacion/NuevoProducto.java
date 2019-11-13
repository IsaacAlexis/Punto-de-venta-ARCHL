
package Presentacion;

import Datos.ProductosSQL;
import Negocios.NegocioProductos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Maldonado88
 */
public class NuevoProducto extends javax.swing.JFrame {

    ProductosSQL prod = new ProductosSQL();
    
    public NuevoProducto() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        initComponents();
        this.setLocationRelativeTo(null);
        LlenarComboCatego();
        LlenarComboProvee();
        LLenarTabla();
        btnEditarProducto.setEnabled(false);
        btnCancelarBusProd.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodProdNP = new javax.swing.JTextField();
        lblBarcode = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodBarNP = new javax.swing.JTextField();
        cboxCategoriaNP = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtDescripcionProdNP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioProdNP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spnExistenciaProdNP = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        cboxProveedorNP = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        btnGuardarNP = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();
        btnCancelarNP = new javax.swing.JButton();
        btnBuscarProd = new javax.swing.JButton();
        btnCancelarBusProd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblSele = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        jLabel1.setText("Agregar y Modificar Productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 350, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 0, 18))); // NOI18N

        jLabel2.setText("Codigo del producto");

        lblBarcode.setText("Codigo de barras");

        jLabel4.setText("Categoria");

        jLabel5.setText("Descripcion");

        jLabel6.setText("Precio");

        txtPrecioProdNP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioProdNPKeyTyped(evt);
            }
        });

        jLabel7.setText("Existencia");

        spnExistenciaProdNP.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnExistenciaProdNP.setValue(1);

        jLabel3.setText("Proveedor");

        jButton3.setText("Agregar Categoria");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescripcionProdNP))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodProdNP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBarcode)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodBarNP, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(22, 22, 22)
                                .addComponent(txtPrecioProdNP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(22, 22, 22)
                                .addComponent(spnExistenciaProdNP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(199, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxProveedorNP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxCategoriaNP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCodProdNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBarcode)
                        .addComponent(txtCodBarNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioProdNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDescripcionProdNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(spnExistenciaProdNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cboxProveedorNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboxCategoriaNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 850, 230));

        btnGuardarNP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save_25px.png"))); // NOI18N
        btnGuardarNP.setText("Guardar");
        btnGuardarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNPActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        btnEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit_25px.png"))); // NOI18N
        btnEditarProducto.setText("Editar");
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        btnCancelarNP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete_25px.png"))); // NOI18N
        btnCancelarNP.setText("Cancelar");
        btnCancelarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNPActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        btnBuscarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search_25px.png"))); // NOI18N
        btnBuscarProd.setText("Buscar");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        btnCancelarBusProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Find and Replace_25px.png"))); // NOI18N
        btnCancelarBusProd.setText("Cancelar Busqueda");
        btnCancelarBusProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBusProdActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarBusProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Producto", "Codigo de Barras", "Categoria", "Descripcion", "Precio", "Existencia", "Proveedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(1).setResizable(false);
            tblProductos.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(2).setResizable(false);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(3).setResizable(false);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(250);
            tblProductos.getColumnModel().getColumn(4).setResizable(false);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(5).setResizable(false);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(75);
            tblProductos.getColumnModel().getColumn(6).setResizable(false);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 850, 260));

        lblSele.setText("Seleccione un producto para editar");
        jPanel1.add(lblSele, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNPActionPerformed
        if (txtCodProdNP.getText().length() == 0 || txtDescripcionProdNP.getText().length() == 0 || txtPrecioProdNP.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"El codigo del producto, la descripcion el precio y la existencia son campos obligatorios.");
        }
        else{
            
            try {
                
                prod.setIdProd(txtCodProdNP.getText().toUpperCase());
                new NegocioProductos().PuenteExiste(prod);
            
                if(prod.isStatusExist()==false){
                    if (txtCodBarNP.getText().length()!=0) {
                        prod.setIdProd(txtCodProdNP.getText().toUpperCase());
                        prod.setCodigoBar(txtCodBarNP.getText().toUpperCase());
                        prod.setCategoria(cboxCategoriaNP.getSelectedItem().toString());
                        prod.setDescripcion(txtDescripcionProdNP.getText().toUpperCase());
                        prod.setPrecio(Float.parseFloat(txtPrecioProdNP.getText()));
                        prod.setExistencia(Integer.parseInt(spnExistenciaProdNP.getValue().toString()));
                        prod.setProveedorProd(cboxProveedorNP.getSelectedItem().toString());
                    } else {
                        prod.setIdProd(txtCodProdNP.getText().toUpperCase());
                        prod.setCodigoBar("SIN CODIGO");
                        prod.setCategoria(cboxCategoriaNP.getSelectedItem().toString());
                        prod.setDescripcion(txtDescripcionProdNP.getText().toUpperCase());
                        prod.setPrecio(Float.parseFloat(txtPrecioProdNP.getText()));
                        prod.setExistencia(Integer.parseInt(spnExistenciaProdNP.getValue().toString()));
                        prod.setProveedorProd(cboxProveedorNP.getSelectedItem().toString());
                    } //Fin else
                    new NegocioProductos().PuenteProveedor(prod);
                    new NegocioProductos().PuenteCategorias(prod);
                    new NegocioProductos().PuenteGuardar(prod);
                    Limpiar();
                    LLenarTabla();
                    txtCodProdNP.grabFocus();

                }
                else{
                    JOptionPane.showMessageDialog(null, "El Producto ya existe... Verifique su codigo de producto");
                    LLenarTabla();
                    
                }
                
                
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarNPActionPerformed

    private void txtPrecioProdNPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioProdNPKeyTyped
        
        //Introducir solo valores numericos en el campo de precio
        
        char validar = evt.getKeyChar();

        if (Character.isLetter(validar)) {
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(null, "Introduzca solo valores numericos");

        }
    }//GEN-LAST:event_txtPrecioProdNPKeyTyped

    private void btnCancelarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNPActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnCancelarNPActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        
        if(evt.getButton()==1){
            try {
                
                txtCodProdNP.setEnabled(false);
                txtCodBarNP.setEnabled(false);
                btnGuardarNP.setEnabled(false);
                lblSele.setVisible(false);
                
                //Variable para saber la fila que selecciono el usuario
                int fila=tblProductos.getSelectedRow();
                //Variable para la existencia del producto
                int exis = Integer.parseInt(tblProductos.getValueAt(fila, 5).toString());
                
                //Se asigna a los txt´s corespondientes los valores de la fila y la columna (fila,columna)
                txtCodProdNP.setText(tblProductos.getValueAt(fila, 0).toString());
                txtCodBarNP.setText(tblProductos.getValueAt(fila, 1).toString());
                
                //Se cambia el numero de la categoria por el nombre para mostrarlo en el combobox
                prod.setNumCatego(tblProductos.getValueAt(fila, 2).toString());
                new NegocioProductos().PuenteNombreCategorias(prod);
                cboxCategoriaNP.setSelectedItem(prod.getCategoria());
                
                //Se asigna a los txt´s corespondientes los valores de la fila y la columna (fila,columna)
                txtDescripcionProdNP.setText(tblProductos.getValueAt(fila, 3).toString());
                txtPrecioProdNP.setText(tblProductos.getValueAt(fila, 4).toString());
                //Se le asigna el valor del spinner a la variable exis
                spnExistenciaProdNP.setValue(exis);
                
                //Se cambia el numero del proveedor por el nombre para mostrarlo en el combobox
                prod.setNumProveedorProd(tblProductos.getValueAt(fila, 6).toString());
                new NegocioProductos().PuenteNombreProveedores(prod);
                cboxProveedorNP.setSelectedItem(prod.getProveedorProd());
                
                btnEditarProducto.setEnabled(true);
               
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        if (txtCodProdNP.getText().length() == 0 || txtDescripcionProdNP.getText().length() == 0 || txtPrecioProdNP.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"El codigo del producto, la descripcion el precio y la existencia son campos obligatorios.");
        }
        else{
            
            try {
                
                if (txtCodBarNP.getText().length()!=0) {
                    prod.setIdProd(txtCodProdNP.getText().toUpperCase());
                    prod.setCodigoBar(txtCodBarNP.getText().toUpperCase());
                    prod.setCategoria(cboxCategoriaNP.getSelectedItem().toString());
                    prod.setDescripcion(txtDescripcionProdNP.getText().toUpperCase());
                    prod.setPrecio(Float.parseFloat(txtPrecioProdNP.getText()));
                    prod.setExistencia(Integer.parseInt(spnExistenciaProdNP.getValue().toString()));
                    prod.setProveedorProd(cboxProveedorNP.getSelectedItem().toString());
                } else {
                    prod.setIdProd(txtCodProdNP.getText().toUpperCase());
                    prod.setCodigoBar("SIN CODIGO");
                    prod.setCategoria(cboxCategoriaNP.getSelectedItem().toString());
                    prod.setDescripcion(txtDescripcionProdNP.getText().toUpperCase());
                    prod.setPrecio(Float.parseFloat(txtPrecioProdNP.getText()));
                    prod.setExistencia(Integer.parseInt(spnExistenciaProdNP.getValue().toString()));
                    prod.setProveedorProd(cboxProveedorNP.getSelectedItem().toString());
                } //Fin else
                new NegocioProductos().PuenteProveedor(prod);
                new NegocioProductos().PuenteCategorias(prod);
                new NegocioProductos().PuenteEditarProducto(prod);
                Limpiar();
                LLenarTabla();
                btnEditarProducto.setEnabled(false);
                btnGuardarNP.setEnabled(true);
                lblSele.setEnabled(true);
                txtCodProdNP.setEnabled(true);
                txtCodBarNP.setEnabled(true);
                txtCodProdNP.grabFocus();

                
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
                Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
        
        String v = JOptionPane.showInputDialog(null,"Introduzca el nombre del Producto");
        
        if(v != null){
            try {
                ProductosSQL prod = new ProductosSQL();
                prod.setBus(v);

                NegocioProductos np = new NegocioProductos();
                np.PuenteMostrarTablaBuscar(tblProductos,prod);

                btnCancelarBusProd.setVisible(true);

            } catch (IllegalAccessException | ClassNotFoundException | InstantiationException ex) {
                JOptionPane.showMessageDialog(null,"Error "+ex);
            }
        }
        
    }//GEN-LAST:event_btnBuscarProdActionPerformed

    private void btnCancelarBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBusProdActionPerformed
        
        try {
            LLenarTabla();
            btnCancelarBusProd.setVisible(false);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCancelarBusProdActionPerformed

    
    private void Limpiar() {
        txtCodProdNP.setText(null);
        txtCodBarNP.setText(null);
        cboxCategoriaNP.setSelectedItem("Proveedor Conocido");
        txtDescripcionProdNP.setText(null);
        txtPrecioProdNP.setText(null);
        spnExistenciaProdNP.setValue(1);
        cboxProveedorNP.setSelectedItem("General");
        
        txtCodProdNP.grabFocus();
        
    }
    
    private void LlenarComboCatego() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        NegocioProductos nplt = new NegocioProductos();
        JComboBox PuenteCategoriasCombo = nplt.PuenteCategoriasCombo(cboxCategoriaNP);
    }
    
    private void LlenarComboProvee() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        NegocioProductos nplt = new NegocioProductos();
        JComboBox PuenteProveedoresCombo = nplt.PuenteProveedoresCombo(cboxProveedorNP);
    }
    
    private void LLenarTabla() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        NegocioProductos nplt = new NegocioProductos();
        nplt.PuenteMostrarTabla(tblProductos);
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
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new NuevoProducto().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(NuevoProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnCancelarBusProd;
    private javax.swing.JButton btnCancelarNP;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnGuardarNP;
    private javax.swing.JComboBox<String> cboxCategoriaNP;
    private javax.swing.JComboBox<String> cboxProveedorNP;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblSele;
    private javax.swing.JSpinner spnExistenciaProdNP;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCodBarNP;
    private javax.swing.JTextField txtCodProdNP;
    private javax.swing.JTextField txtDescripcionProdNP;
    private javax.swing.JTextField txtPrecioProdNP;
    // End of variables declaration//GEN-END:variables
}
