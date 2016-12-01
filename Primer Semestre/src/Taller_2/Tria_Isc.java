package Taller_2;

import javax.swing.JOptionPane;

class Tria_Isc {

    int a;
    String fi = "";

    Tria_Isc(int altura) {
        a = altura;

    }

    public void hacer() {
        int h = 0, b = 0;
        for (h = 0; h < a; h++) {
            for (b = h - a; b <= a; b++) {

                fi += " ";
            }
            for (b = a - h; b <= a; b++) {
                fi += "*";
                for (b = a - h; b < a; b++) {
                    fi += "**";
                }
            }
            fi += "\n";
        }
        JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n " + fi);

    }
}
