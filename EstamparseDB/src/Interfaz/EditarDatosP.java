package Interfaz;

import codigo.*;
import javax.swing.*;

public class EditarDatosP extends javax.swing.JFrame {

    DatosRegistro actualizar = new DatosRegistro();

    public EditarDatosP() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("EDITAR DATOS");
        if (DatosRegistro.TipoUsuario.equals("Cliente")) {
            NumLab.setEnabled(false);
            NumeroCuentaTxt.setEnabled(false);
        } else {
            NumLab.setVisible(true);
            NumeroCuentaTxt.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreTxt = new javax.swing.JTextField();
        NombreLab = new javax.swing.JLabel();
        DocumentoTxt = new javax.swing.JTextField();
        DocLab = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JTextField();
        ContAntLab1 = new javax.swing.JLabel();
        ContLab = new javax.swing.JLabel();
        ContraseñaAntPass = new javax.swing.JPasswordField();
        ConfLab = new javax.swing.JLabel();
        ContraseñaPass = new javax.swing.JPasswordField();
        EmailLab = new javax.swing.JLabel();
        ConfirmarPass = new javax.swing.JPasswordField();
        NumLab = new javax.swing.JLabel();
        CambiarBtn = new javax.swing.JButton();
        VolverBoton = new javax.swing.JButton();
        NumeroCuentaTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(325, 285));
        setSize(new java.awt.Dimension(325, 285));

        NombreTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        NombreLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NombreLab.setText("Nombre");

        DocumentoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        DocLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DocLab.setText("Documento");

        EmailTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ContAntLab1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContAntLab1.setText("Antigua Contraseña");

        ContLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContLab.setText("Contraseña Nueva");

        ContraseñaAntPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ConfLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConfLab.setText("Confirmar Contraseña");

        ContraseñaPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        EmailLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailLab.setText("Email");

        ConfirmarPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        NumLab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NumLab.setText("Numero de Cuenta");

        CambiarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CambiarBtn.setText("Cambiar");
        CambiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarBtnActionPerformed(evt);
            }
        });

        VolverBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VolverBoton.setText("Volver");
        VolverBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBotonActionPerformed(evt);
            }
        });

        NumeroCuentaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreLab, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DocLab)
                            .addComponent(ContAntLab1)
                            .addComponent(ContLab)
                            .addComponent(ConfLab)
                            .addComponent(EmailLab)
                            .addComponent(NumLab))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContraseñaAntPass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContraseñaPass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumeroCuentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CambiarBtn)
                        .addGap(31, 31, 31)
                        .addComponent(VolverBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DocumentoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ContAntLab1)
                    .addComponent(ContraseñaAntPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ContLab)
                    .addComponent(ContraseñaPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ConfLab)
                    .addComponent(ConfirmarPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(EmailLab)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(NumLab))
                    .addComponent(NumeroCuentaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CambiarBtn)
                    .addComponent(VolverBoton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CambiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarBtnActionPerformed
        String nombre = NombreTxt.getText();
        String documento = DocumentoTxt.getText();
        String contraseñaAnt = new String(ContraseñaAntPass.getPassword());
        String contraseña = new String(ContraseñaPass.getPassword());
        String confirmar = new String(ConfirmarPass.getPassword());
        String email = EmailTxt.getText();
        String numeroCuenta = new String(NumeroCuentaTxt.getPassword());
        boolean Cambio = true;
        if ((!nombre.equals("")) || (!documento.equals("")
            || !contraseñaAnt.equals("") || !contraseña.equals("")
            || !confirmar.equals("") || !email.equals(""))) {
        if (contraseña.equals(confirmar)) {
            int a = JOptionPane.showConfirmDialog(null, "¿Deseas cambiar sus datos?");
            if (a == JOptionPane.YES_OPTION) {
                Cambio = actualizar.actualizarUsuarios(nombre, documento, DatosRegistro.UsuarioActivo, contraseña, contraseñaAnt, DatosRegistro.TipoUsuario, email, numeroCuenta);
                if (Cambio == true) {
                    JOptionPane.showMessageDialog(rootPane, "Tus datos como usuario ya cambiaron");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Su contraseña anterior es incorrecta");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite bien la contraseña a cambiar");
        }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Recuerde digitar todos sus datos");
        }
    }//GEN-LAST:event_CambiarBtnActionPerformed

    private void VolverBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBotonActionPerformed
        if (DatosRegistro.TipoUsuario.equals("Cliente")) {
            MenuClienteP volver = new MenuClienteP();
            volver.setVisible(true);
            dispose();
        } else {
            MenuArtistaP volver2 = new MenuArtistaP();
            volver2.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_VolverBotonActionPerformed
    Ingreso pantallaIngreso = new Ingreso();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarBtn;
    private javax.swing.JLabel ConfLab;
    private javax.swing.JPasswordField ConfirmarPass;
    private javax.swing.JLabel ContAntLab1;
    private javax.swing.JLabel ContLab;
    private javax.swing.JPasswordField ContraseñaAntPass;
    private javax.swing.JPasswordField ContraseñaPass;
    private javax.swing.JLabel DocLab;
    private javax.swing.JTextField DocumentoTxt;
    private javax.swing.JLabel EmailLab;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel NombreLab;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JLabel NumLab;
    private javax.swing.JPasswordField NumeroCuentaTxt;
    private javax.swing.JButton VolverBoton;
    // End of variables declaration//GEN-END:variables

}
