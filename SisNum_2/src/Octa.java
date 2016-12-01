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
public class Octa {

    public String b;

    public Octa() {
        b = "";
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int OctaDecimal() {
        int a = 0, n = 0, p = 1, c = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            n = Integer.parseInt(Character.toString(b.charAt(i)));
            if (n <= 7) {
                a = a + (n * p);
                p = p * 8;
                c++;
            }
        }
        if (c < b.length()) {
            a = -1;
            JOptionPane.showMessageDialog(null, "Digita solo números 0 y 1."
                    + "\n Vuelve a intentarlo");
        }
         if (a== 0) {
             JOptionPane.showMessageDialog(null, "Tu numero: 0 "
                                + " \n es en decimal: 0"
                                + "\n es en binario: 0"
                                + "\n y en hexadecimal: 0");
         }
        return a;
    }
}
