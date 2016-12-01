
import javax.swing.*;

public class Vector_sumavol {

    void suma_Vol(int vector[], int filas) {
        int i, sumavalores = 0, total = 0;
        String acum = "";
        for (i = 0; i <= filas - 2; i++) {
            sumavalores += vector[i];
            acum += vector[i] + " ";
            if (vector[i + 1] == sumavalores) {
                JOptionPane.showMessageDialog(null, "La suma de los elementos del vector: "
                        + acum + " da el vector el cual es: " + vector[i + 1]);
                total++;
            }

        }
        if (total > 0) {
            JOptionPane.showMessageDialog(null, "Los elementos del vector que son iguales a las sumas"
                    + "de los elemento anteriores son:" + total);
        } else {
            JOptionPane.showMessageDialog(null, "No existe elementos que sean iguales a la"
                    + "suma de los elementos anteriores");
        }

    }
}
