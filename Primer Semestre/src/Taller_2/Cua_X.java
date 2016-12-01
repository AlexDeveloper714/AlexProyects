package Taller_2;

import javax.swing.JOptionPane;

class Cua_X {

    int a_2;
    String fi = "";

    Cua_X(int lado) {
        a_2 = lado;

    }

    public void hacer() {
        int h = 0, a = 0;

        for (h = 0; h < a_2; h++) {
            for (a = 0; a < a_2; a++) {
                if (a == 0 || h == 0 || a == h || h == a_2 - 1 || a == a_2 - 1 || a + h == a_2 - 1) {
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
