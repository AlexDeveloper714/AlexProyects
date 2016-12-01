package Taller_2;

import javax.swing.JOptionPane;

class Cua {

    int a_2;
    String fi;

    Cua(int lado) {
        a_2 = lado;

    }

    public void hacer() {
        int h = 0, a = 0;

        for (h = 0; h < a_2; h++) {
            for (a = 0; a < a_2; a++) {
                fi += "*";
            }
            fi += "\n";
        }
        JOptionPane.showMessageDialog(null, "Tu figura hecha es: " + fi);

    }
}
