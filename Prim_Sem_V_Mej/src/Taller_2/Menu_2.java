package Taller_2;

import javax.swing.JOptionPane;

public class Menu_2 {

    public void imprimirMenu() {
        String  x = "";
        String s[] = {"Paralelogramo de *", "Triangulo Rectangulo de *", "Rectangulo de *", "Cuadrado en X de *", "Triangulo Iscoceles de *", "Rombo de *", "Volver"};
        int a_2[] = {0, 0, 0};
        while (x != "Volver") {
            try {
                while (x != "Volver") {
                    x = (String) JOptionPane.showInputDialog(null, "Seleccione una de las opciones:", "Taller 2", JOptionPane.QUESTION_MESSAGE, null, s, s[0]);
                    switch (x) {
                        case "Paralelogramo de *":
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que define la altura del paralelogramo: "));
                            a_2[1] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que define el ancho del paralelogramo: "));
                            Paral verPa = new Paral(a_2[0], a_2[1]);
                            verPa.hacer();
                            break;
                        case "Triangulo Rectangulo de *":
                            a_2[2] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que define la altura para hacer un triangulo rectangulo: "));
                            Tria verTri = new Tria(a_2[2]);
                            verTri.hacer();
                            break;
                        case "Rectangulo de *":
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que define la altura del rectangulo: "));
                            a_2[1] = Integer.parseInt(JOptionPane.showInputDialog("Digita el el número que define el ancho del rectangulo: "));
                            Rec VerRec = new Rec(a_2[0], a_2[1]);
                            VerRec.hacer();
                            break;
                        case "Cuadrado en X de *":
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número para hacer el cuadrado en X: "));
                            Cua_X verCua_X = new Cua_X(a_2[0]);
                            verCua_X.hacer();
                            break;
                        case "Triangulo Iscoceles de *":
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número para hacer un traingulo iscoceles: "));
                            Tria_Isc verIsc = new Tria_Isc(a_2[0]);
                            verIsc.hacer();
                            break;
                        case "Rombo de *":
                            a_2[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número para hacer el rombo: "));
                            Rombo verRom = new Rombo(a_2[0]);
                            verRom.hacer();
                            break;
                    }
                }
            } catch (NumberFormatException z) {
                JOptionPane.showMessageDialog(null, "digite números de 1 a 9, no letras","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
        }

    }
}
