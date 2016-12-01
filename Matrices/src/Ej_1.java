
import javax.swing.*;

public class Ej_1 {

    void llamar() {
        
        int i, n, m, j,c = 0;
        String ne = "", ma = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de filas en la matriz:"));
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de columnas en la matriz:"));
        int valores[][] = new int[m][n];
        if (m <= 50 || n <= 50) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para guardar en la matriz:"));
                    if (valores[i][j] < 0) {
                        ne += valores[i][j] + " ";
                        c++;
                    }
                    ma += valores[i][j] + " ";
                }
                ma += "\n";

            }
            if (c > 0) {
                JOptionPane.showMessageDialog(null, "La matriz digitada es:\n"
                        + ma + "La cantidad de negativos que hay son: " + c
                        + "\n Estos son: " + ne);

            } else {
                JOptionPane.showMessageDialog(null, "La matriz digitada es:\n"
                        + ma + "NO EXISTEN NEGATIVOS EN LA MATRIZ");
            }

        } else {
            JOptionPane.showMessageDialog(null, "digite números menores a 50");
        }

    }
}
