
import javax.swing.*;

public class Matriz_vaca {

    void produc_hato(int matriz[][], int vacas) {
        int i, j, pos = 0;
        String prod_tot = "";
        int produ_vac[] = new int[vacas];
        for (i = 0; i < vacas; i++) {
            for (j = 0; j < 7; j++) {
                produ_vac[i] += matriz[i][j];
            }
            prod_tot += produ_vac[i] + " ";
            if (produ_vac[0] > produ_vac[i]) {
                pos = 1;
            } else  {
                pos = i + 1;
            }
        }
        JOptionPane.showMessageDialog(null, "La vaca que produjo más leche es:  " + pos );
        JOptionPane.showMessageDialog(null, "La produccion del hato por vaca a la semana es: \n" + prod_tot);
    }

}
