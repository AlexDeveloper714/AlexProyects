package Taller_4;

import javax.swing.JOptionPane;

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
        int a[] ={0,0,1,0};
       
        try{
            for (int i = b.length() - 1; i >= 0; i--) {

            if (Integer.parseInt(Character.toString(b.charAt(i))) >= 0 && Integer.parseInt(Character.toString(b.charAt(i))) <= 7) {
                a[1] = Integer.parseInt(Character.toString(b.charAt(i)));
                a[0] = a[0] + (a[1] * a[2]);
                a[2] = a[2] * 8;
                a[3]++;
            }
        }
        if (a[3] < b.length()) {
            a[0] = -1;
            JOptionPane.showMessageDialog(null, "Digita solo números 0 a 7."
                    + "\n Vuelve a intentarlo");
        }
  if (a[0] == 0) {
                                JOptionPane.showMessageDialog(null, "Tu numero: 0 "
                                        + " \n es en decimal: 0"
                                        + "\n es en binario: 0"
                                        + "\n y en hexadecimal: 0"
                                        + "\n y en romano: NO EXISTE");
                            } 
        }
        catch(NumberFormatException  m){

            JOptionPane.showMessageDialog(null, "Digita solo números 0 a 7, no letras."
                    + "\n Vuelve a intentarlo");
   
        }
        return a[0];
    }
}
