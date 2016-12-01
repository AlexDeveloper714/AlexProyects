
import javax.swing.*;

public class Recursivo {

    public static void main(String[] args) {
        int n, i;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite número "
                + "para hacer operaciones:"));
        if (n >= 0) {
            facto(n);
            suma_cua(n);
            dec_bin(n);
            JOptionPane.showMessageDialog(null, "El factorial de tu número es: " 
                    + facto(n)
            +"\nla suma de cuadrados de tu numero es: " + suma_cua(n)
            +"\ny el numero binario es: " + dec_bin(n));
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el "
                    + "binario a convertir:"));
            bin_dec(n);
            JOptionPane.showMessageDialog(null, "El binario convertido a "
                    + "decimal : " + bin_dec(n));
        } else {
            JOptionPane.showMessageDialog(null, "Digita números mayores o "
                    + "iguales a 0");
        }
        i = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el inicio"
                + " de la suma de cuadrados (i+2)^2:"));
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el final"
                + " de la suma de cuadrados (i+2)^2:"));
        if (i >= 0 && n >= 0) {
            multi_cua(i, n);
            JOptionPane.showMessageDialog(null, "El resultado de la suma de "
                    + "cuadrados es: " + multi_cua(i, n));

        } else {
            JOptionPane.showMessageDialog(null, "Digita números mayores "
                    + "o iguales a 0");
        }

    }

    public static long facto(int n1) {
        if (n1 == 0) {
            return 1;
        } else {
            return n1 * facto(n1 - 1);
        }
    }

    public static long suma_cua(int n) {
        if (n == 0) {
            return n;
        } else {
            return (n * n) + suma_cua(n - 1);
        }
    }

    public static long dec_bin(int n1) {
        if (n1 <= 1) {
            return n1;
        } else {
            return n1 % 2 + (dec_bin(n1 / 2) * 10);
        }

    }

    public static long bin_dec(int n1) {
        if (n1 <= 1) {
            return n1;
        } else {
            return n1 % 10 + (bin_dec(n1 / 10) * 2);
        }
    }

    public static long multi_cua(int i, int n) {
        if (i > n) {
            return 1;
        } else {
            return ((i + 2) * (i + 2)) * multi_cua(i+1,n);
        }
    }
}
