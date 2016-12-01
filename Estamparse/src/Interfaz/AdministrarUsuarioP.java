package Interfaz;

import codigo.*;
import javax.swing.*;

public class AdministrarUsuarioP extends javax.swing.JFrame {

    public AdministrarUsuarioP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ADMINISTRAR USUARIOS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTipoUsuario = new javax.swing.JLabel();
        combTipoUsuario = new javax.swing.JComboBox();
        txtUsername = new javax.swing.JLabel();
        cajonUsernameBusqueda = new javax.swing.JTextField();
        botonEliminarUsuario = new javax.swing.JButton();
        BotonVolver = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        txtTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTipoUsuario.setText("Tipos de usuario");

        combTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        combTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Artista", "Cliente" }));

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername.setText("Username del usuario");

        cajonUsernameBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        botonEliminarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonEliminarUsuario.setText("Eliminar Usuario");
        botonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarUsuarioActionPerformed(evt);
            }
        });

        BotonVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajonUsernameBusqueda)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoUsuario)
                            .addComponent(txtUsername)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonEliminarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonVolver)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(combTipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTipoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajonUsernameBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarUsuario)
                    .addComponent(BotonVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarUsuarioActionPerformed
        String userName = cajonUsernameBusqueda.getText();
        String tipousuario = combTipoUsuario.getSelectedItem().toString();
        Boolean confirmar = false;
        Registro eliminar = new Registro();
        if (!userName.equals("")) {
            switch (tipousuario) {
                case "Artista":
                    int a = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar al artista: "
                            + userName + " del sistema?");
                    if (a == JOptionPane.YES_OPTION) {
                        confirmar = eliminar.EliminarAdmin(tipousuario, userName);
                    }
                    break;
                default:
                    a = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar al cliente: "
                            + userName + " del sistema?");
                    if (a == JOptionPane.YES_OPTION) {
                        confirmar = eliminar.EliminarAdmin(tipousuario, userName);
                    }
                    break;
            }
            if (confirmar == true) {
                JOptionPane.showMessageDialog(rootPane, "Se elimino el " + tipousuario + " que busco");

            } else {
                JOptionPane.showMessageDialog(rootPane, "No hay usuario a eliminar");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite un username para eliminar");
        }

    }//GEN-LAST:event_botonEliminarUsuarioActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        dispose();
        MenuAdminP admin = new MenuAdminP();
        admin.setVisible(true);
    }//GEN-LAST:event_BotonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonVolver;
    private javax.swing.JButton botonEliminarUsuario;
    private javax.swing.JTextField cajonUsernameBusqueda;
    private javax.swing.JComboBox combTipoUsuario;
    private javax.swing.JLabel txtTipoUsuario;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
