package Interfaz;

import codigo.*;
import javax.swing.*;

public class AdministrarCatalogoP extends javax.swing.JFrame {

    CatalogoEstampa c1 = new CatalogoEstampa(null, null, null, 0, null);

    public AdministrarCatalogoP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ADMIMISTRAR CATALOGOS DE ESTAMPAS");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CategoriaTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AgregarBoton = new javax.swing.JButton();
        SalirBoton = new javax.swing.JButton();
        OcultarBoton = new javax.swing.JButton();
        RestaurarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        CategoriaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Buscar Catalogo");

        AgregarBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AgregarBoton.setText("Agregar");
        AgregarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBotonActionPerformed(evt);
            }
        });

        SalirBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SalirBoton.setText("Volver");
        SalirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBotonActionPerformed(evt);
            }
        });

        OcultarBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OcultarBoton.setText("Ocultar");
        OcultarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcultarBotonActionPerformed(evt);
            }
        });

        RestaurarBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RestaurarBoton.setText("Restaurar");
        RestaurarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CategoriaTxt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AgregarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OcultarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RestaurarBoton)
                        .addGap(18, 18, 18)
                        .addComponent(SalirBoton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoriaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarBoton)
                    .addComponent(SalirBoton)
                    .addComponent(OcultarBoton)
                    .addComponent(RestaurarBoton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBotonActionPerformed
        MenuAdminP p1 = new MenuAdminP();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirBotonActionPerformed

    private void AgregarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBotonActionPerformed
        if (!CategoriaTxt.getText().equals("")) {
            int confirmacionCompra = JOptionPane.showConfirmDialog(null, "¿Estas "
                    + "seguro de agregar esta categoria: "
                    + CategoriaTxt.getText() + " ?");
            if (confirmacionCompra == JOptionPane.YES_OPTION) {
                if (c1.revisarCategoria(CategoriaTxt.getText()) == false && c1.RevisarOcultacionCategoria(CategoriaTxt.getText()) == false) {
                    c1.almacenarCategoria(CategoriaTxt.getText());
                    JOptionPane.showMessageDialog(rootPane, "Se ha agregado una nueva categoria");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Esta categoria ya existe o esta oculta");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite una categoria para agregar");
        }
    }//GEN-LAST:event_AgregarBotonActionPerformed

    private void OcultarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcultarBotonActionPerformed
        if (!CategoriaTxt.getText().equals("")) {
            int confirmacionCompra = JOptionPane.showConfirmDialog(null, "¿Estas "
                    + "seguro de ocultar esta categoria: "
                    + CategoriaTxt.getText() + " ?");
            if (confirmacionCompra == JOptionPane.YES_OPTION) {
                if (c1.OcultarCategoria(CategoriaTxt.getText()) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Se oculto la categoria digitada");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No digito una categoria almacenada");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite una categoria para ocultar");
        }
    }//GEN-LAST:event_OcultarBotonActionPerformed

    private void RestaurarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurarBotonActionPerformed
        if (!CategoriaTxt.getText().equals("")) {
            int confirmacionCompra = JOptionPane.showConfirmDialog(null, "¿Estas "
                    + "seguro de agregar esta categoria: "
                    + CategoriaTxt.getText() + " ?");
            if (confirmacionCompra == JOptionPane.YES_OPTION) {
                if (c1.TraerCatalogo(CategoriaTxt.getText()) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Se restauro al categoria digitada");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No existe la categoria digitada para resturar");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite una categoria para restaurar");
        }
    }//GEN-LAST:event_RestaurarBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBoton;
    private javax.swing.JTextField CategoriaTxt;
    private javax.swing.JButton OcultarBoton;
    private javax.swing.JButton RestaurarBoton;
    private javax.swing.JButton SalirBoton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
