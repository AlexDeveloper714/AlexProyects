package Taller_4;

import javax.swing.JOptionPane;

public class Hexa {

    private String b;

    public Hexa() {
        b = "";
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int HexaDecimal() {
        int a[] = {0,0,1,0};
        String m = "";
        try {
            for (int i = b.length() - 1; i >= 0; i--) {
                m = Character.toString(b.charAt(i));
                switch (m) {
                    case "A":
                        a[1] = 10;
                        a[3]++;
                        break;
                    case "B":
                        a[1] = 11;
                        a[3]++;
                        break;
                    case "C":
                        a[1] = 12;
                        a[3]++;
                        break;
                    case "D":
                        a[1] = 13;
                        a[3]++;
                        break;
                    case "E":
                        a[1] = 14;
                        a[3]++;
                        break;
                    case "F":
                        a[1] = 15;
                        a[3]++;
                        break;
                    default:
                        if (Integer.parseInt(Character.toString(b.charAt(i))) >= 0
                                && Integer.parseInt(Character.toString(b.charAt(i))) < 10) {
                            a[1] = Integer.parseInt(Character.toString(b.charAt(i)));
                            a[3]++;
                        }
                }

                a[0] = a[0] + (a[1] * a[2]);
                a[2] = a[2] * 16;
            }
            if (a[3] < b.length()) {
                a[0] = -1;
                JOptionPane.showMessageDialog(null, "Digita letras de A a F (En mayusculas)."
                        + "\n Vuelve a intentarlo");
            }
              if (a[0] == 0) {
                                JOptionPane.showMessageDialog(null, "Tu numero: 0 "
                                        + " \n es en decimal: 0"
                                        + "\n es en binario: 0"
                                        + "\n y en hexadecimal: 0"
                                        + "\n y en romano: NO EXISTE");
                            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digita letras de A a F (En mayusculas)."
                    + "\n Vuelve a intentarlo");
        }
        return a[0];
    }
}
