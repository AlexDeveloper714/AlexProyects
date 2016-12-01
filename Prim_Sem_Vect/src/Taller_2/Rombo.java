package Taller_2;

import javax.swing.JOptionPane;

class Rombo {

    int a;
    String fi = "";

    Rombo(int a_1) {
        a = a_1;

    }

    void hacer() {
        int h[] ={0,0};
        for (h[0] = 0; h[0] <= a; h[0]++) {
            for (h[1] = h[0] - a; h[1] <= a; h[1]++) {

                fi += " ";
            }
            for (h[1] = a - h[0]; h[1] <= a; h[1]++) {
                fi += "*";
                for (h[1] = a - h[0]; h[1] < a; h[1]++) {
                    fi += "**";
                }
            }
            fi += "\n";
        }
        for (h[0] = a; h[0] >= 0; h[0]--) {
            for (h[1] = h[0] - a; h[1] <= a; h[1]++) {

                fi += " ";
            }
            for (h[1] = a - h[0]; h[1] <= a; h[1]++) {
                fi += "*";
                for (h[1] = a - h[0]; h[1] < a; h[1]++) {
                    fi += "**";
                }
            }
            fi += "\n";
        }
        JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n " + fi);
    }
}
