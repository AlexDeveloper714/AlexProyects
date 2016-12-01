package Interfaz;

import codigo.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.*;

public class MostrarCarritoP extends javax.swing.JFrame {

    static int recorrido = 0;
    static int precio = 0;
    static String datos = "";
    DatosEstampa registroCarrito = new DatosEstampa();
    Compra compra = new Compra();

    static ArrayList<String> DatosTemp = new ArrayList<>();
    static ArrayList<Integer> PrecioTemp = new ArrayList<>();
    static ArrayList<BufferedImage> imagenTemp = new ArrayList<>();

    public MostrarCarritoP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("CARRITO");
        TodoTxt.setEditable(false);
        registroCarrito.recojerCarrito(Ingreso.usuarioActivo);
        DatosTemp = DatosEstampa.DatosCarrito;
        PrecioTemp = DatosEstampa.PrecioCarrito;
        imagenTemp = DatosEstampa.imagenCarrito;
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
        TipoPago = new javax.swing.JComboBox();
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

        TipoPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TipoPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Debito", "Credito" }));

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
                            .addComponent(TipoPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverBtn)
                    .addComponent(ComprarBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        DatosTemp.clear();
        PrecioTemp.clear();
        imagenTemp.clear();
        dispose();
        MenuClienteP p1 = new MenuClienteP();
        p1.setVisible(true);
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void ComprarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarBtnActionPerformed
        try {
            int Cantidad = Integer.parseInt(CantidadTxt.getText());
            double compras = 0;
            if (Cantidad > 0 && Cantidad <= 1000) {
                compras = compra.calcularCompra(precio, Cantidad, TipoPago.getSelectedItem().toString());
                if (precio > 0) {
                    int confirmacionCompra = JOptionPane.showConfirmDialog(NextBoton, "El precio de la camiseta/s es: $" + compras + "\nDesea continuar con la compra?", "Confirmacion de compra", 1);
                    if (confirmacionCompra == JOptionPane.YES_OPTION) {
                        if (registroCarrito.cambiarCarrito(Ingreso.usuarioActivo, datos, (int) compras, Cantidad)) {
                            JOptionPane.showMessageDialog(NextBoton, "Su compra llegara es de: "
                                    + "\n llegara en 5 dias");
                        }
                        precio = 0;
                        DatosTemp.clear();
                        PrecioTemp.clear();
                        imagenTemp.clear();
                        registroCarrito.recojerCarrito(Ingreso.usuarioActivo);
                        DatosTemp = DatosEstampa.DatosCarrito;
                        PrecioTemp = DatosEstampa.PrecioCarrito;
                        imagenTemp = DatosEstampa.imagenCarrito;
                        recorrido = 0;
                        if (imagenTemp.isEmpty()) {
                            JOptionPane.showMessageDialog(NextBoton, "Ya no posees nada en el carrito");
                            dispose();
                            MenuClienteP p1 = new MenuClienteP();
                            p1.setVisible(true);
                        }
                        ImagenEstampa.setIcon(null);
                        NextBoton.setEnabled(true);
                        PrevBoton.setEnabled(true);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(NextBoton, "Digite solo entre 1 a 1000");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(NextBoton, "digite solo números, no letras o simbolos");
        }

    }//GEN-LAST:event_ComprarBtnActionPerformed

    private void NextBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBotonActionPerformed
        if (recorrido < imagenTemp.size()) {
            ImageIcon imagen2 = new ImageIcon(imagenTemp.get(recorrido));
            Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(ImagenEstampa.getWidth(), ImagenEstampa.getHeight(), Image.SCALE_DEFAULT));
            ImagenEstampa.setIcon(icono);
            precio = PrecioTemp.get(recorrido);
            datos = DatosTemp.get(recorrido);
            TodoTxt.setText(DatosTemp.get(recorrido) + "\n\nPrecio: " + precio);
            recorrido++;
        }
        if (recorrido == imagenTemp.size()) {
            recorrido--;
            NextBoton.setEnabled(false);
        }
        if (recorrido >= 0) {
            PrevBoton.setEnabled(true);
        }
    }//GEN-LAST:event_NextBotonActionPerformed

    private void PrevBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevBotonActionPerformed
        if (recorrido < imagenTemp.size() && recorrido >= 0) {
            ImageIcon imagen2 = new ImageIcon(imagenTemp.get(recorrido));
            Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(ImagenEstampa.getWidth(), ImagenEstampa.getHeight(), Image.SCALE_DEFAULT));
            ImagenEstampa.setIcon(icono);
            precio = PrecioTemp.get(recorrido);
            datos = DatosTemp.get(recorrido);
            TodoTxt.setText(DatosTemp.get(recorrido) + "\n\nPrecio: " + precio);
            recorrido--;
        }
        if (recorrido == -1) {
            recorrido++;
            PrevBoton.setEnabled(false);
        }
        if (recorrido < imagenTemp.size()) {
            NextBoton.setEnabled(true);
        }
    }//GEN-LAST:event_PrevBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantidadTxt;
    private javax.swing.JButton ComprarBtn;
    private javax.swing.JLabel ImagenEstampa;
    private javax.swing.JButton NextBoton;
    private javax.swing.JButton PrevBoton;
    private javax.swing.JComboBox TipoPago;
    private javax.swing.JTextArea TodoTxt;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
