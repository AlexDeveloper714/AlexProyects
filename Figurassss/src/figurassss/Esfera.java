/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package figurassss;

/**
 *
 * @author SANTIAGO
 */
public class Esfera extends Figura{

    public float radio;
    public static final double pi=3.14159265358979323846;

    public String getNombre() {
        return nombre;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Esfera (){}
    
    public Esfera( int radio){
        this.radio = radio;
        this.nombre="Esfera";
        //this.numeroLados = 0;
     }
     // 4*pi*r²
     public double calcularArea(){
         return (4) * pi * radio * radio;
         }

     // (4/3)*pi*radio³

     public double calcularVolumen(){
        return (4 / 3) * pi * radio * radio * radio;
        }

}
