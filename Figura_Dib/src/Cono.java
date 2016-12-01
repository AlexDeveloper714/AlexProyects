
public class Cono extends Geometria {

    public double radio, altura, x, y, r;

    public String getNombre() {
        return nombre;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cono() {
        this.nombre = "Cono";
    }

    public Cono(double r) {
        this(0.0, 0.0, r);
    }

    public Cono(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Cono(Cono c) {
        this(c.x, c.y, c.r);
    }

    @Override
    public double calularArea() {
        double generatriz = 0;
        generatriz = (radio * radio) + (altura * altura);
        return (3.1416) * radio * (radio + generatriz);
    }

    @Override
    public double calularVolumen() {
        return (altura * (3.1416) * (radio * radio)) / 3;
    }

}
