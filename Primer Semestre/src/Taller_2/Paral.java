package Taller_2;

import javax.swing.JOptionPane;

class Paral {

    int a_2, n_2;
    String fi = "";

    Paral(int lado, int ancho) {
        a_2 = lado;
        n_2 = ancho;

    }

    public void hacer() {
        int h = 0, a = 0;
        for (h = 0; h < a_2; h++) {
            for (a = h - a_2; a <= a_2; a++) {

                fi += " ";
            }
            for (a = 0; a < n_2; a++) {
                fi += "*";
            }
            fi += "\n";
        }

        JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n" + fi);

    }
}
//
//
//for(b=a-h;b<=a;b++)
//              {
//                  
//                  System.out.print("*");
//              }
