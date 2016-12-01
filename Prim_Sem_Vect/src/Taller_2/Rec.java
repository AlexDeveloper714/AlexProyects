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
        int h[] = {0,0};
        for (h[0] = 0; h[0] < a_2; h[0]++) {
            for (h[1] = 0; h[1] < n_2; h[1]++) {
                fi += "*";
            }
            fi += "\n";
        }
        JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n" + fi);
    }
}
