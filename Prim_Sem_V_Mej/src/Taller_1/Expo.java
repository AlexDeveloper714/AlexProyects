package Taller_1;

import javax.swing.JOptionPane;

class Expo {

    int a_2, n_2;

    Expo(int Expo, int Expo_2) {
        a_2 = Expo;
        n_2 = Expo_2;

    }

    public void hacer() {
        int b = 0;
        if (a_2 == 0 && n_2 == 0) {
            b = 1;
        } else {
            if (n_2 == 0) {
                b = 1;
            }
        }
        b = a_2;
        while (n_2 > 1) {

            a_2 = b * a_2;
            n_2--;
        }
        JOptionPane.showMessageDialog(null, "El resultado de tu exponente es: " + a_2);

    }
}
