package Taller_2;

import javax.swing.JOptionPane;

class Cua_X {

    int a_2;
    String fi = "";

    Cua_X(int lado) {
        a_2 = lado;

    }

    public void hacer() {
        int h[] = {0,0};
        for (h[0] = 0; h[0] < a_2; h[0]++) {
            for (h[1] = 0; h[1] < a_2; h[1]++) {
                if (h[1] == 0 || h[0] == 0 || h[1] == h[0] || h[0] == a_2 - 1 || h[1] == a_2 - 1 || h[1] + h[0] == a_2 - 1) {
                    fi += "*";

                } else {
                    fi += " ";
                }

            }
            fi += "\n";
        }
        JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n" + fi);

    }
}
