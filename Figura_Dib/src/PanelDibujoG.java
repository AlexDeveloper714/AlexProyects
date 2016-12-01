
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PanelDibujoG extends javax.swing.JFrame {

    public PanelDibujoG() {
        initComponents();
    }

    public void dibujar(Graphics dw) {
         Dibujable dib;
        Enumeration e;
        e = v.elements();
        while (e.hasMoreElements()) {
            dib = (Dibujable) e.nextElement();
            dib.dibujar(dw);
        }
    }
    private Vector v;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDibujo_2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDibujo_2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelDibujo_2Layout = new javax.swing.GroupLayout(PanelDibujo_2);
        PanelDibujo_2.setLayout(PanelDibujo_2Layout);
        PanelDibujo_2Layout.setHorizontalGroup(
            PanelDibujo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        PanelDibujo_2Layout.setVerticalGroup(
            PanelDibujo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        jButton1.setText("Hacer Dibujo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(PanelDibujo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(PanelDibujo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Esfera F1 = new Esfera();
        F1.setRadio(3);
        Cono F2 = new Cono();
        F2.setRadio(3);
        F2.setAltura(3);
        Cilindro F3 = new Cilindro();
        F3.setRadio(3);
        F3.setAltura(3);
        Cilindro c1 = new Cilindro(1.0, 1.0, F3.radio);
        Cono c2 = new Cono(0.0, 0.0, F2.radio);
        Esfera c3 = new Esfera(0.0, 0.0, F1.radio);
        JOptionPane.showMessageDialog(null, "Estas figuras tienen radio de: 3 y altura (cono y cilindro) de 3");
        JOptionPane.showMessageDialog(null,
                "El nombre de la figura es: " + F1.getNombre()
                + "\nEl area es: " + F1.calularArea()
                + " y el volumen es: " + F1.calularVolumen()
                + "\n\n" + "El nombre de la figura es: " + F2.getNombre()
                + "\nEl area superficial es: " + F2.calularArea()
                + " y el volumen es: " + F2.calularVolumen()
                + "\n\n" + "El nombre de la figura es: " + F3.getNombre()
                + "\nEl area superficial es: " + F3.calularArea()
                + " y el volumen es: " + F3.calularVolumen());
        Cilindro_Grafico cg1 = new Cilindro_Grafico((c1.x * 10) + 50, (c1.y * 10) + 150, (c1.r * 10), Color.red);
        Cono_Grafico cg2 = new Cono_Grafico((c2.x * 10) + 150, (c2.y * 10) + 160, (c2.r * 10), Color.GREEN);
        Esfera_Grafica cg3 = new Esfera_Grafica((c3.x * 10) + 250, (c3.y * 10) + 120, (c3.r * 10), Color.BLUE);
        v.addElement(cg1);
        v.addElement(cg2);
        v.addElement(cg3);
        PanelDibujo mipanel = new PanelDibujo(v);
        PanelDibujo_2.add(mipanel);

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(PanelDibujoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelDibujoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelDibujoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelDibujoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelDibujoG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDibujo_2;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
