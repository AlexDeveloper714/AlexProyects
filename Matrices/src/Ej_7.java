
import javax.swing.*;

public class Ej_7 {

    void llamar() {
        int i, n, m, j, c = 0;
        String ma = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de filas en la matriz:"));
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de columnas en la matriz:"));
        int valores[][] = new int[m][n];
        if ((m <= 50 || n <= 50)&&m==n) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para guardar en la matriz:"));
                    if (i - j > 0 && valores[i][j] == 0) {
                        c = c;
                    } else if (i - j > 0) {
                        c++;
                    }
                    ma += valores[i][j] + " ";
                }
                ma += "\n";
            }
            if (c == 0) {
                JOptionPane.showMessageDialog(null, "La matriz digitada es:\n"
                        + ma + "LA MATRIZ ES TRIANGULAR SUPERIOR");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz digitada es:\n"
                        + ma + "LA MATRIZ NO ES TRIANGULAR SUPERIOR");
            }
        } else {
            JOptionPane.showMessageDialog(null, "digite números menores a 50");
        }
    }
}
