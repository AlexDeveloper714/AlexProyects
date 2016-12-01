package Taller_1;

import javax.swing.JOptionPane;

class Suma_N {

    double a;

    Suma_N(double a_1) {
        a = a_1;

    }

    void hacer() {
        double c = 0;
        int d=0,h=0;
        if(a>=0){
           c = ((a / 2) + 0.5) * a;
        d=(int) c;
        h=(int) a;
        JOptionPane.showMessageDialog(null, " El resultado de la suma "
                + "sucesiva del numero: "
                + h
                + " es: " + d); 
        }
        else{
            c = ((a / 2) - 0.5) * (-a);
        d=(int) c;
        h=(int) a;
        JOptionPane.showMessageDialog(null, " El resultado de la suma "
                + "sucesiva del numero: "
                + h
                + " es: " + d);
        }
        
    }

}
