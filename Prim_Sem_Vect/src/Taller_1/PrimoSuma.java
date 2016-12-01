package Taller_1;

import javax.swing.JOptionPane;

class PrimoSuma {

    int a_2;

    PrimoSuma(int Primo_2) {
        a_2 = Primo_2;

    }

    public void hacer() {
        int a[] = {0, 0, 0};
        if (a_2 < 5) {
            JOptionPane.showMessageDialog(null, "No se puede hacer esa operación...");
        }
        for (a_2 = a_2; a_2 >= 5; a_2--) {
            a[2] = 0;
            for (a[0] = 1; a[0] <= a_2; a[0]++) {
                if (a_2 % a[0] == 0) {
                    a[2]++;
                }
            }
            if (a[2] == 2) {
                JOptionPane.showMessageDialog(null, " El número " + a_2 + " es primo");
                a[1] = a[1] + a_2;
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los primos es " + a[1]);

    }

}
