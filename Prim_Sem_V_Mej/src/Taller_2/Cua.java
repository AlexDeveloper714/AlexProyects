package Taller_2;

import javax.swing.JOptionPane;

class Cua {

    int a_2;
    String fi;

    Cua(int lado) {
        a_2 = lado;

    }

    public void hacer() {
        int h[] = {0,0};

        for (h[0] = 0; h[0] < a_2; h[0]++) {
            for (h[1] = 0; h[1] < a_2; h[1]++) {
                fi += "*";
            }
            fi += "\n";
        }
        JOptionPane.showMessageDialog(null, "Tu figura hecha es: " + fi);

    }
}
