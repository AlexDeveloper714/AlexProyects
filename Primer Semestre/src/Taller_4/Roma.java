/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Roma {

    private String b;

    public Roma() {
        b = "";
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int RomaDecimal() {
        int R = 0, a = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, j = 0, ant = 0, suma = 0;
        String z = " ";
        try {
            for (int i = 0; i <= b.length() - 1; i++) {
                z = Character.toString(b.charAt(i));
                switch (z) {
                    case "I":
                        if (a < 3) {
                            R = 1;
                            c++;
                            a++;
                        }

                        break;
                    case "V":
                        if (d == 0) {
                            R = 5;
                            c++;
                            d++;
                        }
                        break;
                    case "X":
                        if (e < 3) {
                            R = 10;
                            c++;
                            e++;
                        }
                        break;
                    case "L":
                        if (f == 0) {
                            R = 50;
                            c++;
                            f++;
                        }
                        break;
                    case "C":
                        if (g < 3) {
                            R = 100;
                            c++;
                            g++;
                        }
                        break;
                    case "D":
                        if (h == 0) {
                            R = 500;
                            c++;
                            h++;
                        }
                        break;
                    case "M":
                        if (j < 4) {
                            R = 1000;
                            c++;
                            j++;
                        }
                        break;
                }

                if (ant < R) {
                    if (a > 1 || e > 1 || g > 1) {
                        suma = -1;
                        JOptionPane.showMessageDialog(null, "Digita letras en Romano (No digites mal los romanos)"
                                + "\n Vuelve a intentarlo");
                    }
                    if (a == 1 || e == 1 || g == 1) {
                        suma = suma - (2 * ant);
                        ant = R;
                    }

                } else {
                    ant = R;
                }
                suma = suma + R;

            }
            if (suma == 3999 && a == 1 && e == 2 && g == 2) {
                suma = suma;
            } else if (suma < 3999) {
                suma = suma;
            } else {
                suma = -1;
                JOptionPane.showMessageDialog(null, "Digita letras en Romano (No digites mal los romanos)"
                        + "\n Vuelve a intentarlo");
            }

            if (c < b.length()) {
                suma = -1;
                JOptionPane.showMessageDialog(null, "Digita letras en Romano (No digites mal los romanos)"
                        + "\n Vuelve a intentarlo");
            }

        } catch (NumberFormatException m) {
            JOptionPane.showMessageDialog(null, "Digita solo letras del numero romano, no numeros");
        }
        return suma;
    }
}
