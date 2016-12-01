package Taller_2;

import javax.swing.JOptionPane;

class Rec {

    int a_2, n_2;
    String fi = "";

    Rec(int alto, int ancho) {
        a_2 = alto;
        n_2 = ancho;

    }

    public void hacer() {
        int h = 0, a = 0;
        for (h = 0; h < a_2; h++) {
            for (a = 0; a < n_2; a++) {
                fi += "*";
            }
            fi += "\n";
        }
        JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n" + fi);
    }
}
