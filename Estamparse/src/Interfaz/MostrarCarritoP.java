package Interfaz;

import codigo.*;
import java.awt.*;
import javax.swing.*;

public class MostrarCarritoP extends javax.swing.JFrame {

    String Todo = "";
    static int recorrido = 0;
    CatalogoCamiseta camiseta = new CatalogoCamiseta(0, null, null, null, null, null, 0, Registro.UsuarioActivo);
    Compra c2 = new Compra();

    public MostrarCarritoP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("CARRITO");
        TodoTxt.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagenEstampa = new javax.swing.JLabel();
        PrevBoton = new javax.swing.JButton();
        NextBoton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        VolverBtn = new javax.swing.JButton();
        ComprarBtn = new javax.swing.JButton();
        CantidadTxt = new javax.swing.JTextField();
        TodoTxt = new javax.swing.JTextArea();
        comboTipoPago = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        ImagenEstampa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PrevBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrevBoton.setText("<");
        PrevBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevBotonActionPerformed(evt);
            }
        });

        NextBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NextBoton.setText(">");
        NextBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBotonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cantidad");

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        ComprarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComprarBtn.setText("Comprar");
        ComprarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarBtnActionPerformed(evt);
            }
        });

        TodoTxt.setEditable(false);
        TodoTxt.setBackground(new java.awt.Color(214, 217, 223));
        TodoTxt.setColumns(20);
        TodoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TodoTxt.setRows(5);
        TodoTxt.setAutoscrolls(false);
        TodoTxt.setBorder(null);
        TodoTxt.setCaretColor(new java.awt.Color(240, 240, 240));
        TodoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TodoTxt.setDisabledTextColor(new java.awt.Color(240, 240, 240));
        TodoTxt.setFocusable(false);
        TodoTxt.setRequestFocusEnabled(false);
        TodoTxt.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        TodoTxt.setSelectionColor(new java.awt.Color(240, 240, 240));
        TodoTxt.setVerifyInputWhenFocusTarget(false);

        comboTipoPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboTipoPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Debito", "Credito" }));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de tarjeta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CantidadTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(comboTipoPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PrevBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ImagenEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NextBoton))
                            .addComponent(TodoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VolverBtn)
                .addGap(29, 29, 29)
                .addComponent(ComprarBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagenEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrevBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TodoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverBtn)
                    .addComponent(ComprarBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        dispose();
        MenuClienteP p1 = new MenuClienteP();
        p1.setVisible(true);
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void ComprarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarBtnActionPerformed
        try {
            int Cantidad = Integer.parseInt(CantidadTxt.getText());
            int a = 0;
            if (Cantidad > 0 && Cantidad <= 1000) {
                double compras = c2.calcularDatos(CatalogoCamiseta.tallaActual, comboTipoPago.getSelectedItem().toString(), CatalogoCamiseta.PrecioActual, Cantidad);
                int confirmacionCompra = JOptionPane.showConfirmDialog(NextBoton, "El precio de la camiseta/s es: $" + compras + "\nDesea continuar con la compra?", "Confirmacion de compra", 1);
                if (confirmacionCompra == JOptionPane.YES_OPTION) {
                    Compra.cantidadCompras += compras;
                    Compra.cantidadCamisetas += Cantidad;
                    JOptionPane.showMessageDialog(NextBoton, "Su compra llegara es de: " + a
                            + "\n llegara en 5 dias");
                }
            } else {
                JOptionPane.showMessageDialog(NextBoton, "Digite solo entre 1 a 1000");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(NextBoton, "digite solo números, no letras o simbolos");
        }

    }//GEN-LAST:event_ComprarBtnActionPerformed

    private void NextBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBotonActionPerformed
        if (recorrido < CatalogoCamiseta.CarritoActual) {
            ImageIcon imagen2 = new ImageIcon(camiseta.ObtenerCamisaIzqDer(recorrido).getPath());
            Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(ImagenEstampa.getWidth(), ImagenEstampa.getHeight(), Image.SCALE_DEFAULT));
            ImagenEstampa.setIcon(icono);
            Todo = "Tipo Camiseta: " + CatalogoCamiseta.tipoCamisetaActual
                    + "\n\nId carrito  " + CatalogoCamiseta.idCamisaActual
                    + "\n\nTalla: " + CatalogoCamiseta.tallaActual
                    + "\n\nColor " + CatalogoCamiseta.colorActual
                    + "\n\nNombre Estampa: " /* + CatalogoCamiseta.PosicionActual*/
                    + "\n\nPosicion Estampa: " + CatalogoCamiseta.PosicionActual
                    + "\n\nPrecio Camiseta: " + CatalogoCamiseta.PrecioActual;
            TodoTxt.setText(Todo);
            recorrido++;
        }
        if (recorrido == CatalogoCamiseta.CarritoActual) {
            recorrido--;
            NextBoton.setEnabled(false);
        }
        if (recorrido >= 0) {
            PrevBoton.setEnabled(true);
        }
    }//GEN-LAST:event_NextBotonActionPerformed

    private void PrevBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevBotonActionPerformed
        if (recorrido < CatalogoCamiseta.CarritoActual && recorrido >= 0) {
            ImageIcon imagen2 = new ImageIcon(camiseta.ObtenerCamisaIzqDer(recorrido).getPath());
            Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(ImagenEstampa.getWidth(), ImagenEstampa.getHeight(), Image.SCALE_DEFAULT));
            ImagenEstampa.setIcon(icono);
            Todo = "Tipo Camiseta: " + CatalogoCamiseta.tipoCamisetaActual
                    + "\n\nId carrito  " + CatalogoCamiseta.idCamisaActual
                    + "\n\nTalla: " + CatalogoCamiseta.tallaActual
                    + "\n\nColor " + CatalogoCamiseta.colorActual
                    + "\n\nNombre Estampa: " /* + CatalogoCamiseta.PosicionActual*/
                    + "\n\nPosicion Estampa: " + CatalogoCamiseta.PosicionActual
                    + "\n\nPrecio Camiseta: " + CatalogoCamiseta.PrecioActual;
            TodoTxt.setText(Todo);
            recorrido--;
        }
        if (recorrido == -1) {
            recorrido++;
            PrevBoton.setEnabled(false);
        }
        if (recorrido < CatalogoCamiseta.CarritoActual) {
            NextBoton.setEnabled(true);
        }
    }//GEN-LAST:event_PrevBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantidadTxt;
    private javax.swing.JButton ComprarBtn;
    private javax.swing.JLabel ImagenEstampa;
    private javax.swing.JButton NextBoton;
    private javax.swing.JButton PrevBoton;
    private javax.swing.JTextArea TodoTxt;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JComboBox comboTipoPago;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
