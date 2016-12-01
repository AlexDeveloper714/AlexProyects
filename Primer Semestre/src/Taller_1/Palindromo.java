
package Taller_1;

import javax.swing.JOptionPane;

 class Palindromo {
    String b;
    Palindromo(String Pali){
        b=Pali;
    }
    public  void hacer() {
        String a = "";
        for (int i = 0; i <= b.length() - 1; i++) {
            a = Character.toString(b.charAt(i)) + a;
        }
        if (b.equals(a)) {
            JOptionPane.showMessageDialog(null, "La palabra:\n"
                    + b + " es un palindromo,\n ya que "
                    + a + " es igual");
        } else {
            JOptionPane.showMessageDialog(null, "La palabra:\n "
                    + b + " NO es un palindromo, \n ya que "
                    + a + " NO es igual");
        }
    }

}
