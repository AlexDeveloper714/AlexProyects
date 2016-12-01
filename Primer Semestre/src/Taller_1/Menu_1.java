package Taller_1;

import javax.swing.JOptionPane;

public class Menu_1 {

    public void imprimirMenu() {
        String diaSemana = "", pali = "";
        int opc = 0, a_2 = 0, b = 0, n = 0, d = 0, m = 0, a = 0, A = 0, B = 0, C = 0, D = 0, E = 0;
        double z;
        while (opc != 11) {
            try {
                while (opc != 11) {
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
                            + "\n 10. Suma sucesiva de 1 al numero digitado"
                            + "\n 11. Volver"));
                    switch (opc) {
                        case 1:
                            a_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un nùmero para imprimir tu fibonacci:"));
                            Fibonacci verFi = new Fibonacci(a_2);
                            verFi.hacer();
                            break;
                        case 2:
                            a = Integer.parseInt(JOptionPane.showInputDialog("\n Digita el número para imprimir el factorial: "));
                            Facto verFa = new Facto(a);
                            verFa.hacer();
                            break;
                        case 3:
                            a_2 = Integer.parseInt(JOptionPane.showInputDialog("\n Digita el número que quieres hacer  la base: "));
                            b = Integer.parseInt(JOptionPane.showInputDialog("\n Digita el número que quieres hacer el exponente: "));
                            Expo verEx = new Expo(a_2, b);
                            verEx.hacer();
                            break;
                        case 4:
                            a_2 = Integer.parseInt(JOptionPane.showInputDialog("\n Digita el número para convertir a binario: "));
                            Bina verBi = new Bina(a_2);
                            verBi.hacer();
                            break;
                        case 5:
                            a_2 = Integer.parseInt(JOptionPane.showInputDialog("\n Digita el número para saber si es primo o no: "));
                            Primo verPri = new Primo(a_2);
                            verPri.hacer();
                            break;
                        case 6:
                            a_2 = Integer.parseInt(JOptionPane.showInputDialog("\n Digita el número dividendo o numerador: "));
                            b = Integer.parseInt(JOptionPane.showInputDialog("\n Digita el número divisor o denominador: "));
                            Simpli verSim = new Simpli(a_2, b);
                            verSim.hacer();
                            break;
                        case 7:
                            a_2 = Integer.parseInt(JOptionPane.showInputDialog("\n Digite el número para mostrar todos los primos de 5 hasta ese número y mostrar la suma de todos los primos"));
                            PrimoSuma verPriSu = new PrimoSuma(a_2);
                            verPriSu.hacer();
                            break;
                        case 8:
                            d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia"));
                            m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
                            a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año"));

                            DiaSemana DIA = new DiaSemana(d, m, a);
                            A = DIA.CalcularA();
                            B = DIA.CalcularB();
                            C = DIA.CalcularC();
                            D = DIA.CalcularD();
                            E = DIA.CalcularE();
                            diaSemana = DIA.solucion(A, B, C, D, E);
                            JOptionPane.showMessageDialog(null, diaSemana);
                            break;
                        case 9:
                            pali = JOptionPane.showInputDialog("Digite un nombre para ver si"
                                    + "es palindromo o no");
                            Palindromo pal = new Palindromo(pali);
                            pal.hacer();
                            break;
                        case 10:
                            a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para saber el resultado de la suma sucesiva de 1 a ese numero:"));
                            Suma_N sum = new Suma_N(a);
                            sum.hacer();
                            break;
                        case 11:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Imprima números de 1 a 11");
                            break;
                    }
                }
            } catch (NumberFormatException X) {
                JOptionPane.showMessageDialog(null, "digite números de 1 a 11,no letras");
            }
        }

    }
}
