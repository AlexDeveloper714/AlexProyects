package pruebaconexion;

import java.awt.*;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;

public class GaleriaDB extends javax.swing.JFrame {

    static int recorrido = 0;
    static Boolean SiSelecciono = false;
    Prueba p = new Prueba();
    ArrayList<BufferedImage> imagenGaleriaTemp = new ArrayList<>();

    public GaleriaDB() {
        p.verDatos();
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("GALERIA IMAGENES");
        PrevBoton.setEnabled(false);
        NextBoton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagenEstampa = new javax.swing.JLabel();
        PrevBoton = new javax.swing.JButton();
        NextBoton = new javax.swing.JButton();
        VolverBtn = new javax.swing.JButton();
        ArtistaTxt = new javax.swing.JTextField();
        BuscarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BusquedaTxt = new javax.swing.JLabel();

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

        VolverBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VolverBtn.setText("Volver");
        VolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBtnActionPerformed(evt);
            }
        });

        ArtistaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BuscarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BuscarBtn.setText("Buscar");
        BuscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre Artista");

        BusquedaTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ArtistaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PrevBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImagenEstampa, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NextBoton))
                    .addComponent(BusquedaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ArtistaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BusquedaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverBtn)
                    .addComponent(BuscarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void VolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBtnActionPerformed
        dispose();
        Registro p1 = new Registro();
        p1.setVisible(true);
    }//GEN-LAST:event_VolverBtnActionPerformed

    private void NextBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBotonActionPerformed
        if (recorrido < imagenGaleriaTemp.size()) {
            ImageIcon imagen2 = new ImageIcon(imagenGaleriaTemp.get(recorrido));
            Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(ImagenEstampa.getWidth(), ImagenEstampa.getHeight(), Image.SCALE_DEFAULT));
            ImagenEstampa.setIcon(icono);
            recorrido++;
        }
        if (recorrido == imagenGaleriaTemp.size()) {
            recorrido--;
            NextBoton.setEnabled(false);
        }
        if (recorrido >= 0) {
            PrevBoton.setEnabled(true);
        }

    }//GEN-LAST:event_NextBotonActionPerformed

    private void PrevBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevBotonActionPerformed

        if (recorrido < imagenGaleriaTemp.size() && recorrido >= 0) {
            ImageIcon imagen2 = new ImageIcon(imagenGaleriaTemp.get(recorrido));
            Icon icono = new ImageIcon(imagen2.getImage().getScaledInstance(ImagenEstampa.getWidth(), ImagenEstampa.getHeight(), Image.SCALE_DEFAULT));
            ImagenEstampa.setIcon(icono);
            recorrido--;
        }
        if (recorrido == -1) {
            recorrido++;
            PrevBoton.setEnabled(false);
        }
        if (recorrido < imagenGaleriaTemp.size()) {
            NextBoton.setEnabled(true);
        }

    }//GEN-LAST:event_PrevBotonActionPerformed

    private void BuscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBtnActionPerformed
        String Artista = ArtistaTxt.getText();
        if (!Artista.equals("")) {
            if (p.verGaleria(Artista)) {
                imagenGaleriaTemp = Prueba.imagenGaleria;
                BusquedaTxt.setText("Se encontró con exito al artista: " + Artista);
                ImagenEstampa.setIcon(null);
                PrevBoton.setEnabled(true);
                NextBoton.setEnabled(true);
                SiSelecciono = true;
            } else {
                BusquedaTxt.setText("No se encontró con exito al artista: " + Artista);
                ImagenEstampa.setIcon(null);
                PrevBoton.setEnabled(false);
                NextBoton.setEnabled(false);
            }
        } else {
            BusquedaTxt.setText("Digite un artista para buscar");
            ImagenEstampa.setIcon(null);
            PrevBoton.setEnabled(false);
            NextBoton.setEnabled(false);
        }
    }//GEN-LAST:event_BuscarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArtistaTxt;
    private javax.swing.JButton BuscarBtn;
    private javax.swing.JLabel BusquedaTxt;
    private javax.swing.JLabel ImagenEstampa;
    private javax.swing.JButton NextBoton;
    private javax.swing.JButton PrevBoton;
    private javax.swing.JButton VolverBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
