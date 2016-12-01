package Taller_2;

import javax.swing.JOptionPane;

class Tria_Isc {

    int a;
    String fi = "";

    Tria_Isc(int altura) {
        a = altura;

    }

    public void hacer() {
        int h[] ={0,0};
        for (h[0] = 0; h[0] < a; h[0]++) {
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
