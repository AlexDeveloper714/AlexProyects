package figuras;
// fichero Circulo.java

public class Circulo extends Geometria {
	static int numCirculos=0;
	public double x, y, r;

	public Circulo() { this(0.0, 0.0, 1.0); }
	public Circulo(double r) { this(0.0, 0.0, r); }
	public Circulo(double x, double y, double r) {
		this.x=x; this.y=y; this.r=r;
		numCirculos++;
	}
	public Circulo(Circulo c) { this(c.x, c.y, c.r); }
	public double area() { return 3.1416* r * r; }
	public double perimetro() { return 2.0 * 3.1416 * r; }
} // fin de la clase Circulo