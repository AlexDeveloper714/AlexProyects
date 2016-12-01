package Taller_2;

import javax.swing.JOptionPane;

public class Menu_2 {

    public void imprimirMenu() {
        int opc_2 = 0, a_2[] ={0,0,0};
        while (opc_2 != 7) {
            try {
                while (opc_2 != 7) {
                    opc_2 = Integer.parseInt(JOptionPane.showInputDialog("Taller 2. \n  "
                            + "\n Digite un número para hacer su respectivo procedimiento y presione ENTER:  "
                            + "\n 1. Paralelogramo de * "
                            + "\n 2. Triangulo Rectangulo de * "
                            + "\n 3. Rectangulo de * "
                            + "\n 4. Cuadrado en X de * "
                            + "\n 5. Triangulo Iscoceles de * "
                            + "\n 6. Rombo de * \n "
                            + "7. Volver"));
                    switch (opc_2) {
                        case 1:
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que define la altura del paralelogramo: "));
                            a_2[1] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que define el ancho del paralelogramo: "));
                            Paral verPa = new Paral(a_2[0], a_2[1]);
                            verPa.hacer();
                            break;
                        case 2:
                            a_2[2] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que define la altura para hacer un triangulo rectangulo: "));
                            Tria verTri = new Tria(a_2[2]);
                            verTri.hacer();
                            break;
                        case 3:
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que define la altura del rectangulo: "));
                            a_2[1] = Integer.parseInt(JOptionPane.showInputDialog("Digita el el número que define el ancho del rectangulo: "));
                            Rec VerRec = new Rec(a_2[0], a_2[1]);
                            VerRec.hacer();
                            break;
                        case 4:
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número para hacer el cuadrado en X: "));
                            Cua_X verCua_X = new Cua_X(a_2[0]);
                            verCua_X.hacer();
                            break;
                        case 5:
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número para hacer un traingulo iscoceles: "));
                            Tria_Isc verIsc = new Tria_Isc(a_2[0]);
                            verIsc.hacer();
                            break;
                        case 6:
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número para hacer el rombo: "));
                            Rombo verRom = new Rombo(a_2[0]);
                            verRom.hacer();
                            break;
                        case 7:
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Digite solo números de 1 a 7");
                            break;
                    }
                }
            } catch (NumberFormatException x) {
                    JOptionPane.showMessageDialog(null, "digite números de 1 a 9, no letras");
            }
        }

    }
}
