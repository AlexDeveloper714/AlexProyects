
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("CONVERSION INFIJO");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoInfijoTxt = new javax.swing.JTextField();
        OperarBtn = new javax.swing.JButton();
        OperacionesTxt = new javax.swing.JTextArea();
        OperacionesTxt1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoInfijoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TextoInfijoTxt.setAutoscrolls(false);

        OperarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OperarBtn.setText("Cambiar y Operar");
        OperarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperarBtnActionPerformed(evt);
            }
        });

        OperacionesTxt.setEditable(false);
        OperacionesTxt.setColumns(20);
        OperacionesTxt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        OperacionesTxt.setRows(5);
        OperacionesTxt.setAutoscrolls(false);
        OperacionesTxt.setBorder(null);
        OperacionesTxt.setFocusable(false);
        OperacionesTxt.setVerifyInputWhenFocusTarget(false);

        OperacionesTxt1.setEditable(false);
        OperacionesTxt1.setColumns(20);
        OperacionesTxt1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        OperacionesTxt1.setRows(5);
        OperacionesTxt1.setText("Digite una expresion infija para\nconvertir a posfija y prefija\n(cada termino debe estar \nseparado de espacios)...");
        OperacionesTxt1.setAutoscrolls(false);
        OperacionesTxt1.setBorder(null);
        OperacionesTxt1.setFocusable(false);
        OperacionesTxt1.setRequestFocusEnabled(false);
        OperacionesTxt1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OperacionesTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoInfijoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OperarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OperacionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OperacionesTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoInfijoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OperarBtn)
                .addGap(18, 18, 18)
                .addComponent(OperacionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    OperarPostPre cambiar = new OperarPostPre();


    private void OperarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperarBtnActionPerformed
        String infijo = TextoInfijoTxt.getText();
        String [] expresion = infijo.replaceAll(" +"," ").trim().split(" ");
        if (cambiar.VerficarInfija(infijo)) {
            OperacionesTxt.setText("Postfijo: "+cambiar.resultadoPostFijo(infijo)+"\n\nPrefijo: "+cambiar.cambiarAPreB(infijo)); 
        }else{
            OperacionesTxt.setText("No es una expresion infija, \ningresela de nuevo");
            TextoInfijoTxt.setText(" ");
        }
    }//GEN-LAST:event_OperarBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea OperacionesTxt;
    private javax.swing.JTextArea OperacionesTxt1;
    private javax.swing.JButton OperarBtn;
    private javax.swing.JTextField TextoInfijoTxt;
    // End of variables declaration//GEN-END:variables
}
