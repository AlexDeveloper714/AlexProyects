
import Taller_1.Menu_1;
import Taller_2.Menu_2;
import Taller_3.Menu_3;
import Taller_4.Menu_4;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        while (n != 5) {
            try {
                while (n != 5) {
                    n = Integer.parseInt(JOptionPane.showInputDialog("Primer Semestre: \n"
                            + "\n Digite un número para hacer su respectivo procedimiento y presione ENTER:  "
                            + "\n 1. Hacer el Taller 1 "
                            + "\n 2. Hacer el Taller 2 "
                            + "\n 3. Hacer el Taller 3 "
                            + "\n 4. Hacer el Taller 4"
                            + "\n 5. Salir \n"));
                    switch (n) {
                        case 1:
                            Menu_1 M1 = new Menu_1();
                            M1.imprimirMenu();
                            break;
                        case 2:
                            Menu_2 M2 = new Menu_2();
                            M2.imprimirMenu();
                            break;
                        case 3:
                            Menu_3 M3 = new Menu_3();
                            M3.imprimirMenu();
                            break;
                        case 4:
                            Menu_4 M4 = new Menu_4();
                            M4.imprimirMenu();
                            break;
                        case 5:
                            break;
                        default:
                            n = Integer.parseInt(JOptionPane.showInputDialog("\n Por favor escriba un número de 1 a 4"
                                    + "\n Recuerda:"
                                    + "\n 1. Hacer el Taller 1 "
                                    + "\n 2. Hacer el Taller 2 "
                                    + "\n 3. Hacer el Taller 3 "
                                    + "\n 4. Hacer el Taller 4"
                                    + "\n 5. Salir"));
                            break;

                    }
                }

            } catch (NumberFormatException m) {

                JOptionPane.showMessageDialog(null, "Por favor escriba un número de 1 a 4, no letras");
            }

        }

    }

}
