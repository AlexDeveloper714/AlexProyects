
import javax.swing.*;

public class Palindromo {

    public void Espalindromo() {
        Pila p1 = new Pila();
        Cola c1 = new Cola();
        String a = "";
        Boolean Sies = false;
        a = JOptionPane.showInputDialog("Digite una palabra para saber si es "
                + "palindromo o no:");
        for (int i = 0; i < a.length(); i++) {
                p1.insertarPila(a.charAt(i));
                c1.insertarCola(a.charAt(i));
        }
        while (!p1.estaPilaVacia()&&!c1.estaColaVacia()) {
            Sies = p1.infoPila().equals(c1.infoCola());
            p1.getPila();
            c1.getCola();
        }
        if (Sies == true) {
            JOptionPane.showMessageDialog(null, "Es un palindromo");
        } else {
            JOptionPane.showMessageDialog(null, "NO es un palindromo");
        }
    }
}
