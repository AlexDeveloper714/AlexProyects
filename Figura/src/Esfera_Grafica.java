
import java.awt.*;

public class Esfera_Grafica extends Cono implements Dibujable {

    Color color;

    // constructor
    public Esfera_Grafica(double x, double y, double r, Color unColor) {
        // llamada al constructor de Circulo
        super(x, y, r);
        this.color = unColor;
    }

    // m�todos de la interface Dibujable
    public void dibujar(Graphics dw) {
        double dec = 0.1;
        dw.setColor(color);
        for (int i = 0; i < 10; i++) {
            dw.drawOval((int) (x - (r - dec)), (int) (y - r), (int) (2.0 * (r - dec)), (int) (2.0 * r));
            dw.drawOval((int) (x - r), (int) (y - (r-dec)), (int) (2.0 * r), (int) (2.0 * (r-dec)));
            dec = dec + 5;

        }
    }
} // fin de la clase CirculoGrafico

