
public class Cono {

    private double H, R;

    public Cono(double H, double R) {
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

    public double Volumen_Cono(double H, double R) {
        double vol = 0, h = 0, r = 0, sumavol = 0, dec = 0.1, c = 100;
        /*Formula Básica para entender el decrecimiento
         if (R >= 10 && R < 20) {
         dec = dec * (R / 10) + (R / 100);
         } else if (R >= 20) {
         dec = (dec * 2) + (R / 100);
        } */
        dec = dec * (R / 10) + (R / 100);
        h = H / c;
        r = R;
        for (int i = 0; i < c; i++) {
            vol = h * Math.pow(r, 2) * 3.1416;
            sumavol = sumavol + vol;
            r = r - dec;
        }
        return sumavol;
    }
}
