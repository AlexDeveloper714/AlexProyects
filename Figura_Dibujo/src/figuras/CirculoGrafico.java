package figuras;
// fichero CirculoGrafico.java

import java.awt.*;

public class CirculoGrafico extends Circulo implements Dibujable {

    Color color;

    // constructor
    public CirculoGrafico(double x, double y, double r, double h, Color unColor) {
        // llamada al constructor de Circulo
        super(x, y, r);
        this.color = unColor;
    }

    // m�todos de la interface Dibujable

    public void dibujar(Graphics dw) {
        dw.setColor(color);
        for (int i = 0; i < 5; i++) {
            y=y+10;
            dw.drawOval((int) (x - r), (int) (y - r), (int) (2.0 * r), (int) (2.0 * r));
        }
    }
} // fin de la clase CirculoGrafico
