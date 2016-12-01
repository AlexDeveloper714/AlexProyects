
import javax.swing.*;

public class Ej_3 {

    void llamar() {
        int i, n, m, j, suma = 0;
        String ma = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de filas en la matriz:"));
        m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para ingresar una cantidad de columnas en la matriz:"));
        int valores[][] = new int[m][n];
        if ((m <= 50 || n <= 50) && (m == n)) {
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para guardar en la matriz:"));
                    if (i == j) {
                        suma += valores[i][j];
                    }
                    ma += valores[i][j] + " ";
                }
                ma += "\n";

            }
            JOptionPane.showMessageDialog(null, "La matriz digitada es:\n"
                    + ma + "La suma de la diagonal principal de la matriz es: " + suma);

        } else {
            JOptionPane.showMessageDialog(null, "digite números menores a 50 y la Matriz no es cuadrada"
                    + "\n AMBOS NÚMEROS DEBEN SER IGUALES,INTENTA DE NUEVO");
        }
    }

}
