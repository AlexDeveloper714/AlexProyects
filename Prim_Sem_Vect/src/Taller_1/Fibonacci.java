package Taller_1;

import javax.swing.JOptionPane;

class Fibonacci {

    int lim_1;

    Fibonacci(int a_2) {
        lim_1 = a_2;
    }

    public void hacer() {
        int d[] = {0, 1, 0};
        String m = "";

        if (lim_1 < 0) {
            JOptionPane.showMessageDialog(null, " NO SE PUEDE HACER");
        }
        while (d[2] <= lim_1 && lim_1 >= 0) {
            m = m + " " +  d[2];
            d[2] = d[0] + d[1];
            d[1] = d[0];
            d[0] = d[2];
        }
        JOptionPane.showMessageDialog(null, "Tu serie de Fibonacci es: \n" + m);
    }
}
