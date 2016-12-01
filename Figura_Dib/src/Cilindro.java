
public class Cilindro extends Geometria {

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

    public Cilindro() {
        this.nombre = "Cilindro";
    }

    public Cilindro(double r) {
        this(0.0, 0.0, r);
    }

    public Cilindro(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Cilindro(Cilindro c) {
        this(c.x, c.y, c.r);
    }

    @Override
    public double calularArea() {
        return 2 * (3.1416) * radio * (radio + altura);
    }

    @Override
    public double calularVolumen() {
        return altura * (3.1416) * (radio * radio);
    }

}
