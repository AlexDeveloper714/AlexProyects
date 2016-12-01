package Interfaz;

import codigo.*;
import javax.swing.*;

public class MenuArtistaP extends javax.swing.JFrame {

    DatosEstampa revisarEstampa = new DatosEstampa();

    public MenuArtistaP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setTitle("MENU ARTISTA");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCargarEstampa = new javax.swing.JButton();
        botonEditarDatos = new javax.swing.JButton();
        botonAdministrarEstampas = new javax.swing.JButton();
        botonTerminarSeccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        botonCargarEstampa.setText("Cargar Estampa");
        botonCargarEstampa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarEstampaActionPerformed(evt);
            }
        });

        botonEditarDatos.setText("Editar datos");
        botonEditarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarDatosActionPerformed(evt);
            }
        });

        botonAdministrarEstampas.setText("Administrar Estampas");
        botonAdministrarEstampas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministrarEstampasActionPerformed(evt);
            }
        });

        botonTerminarSeccion.setText("Terminar sección");
        botonTerminarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarSeccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAdministrarEstampas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEditarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCargarEstampa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonTerminarSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCargarEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAdministrarEstampas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonTerminarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarEstampaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarEstampaActionPerformed
        if (revisarEstampa.buscarCategoria()) {
            CargarEstampaP cE = new CargarEstampaP();
            cE.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se pueden cargar Estampas porque todavia no hay categorias...");
        }
    }//GEN-LAST:event_botonCargarEstampaActionPerformed

    private void botonTerminarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarSeccionActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesion?");
        if (a == JOptionPane.YES_OPTION) {
            Ingreso pantallaIngreso = new Ingreso();
            pantallaIngreso.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botonTerminarSeccionActionPerformed

    private void botonEditarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarDatosActionPerformed
        EditarDatosP pantallaCambio = new EditarDatosP();
        pantallaCambio.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonEditarDatosActionPerformed

    private void botonAdministrarEstampasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministrarEstampasActionPerformed
        if (revisarEstampa.buscarEstampa()) {
            AdministrarEstampaP p1 = new AdministrarEstampaP();
            p1.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay estampas almacenadas en el sistema");
        }
    }//GEN-LAST:event_botonAdministrarEstampasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdministrarEstampas;
    private javax.swing.JButton botonCargarEstampa;
    private javax.swing.JButton botonEditarDatos;
    private javax.swing.JButton botonTerminarSeccion;
    // End of variables declaration//GEN-END:variables
}
