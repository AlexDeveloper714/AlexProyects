
public class Cilindro {

    private double H, R;

    public Cilindro(double H, double R) {
        this.H = H;
        this.R = R;
    }

    public double getH() {
        return H;
    }

    public void setH(double H) {
        this.H = H;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public double Volumen_Cili(double H, double R) {
        double vol = 0;
        vol=H*Math.pow(R,2)*3.1416;
        return vol;
    }
}
