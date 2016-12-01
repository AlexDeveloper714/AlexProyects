package Taller_2;

import javax.swing.JOptionPane;

class Rombo {

    int a;
    String fi = "";

    Rombo(int a_1) {
        a = a_1;

    }

    void hacer() {
        int h = 0, b = 0;
        for (h = 0; h <= a; h++) {
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
        for (h = a; h >= 0; h--) {
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
