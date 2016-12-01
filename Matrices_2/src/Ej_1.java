
public class Ej_1 {

    String promedioMatriz(int matriz[][], int m, int n) {
        int i, j, suma = 0;
        String ma = "";
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                suma += matriz[i][j];
                ma += matriz[i][j] + " ";
            }
            int proc[] = new int[m];
            proc[i] = suma / m;
            suma = 0;
            ma += proc[i] + "\n";
        }
        for (j = 0; j < n; j++) {
            for (i = 0; i < m; i++) {
                suma += matriz[i][j];
            }
            int prof[] = new int[n];
            prof[j] = suma / n;
            suma = 0;
            ma += prof[j] + " ";

        }
        return ma;
    }
}
