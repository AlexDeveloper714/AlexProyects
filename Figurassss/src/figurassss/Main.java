/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package figurassss;

/**
 *
 * @author SANTIAGO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Esfera E1 = new Esfera(3);
        Esfera E2 = new Esfera();
        E2.setRadio(2);
        System.out.println ("El nombre de la figura es: "+E1.getNombre());
        System.out.println ("El area es: "+E1.calcularArea());
        System.out.println ("El Volumen es: "+E1.calcularVolumen());
    }

}
