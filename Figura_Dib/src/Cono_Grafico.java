
import java.awt.*;

public class Cono_Grafico extends Cono implements Dibujable {

    Color color;

    // constructor
    public Cono_Grafico(double x, double y, double r, Color unColor) {
        // llamada al constructor de Circulo
        super(x, y, r);
        this.color = unColor;
    }

    // m�todos de la interface Dibujable
    public void dibujar(Graphics dw) {
        dw.setColor(color);
        for (int i = 0; i < 100; i++) {
            y = y - 5;
            r = r - 2;
            dw.drawOval((int) (x - r), (int) (y - r), (int) (2.0 * r), (int) (1.0 * r));
        }
    }
} // fin de la clase CirculoGrafico

