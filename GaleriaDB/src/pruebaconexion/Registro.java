package pruebaconexion;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class Registro extends javax.swing.JFrame {

    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("imagenes (.JPG,.PNG,.GIF,.JPEG)", "jpg", "png", "gif", "jpeg");
    FileInputStream imagen;
    boolean SiSelecciono = false;

    public Registro() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("REGISTRO BASE DE DATOS");
    }
    Prueba p = new Prueba();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreEstampaTxt = new javax.swing.JTextField();
        NombreArtistaTxt = new javax.swing.JTextField();
        CiudadTxt = new javax.swing.JTextField();
        RegistroBtn = new javax.swing.JButton();
        VerBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistroTxt = new javax.swing.JTextArea();
        SalirTxt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SeleccionarBtn = new javax.swing.JButton();
        Carrusel = new javax.swing.JLabel();
        DimensionesTxt = new javax.swing.JTextArea();
        VerGAleriaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(214, 217, 223));

        NombreEstampaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        NombreArtistaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        CiudadTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        RegistroBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegistroBtn.setText("Registrarse");
        RegistroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroBtnActionPerformed(evt);
            }
        });

        VerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VerBtn.setText("Ver registros");
        VerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBtnActionPerformed(evt);
            }
        });

        RegistroTxt.setEditable(false);
        RegistroTxt.setColumns(20);
        RegistroTxt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        RegistroTxt.setRows(5);
        RegistroTxt.setFocusable(false);
        jScrollPane1.setViewportView(RegistroTxt);

        SalirTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SalirTxt.setText("Salir");
        SalirTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NOMBRE ESTAMPA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CIUDAD");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE ARTISTA");

        SeleccionarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SeleccionarBtn.setText("SELECCIONAR ARCHIVO");
        SeleccionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarBtnActionPerformed(evt);
            }
        });

        Carrusel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DimensionesTxt.setEditable(false);
        DimensionesTxt.setBackground(new java.awt.Color(214, 217, 223));
        DimensionesTxt.setColumns(20);
        DimensionesTxt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        DimensionesTxt.setRows(5);
        DimensionesTxt.setAutoscrolls(false);
        DimensionesTxt.setBorder(null);
        DimensionesTxt.setFocusable(false);
        DimensionesTxt.setRequestFocusEnabled(false);
        DimensionesTxt.setVerifyInputWhenFocusTarget(false);

        VerGAleriaBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VerGAleriaBtn.setText("Ver galeria");
        VerGAleriaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerGAleriaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RegistroBtn)
                                .addGap(18, 18, 18)
                                .addComponent(VerBtn)
                                .addGap(18, 18, 18)
                                .addComponent(SalirTxt))
                            .addComponent(NombreEstampaTxt)
                            .addComponent(NombreArtistaTxt)
                            .addComponent(CiudadTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Carrusel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SeleccionarBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(VerGAleriaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DimensionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreEstampaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(SeleccionarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreArtistaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CiudadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegistroBtn)
                            .addComponent(VerBtn)
                            .addComponent(SalirTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Carrusel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DimensionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VerGAleriaBtn)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroBtnActionPerformed
        String nombreEstampa = NombreEstampaTxt.getText();
        String nombreArtista = NombreArtistaTxt.getText();
        String ciudad = CiudadTxt.getText();

        if (!nombreEstampa.equals("") && !nombreArtista.equals("") && !ciudad.equals("") && imagen != null) {
            int ingreso = JOptionPane.showConfirmDialog(null, "¿Desea registrarse con los "
                    + "siguientes datos?:"
                    + "\nEstampa: " + nombreEstampa
                    + "\nArtista: " + nombreArtista
                    + "\nCiudad: " + ciudad);
            if (ingreso == JOptionPane.YES_OPTION) {
                p.recojerDatos(nombreArtista, nombreEstampa, ciudad, imagen);
                JOptionPane.showMessageDialog(rootPane, "Felicidades, ya se registro");
                NombreEstampaTxt.setText(null);
                NombreArtistaTxt.setText(null);
                CiudadTxt.setText(null);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Recuerde digitar todo los datos y subir la estampa");
        }
    }//GEN-LAST:event_RegistroBtnActionPerformed

    private void VerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBtnActionPerformed
        String todo = p.verDatos();
        if (!todo.equals("")) {
            RegistroTxt.setText(todo);
        } else {
            RegistroTxt.setText("NO HAY REGISTROS AUN");

        }
    }//GEN-LAST:event_VerBtnActionPerformed

    private void SalirTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirTxtActionPerformed
        int salida = JOptionPane.showConfirmDialog(null, "¿Desea sair del sistema?");
        if (salida == JOptionPane.YES_OPTION) {
            dispose();
            JOptionPane.showMessageDialog(rootPane, "GRACIAS POR SALIR DEL SISTEMA");
            System.exit(0);
        }

    }//GEN-LAST:event_SalirTxtActionPerformed

    private void SeleccionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarBtnActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Debes subir imagenes de 226x226 pixeles");
        try {
            chooser.setAcceptAllFileFilterUsed(false);
            chooser.setFileFilter(filter);
            chooser.showOpenDialog(null);
            chooser.getSelectedFile().getPath();
            ImageIcon imagen2 = new ImageIcon(chooser.getSelectedFile().getPath());
            if (imagen2.getIconHeight() <= 226 && imagen2.getIconWidth() <= 226) {
                Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(Carrusel.getWidth(), Carrusel.getHeight(), Image.SCALE_DEFAULT));
                Carrusel.setIcon(icono);
                imagen = new FileInputStream(chooser.getSelectedFile().getPath());
                DimensionesTxt.setText("Alto:" + imagen2.getIconHeight() + "\nAncho:" + imagen2.getIconWidth());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Tu imagen supera los 226x226 pixeles");
                Carrusel.setIcon(null);
                DimensionesTxt.setText(null);
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_SeleccionarBtnActionPerformed

    private void VerGAleriaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerGAleriaBtnActionPerformed
        dispose();
        GaleriaDB p1 = new GaleriaDB();
        p1.setVisible(true);
    }//GEN-LAST:event_VerGAleriaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrusel;
    private javax.swing.JTextField CiudadTxt;
    private javax.swing.JTextArea DimensionesTxt;
    private javax.swing.JTextField NombreArtistaTxt;
    private javax.swing.JTextField NombreEstampaTxt;
    private javax.swing.JButton RegistroBtn;
    private javax.swing.JTextArea RegistroTxt;
    private javax.swing.JButton SalirTxt;
    private javax.swing.JButton SeleccionarBtn;
    private javax.swing.JButton VerBtn;
    private javax.swing.JButton VerGAleriaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
