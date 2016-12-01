package Taller_1;

import javax.swing.JOptionPane;

class Bina {

    int a_2;

    Bina(int Bina_2) {
        a_2 = Bina_2;

    }

    public void hacer() {
        int b = 0;
        String c = "";

        while (a_2 > 0) {
            b = a_2 % 2;
            a_2 = a_2 / 2;
            c = b + c;
        }

        JOptionPane.showMessageDialog(null, "Tu número binario es " + c);

    }
}
