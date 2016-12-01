
import java.awt.*;

public class Texto_Grafico extends Cono implements Dibujable {
    
    Color color;

    // constructor
    public Texto_Grafico(String nombre, double x, double y, Color unColor) {
        // llamada al constructor de Circulo
        super(x, y, 0);
        this.color = unColor;
        this.nombre = nombre;
    }

    // m�todos de la interface Dibujable
    public void dibujar(Graphics dw) {
        dw.setColor(color);
        dw.drawString(nombre,(int) x,(int) y);
    }
} // fin de la clase CirculoGrafico

