import javax.swing.*;

public class main {

    public static void main(String[] args) {
        int x = 0, m = 0, n = 0;
        while (x != 4) {
            try {
                while (x != 4) {
                    x = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros: de 1 a 4 para hacer operaciones:"
                            + "\n 1. Promedio de filas y columnas de una matriz:"
                            + "\n 2. Flujo de los tubos con una velocidad unica :"
                            + "\n 3. Temperaturas maximas y minimas de ENERO con conteo de dias y promedio"
                            + "\n 4. Salir:"));
                    switch (x) {
                        case 1:
                            m = Integer.parseInt(JOptionPane.showInputDialog("Digite número de filas en la matriz"));
                            n = Integer.parseInt(JOptionPane.showInputDialog("Digite número de columnas en la matriz"));
                            int matriz[][] = new int[m][n];
                            for (int i = 0; i < m; i++) {
                                for (int j = 0; j < n; j++) {
                                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para conservar en la matriz"));
                                }
                            }
                            Ej_1 V3 = new Ej_1();
                            Ej_4 V4 = new Ej_4();
                            JOptionPane.showMessageDialog(null, "La matriz digitada \n con los promedio de filas"
                                    + " y columnas es:\n" + V3.promedioMatriz(matriz, m, n));
                            JOptionPane.showMessageDialog(null, "La matriz digitada \n con las columnas cambiadas es:\n" + V4.promedioMatriz(matriz, m, n));
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "La cantidad de radios a guardar son 30, es decir que hay 30 tubos:");
                            int matriz_ve[][] = new int[5][6];
                            int c=0;
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < 6; j++) {
                                    c++;
                                    matriz_ve[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite el diametro del tubo " + c +" :"));
                                }
                            }
                            Ej_2 V5 = new Ej_2();
                            V5.llamar(matriz_ve);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Se asume que el mes de ENERO tiene los 30 dias...");
                            int matriz2[][] = new int[15][2];
                            int dia = 0;
                            for (int i = 0; i < 15; i++) {
                                for (int j = 0; j < 2; j++) {
                                    dia++;
                                    matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite la temperatura de ENERO en el dia: " + dia));
                                }
                            }
                            Ej_3 VC = new Ej_3();
                            VC.mes_temp(matriz2);
                            break;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite algo valido o use la opcion salir...");
            }

        }

    }
}
