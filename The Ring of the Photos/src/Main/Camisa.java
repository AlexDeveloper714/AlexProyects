/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author KERBEROS
 */
public class Camisa {
    String color;
    String talla;
    String estilo;
    String nombreCamisa;

    public Camisa(String color, String talla, String estilo, String nombreCamisa) {
        this.color = color;
        this.talla = talla;
        this.estilo = estilo;
        this.nombreCamisa = nombreCamisa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getNombreCamisa() {
        return nombreCamisa;
    }

    public void setNombreCamisa(String nombreCamisa) {
        this.nombreCamisa = nombreCamisa;
    }


}
