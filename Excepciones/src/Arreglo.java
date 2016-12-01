
import javax.swing.*;

public class Arreglo {

    public void Arreglo() {
        int valores[] = {4, 5, 7, 8, 9}, indice = 0;
        boolean Falla = true;
        JOptionPane.showMessageDialog(null, "Este arreglo es de 0 a 4");
        while (Falla == true) {
            try {
                indice = Integer.parseInt(JOptionPane.showInputDialog("Digite un indice para el arreglo"));
                valores[indice] = 15;
                if (indice < 5) {
                    Falla = false;
                    JOptionPane.showMessageDialog(null, "El valor en el indice " + indice +" es: " + valores[indice]);
                }

            } catch (ArrayIndexOutOfBoundsException error) {
                JOptionPane.showMessageDialog(null, "Indice fuera de rango");
                Falla = true;
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Digite un número valido");
                Falla = true;
            }

        }

    }

}
