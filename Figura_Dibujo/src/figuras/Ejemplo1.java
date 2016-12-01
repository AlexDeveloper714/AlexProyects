package figuras;
// fichero Ejemplo1.java

import java.util.*;
import java.awt.*;
import javax.swing.*;

class Ejemplo1 {

    public static void main(String arg[]) throws InterruptedException {
        int i, h;
        JOptionPane.showMessageDialog(null, "Comienza main()...");
        h = 5;
        Circulo c1 = new Circulo(1.0, 1.0, 2.0);
        Circulo c2 = new Circulo(0.0, 0.0, 3.0);
        JOptionPane.showMessageDialog(null, "El area del primer circulo es :" + c1.area()
                + "\nRadio = " + c1.r + " unidades."
                + "\nCentro = (" + c1.x + "," + c1.y + ") unidades."
                + "\n\nEl area del segundo circulo es :" + c2.area()
                + "\nRadio = " + c2.r + " unidades."
                + "\nCentro = (" + c2.x + "," + c2.y + ") unidades."
        );
        if (c2.r < c1.r) {
            JOptionPane.showMessageDialog(null, "El radio del primer circulo es:" + c1.r
                    + "\n el cual es mayor al del segundo circulo:" + c2.r);

        } else if (c1.r < c2.r) {
            JOptionPane.showMessageDialog(null, "El radio del segundo circulo es:" + c2.r
                    + "\n el cual es mayor al del primer circulo:" + c1.r);
        } else {
            JOptionPane.showMessageDialog(null, "El radio del primer circulo es:" + c1.r
                    + "\n el cual es igual al del segundo circulo:" + c2.r);
        }
        JOptionPane.showMessageDialog(null, "Termina main()...");

        VentanaCerrable ventana = new VentanaCerrable("Ventana Figuras Geometricas");
        //VentanaCerrable();
        Vector v = new Vector();
        CirculoGrafico cg1 = new CirculoGrafico((c1.x * 10) + 150, (c1.y * 10) + 100, (c1.r * 10),h, Color.red);
        CirculoGrafico cg2 = new CirculoGrafico((c2.x * 10) + 100, (c2.y * 10) + 100, (c2.r * 10),h, Color.blue);
        RectanguloGrafico rg = new RectanguloGrafico(50, 50, 200, 150, Color.green);
        v.addElement(cg1);
        v.addElement(cg2);
        v.addElement(rg);
        PanelDibujo mipanel = new PanelDibujo(v);
        /*add(mipanel es el dibujo)*/
        ventana.add(mipanel);
        /*setResizable sirve para no permitir 
         al usuario cambiar el tamaño de la ventana*/
        ventana.setResizable(false);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
    } // fin de main()
} // fin de class Ejemplo1
