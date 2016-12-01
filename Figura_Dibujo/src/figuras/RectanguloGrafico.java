package figuras;
// Fichero RectanguloGrafico.java

import java.awt.*;

class RectanguloGrafico extends Rectangulo implements Dibujable {

    Color color;

    public RectanguloGrafico(double x1, double y1, double x2, double y2,
            Color unColor) {
        super(x1, y1, x2, y2);
        this.color = unColor;
    }

    public void dibujar(Graphics dw) {
        dw.setColor(color);
        dw.drawRect((int) x1, (int) y1, (int) (x2 - x1), (int) (y2 - y1));
    }
} // fin de la clase RectanguloGrafico
