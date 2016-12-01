package Interfaz;

import codigo.*;
import javax.swing.*;

public class Ingreso extends javax.swing.JFrame {

    Compra c1 = new Compra();

    public Ingreso() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("INGRESO APLICACIÓN");
        confirmarIngreso.agregarUsuario();
        c1.TallasAlamcenadas();
        c1.SeteoDescuentoSistema();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JLabel();
        cajonUsuario = new javax.swing.JTextField();
        botonIngreso = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JButton();
        txtLogo = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        cajonPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsuario.setText("Usuario");

        txtContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtContraseña.setText("Contraseña");

        botonIngreso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIngreso.setText("Ingresar");
        botonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresoActionPerformed(evt);
            }
        });

        botonRegistrarse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        txtLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/logo.png"))); // NOI18N

        botonSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(txtLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajonUsuario)
                            .addComponent(cajonPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonRegistrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(cajonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtContraseña))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cajonPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Registro confirmarIngreso = new Registro();
    private void botonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresoActionPerformed

        String usuario = cajonUsuario.getText();
        String contraseña = new String(cajonPassword.getPassword());
        boolean ingreso = confirmarIngreso.ingresarSistema(usuario, contraseña);
        //Confirmacion de ingreso
        if (ingreso == false) {
            JOptionPane.showMessageDialog(rootPane, "Ingreso mal los datos o no esta registrado, intentelo de nuevo", "ERROR", 2);
            cajonUsuario.setText("");
            cajonPassword.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Felicidades Ingreso al sistema", "BIENVENIDO", 1);
            if (Registro.x == 2) {
                /*Es artista*/
                dispose();
                MenuArtistaP artistaP = new MenuArtistaP();
                artistaP.setVisible(true);
            }
            if (Registro.x == 1) {
                /*Es cliente*/
                dispose();
                MenuClienteP clienteP = new MenuClienteP();
                clienteP.setVisible(true);
            }
            if (Registro.x == 0) {
                MenuAdminP AdminP = new MenuAdminP();
                AdminP.setVisible(true);
                dispose();
            }

        }
    }//GEN-LAST:event_botonIngresoActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        RegistroP panelRegistro = new RegistroP();
        panelRegistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Desea sair del sistema?");
        if (a == JOptionPane.YES_OPTION) {
            dispose();
            JOptionPane.showMessageDialog(null, "Gracias por ingresar a nuestra aplicación"
                    + "\nlamentamos nuestra ineptitud pero todavia no"
                    + " nos enseñan base de datos."
                    + "\nasi que sus datos se borraran al salir...XDDD");
            System.exit(0);
        }
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngreso;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPasswordField cajonPassword;
    private javax.swing.JTextField cajonUsuario;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtLogo;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
