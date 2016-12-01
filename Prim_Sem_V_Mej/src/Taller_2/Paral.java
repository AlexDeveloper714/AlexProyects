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
        int h[] = {0,0};
        for (h[0] = 0; h[0] < a_2; h[0]++) {
            for (h[1] = h[0] - a_2; h[1] <= a_2; h[1]++) {

                fi += " ";
            }
            for (h[1] = 0; h[1] < n_2; h[1]++) {
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
