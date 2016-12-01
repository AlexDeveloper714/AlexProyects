
import javax.swing.*;

public class OperacionCola {

    public void ColaOperaciones() {
        Pila p1 = new Pila();
        String Opcion = "", Pila = "", PilaAnt = "", x = "";
        int mayor = 0, acum = 0, mayorAnt = 0, acumAnt = 0;
        double prom = 0, promAnt = 0;
        while (!Opcion.equalsIgnoreCase("N")) {
            try {
                int a = 0;
                a = Integer.parseInt(JOptionPane.showInputDialog("Digite un caracter a ingresar en la pila"));
                p1.insertarPila(a);
                Opcion = JOptionPane.showInputDialog("Desea seguir agregando caracter (s/n)\n(pueden ser mayusculas o minusculas)");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite un valor valido....");

            }
        }
        x = JOptionPane.showInputDialog("Digite un caracter para eliminar en la pila");
        while (!p1.estaPilaVacia()) {
            promAnt += (int) p1.infoPila();
            if ((int) p1.infoPila() > mayor) {
                mayorAnt = (int) p1.infoPila();
            }
            if (!x.equals(p1.infoPila().toString())) {
                if ((int) p1.infoPila() > mayor) {
                    mayor = (int) p1.infoPila();
                }
                prom += (int) p1.infoPila();
                PilaAnt += p1.infoPila() + " ";
                Pila += p1.getPila() + " ";
                acum++;
            } else {
                PilaAnt += p1.infoPila() + " ";
                p1.getPila();
            }
            acumAnt++;
        }
        prom = prom / acum;
        promAnt = promAnt / acumAnt;
        JOptionPane.showMessageDialog(null, "El promedio de la pila anterior es: "
                + promAnt + "\nLa cantidad de elementos de la pila anterios es: " + acumAnt
                + "\n La pila original es: \n" + PilaAnt
                + "\nEl promedio de la pila es: "
                + prom + "\nLa cantidad de elementos es: " + acum + 
                "\nLa pila con el caracter: " + x
                + " quitado es: \n" + Pila);
    }

}
