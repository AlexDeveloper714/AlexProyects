package Taller_4;

import javax.swing.JOptionPane;

public class Binario {

    private String b;

    public Binario() {
        b = "";
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int binarioDecimal() {
        int a = 0, n = 0, p = 1, c = 0;
        try{
          for (int i = b.length() - 1; i >= 0; i--) {
            
            if (Integer.parseInt(Character.toString(b.charAt(i))) == 0 || Integer.parseInt(Character.toString(b.charAt(i))) == 1) {
                n = Integer.parseInt(Character.toString(b.charAt(i)));
                a = a + (n * p);
                p = p * 2;
                c++;

            }
        }         if (c < b.length()) {
            a = -1;
            JOptionPane.showMessageDialog(null, "Digita solo números 0 y 1."
                    + "\n Vuelve a intentarlo");
        }
           if (a == 0) {
                                JOptionPane.showMessageDialog(null, "Tu numero: 0 "
                                        + " \n es en decimal: 0"
                                        + "\n es en binario: 0"
                                        + "\n y en hexadecimal: 0"
                                        + "\n y en romano: NO EXISTE");
                            } 
        }
        catch(NumberFormatException  m){

            JOptionPane.showMessageDialog(null, "Digita solo números 0 y 1, no letras."
              + "\n Vuelve a intentarlo");
   
        }
        
        
       
        return a;
    }
}
