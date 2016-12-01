package Taller_3;

import javax.swing.JOptionPane;

public class Fraccion {

    int num, den;

    public Fraccion() {
        num = 1;
        den = 1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public void simplificar() {
        int div = 2;
        while (div <= num && div <= den) {
            if (num % div == 0 && den % div == 0) {
                num = num / div;
                den = den / div;
            } else {
                div++;
            }
        }
    }

    public void ImprimirFraccion() {
        JOptionPane.showMessageDialog(null, "Tu fracción es:\n" + num + "/" + den);
    }

}
