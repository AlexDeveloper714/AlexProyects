
import javax.swing.*;

public class main {

    public static void main(String[] args) {
        int elegir = 0;
        while (elegir != 6) {
            try {
                elegir = Integer.parseInt(JOptionPane.showInputDialog("Digite las opciones a realizar con"
                        + "colas y pilas:"
                        + "\n1. Crea pila y cola"
                        + "\n2. Eliminar datos de una pila"
                        + "\n3. Promedio, cantidad de datos y eliminar datos de una cola"
                        + "\n4. Ver si una palabra es palindromo o no"
                        + "\n5. Resolver operacion postfijo"
                        + "\n6. Salir"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite numeros, no letras");
            }
            switch (elegir) {
                case 1:
                    Pila p1 = new Pila();
                    Cola c1 = new Cola();
                    String Opcion = "",
                     Pila = "",
                     Cola = "";
                    while (!Opcion.equalsIgnoreCase("N")) {
                        try {
                            int a = 0;
                            a = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor "
                                    + "a ingresar en la pila y la cola..."));
                            p1.insertarPila(a);
                            c1.insertarCola(a);
                            Opcion = JOptionPane.showInputDialog(""
                                    + "Desea seguir agregando valores "
                                    + "(s/n)\n(pueden ser mayusculas "
                                    + "o minusculas)");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, ""
                                    + "Digite nuermos, no letras...");
                        }
                    }
                    while (!p1.estaPilaVacia()) {
                        Pila += p1.getPila() + " ";
                        Cola += c1.getCola() + " ";
                    }
                    JOptionPane.showMessageDialog(null, "La pila es: \n" + Pila
                            + "\nLa cola es:\n" + Cola);
                    break;
                case 2:
                    Cadena_Pila cp = new Cadena_Pila();
                    cp.EliminarCadena();
                    break;
                case 3:
                    OperacionCola co = new OperacionCola();
                    co.ColaOperaciones();
                    break;
                case 4:
                    Palindromo pal = new Palindromo();
                    pal.Espalindromo();
                    break;
                case 5:
                    OperarPostfijo cd= new OperarPostfijo();
                    cd.calcularDatos();
                    break;
                default:
                    if (elegir != 0) {
                        JOptionPane.showMessageDialog(null, "Digite opciones de 1 a 5");
                        break;
                    }
            }
        }

    }

}
