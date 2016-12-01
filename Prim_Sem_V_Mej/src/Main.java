
import Taller_1.Menu_1;
import Taller_2.Menu_2;
import Taller_3.Menu_3;
import Taller_4.Menu_4;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String x = "";
        String s[] = {"Taller 1", "Taller 2", "Taller 3", "Taller 4", "Salir"};
        while (x != "Salir") {
            try {
                x = (String) JOptionPane.showInputDialog(null, "Seleccione una de las opciones:", "Primer Semestre", JOptionPane.QUESTION_MESSAGE, null, s, s[0]);
                switch (x) {
                    case "Taller 1":
                        Menu_1 M1 = new Menu_1();
                        M1.imprimirMenu();
                        break;
                    case "Taller 2":
                        Menu_2 M2 = new Menu_2();
                        M2.imprimirMenu();
                        break;
                    case "Taller 3":
                        Menu_3 M3 = new Menu_3();
                        M3.imprimirMenu();
                        break;
                    case "Taller 4":
                        Menu_4 M4 = new Menu_4();
                        M4.imprimirMenu();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Hasta pronto...","Despedida",1);
                        break;

                }
            } catch (NullPointerException z) {
                JOptionPane.showMessageDialog(null, "Debes elegir una opción, "
                        + "\n si no te devolveras al menu principal...","Advertencia",JOptionPane.WARNING_MESSAGE);
            }

        }

    }

}
