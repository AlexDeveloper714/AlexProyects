
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahau
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d=0, m=0, a=0,A=0, B=0, C=0,D=0, E=0;
        String diaSemana ="";

        d= Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
        a= Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año"));

        DiaSemana DIA = new DiaSemana(d, m, a);
        A= DIA.CalcularA();
        B= DIA.CalcularB();
        C= DIA.CalcularC();
        D= DIA.CalcularD();
        E= DIA.CalcularE();
        diaSemana = DIA.solucion(A,B,C,D,E);
     
       JOptionPane.showMessageDialog(null,diaSemana) ;

    }

}
