/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosobjetos;

/**
 *
 * @author usuario
 */
public class Reserva {

    private String nombre;
    private String direccion;
    private int idReserva;

    public Reserva() {
    }

    public Reserva(String nombre, String direccion, int  idReserva) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.idReserva=idReserva;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
                
    
}
