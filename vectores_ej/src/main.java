
import javax.swing.*;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0, cantidad = 0, cont = 0;
        boolean Sies = false;
        while (x != 7) {
            try {
                while (x != 7) {
                    x = Integer.parseInt(JOptionPane.showInputDialog("Digite numeros: de 1 a 6 para:"
                            + "\n 1. Suma de valores posteriores a un valor en el vector:"
                            + "\n 2. Saber si el vector es Melchoriforme o no:"
                            + "\n 3. Suma de los hoyos de un vector:"
                            + "\n 4. Suma al positivisar un vector:"
                            + "\n 5. Produccion del leche por vaca"
                            + "\n 6. Inversion de un número:"
                            + "\n 7.Salir"));
                    if (x < 5 && x != 0) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de espacio para el vector"));
                    }
                    int vector[] = new int[cantidad];
                    switch (x) {
                        case 1:
                            for (int i = 0; i < vector.length; i++) {
                                vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a guardar: "));
                            }
                            Vector_sumavol VX = new Vector_sumavol();
                            VX.suma_Vol(vector, cantidad);
                            break;
                        case 2:
                            for (int i = 0; i < vector.length; i++) {
                                vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a guardar: "));
                            }
                            Vector_Melcho V3 = new Vector_Melcho();
                            Sies = V3.Es_Melcho(vector, cantidad);
                            if (Sies == true) {
                                JOptionPane.showMessageDialog(null, "Este vector es Melchoriforme");

                            } else {
                                JOptionPane.showMessageDialog(null, "Este vector NO es Melchoriforme");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < vector.length; i++) {
                                vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a guardar: "));
                            }
                            Vector_Hoyo VL = new Vector_Hoyo();
                            JOptionPane.showMessageDialog(null, "El elemento menor del vector es: " + VL.suma_Hoyos(vector, cantidad));
                            break;
                        case 4:
                            for (int i = 0; i < vector.length; i++) {
                                vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a guardar: "));
                            }
                            Vector_Posi VP = new Vector_Posi();
                            JOptionPane.showMessageDialog(null, "La suma de positivisar el vector es: " + VP.posit_vec(vector, cantidad));
                            break;
                        case 5:
                            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de vacas a ordeñar"));
                            int matriz[][] = new int[cantidad][7];
                            for (int i = 0; i < cantidad; i++) {
                                cont++;
                                for (int j = 0; j < 7; j++) {
                                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite la leche que produjo la vaca " + cont + " :"));
                                }
                            }
                            Matriz_vaca MV = new Matriz_vaca();
                            MV.produc_hato(matriz, cantidad);
                            break;
                        case 6:
                            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite un número a invertir (la cifra final debe ser mayor a 0)"));
                            if (inv_num(cantidad).equals("")) {
                                JOptionPane.showMessageDialog(null, "No puedes digitar un número que tenga en su ultima cifra sea 0");
                            } else {
                                JOptionPane.showMessageDialog(null, "El número invertido es: " + inv_num(cantidad));
                            }
                            break;

                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite algo valido o use la opcion salir...");
            }

        }

    }

    public static String inv_num(int num) {
        if (num % 10 == 0) {
            return "";
        } else {
            return (num % 10) + inv_num(num / 10);
        }
    }
}
