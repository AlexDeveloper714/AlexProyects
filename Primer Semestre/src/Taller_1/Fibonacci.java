package Taller_1;

import javax.swing.JOptionPane;

class Fibonacci {

    int lim_1;

    Fibonacci(int a_2) {
        lim_1 = a_2;
    }

    public void hacer() {
        int a = 0, b = 1, c = 0;
        String m="";

        if (lim_1 < 0) {
            JOptionPane.showMessageDialog(null, " NO SE PUEDE HACER");
        }

        while (c <= lim_1 && lim_1 >= 0) {

            m=m+" "+c;
            c = a + b;
            b = a;
            a = c;

        }
        JOptionPane.showMessageDialog(null, "Tu serie de Fibonacci es: \n" + m);
    }
}
