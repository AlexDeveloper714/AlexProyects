/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ArreglosObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

// creacion de vector de objetos de tipo reservas
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de clientes a cargar"));
        Reserva vectorReservas[] = new Reserva[n];
        int j=0;
        for (int i = 0; i < n; i++) {
            j=i+1;
            vectorReservas[i] = new Reserva("", "",0);
            String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del cliente " + j + ":");
            String direccion = JOptionPane.showInputDialog(null, "Ingrese direccion del cliente " + j + ":");
            vectorReservas[i].setNombre(nombre);
            vectorReservas[i].setDireccion(direccion);
            vectorReservas[i].setIdReserva(j); // el idReserva se dade manera automatica        
            
        }

        
        // impresion de las reservas
        for (int i = 0; i < n; i++) {
            j=i+1;
            JOptionPane.showMessageDialog(null, "nombre de cliente  " + vectorReservas[i].getNombre()+ " con direccion:"+vectorReservas[i].getDireccion()+" con ID: "+vectorReservas[i].getIdReserva() );
            //System.out.println("nombre de cliente " + i + " : " + vectorReservas[i].getNombre());
        }

    }
}
