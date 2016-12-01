
import javax.swing.*;

public class Cadena_Pila {

    public void EliminarCadena() {
        Pila p1 = new Pila();
        String Opcion = "", Pila = "", PilaAnt = "", a = "", x = "";
        while (!Opcion.equalsIgnoreCase("N")) {
            a = JOptionPane.showInputDialog("Digite un caracter a ingresar en la pila");
            p1.insertarPila(a);
            Opcion = JOptionPane.showInputDialog("Desea seguir agregando caracter (s/n)\n(pueden ser mayusculas o minusculas)");
        }
        x = JOptionPane.showInputDialog("Digite un caracter para eliminar en la pila");
        while (!p1.estaPilaVacia()) {
            if (!x.equals(p1.infoPila())) {
                PilaAnt += p1.infoPila() + " ";
                Pila += p1.getPila() + " ";
            } else {
                PilaAnt += p1.infoPila() + " ";
                p1.getPila();
            }
        }
        JOptionPane.showMessageDialog(null, "La pila original es: \n" 
                + PilaAnt + "\nLa pila con el caracter: " 
                + x + " quitado es: \n" + Pila);

    }

}
