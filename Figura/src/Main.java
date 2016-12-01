
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String z = "";
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
        z = "El nombre de la figura es: " + F1.getNombre()
                + "\nEl area es: " + F1.calularArea()
                + " y el volumen es: " + F1.calularVolumen()
                + "\n\n" + "El nombre de la figura es: " + F2.getNombre()
                + "\nEl area superficial es: " + F2.calularArea()
                + " y el volumen es: " + F2.calularVolumen()
                + "\n\n" + "El nombre de la figura es: " + F3.getNombre()
                + "\nEl area superficial es: " + F3.calularArea()
                + " y el volumen es: " + F3.calularVolumen();
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
        VentanaCerrable ventana = new VentanaCerrable("Ventana Figuras Geometricas");
        //VentanaCerrable();
        Vector v = new Vector();
        Cilindro_Grafico cg1 = new Cilindro_Grafico((c1.x * 10) + 50, (c1.y * 10) + 150, (c1.r * 10), Color.red);
        Cono_Grafico cg2 = new Cono_Grafico((c2.x * 10) + 150, (c2.y * 10) + 160, (c2.r * 10), Color.GREEN);
        Esfera_Grafica cg3 = new Esfera_Grafica((c3.x * 10) + 250, (c3.y * 10) + 120, (c3.r * 10), Color.BLUE);
//        Texto_Grafico cg4 = new Texto_Grafico(z,100,100,Color.BLACK);
        v.addElement(cg1);
        v.addElement(cg2);
        v.addElement(cg3);
//        v.addElement(cg4);
        PanelDibujo mipanel = new PanelDibujo(v);
        /*add(mipanel es el dibujo)*/
        ventana.add(mipanel);
        /*setResizable sirve para no permitir 
         al usuario cambiar el tamaño de la ventana*/
        ventana.setResizable(false);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
    }
}
