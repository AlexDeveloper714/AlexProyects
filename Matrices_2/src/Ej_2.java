
import javax.swing.*;

public class Ej_2 {

    String llamar(int matriz[][]) {
        int i, j, c = 0;
        double q, a, v;
        double flu_med[][] = new double[5][6];
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite la velocidad a usar para todos los tubos: "));
        String flu_mat = "", ma = "";
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 6; j++) {
                a = (3.1416 * (matriz[i][j] * matriz[i][j])) / 4;
                flu_med[i][j] = v * a;
                ma += matriz[i][j] + " ";
                flu_mat += flu_med[i][j] + " ";
            }
            ma += "\n";
            flu_mat += "\n";
        }
        JOptionPane.showMessageDialog(null, "Los radios de los 30 tubos son:\n"
                + ma
                + "\n El flujo promedio de cada tubo es: \n"
                + flu_mat);
        return ma;
    }

}
