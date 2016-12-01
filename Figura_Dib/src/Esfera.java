
public class Esfera extends Geometria {

    public double radio, x, y, r;

    public String getNombre() {
        return nombre;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Esfera() {
        this.nombre = "Esfera";
    }

    public Esfera(double r) {
        this(0.0, 0.0, r);
    }

    public Esfera(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Esfera(Esfera c) {
        this(c.x, c.y, c.r);
    }

    @Override
    public double calularArea() {
        return 4 * (3.1416) * (radio * radio);
    }

    @Override
    public double calularVolumen() {
        return (4 * (3.1416) * (radio * radio * radio)) / 3;

    }

}
