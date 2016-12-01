
import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        double h = 0, r = 0;
//        double tot=0,por=0;
        h = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura del cilindro"));
        r = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del cilindro"));
        Cilindro cilin1 = new Cilindro(h, r);
        cilin1.Volumen_Cili(h, r);
        Cono cono1 = new Cono(h, r);
//        tot=(cilin1.Volumen_Cili(h, r)/3);
//        por=((cono1.Volumen_Cono(h, r)-tot)*100)/tot;
        JOptionPane.showMessageDialog(null, "El volumen del cilindro con: "
                + cilin1.getH() + " de altura y " + cilin1.getR() + " de radio es de: " + cilin1.Volumen_Cili(h, r));
        JOptionPane.showMessageDialog(null, "El volumen del cono con: "
                + cono1.getH() + " de altura y " + cono1.getR() + " de radio es de: " + cono1.Volumen_Cono(h, r));
//                JOptionPane.showMessageDialog(null, "El volumen del cono total es: "
//                + tot + " el volumeno parcial sacado fue:" + cono1.Volumen_Cono(h, r) + " y el porcentaje de error"
//                        + " es: " + por);
    }
}
