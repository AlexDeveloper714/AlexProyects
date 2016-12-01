package Taller_3;

import javax.swing.JOptionPane;

public class Menu_3 {

    public void imprimirMenu() {

        int n = 0, d = 0, opc_3 = 0;
        JOptionPane.showMessageDialog(null, "Los numeros no cambiaran, asi que recuerdalos bien...");
        n = Integer.parseInt(JOptionPane.showInputDialog("Numerador Fracción 1\n"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Denominador Fracción 1\n"));
        Fraccion F1 = new Fraccion();
        F1.setNum(n);
        F1.setDen(d);
        n = Integer.parseInt(JOptionPane.showInputDialog("Numerador Fracción 2\n"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Denominador Fracción 2\n"));
        Fraccion F2 = new Fraccion();
        F2.setNum(n);
        F2.setDen(d);

        while (opc_3 != 5) {
            try {
                while (opc_3 != 5) {
                    opc_3 = Integer.parseInt(JOptionPane.showInputDialog("Taller Fraccionarios:\n  "
                            + "\n Digite un número para hacer su respectivo procedimiento y presione ENTER:  "
                            + "\n 1. Sumar fraccionarios \n "
                            + "2. Restar fraccionarios \n "
                            + "3. Multiplicar fraccionarios "
                            + "\n 4. Dividir fraccionarios"
                            + "\n 5. Volver"));

                    switch (opc_3) {
                        case 1:
                            Sumar SF = new Sumar();
                            SF.setF1(F1);
                            SF.setF2(F2);
                            Fraccion RES = SF.SumarFracciones();
                            RES.ImprimirFraccion();
                            RES.simplificar();
                            RES.ImprimirFraccion();
                            break;
                        case 2:
                            Restar RF = new Restar();
                            RF.setF1(F1);
                            RF.setF2(F2);
                            Fraccion RES1 = RF.RestarFracciones();
                            RES1.ImprimirFraccion();
                            RES1.simplificar();
                            RES1.ImprimirFraccion();
                            break;
                        case 3:
                            Multiplicar MF = new Multiplicar();
                            MF.setF1(F1);
                            MF.setF2(F2);
                            Fraccion RES2 = MF.MultiplicarFracciones();
                            RES2.ImprimirFraccion();
                            RES2.simplificar();
                            RES2.ImprimirFraccion();
                            break;
                        case 4:
                            Dividir DF = new Dividir();
                            DF.setF1(F1);
                            DF.setF2(F2);
                            Fraccion RES3 = DF.DividirFracciones();
                            RES3.ImprimirFraccion();
                            RES3.simplificar();
                            RES3.ImprimirFraccion();
                            break;
                              case 5:
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "Digite Solo numeros de 1 a 5");
                            break;

                    }
                }
            } catch (NumberFormatException x) {          
                    JOptionPane.showMessageDialog(null, "digite números de 1 a 9, no letras");
                
            }
        }

    }
}
