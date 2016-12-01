package Taller_1;

import javax.swing.JOptionPane;

class Primo {

    int a_2;

    Primo(int Primo_2) {
        a_2 = Primo_2;

    }

    public void hacer() {
        int b = 1, i = 0;

        while (b <= a_2) {

            if (a_2 % b == 0) {
                b++;
                i++;
            }
            b++;
        }

        if (i == 2) {
            JOptionPane.showMessageDialog(null, " El número " + a_2 + " es primo");
        } else {
            JOptionPane.showMessageDialog(null, " El número " + a_2 + " no es primo");
        }

    }
}
