package Interfaz;

import codigo.*;
import javax.swing.*;

public class EstadisticasCompraP extends javax.swing.JFrame {

    String Todo = "";
    DatosEstampa Obtenerdatos = new DatosEstampa();

    public EstadisticasCompraP() {
        initComponents();
        Obtenerdatos.obtenerDatos();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        Todo = "Cantidad de camisetas: " + DatosEstampa.cantidadCamisetas
                + "\n\nPrecio camisetas vendidas: " + DatosEstampa.dineroCompra;
        TodoTxt.setText(Todo);
        setTitle("ESTADISTICAS COMPRAS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VolverBtn = new javax.swing.JButton();
        TodoTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VolverBtn)
                    .addComponent(TodoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TodoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolverBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        MenuAdminP p1 = new MenuAdminP();
        p1.setVisible(true);
        DatosEstampa.cantidadCamisetas = 0;
        DatosEstampa.dineroCompra = 0;
        dispose();
    }//GEN-LAST:event_VolverBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TodoTxt;
    private javax.swing.JButton VolverBtn;
    // End of variables declaration//GEN-END:variables
}
