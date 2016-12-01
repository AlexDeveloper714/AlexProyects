import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
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
                    n = Integer.parseInt(Character.toString(b.charAt(i)));

            }
            if (n <= 0 && n > 16) {
                    a = a + (n * p);
                    p = p * 16;
                      c++;
            }
            else{
              a = a + (n * p);
            p = p * 16;
            c++;  
            } 
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
                    + "\n y en hexadecimal: 0");
        }
        return a;
    }
}
