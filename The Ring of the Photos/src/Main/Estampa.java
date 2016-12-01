/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author KERBEROS
 */
public class Estampa {
    String nombreEstampa;
    int tema;
    int autor;
    int ranking;
    int idEstampa;

    public Estampa(String nombre, int tema, int autor, int ranking, int idEstampa) {
        this.nombreEstampa = nombre;
        this.tema = tema;
        this.autor = autor;
        this.ranking = ranking;
        this.idEstampa = idEstampa;
    }

    public String getNombre() {
        return nombreEstampa;
    }

    public void setNombre(String nombre) {
        this.nombreEstampa = nombre;
    }

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getIdEstampa() {
        return idEstampa;
    }

    public void setIdEstampa(int idEstampa) {
        this.idEstampa = idEstampa;
    }
    
    
}
