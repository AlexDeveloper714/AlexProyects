
import javax.swing.JOptionPane;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        while (x != 9) {
            try {
                while (x != 9) {
                    x = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros: de 1 a 8 para hacer operaciones con matrices:"
                            + "\n 1. Conteo de elementos negativos:"
                            + "\n 2. Suma de números mayores a 100:"
                            + "\n 3. Suma de la diagonal principal (Matriz cuadrada)"
                            + "\n 4. Suma de la diagonal secundaria (Matriz cuadrada)"
                            + "\n 5. Suma de cada columna"
                            + "\n 6. Verificar si es simetrica por la diagonal principal:"
                            + "\n 7. Verificar si es triangular superior (solo 0 por debajo de la diagonal secundaria):"
                            + "\n 8. Promedio de filas y columnas:"
                            + "\n 9. Salir:"));
                    switch (x) {
                        case 1:
                            Ej_1 V3 = new Ej_1();
                            V3.llamar();
                            break;
                        case 2:
                            Ej_2 V5 = new Ej_2();
                            V5.llamar();
                            break;
                        case 3:
                            Ej_3 VC = new Ej_3();
                            VC.llamar();
                            break;
                        case 4:
                            Ej_4 VM = new Ej_4();
                            VM.llamar();
                            break;
                        case 5:
                            Ej_5 VS = new Ej_5();
                            VS.llamar();
                            break;
                        case 6:
                            Ej_6 VD = new Ej_6();
                            VD.llamar();
                            break;
                        case 7:
                            Ej_7 VX = new Ej_7();
                            VX.llamar();
                            break;
                        case 8:
                            Ej_8 VZ = new Ej_8();
                            VZ.llamar();
                            break;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite algo valido o use la opcion salir...");
            }

        }

    }
}
