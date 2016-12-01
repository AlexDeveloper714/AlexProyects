
import javax.swing.*;

public class Entero {

    public void verficarEntero() {
        int m = 5;
        boolean Sies = false;
        while (Sies == false) {
            try {
                m = Integer.parseInt(JOptionPane.showInputDialog("Digite un número mayor a 0 para saber si es entero o no"));
                if (m >= 0) {
                    Sies = true;
                    JOptionPane.showMessageDialog(null, "Tu número " + m + " es ENTERO!!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Debes digitar números mayores a 0", "ADVERTENCIA",2);
                    Sies = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digitaste mal, por favor vuelva a digitar un número que sea ENTERO y no digites letras", "ERROR", 0);
            }

        }

    }

}
