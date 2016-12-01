package Interfaz;

import codigo.*;
import javax.swing.*;

public class RegistroP extends javax.swing.JFrame {

    public RegistroP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("REGISTRO USUARIO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JLabel();
        txtUsuarioR = new javax.swing.JLabel();
        txtContraseñaR = new javax.swing.JLabel();
        txtConfirmacion = new javax.swing.JLabel();
        cajonUsuarioR = new javax.swing.JTextField();
        txtEmail = new javax.swing.JLabel();
        cajonEmail = new javax.swing.JTextField();
        comboTipoUsuario = new javax.swing.JComboBox();
        txtTipoUsuario = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JLabel();
        cajonNumeroCuenta = new javax.swing.JPasswordField();
        botonRegresar = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JButton();
        cajonNombre = new javax.swing.JTextField();
        cajonDocumento = new javax.swing.JTextField();
        cajonContraseñaR = new javax.swing.JPasswordField();
        cajonConfirmacion = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setText("Nombre");

        txtDocumento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDocumento.setText("Documento");

        txtUsuarioR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsuarioR.setText("Usuario");

        txtContraseñaR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtContraseñaR.setText("Contraseña");

        txtConfirmacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtConfirmacion.setText("Confirmar contraseña");

        cajonUsuarioR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setText("Email");

        cajonEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        comboTipoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Artista", "Cliente" }));
        comboTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoUsuarioActionPerformed(evt);
            }
        });

        txtTipoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTipoUsuario.setText("Tipos de usuario");

        txtNumeroCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumeroCuenta.setText("Numero de cuenta");

        cajonNumeroCuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        cajonNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajonDocumento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajonContraseñaR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajonConfirmacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addComponent(txtNombre)
                    .addComponent(txtDocumento)
                    .addComponent(txtUsuarioR)
                    .addComponent(txtTipoUsuario)
                    .addComponent(txtContraseñaR)
                    .addComponent(txtNumeroCuenta)
                    .addComponent(txtConfirmacion))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajonNumeroCuenta)
                    .addComponent(comboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(cajonNombre)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(cajonDocumento)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajonUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajonContraseñaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajonConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(cajonEmail)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cajonConfirmacion, cajonContraseñaR, cajonUsuarioR});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cajonNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cajonDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioR, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cajonUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContraseñaR, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(cajonContraseñaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajonConfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cajonEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajonNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Registro registrarUsuario = new Registro();
    Ingreso pantallaIngreso = new Ingreso();
    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        String nombre = cajonNombre.getText();
        String documento = cajonDocumento.getText();
        String usuario = cajonUsuarioR.getText();
        String contraseña = new String(cajonContraseñaR.getPassword());
        String confirmar = new String(cajonConfirmacion.getPassword());
        String email = cajonEmail.getText();
        String numeroCuenta = new String(cajonNumeroCuenta.getPassword());
        boolean Igual = registrarUsuario.buscarIgual(usuario);
//Guardar Registro
        if (nombre.equals("") || documento.equals("") || usuario.equals("") || contraseña.equals("") || email.equals("")) {
            JOptionPane.showMessageDialog(cajonDocumento, "Llene todos los campos por favor", "ERROR", 2);
        } else {
            if (contraseña.equals(confirmar)) {
                switch (comboTipoUsuario.getSelectedItem().toString()) {
                    case "Artista":
                        if (numeroCuenta.equals("")) {
                            JOptionPane.showMessageDialog(cajonDocumento, "Ingrese numero de cuenta", "ERROR", 2);
                        } else {
                            try {
                                if (Integer.parseInt(numeroCuenta) > 0) {
                                    /*ingresarUsuario(tipoUsuario,nombre,documento,username,password,Email,numeroCuenta)*/
                                    if (Igual == false) {
                                        int a = JOptionPane.showConfirmDialog(null, "¿Deseas registrarte como Artista con los siguientes datos?:"
                                                + "\nNombre: " + nombre
                                                + "\nDocumento: " + documento
                                                + "\nUsuario: " + usuario
                                                + "\nEmail: " + email);
                                        if (a == JOptionPane.YES_OPTION) {
                                            registrarUsuario.ingresarUsuario(nombre, documento, usuario, contraseña, email, numeroCuenta);
                                            //Mensaje de confirmacion
                                            JOptionPane.showMessageDialog(cajonDocumento, "El Artista se registro con los datos\n"
                                                    + "\nNombre: " + nombre
                                                    + "\nDocumento: " + documento
                                                    + "\nUsuario: " + usuario
                                                    + "\nEmail: " + email, "Registro realizado", 1);
                                            //Retorno a pantalla de logeo  
                                            pantallaIngreso.setVisible(true);
                                            dispose();
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(cajonDocumento, "El userName ya se uso");
                                        cajonUsuarioR.setText("");
                                    }

                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(rootPane, "Ingreso letras en el campo de numero de cuenta", "ERROR", 2);
                                cajonNumeroCuenta.setText("");
                            }

                        }
                        break;
                    default:
                        if (Igual == false) {
                            int a = JOptionPane.showConfirmDialog(null, "¿Deseas registrarte como Cliente con los siguientes datos?:"
                                    + "\nNombre: " + nombre
                                    + "\nDocumento: " + documento
                                    + "\nUsuario: " + usuario
                                    + "\nEmail: " + email);
                            if (a == JOptionPane.YES_OPTION) {
                                registrarUsuario.ingresarUsuario(nombre, documento, usuario, contraseña, email, numeroCuenta);
                                //Mensaje de confirmacion
                                JOptionPane.showMessageDialog(cajonDocumento, "El Usuario se registro con los datos\n"
                                        + "\nNombre: " + nombre
                                        + "\nDocumento: " + documento
                                        + "\nUsuario: " + usuario
                                        + "\nTipo de usuario: " + comboTipoUsuario.getSelectedItem()
                                        + "\nEmail: " + email, "Registro realizado", 1);
                                //Retorno a pantalla de logeo  
                                pantallaIngreso.setVisible(true);
                                dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(cajonDocumento, "El userName ya se uso");
                            cajonUsuarioR.setText("");
                        }
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Las contraseñas no coinciden, intentelo de nuevo", "ERROR", 2);
                cajonContraseñaR.setText("");
                cajonConfirmacion.setText("");
            }
        }
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "¿Deseas volver al menu principal?");
        if (a == JOptionPane.YES_OPTION) {
            pantallaIngreso.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void comboTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoUsuarioActionPerformed
        if (comboTipoUsuario.getSelectedItem().equals("Cliente")) {
            txtNumeroCuenta.setEnabled(false);
            cajonNumeroCuenta.setEnabled(false);
        } else {
            txtNumeroCuenta.setEnabled(true);
            cajonNumeroCuenta.setEnabled(true);
            cajonNumeroCuenta.setText("");
        }
    }//GEN-LAST:event_comboTipoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JPasswordField cajonConfirmacion;
    private javax.swing.JPasswordField cajonContraseñaR;
    private javax.swing.JTextField cajonDocumento;
    private javax.swing.JTextField cajonEmail;
    private javax.swing.JTextField cajonNombre;
    private javax.swing.JPasswordField cajonNumeroCuenta;
    private javax.swing.JTextField cajonUsuarioR;
    private javax.swing.JComboBox comboTipoUsuario;
    private javax.swing.JLabel txtConfirmacion;
    private javax.swing.JLabel txtContraseñaR;
    private javax.swing.JLabel txtDocumento;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtNumeroCuenta;
    private javax.swing.JLabel txtTipoUsuario;
    private javax.swing.JLabel txtUsuarioR;
    // End of variables declaration//GEN-END:variables
}
