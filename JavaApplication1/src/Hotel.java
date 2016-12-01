/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Hotel {

    private String Alimentacion;
    private String Habitacion;
    private String TipoPersona;

    public Hotel(String Alimentacion, String Habitacion, String TipoPersona) {
        this.Alimentacion = Alimentacion;
        this.Habitacion = Habitacion;
        this.TipoPersona = TipoPersona;

    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String Alimentacion) {
        this.Alimentacion = Alimentacion;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

    public String getTipoPersona() {
        return TipoPersona;
    }

    public void setTipoPersona(String TipoPersona) {
        this.TipoPersona = TipoPersona;
    }

    public double costoAdicional(String Alimentacion) {
        double n = 0;
        switch (Alimentacion) {
            case "SA":
                n = 0;
                break;
            case "CD":
                n = 8000;
                break;
            case "CC":
                n = 10000;
                break;
            case "Full":
                n = 30000;
                break;
            case "King":
                n = 40000;
                break;
            case "Superior":
                n = 60000;
                break;
            default:
                n = -1;
                break;

        }
        return n;
    }

    public double descuentoReserva(String Habitacion) {
        double n = 0;
        switch (Habitacion) {
            case "Sencilla":
                n = 0;
                break;
            case "Doble":
                n = 8000;
                break;
            case "Triple":
                n = 10000;
                break;
            case "Cuadruple":
                n = 30000;
                break;
            default:
                n = -1;
                break;

        }
        return n;
    }

    public double costoPersona(String TipoPersona) {
        double n = 0;
        switch (TipoPersona) {
            case "Niño":
                n = 550000;
                break;
            case "Adulto":
                n =650000;
                break;
             default:
                n = -1;
                break;

        }
        return n;
    }

    public double calcularCostos(double costoAdicional, double descuentoReserva) {
        double n = 0;
        n = costoAdicional + descuentoReserva;
        return n;
    }
}
