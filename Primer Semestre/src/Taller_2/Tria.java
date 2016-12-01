package Taller_2;

import javax.swing.JOptionPane;

//Hecho por Ivàn Alexander Diàz Cruz, totalmente original....
class Tria {

    int a;
    String fi = "";

    Tria(int altura) {
        a = altura;

    }

    public void hacer() {
        int h = 0, b = 0;
        for (h = 0; h < a; h++) {
            for (b = a - h; b <= a; b++) {

                fi += "*";
            }

            fi += "\n";
        }
        JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n" + fi);
    }
}
