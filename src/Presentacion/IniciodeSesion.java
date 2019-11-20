package Presentacion;

import Datos.IniciosDeSesion;
import Negocios.NegocioSesiones;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IniciodeSesion extends javax.swing.JFrame {
    
    IniciosDeSesion ini = new IniciosDeSesion();
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public IniciodeSesion() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        new NegocioSesiones().PuenteConectarDB();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        txtUsuario.setText("RefaAdmin");
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 178, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        txtPassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        txtPassword.setText("12345");
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 180, 30));

        btnIniciarSesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario2.png"))); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        btnSalir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close Window_25px.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Stop Squared_25px.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel3.setText("Inicio de Sesion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        
        int var = evt.getKeyCode();
        
        if(var == KeyEvent.VK_ENTER){
            if(txtUsuario.getText().length() == 0 || txtPassword.getPassword().length == 0){
            JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio, introduzca un Usuario y Contraseña","Usuario y contraseña",1);
            }
            else{
                try{
                    ini.setUsuario(txtUsuario.getText());
                    ini.setContraseña(txtPassword.getText());
                
                    new NegocioSesiones().PuenteInicioSesion(ini);
                
                    if(ini.isStatus()== true){
                        MenuPrincipal menu = new MenuPrincipal();
                        menu.setVisible(true);    
                        this.dispose();
                    }
                    else{
                    JOptionPane.showMessageDialog(null, "No entro");
                    }
                }
                catch(HeadlessException | ClassNotFoundException | IllegalAccessException | InstantiationException e){
                JOptionPane.showMessageDialog(null, "Error al iniciar Sesion");
                }
            }
        }
        
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        int var = evt.getKeyCode();
        
        if(var == KeyEvent.VK_ENTER){
            txtPassword.grabFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        
        if(txtUsuario.getText().length() == 0 || txtPassword.getPassword().length == 0){
            JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio, introduzca un Usuario y Contraseña","Usuario y contraseña",1);
        }
        else{
            try{
                ini.setUsuario(txtUsuario.getText());
                ini.setContraseña(txtPassword.getText());
                
                new NegocioSesiones().PuenteInicioSesion(ini);
                
                if(ini.isStatus()== true){
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.setVisible(true);    
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrectos");
                }
            }
            catch(HeadlessException | ClassNotFoundException | IllegalAccessException | InstantiationException e){
                JOptionPane.showMessageDialog(null, "Error al iniciar Sesion");
            }
        }
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new IniciodeSesion().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(IniciodeSesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
