package Interfaz;

import codigo.*;
import javax.swing.*;

public class MenuAdminP extends javax.swing.JFrame {

    DatosEstampa Obtenerdatos = new DatosEstampa();

    public MenuAdminP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU ADMINISTRADOR");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAdministrarUsuarios = new javax.swing.JButton();
        botonEstadicasDeCompra = new javax.swing.JButton();
        botonAdministrarCatalogosDeEstampas = new javax.swing.JButton();
        botonTerminarSeccion = new javax.swing.JButton();
        AdministrarCamisetaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        botonAdministrarUsuarios.setText("Administrar Usuarios");
        botonAdministrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministrarUsuariosActionPerformed(evt);
            }
        });

        botonEstadicasDeCompra.setText("Estadisticas de Compra");
        botonEstadicasDeCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadicasDeCompraActionPerformed(evt);
            }
        });

        botonAdministrarCatalogosDeEstampas.setText("Administrar catalogos de estampas");
        botonAdministrarCatalogosDeEstampas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministrarCatalogosDeEstampasActionPerformed(evt);
            }
        });

        botonTerminarSeccion.setText("Terminar Sección");
        botonTerminarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarSeccionActionPerformed(evt);
            }
        });

        AdministrarCamisetaBtn.setText("Administrar Camisetas");
        AdministrarCamisetaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrarCamisetaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAdministrarCatalogosDeEstampas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEstadicasDeCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAdministrarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonTerminarSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdministrarCamisetaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AdministrarCamisetaBtn, botonAdministrarCatalogosDeEstampas});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAdministrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEstadicasDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAdministrarCatalogosDeEstampas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdministrarCamisetaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonTerminarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AdministrarCamisetaBtn, botonAdministrarCatalogosDeEstampas});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTerminarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarSeccionActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesion?");
        if (a == JOptionPane.YES_OPTION) {
            Ingreso pantallaIngreso = new Ingreso();
            pantallaIngreso.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botonTerminarSeccionActionPerformed

    private void botonAdministrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministrarUsuariosActionPerformed
        dispose();
        AdministrarUsuarioP adminUs = new AdministrarUsuarioP();
        adminUs.setVisible(true);
    }//GEN-LAST:event_botonAdministrarUsuariosActionPerformed

    private void botonAdministrarCatalogosDeEstampasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministrarCatalogosDeEstampasActionPerformed
        AdministrarCatalogoP p1 = new AdministrarCatalogoP();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonAdministrarCatalogosDeEstampasActionPerformed

    private void botonEstadicasDeCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadicasDeCompraActionPerformed
        if (Obtenerdatos.revisarDatos()) {
            EstadisticasCompraP p1 = new EstadisticasCompraP();
            p1.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay camisetas vendidas...");
        }
    }//GEN-LAST:event_botonEstadicasDeCompraActionPerformed

    private void AdministrarCamisetaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrarCamisetaBtnActionPerformed
        dispose();
        AdministrarCamisaP p1 = new AdministrarCamisaP();
        p1.setVisible(true);
    }//GEN-LAST:event_AdministrarCamisetaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdministrarCamisetaBtn;
    private javax.swing.JButton botonAdministrarCatalogosDeEstampas;
    private javax.swing.JButton botonAdministrarUsuarios;
    private javax.swing.JButton botonEstadicasDeCompra;
    private javax.swing.JButton botonTerminarSeccion;
    // End of variables declaration//GEN-END:variables
}
