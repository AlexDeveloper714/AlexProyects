package Taller_4;

import javax.swing.JOptionPane;

public class SisDecimal {

    private int b;

    public SisDecimal() {
        b = 0;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String binarioDecimal() {
        int R = 0;
        String bin = " ";
        try {
            while (b > 0) {
                R = b % 2;
                b = b / 2;
                bin = R + bin;
            }
        } catch (NumberFormatException m) {
            JOptionPane.showMessageDialog(null, "Digita solo números","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        return bin;
    }

    public String OctaDecimal() {
        int R = 0;
        String octa = " ";
        try {
            while (b > 0) {
                R = b % 8;
                b = b / 8;
                octa = R + octa;
            }
        } catch (NumberFormatException m) {
            JOptionPane.showMessageDialog(null, "Digita solo números");
        }

        return octa;
    }

    public String hexaDecimal() {
        int R = 0;
        String hex = " ";
        try {
            while (b > 0) {
                R = b % 16;
                switch (R) {
                    case 10:
                        hex = "A" + hex;
                        break;
                    case 11:
                        hex = "B" + hex;
                        break;
                    case 12:
                        hex = "C" + hex;
                        break;
                    case 13:
                        hex = "D" + hex;
                        break;
                    case 14:
                        hex = "E" + hex;
                        break;
                    case 15:
                        hex = "F" + hex;
                        break;
                    default:
                        hex = R + hex;
                        break;
                }
                b = b / 16;
            }
        } catch (NumberFormatException m) {
            JOptionPane.showMessageDialog(null, "Digita solo números","Advertencia",JOptionPane.WARNING_MESSAGE);
        }

        return hex;
    }

    public String RomaDecimal() {
        int a[] = {0,0,0};
        String rom = "", lec = " ",mec="";
        try {
            lec = Integer.toString(b);
            for (int i = lec.length() - 1; i >= 0; i--) {
                a[0] = Integer.parseInt(Character.toString(lec.charAt(i)));
                a[1]++;
                switch (a[1]) {
                    case 1:
                        if (a[0] < 4) {
                            for (a[2] = 0; a[2] < a[0]; a[2]++) {
                                rom = "I" + rom;
                            }
                        }
                        if (a[0] == 4) {
                            rom = "IV" + rom;
                        }
                        if (a[0] == 5) {
                            rom = "V" + rom;
                        }
                        if (a[0] > 4 && a[0] < 9) {
                            if (a[0] > 5 && a[0] < 9) {
                                mec=rom;
                                rom = "V";
                                for (a[2] = 5; a[2] < a[0]; a[2]++) {
                                    rom = rom + "I";
                                }
                                rom=rom+mec;
                            }
                        }
                        if (a[0] == 9) {
                            rom = "IX" + rom;
                        }
                        break;
                    case 2:
                        if (a[0] < 4) {
                            for (a[2] = 0; a[2] < a[0]; a[2]++) {
                                rom = "X" + rom;
                            }
                        }
                        if (a[0] == 4) {
                            rom = "XL" + rom;
                        }
                        if (a[0] > 4 && a[0] < 9) {
                             mec=rom;
                            rom = "L";
                            for (a[2] = 5; a[2] < a[0]; a[2]++) {
                                rom = rom + "X";
                            }
                            rom=rom+mec;
                        }
                        if (a[0] == 9) {
                            rom = "XC" + rom;
                        }
                        break;
                    case 3:
                        if (a[0] < 4) {
                            for (a[2] = 0; a[2] < a[0]; a[2]++) {
                                rom = "C" + rom;
                            }
                        }
                        if (a[0] == 4) {
                            rom = "CD" + rom;
                        }
                        if (a[0] > 4 && a[0] < 9) {
                            mec=rom;
                            rom = "D";
                            for (a[2] = 5; a[2] < a[0]; a[2]++) {
                                rom = rom + "C";
                            }
                            rom=rom+mec;
                            
                        }
                        if (a[0] == 9) {
                            rom = "CM" + rom;
                        }

                        break;
                    case 4:
                        if (a[0] < 4) {
                            for (a[2] = 0; a[2] < a[0]; a[2]++) {
                                rom = "M" + rom;
                            }
                        } else {
                            rom = "No se puede hacer, solo hasta 3999";
                        }
                        break;
                    default:
                        rom = "No se puede hacer, solo hasta 3999";
                }

            }

        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(null, "Este proceso no se puede hacer...","Advertencia",JOptionPane.WARNING_MESSAGE);
        }

        return rom;
    }
}
