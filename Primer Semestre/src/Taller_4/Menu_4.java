package Taller_4;

import javax.swing.JOptionPane;

public class Menu_4 {

    public void imprimirMenu() {
        String bin = "", oct = "", hex = "", rom = "";
        int dec = 0, opc_4 = 0;
        SisDecimal SD = new SisDecimal();
        Binario SB = new Binario();
        Hexa SH = new Hexa();
        Octa SO = new Octa();
        Roma SR = new Roma();
        while (opc_4 != 6) {

            try {
                while (opc_4 != 6) {

                    opc_4 = Integer.parseInt(JOptionPane.showInputDialog("Taller Conversion\n"
                            + "Digite un número y presione ENTER:\n"
                            + "1. Decimal a todos \n"
                            + "2. Binario a todos \n"
                            + "3. Octal a todos\n"
                            + "4. Hexadecimal a todos \n"
                            + "5. Romano a todos \n"
                            + "6. Volver"));
                    switch (opc_4) {
                        case 1:
                            dec = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero decimal para convertir (los romanos los convertirá hasta 3999): "));
                            SD.setB(dec);
                            bin = SD.binarioDecimal();
                            SD.setB(dec);
                            oct = SD.OctaDecimal();
                            SD.setB(dec);
                            hex = SD.hexaDecimal();
                            SD.setB(dec);
                            rom=SD.RomaDecimal();
                            if (dec == 0) {
                                JOptionPane.showMessageDialog(null, "Tu numero: 0 "
                                        + " \n es en decimal: 0"
                                        + "\n es en binario: 0"
                                        + "\n y en hexadecimal: 0"
                                        + "\n y en romano: NO EXISTE");
                            } 
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu numero " + dec
                                        + " \n es en binario: " + bin
                                        + "\n es en octal: " + oct
                                        + "\n y en hexadecimal: " + hex
                                        + "\ny en romano: " + rom);
                            }

                            break;

                        case 2:
                            bin = JOptionPane.showInputDialog("Digite un nùmero binario:");
                            SB.setB(bin);
                            dec = SB.binarioDecimal();
                            SD.setB(dec);
                            oct = SD.OctaDecimal();
                            SD.setB(dec);
                            hex = SD.hexaDecimal();
                            SD.setB(dec);
                            rom=SD.RomaDecimal();
                            
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu binario " + bin
                                        + " \n es en decimal: " + dec
                                        + "\n es en octal: " + oct
                                        + "\n y en hexadecimal: " + hex
                                        + "\n y en romano: " + rom);
                            }
                            break;
                        case 3:
                            oct = JOptionPane.showInputDialog("Digite un nùmero octal:");
                            SO.setB(oct);
                            dec = SO.OctaDecimal();
                            SD.setB(dec);
                            bin = SD.binarioDecimal();
                            SD.setB(dec);
                            hex = SD.hexaDecimal();
                            SD.setB(dec);
                            rom=SD.RomaDecimal();
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu octal " + oct
                                        + " \n es en decimal: " + dec
                                        + "\n es en binario: " + bin
                                        + "\n y en hexadecimal: " + hex
                                        + "\n y en romano: " + rom);
                            }
                            break;
                        case 4:
                            hex = JOptionPane.showInputDialog("Digite un nùmero hexadecimal(Letras de A a F En mayusculas):");
                            SH.setB(hex);
                            dec = SH.HexaDecimal();
                            SD.setB(dec);
                            oct = SD.OctaDecimal();
                            SD.setB(dec);
                            bin = SD.binarioDecimal();
                            SD.setB(dec);
                            rom=SD.RomaDecimal();
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu hexadecimal " + hex
                                        + " \n es en decimal: " + dec
                                        + "\n es en binario: " + bin
                                        + "\n en octal: " + oct
                                        + "\n y en romano: " + rom);
                            }
                            break;
                        case 5:
                            rom = JOptionPane.showInputDialog("Digite un nùmero romano en mayusculas(solo es posible hasta 4999):");
                            SR.setB(rom);
                            dec = SR.RomaDecimal();
                            SD.setB(dec);
                            oct = SD.OctaDecimal();
                            SD.setB(dec);
                            bin = SD.binarioDecimal();
                            SD.setB(dec);
                            hex = SD.hexaDecimal();
                            SD.setB(dec);
                            if (dec > 0) {
                                JOptionPane.showMessageDialog(null, "Tu romano " + rom
                                        + " \n es en decimal: " + dec
                                        + "\n es en binario: " + bin
                                        + "\n en octal: " + oct
                                        + "\n y en hexadecimal: " + hex);
                            }
                            break;
                        case 6:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Digita números de 1 a 6.");
                            break;
                    }
                }

            } catch (NumberFormatException m) {
                    JOptionPane.showMessageDialog(null, "digite números de 1 a 9, no letras");
                
            }
        }

    }

}
