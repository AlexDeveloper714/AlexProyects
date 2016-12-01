package Taller_1;

import javax.swing.JOptionPane;

//Hecho por Ivàn Alexander Diàz Cruz, totalmente original....
class Facto {

    double a_2;

    Facto(double Facto_2) {
        a_2 = Facto_2;

    }

    public void hacer() {
        
        double c[]={1,1};
        if(a_2 ==0){
            c[1]=a_2+1;
        }
        while(a_2>1){
            c[0]++;
            c[1]=c[0]*c[1];
            a_2--;
        }
        if (a_2 < 0) {
            JOptionPane.showMessageDialog(null, " NO SE PUEDE HACER");
        }
        if (c[0] > 0 && c[0] <= 170) {
            JOptionPane.showMessageDialog(null, "Tu Factorial es: " + (int) c[1]);
        } else {
            JOptionPane.showMessageDialog(null, " Tu factorial es indefinido");
        }
    }
}
