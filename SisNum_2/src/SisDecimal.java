/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
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
        while (b > 0) {
            R = b % 2;
            b = b / 2;
            bin = R + bin;
        }

        return bin;
    }

    public String OctaDecimal() {
        int R = 0;
        String octa = " ";
        while (b > 0) {
            R = b % 8;
            b = b / 8;
            octa = R + octa;
        }
        
        return octa;
    }

    public String hexaDecimal() {
        int R = 0;
        String hex = " ";
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
        
        return hex;
    }

}
