

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Multiplicar {

    private Fraccion F1;
    private Fraccion F2;

    public Multiplicar() {
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
    public Fraccion MultiplicarFracciones(){
        Fraccion R=new Fraccion();
        R.setDen(F1.getDen()*F2.getDen());
        return R;
    }
}
