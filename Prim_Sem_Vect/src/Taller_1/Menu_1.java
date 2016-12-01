package Taller_1;

import javax.swing.JOptionPane;

public class Menu_1 {

    public void imprimirMenu() {
        String diaSemana = "", pali = "";
        int opc = 0;
        int a_1[] = {0, 0},dma[]={0,0,0},a_e[]={0,0,0,0,0};
        while (opc != 10) {
            try {
                while (opc != 10) {
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Taller 1. \n  "
                            + "\n Digite un número para hacer su respectivo procedimiento y presione ENTER:  "
                            + "\n 1. Fibonacci "
                            + "\n 2. Factorial "
                            + "\n 3. Potencia "
                            + "\n 4. Binario "
                            + "\n 5. Primo "
                            + "\n 6. Fraccion "
                            + "\n 7. Suma de Primos "
                            + "\n 8. Dia de la Semana"
                            + "\n 9. Palindromo"
                            + "\n 10. Volver"));
                    switch (opc) {
                        case 1:
                            a_1[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un nùmero para imprimir tu fibonacci:"));
                            Fibonacci verFi = new Fibonacci(a_1[0]);
                            verFi.hacer();
                            break;
                        case 2:
                            a_1[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número para imprimir el factorial: "));
                            Facto verFa = new Facto(a_1[0]);
                            verFa.hacer();
                            break;
                        case 3:
                            a_1[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que quieres hacer  la base: "));
                            a_1[1] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número que quieres hacer el exponente: "));
                            Expo verEx = new Expo(a_1[0], a_1[1]);
                            verEx.hacer();
                            break;
                        case 4:
                            a_1[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número para convertir a binario: "));
                            Bina verBi = new Bina(a_1[0]);
                            verBi.hacer();
                            break;
                        case 5:
                            a_1[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número para saber si es primo o no: "));
                            Primo verPri = new Primo(a_1[0]);
                            verPri.hacer();
                            break;
                        case 6:
                            a_1[0] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número dividendo o numerador: "));
                            a_1[1] = Integer.parseInt(JOptionPane.showInputDialog("Digita el número divisor o denominador: "));
                            Simpli verSim = new Simpli(a_1[0], a_1[1]);
                            verSim.hacer();
                            break;
                        case 7:
                            a_1[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite el número para mostrar todos los primos de 5 hasta ese número y mostrar la suma de todos los primos"));
                            PrimoSuma verPriSu = new PrimoSuma(a_1[0]);
                            verPriSu.hacer();
                            break;
                        case 8:
                            dma[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia"));
                            dma[1] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
                            dma[2] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año"));

                            DiaSemana DIA = new DiaSemana(dma[0], dma[1], dma[2]);
                            a_e[0] = DIA.CalcularA();
                            a_e[1] = DIA.CalcularB();
                            a_e[2] = DIA.CalcularC();
                            a_e[3] = DIA.CalcularD();
                            a_e[4] = DIA.CalcularE();
                            diaSemana = DIA.solucion(a_e[0],a_e[1], a_e[2], a_e[3], a_e[4]);
                            JOptionPane.showMessageDialog(null, diaSemana);
                            break;
                        case 9:
                            pali = JOptionPane.showInputDialog("Digite un nombre para ver si"
                                    + "es palindromo o no");
                            Palindromo pal = new Palindromo(pali);
                            pal.hacer();
                            break;
                        case 10:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Imprima números de 1 a 9");
                            break;
                    }
                }
            } catch (NumberFormatException X) {
                JOptionPane.showMessageDialog(null, "digite números de 1 a 9,no letras");
            }
        }

    }
}
