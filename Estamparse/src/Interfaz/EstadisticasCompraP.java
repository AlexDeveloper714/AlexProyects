package Interfaz;

import codigo.Compra;
import javax.swing.*;

public class EstadisticasCompraP extends javax.swing.JFrame {

    String Todo = "";

    public EstadisticasCompraP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        Todo = "Cantidad de camisetas: " + (int) Compra.cantidadCamisetas
                + "\n\nPrecio camisetas vendidas" + Compra.cantidadCompras;
        TodoTxt.setText(Todo);
        setTitle("ESTADISTICAS COMPRAS");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        TodoTxt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                    .addComponent(jButton3)
                    .addComponent(TodoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TodoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        int a = JOptionPane.showConfirmDialog(null, "¿Deseas volver al menu?");
//        if (a == JOptionPane.YES_OPTION) {
//
//        }
        MenuAdminP p1 = new MenuAdminP();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TodoTxt;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
