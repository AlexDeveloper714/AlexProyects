
package Taller_1;

import javax.swing.JOptionPane;


class PrimoSuma {

    int a_2;

    PrimoSuma(int Primo_2) {
        a_2 = Primo_2;

    }

    public void hacer() {
        int  i = 0, suma = 0, b = 0;
        if (a_2 < 5) {
            JOptionPane.showMessageDialog(null, "No se puede hacer esa operación...");
        }

        for (a_2 = a_2; a_2 >= 5; a_2--) {
            b = 0;

            for (i = 1; i <= a_2; i++) {
                if (a_2 % i == 0) {
                    b++;
                }

            }
            if (b == 2) {
                JOptionPane.showMessageDialog(null, " El número " + a_2 + " es primo");
                suma = suma + a_2;
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los primos es " + suma);

    }

}
