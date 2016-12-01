package Taller_3;

import javax.swing.JOptionPane;

public class Menu_3 {

    public void imprimirMenu() {
        try {
            int n[] = {0, 0};
            JOptionPane.showMessageDialog(null, "Los numeros no cambiaran, asi que recuerdalos bien...");
            n[0] = Integer.parseInt(JOptionPane.showInputDialog("Numerador Fracción 1\n"));
            n[1] = Integer.parseInt(JOptionPane.showInputDialog("Denominador Fracción 1\n"));
            Fraccion F1 = new Fraccion();
            F1.setNum(n[0]);
            F1.setDen(n[1]);
            n[0] = Integer.parseInt(JOptionPane.showInputDialog("Numerador Fracción 2\n"));
            n[1] = Integer.parseInt(JOptionPane.showInputDialog("Denominador Fracción 2\n"));
            Fraccion F2 = new Fraccion();
            F2.setNum(n[0]);
            F2.setDen(n[1]);
            String x = "";
            String s[] = {"Sumar fraccionarios", "Restar fraccionarios", "Multiplicar fraccionarios", "Dividir fraccionarios", "Volver"};
            while (x != "Volver") {
                while (x != "Volver") {
                    x = (String) JOptionPane.showInputDialog(null, "Seleccione una de las opciones:", "Taller 3", JOptionPane.QUESTION_MESSAGE, null, s, s[0]);
                    switch (x) {
                        case "Sumar fraccionarios":
                            Sumar SF = new Sumar();
                            SF.setF1(F1);
                            SF.setF2(F2);
                            Fraccion RES = SF.SumarFracciones();
                            RES.ImprimirFraccion();
                            RES.simplificar();
                            RES.ImprimirFraccion();
                            break;
                        case "Restar fraccionarios":
                            Restar RF = new Restar();
                            RF.setF1(F1);
                            RF.setF2(F2);
                            Fraccion RES1 = RF.RestarFracciones();
                            RES1.ImprimirFraccion();
                            RES1.simplificar();
                            RES1.ImprimirFraccion();
                            break;
                        case "Multiplicar fraccionarios":
                            Multiplicar MF = new Multiplicar();
                            MF.setF1(F1);
                            MF.setF2(F2);
                            Fraccion RES2 = MF.MultiplicarFracciones();
                            RES2.ImprimirFraccion();
                            RES2.simplificar();
                            RES2.ImprimirFraccion();
                            break;
                        case "Dividir fraccionarios":
                            Dividir DF = new Dividir();
                            DF.setF1(F1);
                            DF.setF2(F2);
                            Fraccion RES3 = DF.DividirFracciones();
                            RES3.ImprimirFraccion();
                            RES3.simplificar();
                            RES3.ImprimirFraccion();
                            break;
                    }
                }
            }
        } catch (NumberFormatException z) {
            JOptionPane.showMessageDialog(null, "digite números de 1 a 9, no letras","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
}
