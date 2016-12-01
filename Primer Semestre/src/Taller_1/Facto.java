package Taller_1;

import javax.swing.JOptionPane;

//Hecho por Ivàn Alexander Diàz Cruz, totalmente original....
class Facto {

    double a_2;

    Facto(double Facto_2) {
        a_2 = Facto_2;

    }

    public void hacer() {
        double a = 1, b = 1;
        if (a_2 == 0) {
            b = a_2 + 1;
        }

        while (a_2 > 1) {
            a++;
            b = a * b;
            a_2--;
        }
        if (a_2 < 0) {
            JOptionPane.showMessageDialog(null, " NO SE PUEDE HACER");
        }
        if (a > 0 && a <= 170) {
            JOptionPane.showMessageDialog(null, "Tu Factorial es: " + b);
        } else {
            JOptionPane.showMessageDialog(null, " Tu factorial es indefinido");
        }
    }
}
