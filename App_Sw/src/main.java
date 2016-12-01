
import javax.swing.*;

public class main {

    public static void main(String[] args) {
        String z[] = {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Salir"};
        String m = "";
        while (m != "Salir") {
            try {
                m = (String) JOptionPane.showInputDialog(null, "Seleccione una de las opciones:", "Primer Semestre", JOptionPane.QUESTION_MESSAGE, null, z, z[0]);
                switch (m) {
                    case "Ejercicio 1":
                        Menu_1 M1 = new Menu_1();
                        M1.fu_1();
                        break;
                    case "Ejercicio 2":
                        Menu_2 M2 = new Menu_2();
                        M2.fu_2();
                        break;
                    case "Ejercicio 3":
                        Menu_3 M3 = new Menu_3();
                        M3.fu_3();
                        break;
                    case "Ejercicio 4":
                        Menu_4 M4 = new Menu_4();
                        M4.fu_4();
                        break;
                    case "Ejercicio 5":
                        Menu_5 M5 = new Menu_5();
                        M5.fu_5();
                        break;

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes digitar correctamente para hacer el ejercicio", "ERROR", 0, null);
            } catch (NullPointerException x) {
                JOptionPane.showMessageDialog(null, "Elige una opción, de lo contrario no avanzarás", "ADVERTENCIA", 2, null);
            }
        }

    }
}

/*Las clases deben ir afuera, con el fin
 de que el resultado sea optimo*/
class Menu_1 {

    void fu_1() {
        String z[] = {"Fibonnaci", "Factorial", "Potencia", "Binario",
            "Simplificación", "Primo", "Salir"};
        String m = "";
        while (m != "Salir") {
            try {
                m = (String) JOptionPane.showInputDialog(null, "Seleccione alguna opcion para hacer:", "Primer Semestre", JOptionPane.QUESTION_MESSAGE, null, z, z[0]);
                switch (m) {
                    case "Fibonnaci":
                        Fibonacci F1 = new Fibonacci();
                        F1.fi();
                        break;
                    case "Factorial":
                        Fibonacci F2 = new Fibonacci();
                        F2.fa();
                        break;
                    case "Potencia":
                        Fibonacci F3 = new Fibonacci();
                        F3.ex();
                        break;
                    case "Binario":
                        Fibonacci F4 = new Fibonacci();
                        F4.bi();
                        break;
                    case "Simplificación":
                        Fibonacci F5 = new Fibonacci();
                        F5.si();
                        break;
                    case "Primo":
                        Fibonacci F6 = new Fibonacci();
                        F6.pri();
                        break;

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes digitar correctamente para hacer el ejercicio", "ERROR", 0, null);
            } catch (NullPointerException x) {
                JOptionPane.showMessageDialog(null, "Elige una opción, de lo contrario no avanzarás", "ADVERTENCIA", 2, null);
            }
        }
        /*Para usar JFrame, solo se debe mencionar: import javax.swing.*;
         Ademas de crear el constructor y darle valores...*/

        /*JFrame Menu_1 = new JFrame();
         Menu_1.setLayout(null);
         Menu_1.setSize(200, 200);
         Menu_1.setVisible(true);*/
    }

    class Fibonacci {

        void fi() {
            int fi[] = {0, 0, 1, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer FIBONACCI"));
            if (fi[0] == 0) {
                JOptionPane.showMessageDialog(null, "Tu serie de Fibonnaci es: " + fi[0]);
            }
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[3] <= fi[0]) {
                m = m + " " + fi[3];
                fi[3] = fi[2] + fi[1];
                fi[2] = fi[1];
                fi[1] = fi[3];
            }
            JOptionPane.showMessageDialog(null, "El resultado de Fibonacci es: " + m);
        }

        void fa() {
            int fi[] = {0, 1, 1};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el FACTORIAL"));
            if (fi[0] == 0) {
                JOptionPane.showMessageDialog(null, "El factorial de tu numero es: " + fi[2]);
            }
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[0] > 1) {
                fi[1]++;
                fi[2] = fi[1] * fi[2];
                fi[0]--;

            }
            JOptionPane.showMessageDialog(null, "El factorial de tu numero es: " + fi[2]);

        }

        void ex() {
            int fi[] = {0, 0, 0};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para que sea la BASE"));
            fi[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para que sea el EXPONENTE"));
            if (fi[0] == 0 && fi[1] == 0) {
                fi[2] = 1;
            } else if (fi[1] == 0) {
                fi[2] = 1;
            }
            fi[2] = fi[0];

            while (fi[1] > 1) {
                fi[2] = fi[0] * fi[2];
                fi[1]--;

            }
            if (fi[1] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0 PARA EL EXPONENTE");
            } else {
                JOptionPane.showMessageDialog(null, "La potencia de tu numero es: " + fi[2]);
            }

        }

        void bi() {
            int fi[] = {0, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el FACTORIAL"));
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[0] > 0) {
                fi[1] = fi[0] % 2;
                fi[0] = fi[0] / 2;
                m = fi[1] + m;

            }
            JOptionPane.showMessageDialog(null, "Tu número en binario es: " + m);

        }

        void si() {
            int fi[] = {0, 0, 2};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número que va a ser el DIVIDENDO o NUMERADOR"));
            fi[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número que va a ser el DIVISOR o DENOMINADOR"));
            if (fi[1] == 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE EL CERO COMO DIVISOR, ESTA OPERACIÓN NO SE PUEDE HACER");
            }
            while (fi[2] <= fi[0] && fi[2] <= fi[1]) {
                if (fi[0] % fi[2] == 0 && fi[1] % fi[2] == 0) {
                    fi[0] = fi[0] / fi[2];
                    fi[1] = fi[1] / fi[2];
                } else {
                    fi[2]++;

                }
            }

            if (fi[1] == fi[0] && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: 1");
            } else if (fi[0] == 1 && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0] + "/" + fi[1]);
            } else if (fi[1] == 1 && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0]);
            } else if (fi[1] > 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0] + "/" + fi[1]);
            }
        }

        void pri() {
            int fi[] = {0, 1, 0};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para saber si es PRIMO o no:"));
            while (fi[1] <= fi[0]) {

                if (fi[0] % fi[1] == 0) {
                    fi[1]++;
                    fi[2]++;
                } else {
                    fi[1]++;
                }

            }

            if (fi[2] == 2) {
                JOptionPane.showMessageDialog(null, "El número " + fi[0] + " es primo");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + fi[0] + " no es primo");
            }
        }

    }

}

class Menu_2 {

    void fu_2() {
        String z[] = {"Paralelgramo", "Triangulo Rectangulo", "Rectangulo", "Triangulo Iscoceles",
            "Rombo", "Salir"};
        String m = "";
        while (m != "Salir") {
            try {
                m = (String) JOptionPane.showInputDialog(null, "Seleccione alguna opcion para hacer una figura de *:", "Primer Semestre", JOptionPane.QUESTION_MESSAGE, null, z, z[0]);
                switch (m) {
                    case "Paralelgramo":
                        Figuras F1 = new Figuras();
                        F1.para();
                        break;
                    case "Triangulo Rectangulo":
                        Figuras F2 = new Figuras();
                        F2.tria();
                        break;
                    case "Rectangulo":
                        Figuras F3 = new Figuras();
                        F3.rec();
                        break;
                    case "Triangulo Iscoceles":
                        Figuras F4 = new Figuras();
                        F4.trii();
                        break;
                    case "Rombo":
                        Figuras F5 = new Figuras();
                        F5.rom();
                        break;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes digitar correctamente para hacer el ejercicio", "ERROR", 0, null);
            } catch (NullPointerException x) {
                JOptionPane.showMessageDialog(null, "Elige una opción, de lo contrario no avanzarás", "ADVERTENCIA", 2, null);
            }
        }

    }

    class Figuras {

        void para() {

            int fi[] = {0, 0, 0, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer la altura del paralelogramo:"));
            fi[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el ancho del paralelogramo"));

            if (fi[0] <= 0 || fi[1] <= 0) {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE HACER UNA FIGURA CON RESULTADOS NEGATIVOS O NULOS...");
            } else {
                for (fi[2] = 0; fi[2] < fi[0]; fi[2]++) {
                    for (fi[3] = fi[2] - fi[0]; fi[3] <= fi[0]; fi[3]++) {

                        m += " ";
                    }
                    for (fi[3] = 0; fi[3] < fi[1]; fi[3]++) {
                        m += "*";
                    }
                    m += "\n";
                }

                JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n" + m);
            }
        }

        void tria() {
            int fi[] = {0, 0, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el ancho del triangulo rectangulo:"));
            if (fi[0] <= 0) {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE HACER UNA FIGURA CON RESULTADOS NEGATIVOS O NULOS...");
            } else {
                for (fi[1] = 0; fi[1] < fi[0]; fi[1]++) {
                    for (fi[2] = fi[0] - fi[1]; fi[2] <= fi[0]; fi[2]++) {

                        m += "*";
                    }

                    m += "\n";
                }
                JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n" + m);
            }

        }

        void rec() {
            int fi[] = {0, 0, 0, 0};
            String m = "";

            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer la altura del rectangulo:"));
            fi[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el ancho del rectangulo:"));
            if (fi[0] <= 0 || fi[1] <= 0) {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE HACER UNA FIGURA CON RESULTADOS NEGATIVOS O NULOS...");
            } else {
                for (fi[2] = 0; fi[2] < fi[0]; fi[2]++) {
                    for (fi[3] = 0; fi[3] < fi[1]; fi[3]++) {
                        m += "*";
                    }
                    m += "\n";
                }
                JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n" + m);
            }

        }

        void trii() {
            int fi[] = {0, 0, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer la altura del triangulo isoceles:"));
            if (fi[0] <= 0) {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE HACER UNA FIGURA CON RESULTADOS NEGATIVOS O NULOS...");
            } else {

                for (fi[1] = 0; fi[1] < fi[0]; fi[1]++) {
                    for (fi[2] = fi[1] - fi[0]; fi[2] <= fi[0]; fi[2]++) {

                        m += " ";
                    }
                    for (fi[2] = fi[0] - fi[1]; fi[2] <= fi[0]; fi[2]++) {
                        m += "*";
                        for (fi[2] = fi[0] - fi[1]; fi[2] < fi[0]; fi[2]++) {
                            m += "**";
                        }
                    }
                    m += "\n";
                }
                JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n " + m);
            }

        }

        void rom() {
            int fi[] = {0, 0, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer la altura del triangulo isoceles:"));
            if (fi[0] <= 0) {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE HACER UNA FIGURA CON RESULTADOS NEGATIVOS O NULOS...");
            } else {
                for (fi[1] = 0; fi[1] <= fi[0]; fi[1]++) {
                    for (fi[2] = fi[1] - fi[0]; fi[2] <= fi[0]; fi[2]++) {

                        m += " ";
                    }
                    for (fi[2] = fi[0] - fi[1]; fi[2] <= fi[0]; fi[2]++) {
                        m += "*";
                        for (fi[2] = fi[0] - fi[1]; fi[2] < fi[0]; fi[2]++) {
                            m += "**";
                        }
                    }
                    m += "\n";
                }
                for (fi[1] = fi[0]; fi[1] >= 0; fi[1]--) {
                    for (fi[2] = fi[1] - fi[0]; fi[2] <= fi[0]; fi[2]++) {

                        m += " ";
                    }
                    for (fi[2] = fi[0] - fi[1]; fi[2] <= fi[0]; fi[2]++) {
                        m += "*";
                        for (fi[2] = fi[0] - fi[1]; fi[2] < fi[0]; fi[2]++) {
                            m += "**";
                        }
                    }
                    m += "\n";
                }
                JOptionPane.showMessageDialog(null, "Tu figura hecha es: \n " + m);
            }
        }
    }

}

class Menu_3 {

    void fu_3() {
        String z[] = {"Sumar", "Restar", "Multiplicar", "Dividir", "Salir"}, m = "";
        int f[] = {0, 0};
        JOptionPane.showMessageDialog(null, "Los numeros no cambiaran, asi que recuerdalos bien...");
        f[0] = Integer.parseInt(JOptionPane.showInputDialog("Numerador Fracción 1\n"));
        f[1] = Integer.parseInt(JOptionPane.showInputDialog("Denominador Fracción 1\n"));
        fraccion F1 = new fraccion();
        f[0] = Integer.parseInt(JOptionPane.showInputDialog("Numerador Fracción 2\n"));
        f[1] = Integer.parseInt(JOptionPane.showInputDialog("Denominador Fracción 2\n"));
        fraccion F2 = new fraccion();
        while (m != "Salir") {
            try {
                m = (String) JOptionPane.showInputDialog(null, "Seleccione alguna opcion para hacer:", "Primer Semestre", JOptionPane.QUESTION_MESSAGE, null, z, z[0]);
                switch (m) {
                    case "Sumar":
                        F1.su();
                        break;
                    case "Restar":
                        F2.res();
                        break;
                    case "Multiplicar":
                        F1.mul();
                        break;
                    case "Dividir":

                        F2.div();
                        break;

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes digitar correctamente para hacer el ejercicio", "ERROR", 0, null);
            } catch (NullPointerException x) {
                JOptionPane.showMessageDialog(null, "Elige una opción, de lo contrario no avanzarás", "ADVERTENCIA", 2, null);
            }
        }

    }

    class fraccion {

        void div() {
            int fi[] = {0, 0, 1, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer FIBONACCI"));
            if (fi[0] == 0) {
                JOptionPane.showMessageDialog(null, "Tu serie de Fibonnaci es: " + fi[0]);
            }
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[3] <= fi[0]) {
                m = m + " " + fi[3];
                fi[3] = fi[2] + fi[1];
                fi[2] = fi[1];
                fi[1] = fi[3];
            }
            JOptionPane.showMessageDialog(null, "El resultado de Fibonacci es: " + m);
        }

        void fra() {
            
            int fi[] = {0, 1, 1};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el FACTORIAL"));
            if (fi[0] == 0) {
                JOptionPane.showMessageDialog(null, "El factorial de tu numero es: " + fi[2]);
            }
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[0] > 1) {
                fi[1]++;
                fi[2] = fi[1] * fi[2];
                fi[0]--;

            }
            JOptionPane.showMessageDialog(null, "El factorial de tu numero es: " + fi[2]);

        }


        void su() {
            int fi[] = {0, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el FACTORIAL"));
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[0] > 0) {
                fi[1] = fi[0] % 2;
                fi[0] = fi[0] / 2;
                m = fi[1] + m;

            }
            JOptionPane.showMessageDialog(null, "Tu número en binario es: " + m);

        }

        void res() {
            int fi[] = {0, 0, 2};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número que va a ser el DIVIDENDO o NUMERADOR"));
            fi[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número que va a ser el DIVISOR o DENOMINADOR"));
            if (fi[1] == 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE EL CERO COMO DIVISOR, ESTA OPERACIÓN NO SE PUEDE HACER");
            }
            while (fi[2] <= fi[0] && fi[2] <= fi[1]) {
                if (fi[0] % fi[2] == 0 && fi[1] % fi[2] == 0) {
                    fi[0] = fi[0] / fi[2];
                    fi[1] = fi[1] / fi[2];
                } else {
                    fi[2]++;

                }
            }

            if (fi[1] == fi[0] && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: 1");
            } else if (fi[0] == 1 && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0] + "/" + fi[1]);
            } else if (fi[1] == 1 && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0]);
            } else if (fi[1] > 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0] + "/" + fi[1]);
            }
        }

        void mul() {
            int fi[] = {0, 1, 0};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para saber si es PRIMO o no:"));
            while (fi[1] <= fi[0]) {

                if (fi[0] % fi[1] == 0) {
                    fi[1]++;
                    fi[2]++;
                } else {
                    fi[1]++;
                }

            }

            if (fi[2] == 2) {
                JOptionPane.showMessageDialog(null, "El número " + fi[0] + " es primo");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + fi[0] + " no es primo");
            }
        }

    }

}

class Menu_4 {

    void fu_4() {
        String z[] = {"Fibonnaci", "Factorial", "Potencia", "Binario",
            "Simplificación", "Primo", "Salir"};
        String m = "";
        while (m != "Salir") {
            try {
                m = (String) JOptionPane.showInputDialog(null, "Seleccione alguna opcion para hacer:", "Primer Semestre", JOptionPane.QUESTION_MESSAGE, null, z, z[0]);
                switch (m) {
                    case "Fibonnaci":
                        convert F1 = new convert();
                        F1.fi();
                        break;
                    case "Factorial":
                        convert F2 = new convert();
                        F2.fa();
                        break;
                    case "Potencia":
                        convert F3 = new convert();
                        F3.ex();
                        break;
                    case "Binario":
                        convert F4 = new convert();
                        F4.bi();
                        break;
                    case "Simplificación":
                        convert F5 = new convert();
                        F5.si();
                        break;
                    case "Primo":
                        convert F6 = new convert();
                        F6.pri();
                        break;

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes digitar correctamente para hacer el ejercicio", "ERROR", 0, null);
            } catch (NullPointerException x) {
                JOptionPane.showMessageDialog(null, "Elige una opción, de lo contrario no avanzarás", "ADVERTENCIA", 2, null);
            }
        }
    }

    class convert {

        void fi() {
            int fi[] = {0, 0, 1, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer FIBONACCI"));
            if (fi[0] == 0) {
                JOptionPane.showMessageDialog(null, "Tu serie de Fibonnaci es: " + fi[0]);
            }
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[3] <= fi[0]) {
                m = m + " " + fi[3];
                fi[3] = fi[2] + fi[1];
                fi[2] = fi[1];
                fi[1] = fi[3];
            }
            JOptionPane.showMessageDialog(null, "El resultado de Fibonacci es: " + m);
        }

        void fa() {
            int fi[] = {0, 1, 1};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el FACTORIAL"));
            if (fi[0] == 0) {
                JOptionPane.showMessageDialog(null, "El factorial de tu numero es: " + fi[2]);
            }
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[0] > 1) {
                fi[1]++;
                fi[2] = fi[1] * fi[2];
                fi[0]--;

            }
            JOptionPane.showMessageDialog(null, "El factorial de tu numero es: " + fi[2]);

        }

        void ex() {
            int fi[] = {0, 0, 0};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para que sea la BASE"));
            fi[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para que sea el EXPONENTE"));
            if (fi[0] == 0 && fi[1] == 0) {
                fi[2] = 1;
            } else if (fi[1] == 0) {
                fi[2] = 1;
            }
            fi[2] = fi[0];

            while (fi[1] > 1) {
                fi[2] = fi[0] * fi[2];
                fi[1]--;

            }
            if (fi[1] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0 PARA EL EXPONENTE");
            } else {
                JOptionPane.showMessageDialog(null, "La potencia de tu numero es: " + fi[2]);
            }

        }

        void bi() {
            int fi[] = {0, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el FACTORIAL"));
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[0] > 0) {
                fi[1] = fi[0] % 2;
                fi[0] = fi[0] / 2;
                m = fi[1] + m;

            }
            JOptionPane.showMessageDialog(null, "Tu número en binario es: " + m);

        }

        void si() {
            int fi[] = {0, 0, 2};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número que va a ser el DIVIDENDO o NUMERADOR"));
            fi[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número que va a ser el DIVISOR o DENOMINADOR"));
            if (fi[1] == 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE EL CERO COMO DIVISOR, ESTA OPERACIÓN NO SE PUEDE HACER");
            }
            while (fi[2] <= fi[0] && fi[2] <= fi[1]) {
                if (fi[0] % fi[2] == 0 && fi[1] % fi[2] == 0) {
                    fi[0] = fi[0] / fi[2];
                    fi[1] = fi[1] / fi[2];
                } else {
                    fi[2]++;

                }
            }

            if (fi[1] == fi[0] && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: 1");
            } else if (fi[0] == 1 && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0] + "/" + fi[1]);
            } else if (fi[1] == 1 && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0]);
            } else if (fi[1] > 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0] + "/" + fi[1]);
            }
        }

        void pri() {
            int fi[] = {0, 1, 0};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para saber si es PRIMO o no:"));
            while (fi[1] <= fi[0]) {

                if (fi[0] % fi[1] == 0) {
                    fi[1]++;
                    fi[2]++;
                } else {
                    fi[1]++;
                }

            }

            if (fi[2] == 2) {
                JOptionPane.showMessageDialog(null, "El número " + fi[0] + " es primo");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + fi[0] + " no es primo");
            }
        }

    }

}

class Menu_5 {

    void fu_5() {
        String z[] = {"Fibonnaci", "Factorial", "Potencia", "Binario",
            "Simplificación", "Primo", "Salir"};
        String m = "";
        while (m != "Salir") {
            try {
                m = (String) JOptionPane.showInputDialog(null, "Seleccione alguna opcion para hacer:", "Primer Semestre", JOptionPane.QUESTION_MESSAGE, null, z, z[0]);
                switch (m) {
                    case "Fibonnaci":
                        extra F1 = new extra();
                        F1.fi();
                        break;
                    case "Factorial":
                        extra F2 = new extra();
                        F2.fa();
                        break;
                    case "Potencia":
                        extra F3 = new extra();
                        F3.ex();
                        break;
                    case "Binario":
                        extra F4 = new extra();
                        F4.bi();
                        break;
                    case "Simplificación":
                        extra F5 = new extra();
                        F5.si();
                        break;
                    case "Primo":
                        extra F6 = new extra();
                        F6.pri();
                        break;

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes digitar correctamente para hacer el ejercicio", "ERROR", 0, null);
            } catch (NullPointerException x) {
                JOptionPane.showMessageDialog(null, "Elige una opción, de lo contrario no avanzarás", "ADVERTENCIA", 2, null);
            }
        }
    }

    class extra {

        void fi() {
            int fi[] = {0, 0, 1, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer FIBONACCI"));
            if (fi[0] == 0) {
                JOptionPane.showMessageDialog(null, "Tu serie de Fibonnaci es: " + fi[0]);
            }
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[3] <= fi[0]) {
                m = m + " " + fi[3];
                fi[3] = fi[2] + fi[1];
                fi[2] = fi[1];
                fi[1] = fi[3];
            }
            JOptionPane.showMessageDialog(null, "El resultado de Fibonacci es: " + m);
        }

        void fa() {
            int fi[] = {0, 1, 1};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el FACTORIAL"));
            if (fi[0] == 0) {
                JOptionPane.showMessageDialog(null, "El factorial de tu numero es: " + fi[2]);
            }
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[0] > 1) {
                fi[1]++;
                fi[2] = fi[1] * fi[2];
                fi[0]--;

            }
            JOptionPane.showMessageDialog(null, "El factorial de tu numero es: " + fi[2]);

        }

        void ex() {
            int fi[] = {0, 0, 0};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para que sea la BASE"));
            fi[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para que sea el EXPONENTE"));
            if (fi[0] == 0 && fi[1] == 0) {
                fi[2] = 1;
            } else if (fi[1] == 0) {
                fi[2] = 1;
            }
            fi[2] = fi[0];

            while (fi[1] > 1) {
                fi[2] = fi[0] * fi[2];
                fi[1]--;

            }
            if (fi[1] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0 PARA EL EXPONENTE");
            } else {
                JOptionPane.showMessageDialog(null, "La potencia de tu numero es: " + fi[2]);
            }

        }

        void bi() {
            int fi[] = {0, 0};
            String m = "";
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para hacer el FACTORIAL"));
            if (fi[0] < 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE UN NUMERO MENOR A 0...");
            }
            while (fi[0] > 0) {
                fi[1] = fi[0] % 2;
                fi[0] = fi[0] / 2;
                m = fi[1] + m;

            }
            JOptionPane.showMessageDialog(null, "Tu número en binario es: " + m);

        }

        void si() {
            int fi[] = {0, 0, 2};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número que va a ser el DIVIDENDO o NUMERADOR"));
            fi[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número que va a ser el DIVISOR o DENOMINADOR"));
            if (fi[1] == 0) {
                JOptionPane.showMessageDialog(null, "DIGITASTE EL CERO COMO DIVISOR, ESTA OPERACIÓN NO SE PUEDE HACER");
            }
            while (fi[2] <= fi[0] && fi[2] <= fi[1]) {
                if (fi[0] % fi[2] == 0 && fi[1] % fi[2] == 0) {
                    fi[0] = fi[0] / fi[2];
                    fi[1] = fi[1] / fi[2];
                } else {
                    fi[2]++;

                }
            }

            if (fi[1] == fi[0] && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: 1");
            } else if (fi[0] == 1 && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0] + "/" + fi[1]);
            } else if (fi[1] == 1 && fi[1] != 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0]);
            } else if (fi[1] > 0) {
                JOptionPane.showMessageDialog(null, "El número mas simplificado es: " + fi[0] + "/" + fi[1]);
            }
        }

        void pri() {
            int fi[] = {0, 1, 0};
            fi[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para saber si es PRIMO o no:"));
            while (fi[1] <= fi[0]) {

                if (fi[0] % fi[1] == 0) {
                    fi[1]++;
                    fi[2]++;
                } else {
                    fi[1]++;
                }

            }

            if (fi[2] == 2) {
                JOptionPane.showMessageDialog(null, "El número " + fi[0] + " es primo");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + fi[0] + " no es primo");
            }
        }

    }

}
