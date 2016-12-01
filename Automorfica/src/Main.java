
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex
 */
public class Main {

    public static void main(String[] args) {
        int m = 0;
        while (m == 0) {
            try {
                m = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para saber si es automorfico"));
                if (m != 0) {
                    autoMorf(m);
                    
                } else {
                    autoMorf(m);
                    m++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite un número valido y vuelva a intentarlo...");
            }
        }

    }

    public static void autoMorf(int potencia) {
        boolean Sies = true;
        int poten[] = new int[8];
//        String polen[] = new String[5];
        poten[1] = potencia * potencia;
        poten[2] = potencia * potencia * potencia;
        poten[3] = potencia * potencia * potencia * potencia;
        poten[0] = potencia;
        poten[5] = poten[1];
        poten[6] = poten[2];
        poten[7] = poten[3];
        while (potencia / 10 >= 0 && Sies == true && potencia != 0) {
            if (potencia % 10 == poten[5] % 10 && potencia % 10 == poten[6] % 10 && potencia % 10 == poten[7] % 10) {

            } else {
                Sies = false;
            }
            potencia = potencia / 10;
            poten[5] = poten[5] / 10;
            poten[6] = poten[6] / 10;
            poten[7] = poten[7] / 10;
        }
        if (Sies == true) {
            JOptionPane.showMessageDialog(null, "Tu numero: " + poten[0] + " es Automorfica,\n ya que sus potencias son: " + poten[1] + " , " + poten[2] + " y " + poten[3]
                    + " y todas terminan en el número " + poten[0]);
        } else {
            JOptionPane.showMessageDialog(null, "Tu numero: " + poten[0] + " NO es Automorfica,\n ya que sus potencias son: " + poten[1] + " , " + poten[2] + " y " + poten[3]
                    + " y todas NO terminan en el número " + poten[0]);
        }
    }
}
