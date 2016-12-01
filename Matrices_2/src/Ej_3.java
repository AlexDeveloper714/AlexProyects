
import javax.swing.*;

public class Ej_3 {

    String mes_temp(int matriz[][]) {
        int i, j, aux, max, min, tempmax, tempmin;
        int temp_mes[][] = new int[15][3];
        String ma = "";
        for (i = 0; i < 15; i++) {
            for (j = 0; j < 2; j++) {
                temp_mes[i][j] = matriz[i][j];
            }
        }
        max = 0;
        tempmin = tempmax = max;
        min = temp_mes[0][0];
        for (i = 0; i < 15; i++) {
            for (j = 0; j < 3; j++) {
                if (temp_mes[i][0] > temp_mes[i][1]) {
                    aux = temp_mes[i][1];
                    temp_mes[i][1] = temp_mes[i][0];
                    temp_mes[i][0] = aux;
                }
                if (temp_mes[i][2] == 0) {
                    temp_mes[i][2] = (temp_mes[i][0] + temp_mes[i][1]) / 2;
                }
                if (max < temp_mes[i][j]) {
                    max = temp_mes[i][j];
                }
                if (min > temp_mes[i][j] && j < 2) {
                    min = temp_mes[i][j];
                }
                if (temp_mes[i][j] > 10 && j < 2) {
                    tempmax++;
                } else if (j<2){
                    tempmin++;
                }
                ma += temp_mes[i][j] + " ";
            }
            ma += "\n";
        }
        JOptionPane.showMessageDialog(null, "La matriz digitada es:\n"
                + ma);
        JOptionPane.showMessageDialog(null, " El maximo de temperatura es: " + max + " y la minima es de: " + min
                + "\n la cantidad de dias que la temperatura supera los 10°C es de: " + tempmax
                + " y  la cantidad de dias que la temperatura no supera los 10°C es de: " + tempmin);

        return ma;
    }

}
