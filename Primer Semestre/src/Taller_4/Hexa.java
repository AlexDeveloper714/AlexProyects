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
        int a = 0, n = 0, p = 1, c = 0;
        String m = "";
        try {
            for (int i = b.length() - 1; i >= 0; i--) {
                m = Character.toString(b.charAt(i));
                switch (m) {
                    case "A":
                        n = 10;
                        c++;
                        break;
                    case "B":
                        n = 11;
                        c++;
                        break;
                    case "C":
                        n = 12;
                        c++;
                        break;
                    case "D":
                        n = 13;
                        c++;
                        break;
                    case "E":
                        n = 14;
                        c++;
                        break;
                    case "F":
                        n = 15;
                        c++;
                        break;
                    default:
                        if (Integer.parseInt(Character.toString(b.charAt(i))) >= 0
                                && Integer.parseInt(Character.toString(b.charAt(i))) < 16) {
                            n = Integer.parseInt(Character.toString(b.charAt(i)));
                            c++;
                        }
                }

                a = a + (n * p);
                p = p * 16;
                c++;
            }
            if (c < b.length()) {
                a = -1;
                JOptionPane.showMessageDialog(null, "Digita letras de A a F (En mayusculas)."
                        + "\n Vuelve a intentarlo");
            }
              if (a == 0) {
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
        return a;
    }
}
