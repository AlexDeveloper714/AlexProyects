package Taller_4;

import javax.swing.JOptionPane;

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
        char Rom[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'},letra = ' '; 
        int valor[] = {1, 5, 10, 50, 100, 500, 1000},lim[] = {0, 2, 0, 2, 0, 2, 0},su[] = {0,0,0};
        try {
            for (int i = 0; i < b.length(); i++) {
                letra = b.charAt(i);
                for (int j = 0; j < Rom.length; j++) {
                    if (letra == Rom[j] && lim[j] < 3) {                
                        lim[j]++;
                        su[2]++;
                        su[1] = su[1] + valor[j];
                        if (su[0] < valor[j]) { 
                            su[1] = su[1] - su[0] * 2;
                            su[0] = valor[j];
                        }
                        else { 
                            su[0] = valor[j];
                        }
                    }
                }
            }
            if (su[2] < b.length()) {
                su[1] = -1;
                JOptionPane.showMessageDialog(null, "Digita letras en Romano (No digites mal los romanos)"
                        + "\n Vuelve a intentarlo");
            }
        } catch (NumberFormatException m) {
            JOptionPane.showMessageDialog(null, "Digita solo letras del numero romano, no numeros","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        return su[1];
    }
}
