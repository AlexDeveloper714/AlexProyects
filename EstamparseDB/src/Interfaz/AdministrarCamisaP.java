package Interfaz;

import codigo.*;
import javax.swing.*;

public class AdministrarCamisaP extends javax.swing.JFrame {

    Compra c1 = new Compra();
    DatosRegistro d1 = new DatosRegistro();

    public AdministrarCamisaP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        CantidadBox.setVisible(false);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ADMIMISTRAR CAMISAS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoCamisetaTxt = new javax.swing.JTextField();
        AgregarBtn = new javax.swing.JButton();
        OcultarBtn = new javax.swing.JButton();
        RestarurarBtn = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        SeleccionBox = new javax.swing.JComboBox();
        DescuentoTxt = new javax.swing.JTextField();
        TipoDescuentoBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        CantidadBox = new javax.swing.JComboBox();
        CambiarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TipoCamisetaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        AgregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AgregarBtn.setText("Agregar");
        AgregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBtnActionPerformed(evt);
            }
        });

        OcultarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OcultarBtn.setText("Ocultar");
        OcultarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcultarBtnActionPerformed(evt);
            }
        });

        RestarurarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RestarurarBtn.setText("Restaurar");
        RestarurarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarurarBtnActionPerformed(evt);
            }
        });

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        SeleccionBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SeleccionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COLOR", "TALLA", "TIPO" }));

        TipoDescuentoBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TipoDescuentoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de pago", "Cantidad" }));
        TipoDescuentoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDescuentoBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Descuentos");

        CantidadBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CantidadBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10-50", "50-100", "100-1000" }));

        CambiarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CambiarBtn.setText("Cambiar");
        CambiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TipoCamisetaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(SeleccionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(VolverBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AgregarBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OcultarBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RestarurarBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DescuentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CambiarBtn))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TipoDescuentoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CantidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoCamisetaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeleccionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OcultarBtn)
                    .addComponent(RestarurarBtn)
                    .addComponent(VolverBtn)
                    .addComponent(AgregarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescuentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoDescuentoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CambiarBtn))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        dispose();
        MenuAdminP p1 = new MenuAdminP();
        p1.setVisible(true);
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void AgregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBtnActionPerformed
        String Info = TipoCamisetaTxt.getText();
        String seleccion = SeleccionBox.getSelectedItem().toString();
        if (!"".equals(Info)) {
            int confirmacionCompra = JOptionPane.showConfirmDialog(null,
                    "¿Estas seguro de agregar  " + seleccion
                    + " el cual el valor es: " + Info + " ?");
            if (confirmacionCompra == JOptionPane.YES_OPTION) {
                if (!d1.verificarDatos(Info, seleccion)) {
                    d1.agregarDatos(Info, seleccion);
                    JOptionPane.showMessageDialog(rootPane, "Tus datos ya fueron agregados...");
                    TipoCamisetaTxt.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Sus datos estan ocultos o ya existen en el sistema");
                    TipoCamisetaTxt.setText("");
                }
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite datos para proseguir");
        }
    }//GEN-LAST:event_AgregarBtnActionPerformed

    private void OcultarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcultarBtnActionPerformed
        String Info = TipoCamisetaTxt.getText();
        String seleccion = SeleccionBox.getSelectedItem().toString();
        if (!"".equals(Info)) {
            int confirmacionCompra = JOptionPane.showConfirmDialog(null,
                    "¿Estas seguro de ocultar la " + seleccion
                    + " el cual el valor es: " + Info + " ?");
            if (confirmacionCompra == JOptionPane.YES_OPTION) {
                if (d1.ocultarDatos(Info, seleccion)) {
                    JOptionPane.showMessageDialog(rootPane, "Tus datos se ocultaron con exito...");
                    TipoCamisetaTxt.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Tus datos ya estaban ocultos");
                    TipoCamisetaTxt.setText("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite datos para proseguir");
        }
    }//GEN-LAST:event_OcultarBtnActionPerformed

    private void RestarurarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarurarBtnActionPerformed
        String Info = TipoCamisetaTxt.getText();
        String seleccion = SeleccionBox.getSelectedItem().toString();
        if (!"".equals(Info)) {
            int confirmacionCompra = JOptionPane.showConfirmDialog(null,
                    "¿Estas seguro de restaurar la " + seleccion
                    + " el cual el valor es: " + Info + " ?");
            if (confirmacionCompra == JOptionPane.YES_OPTION) {
                if (d1.restaurarDatos(Info, seleccion)) {
                    JOptionPane.showMessageDialog(rootPane, "Tus datos se restauraron con exito...");
                    TipoCamisetaTxt.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Tus datos ya estaban restaurados");
                    TipoCamisetaTxt.setText("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite datos para proseguir");
        }
    }//GEN-LAST:event_RestarurarBtnActionPerformed
    static boolean SiCantidad = false;
    private void TipoDescuentoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDescuentoBoxActionPerformed
        switch (TipoDescuentoBox.getSelectedItem().toString()) {
            case "Cantidad":
                CantidadBox.setVisible(true);
                SiCantidad = true;
                break;
            default:
                CantidadBox.setVisible(false);
                break;

        }
    }//GEN-LAST:event_TipoDescuentoBoxActionPerformed

    private void CambiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarBtnActionPerformed
        String Filtro = CantidadBox.getSelectedItem().toString();
        try {
            int Descuento = Integer.parseInt(DescuentoTxt.getText());
            if (Descuento > 0 && Descuento <= 15) {
                if (SiCantidad == true) {
                    SiCantidad = false;
                    int confirmacionCompra = JOptionPane.showConfirmDialog(null,
                            "¿Estas seguro de poner descuento de " + Descuento
                            + " % para los valores de: " + Filtro + " ?");
                    if (confirmacionCompra == JOptionPane.YES_OPTION) {
                        c1.SetearDescuentoCantidad(Descuento, Filtro);
                    }
                } else {
                    int confirmacionCompra = JOptionPane.showConfirmDialog(null,
                            "¿Estas seguro de poner descuento de " + Descuento
                            + " % para los tipos de pago(Credito)?");
                    if (confirmacionCompra == JOptionPane.YES_OPTION) {
                        c1.SetearDescuentoTipoPago(Descuento);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "No digite descuentos mayores a 15");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Digite números para los descuentos...");
        }

    }//GEN-LAST:event_CambiarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBtn;
    private javax.swing.JButton CambiarBtn;
    private javax.swing.JComboBox CantidadBox;
    private javax.swing.JTextField DescuentoTxt;
    private javax.swing.JButton OcultarBtn;
    private javax.swing.JButton RestarurarBtn;
    private javax.swing.JComboBox SeleccionBox;
    private javax.swing.JTextField TipoCamisetaTxt;
    private javax.swing.JComboBox TipoDescuentoBox;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
