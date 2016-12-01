
import javax.swing.*;

public class Ej_6 {

    void llamar() {

        int i, n, m, j;
        String ver1 = "", ma = "", ver2 = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de filas en la matriz:"));
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de columnas en la matriz:"));
        int valores[][] = new int[m][n];
        if ((m <= 50 || n <= 50) && m == n) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para guardar en la matriz:"));
                    if (i - j > 0) {
                        ver1 += valores[i][j] + " ";
                    }
                    if (i - j < 0) {
                        ver2 += valores[i][j] + " ";
                    }
                    ma += valores[i][j] + " ";
                }
                ma += "\n";

            }
            if (ver1.equals(ver2)) {
                JOptionPane.showMessageDialog(null, "La matriz digitada es:\n"
                        + ma + "Esa matriz es simetrica por al daigonal principal");

            } else {
                JOptionPane.showMessageDialog(null, "La matriz digitada es:\n"
                        + ma + "Esa matriz NO es simetrica por la diagonal principal");
            }

        } else {
            JOptionPane.showMessageDialog(null, "digite números menores a 50,"
                    + "\nademas ambos deben ser iguales para compobar simetria");
        }
    }
}
