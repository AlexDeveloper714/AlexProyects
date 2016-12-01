
import javax.swing.*;

public class Ej_2 {

    void llamar() {
        int i, n, m, j, c = 0;
        String mas100 = "", ma = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de filas en la matriz:"));
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de columnas en la matriz:"));
        int valores[][] = new int[m][n];
        if (m <= 50 || n <= 50) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para guardar en la matriz:"));
                    if (valores[i][j] > 100) {
                        mas100 += valores[i][j] + " ";
                        c += valores[i][j];
                    }
                    ma += valores[i][j] + " ";
                }
                ma += "\n";

            }
            JOptionPane.showMessageDialog(null, "La matriz digitada es:\n"
                    + ma + "La suuma de elementos mayores a 100 es; " + c
                    + "\n Estos son: " + mas100);

        } else {
            JOptionPane.showMessageDialog(null, "digite números menores a 50");
        }

    }

}
