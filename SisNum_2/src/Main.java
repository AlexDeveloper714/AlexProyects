import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String bin = "", oct = "", hex = "";
        int dec = 0, opc = 0;
        SisDecimal SD = new SisDecimal();
        Binario SB = new Binario();
        Hexa SH = new Hexa();
        Octa SO = new Octa();
        while (opc != 5) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("Taller Conversion\n"
                    + "Digite un número y presione ENTER:\n"
                    + "1. Decimal a todos \n"
                    + "2. Binario a todos \n"
                    + "3. Octal a todos\n"
                    + "4. Hexadecimal a todos \n"
                    + "5.Salir "));
            switch (opc) {
                case 1:
                    dec = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero decimal para convertir: "));
                    SD.setB(dec);
                    bin = SD.binarioDecimal();
                    SD.setB(dec);
                    oct = SD.OctaDecimal();
                    SD.setB(dec);
                    hex = SD.hexaDecimal();
                    if (dec == 0) {
                        JOptionPane.showMessageDialog(null, "Tu numero: 0 "
                                + " \n es en decimal: 0"
                                + "\n es en binario: 0"
                                + "\n y en hexadecimal: 0");
                    } else if (dec > 0) {
                        JOptionPane.showMessageDialog(null, "Tu numero " + dec
                                + " \n es en binario: " + bin
                                + "\n es en octal: " + oct
                                + "\n y en hexadecimal: " + hex);
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
                    if (dec > 0) {
                        JOptionPane.showMessageDialog(null, "Tu numero " + bin
                                + " \n es en decimal: " + dec
                                + "\n es en octal: " + oct
                                + "\n y en hexadecimal: " + hex);
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
                    if (dec > 0) {
                        JOptionPane.showMessageDialog(null, "Tu numero " + oct
                                + " \n es en decimal: " + dec
                                + "\n es en binario: " + bin
                                + "\n y en hexadecimal: " + hex);
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
                    if (dec>0){
                      JOptionPane.showMessageDialog(null, "Tu numero " + hex
                            + " \n es en decimal: " + dec
                            + "\n es en binario: " + bin
                            + "\n y en octal: " + oct);  
                    }      
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    if (opc > 5 || opc < 0) {
                        JOptionPane.showMessageDialog(null, "Digita números de 1 a 5.");
                    }

                    break;
            }
        }

    }

}
