
import javax.swing.*;

public class OperarPostfijo {

    public void calcularDatos() {
        Pila p1 = new Pila();
        Cola c1 = new Cola();
        String Cola = "";
        int Nulo = 0, Letras = 0;
        Cola = JOptionPane.showInputDialog("Digite la expresion a manejar "
                + "(cada valor y signo debe estar separada por espacios):");
        String datos[] = Cola.split(" ");
        for (String dato : datos) {
            if (dato.equals("")) {
                Nulo = 1;
            }
        }
        switch (Nulo) {
            case 0:
                if (datos[0].equals("+") || datos[0].equals("-")
                        || datos[0].equals("*") || datos[0].equals("/")
                        || datos[0].equals("^")) {
                    JOptionPane.showMessageDialog(null, "Digitaste mal la expresion");
                } else {
                    for (String dato : datos) {
                        switch (dato) {
                            case "+":
                                break;
                            case "-":
                                break;
                            case "*":
                                break;
                            case "/":
                                break;
                            case "^":
                                break;
                            default:
                                try {
                                    if (Integer.parseInt(dato) > 0) {
                                        p1.insertarPila(c1);
                                    }
                                } catch (Exception e) {
                                    Letras = 1;
                                }
                                break;
                        }
                    }
                    switch (Letras) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "Puedes proseguir");

                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Digitaste letras...");
                            break;
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No digistaste caracteres validos");
                break;
        }
    }

}
