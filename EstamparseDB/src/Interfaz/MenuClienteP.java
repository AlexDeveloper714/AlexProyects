package Interfaz;

import codigo.*;
import javax.swing.*;

public class MenuClienteP extends javax.swing.JFrame {

    DatosEstampa revisarEstampa = new DatosEstampa();

    public MenuClienteP() {

        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MENU CLIENTE");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCrearCamiseta = new javax.swing.JButton();
        botonEditarDatos = new javax.swing.JButton();
        botonTerminarSeccion = new javax.swing.JButton();
        CarritoBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        botonCrearCamiseta.setText("Crear Camiseta");
        botonCrearCamiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCamisetaActionPerformed(evt);
            }
        });

        botonEditarDatos.setText("Editar datos");
        botonEditarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarDatosActionPerformed(evt);
            }
        });

        botonTerminarSeccion.setText("Terminar seccion");
        botonTerminarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarSeccionActionPerformed(evt);
            }
        });

        CarritoBoton.setText("Mostrar Carrito");
        CarritoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarritoBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CarritoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(botonEditarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCrearCamiseta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonTerminarSeccion, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCrearCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEditarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CarritoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonTerminarSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void botonEditarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarDatosActionPerformed
        EditarDatosP pantallaCambio = new EditarDatosP();
        pantallaCambio.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonEditarDatosActionPerformed

    private void botonCrearCamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCamisetaActionPerformed
        if (revisarEstampa.buscarEstampa()) {
            ComprasP p1 = new ComprasP();
            p1.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No hay estampas para adquirir camisetas...");
        }


    }//GEN-LAST:event_botonCrearCamisetaActionPerformed


    private void CarritoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarritoBotonActionPerformed
        if (revisarEstampa.revisarCarrito(Ingreso.usuarioActivo)) {
            dispose();
            MostrarCarritoP c1 = new MostrarCarritoP();
            c1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(CarritoBoton, "No tienes camisetas en tus carritos");
        }
    }//GEN-LAST:event_CarritoBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarritoBoton;
    private javax.swing.JButton botonCrearCamiseta;
    private javax.swing.JButton botonEditarDatos;
    private javax.swing.JButton botonTerminarSeccion;
    // End of variables declaration//GEN-END:variables
}
