
import javax.swing.JOptionPane;

public class Division {

    public void dividir() {
        double a, b;
        double dividir = 0;
        while (dividir == 0) {
            try {
                a = Double.parseDouble(JOptionPane.showInputDialog("Digite un número para el numerador"));
                b = Double.parseDouble(JOptionPane.showInputDialog("Digite un número para el denominador"));
                if (b <= 0) {
                    JOptionPane.showMessageDialog(null, "El denominador no debe ser 0, vuelve a intentarlo");
                    dividir = 0;
                } else if (a != 0) {
                    dividir = a / b;
                    JOptionPane.showMessageDialog(null, "La division de " + (int) a + "/" + (int) b + " es:" + dividir);
                } else {
                    dividir = a / b;
                    JOptionPane.showMessageDialog(null, "La division de " + (int) a + "/" + (int) b + " es:" + dividir);
                    dividir++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes digitar números mayores a 0 para el denominador");
            }

        }
    }

}
