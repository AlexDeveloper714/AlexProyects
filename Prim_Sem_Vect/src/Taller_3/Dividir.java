package Taller_3;

public class Dividir {

    private Fraccion F1,F2;

    public Dividir() {
        F1 = new Fraccion();
        F2 = new Fraccion();
    }

    public Fraccion getF1(int Fraccion) {
        return F1;
    }

    public void setF1(Fraccion F1) {
        this.F1 = F1;
    }

    public Fraccion getF2(int Fraccion) {
        return F2;
    }

    public void setF2(Fraccion F2) {
        this.F2 = F2;
    }

    public Fraccion DividirFracciones() {
        Fraccion R = new Fraccion();
        R.setDen(F1.getDen() * F2.getNum());
        R.setNum(F1.getNum() * F2.getDen());
        return R;
    }
}
