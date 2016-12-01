
public class Ej_4 {

    String promedioMatriz(int matriz[][], int m, int n) {
        int i, j, jmax, aux;
        String ma = "";
        for (i = 0; i < m; i++) {
            jmax = n - 1;
            for (j = 0; j < n / 2; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[i][jmax];
                matriz[i][jmax] = aux;
                jmax--;

            }

        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                ma += matriz[i][j] + " ";
            }
            ma += "\n";
        }

        return ma;
    }
}
