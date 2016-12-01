package Taller_4;

import javax.swing.JOptionPane;

public class Menu_4 {

    public void imprimirMenu() {
        String sis[] ={"","","",""};
        String x = "";
        String s[] = {"Decimal a todos", "Binario a todos", "Octal a todos", "Hexadecimal a todos", "Romano a todos", "Volver"};
        int dec = 0;
        SisDecimal SD = new SisDecimal();
        Binario SB = new Binario();
        Hexa SH = new Hexa();
        Octa SO = new Octa();
        Roma SR = new Roma();
            try {
                while (x != "Volver") {
                    x = (String) JOptionPane.showInputDialog(null, "Seleccione una de las opciones:", "Taller 4", JOptionPane.QUESTION_MESSAGE, null, s, s[0]);
                    switch (x) {
                        case "Decimal a todos":
                            dec = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero decimal para convertir (los romanos los convertirá hasta 3999): "));
                            SD.setB(dec);
                            sis[0] = SD.binarioDecimal();
                            SD.setB(dec);
                            sis[1] = SD.OctaDecimal();
                            SD.setB(dec);
                            sis[2] = SD.hexaDecimal();
                            SD.setB(dec);
                            sis[3]=SD.RomaDecimal();
                            if (dec == 0) {
                                JOptionPane.showMessageDialog(null, "Tu numero: 0 "
                                        + " \n es en decimal: 0"
                                        + "\n es en binario: 0"
                                        + "\n y en hexadecimal: 0"
                                        + "\n y en romano: NO EXISTE");
                            } 
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu numero " + dec
                                        + " \n es en binario: " + sis[0]
                                        + "\n es en octal: " + sis[1]
                                        + "\n y en hexadecimal: " + sis[2]
                                        + "\ny en romano: " + sis[3]);
                            }

                            break;

                        case "Binario a todos":
                            sis[0] = JOptionPane.showInputDialog("Digite un nùmero binario:");
                            SB.setB(sis[0]);
                            dec = SB.binarioDecimal();
                            SD.setB(dec);
                            sis[1] = SD.OctaDecimal();
                            SD.setB(dec);
                            sis[2] = SD.hexaDecimal();
                            SD.setB(dec);
                            sis[3]=SD.RomaDecimal();
                            
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu binario " + sis[0]
                                        + " \n es en decimal: " + dec
                                        + "\n es en octal: " + sis[1]
                                        + "\n y en hexadecimal: " + sis[2]
                                        + "\n y en romano: " + sis[3]);
                            }
                            break;
                        case "Octal a todos":
                            sis[1] = JOptionPane.showInputDialog("Digite un nùmero octal:");
                            SO.setB(sis[1]);
                            dec = SO.OctaDecimal();
                            SD.setB(dec);
                            sis[0] = SD.binarioDecimal();
                            SD.setB(dec);
                            sis[2] = SD.hexaDecimal();
                            SD.setB(dec);
                            sis[3]=SD.RomaDecimal();
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu octal " + sis[1]
                                        + " \n es en decimal: " + dec
                                        + "\n es en binario: " + sis[0]
                                        + "\n y en hexadecimal: " + sis[2]
                                        + "\n y en romano: " + sis[3]);
                            }
                            break;
                        case "Hexadecimal a todos":
                            sis[2] = JOptionPane.showInputDialog("Digite un nùmero hexadecimal(Letras de A a F En mayusculas):");
                            SH.setB(sis[2]);
                            dec = SH.HexaDecimal();
                            SD.setB(dec);
                            sis[1] = SD.OctaDecimal();
                            SD.setB(dec);
                            sis[0] = SD.binarioDecimal();
                            SD.setB(dec);
                            sis[3]=SD.RomaDecimal();
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu hexadecimal " + sis[2]
                                        + " \n es en decimal: " + dec
                                        + "\n es en binario: " + sis[0]
                                        + "\n en octal: " + sis[1]
                                        + "\n y en romano: " + sis[3]);
                            }
                            break;
                        case "Romano a todos":
                            sis[3] = JOptionPane.showInputDialog("Digite un nùmero romano en mayusculas(solo es posible hasta 4999):");
                            SR.setB(sis[3]);
                            dec = SR.RomaDecimal();
                            SD.setB(dec);
                            sis[1] = SD.OctaDecimal();
                            SD.setB(dec);
                            sis[0] = SD.binarioDecimal();
                            SD.setB(dec);
                            sis[2] = SD.hexaDecimal();
                            SD.setB(dec);
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu romano " + sis[3]
                                        + " \n es en decimal: " + dec
                                        + "\n es en binario: " + sis[0]
                                        + "\n en octal: " + sis[1]
                                        + "\n y en hexadecimal: " + sis[2]);
                            }
                            break;
                    }
                }

            } catch (NullPointerException z) {
                    JOptionPane.showMessageDialog(null, "Debes elegir una opción , "
                        + "\n si no te devolveras al menu principal...","Advertencia",JOptionPane.WARNING_MESSAGE);
                
            }
    }

}
