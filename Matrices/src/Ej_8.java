
import javax.swing.*;

public class Ej_8 {

    String llamar() {
        int i, n, m, j, suma = 0;
        String ma = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de filas en la matriz:"));
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de columnas en la matriz:"));
        int valores[][] = new int[m][n];
        if (m <= 50 || n <= 50) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para guardar en la matriz:"));
                    suma += valores[i][j];
                    ma += valores[i][j] + " ";
                }
                int proc[] = new int[m];
                proc[i] = suma / m;
                suma = 0;
                ma += "(" + proc[i] + ")\n";
            }
            for (j = 0; j < n; j++) {
                for (i = 0; i < m; i++) {
                    suma += valores[i][j];
                }
                int prof[] = new int[n];
                prof[j] = suma / n;
                suma = 0;
                ma += "(" + prof[j] + ")";

            }

            JOptionPane.showMessageDialog(null, "La matriz digitada \n(con los promedio de filas"
                    + " y columnas entre parentesis)es:\n" + ma);
        } else {
            JOptionPane.showMessageDialog(null, "digite números menores a 50");
        }
        return ma;
    }
}
