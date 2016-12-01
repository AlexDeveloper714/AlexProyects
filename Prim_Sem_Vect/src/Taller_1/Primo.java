package Taller_1;

import javax.swing.JOptionPane;

class Primo {

    int a_2;

    Primo(int Primo_2) {
        a_2 = Primo_2;

    }

    public void hacer() {
        int a[] = {1, 0};

        while (a[0] <= a_2) {
            if (a_2 % a[0] == 0) {
                a[0]++;
                a[1]++;
            }
            a[0]++;
        }

        if (a[1] == 2) {
            JOptionPane.showMessageDialog(null, " El número " + a_2 + " es primo");
        } else {
            JOptionPane.showMessageDialog(null, " El número " + a_2 + " no es primo");
        }

    }
}
