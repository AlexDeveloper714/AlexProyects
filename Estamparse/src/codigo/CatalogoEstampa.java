package codigo;

import java.io.*;
import java.util.*;

public class CatalogoEstampa {

    private int idEstampa;
    private String nombreEstampa;
    private String tipoEstampa;
    private String userName;
    private int precioEstampa;
    private File estampa;
    public static String precioActual;
    public static String NombreActual;
    public static String CategoriaActual;

    public CatalogoEstampa(String userName, String nombreEstampa, String tipoEstampa, int precioEstampa, File estampa) {
        this.nombreEstampa = nombreEstampa;
        this.tipoEstampa = tipoEstampa;
        this.precioEstampa = precioEstampa;
        this.estampa = estampa;
        this.userName = userName;
    }

    public int getIdEstampa() {
        return idEstampa;
    }

    public void setIdEstampa(int idEstampa) {
        this.idEstampa = idEstampa;
    }

    public String getNombreEstampa() {
        return nombreEstampa;
    }

    public void setNombreEstampa(String nombreEstampa) {
        this.nombreEstampa = nombreEstampa;
    }

    public String getTipoEstampa() {
        return tipoEstampa;
    }

    public void setTipoEstampa(String tipoEstampa) {
        this.tipoEstampa = tipoEstampa;
    }

    public int getPrecioEstampa() {
        return precioEstampa;
    }

    public void setPrecioEstampa(int precioEstampa) {
        this.precioEstampa = precioEstampa;
    }

    public File getEstampa() {
        return estampa;
    }

    public void setEstampa(File estampa) {
        this.estampa = estampa;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    static ArrayList<Estampa> arrayEstampa = new ArrayList<>();
    static ArrayList<Estampa> arrayEstampaCat = new ArrayList<>();
    public static int indiceEstampa = 0;
    public static int indiceEstampaCat = 0;

    public void alamacenarEstampa(String userName, String nombreEstampa, String tipoEstampa, int precioEstampa, File estampa) {
        arrayEstampa.add(new Estampa(userName, nombreEstampa, tipoEstampa, precioEstampa, estampa));
        indiceEstampa++;
    }

    public void almacenarEstampaCat(String categoria) {
        for (Estampa arrayEstampa1 : arrayEstampa) {
            if (arrayEstampa1.getTipoEstampa().equals(categoria)) {
                arrayEstampaCat.add(arrayEstampa1);
                indiceEstampaCat++;
            }
        }
    }

    public void borrarCatEstTemp() {
        arrayEstampaCat.clear();
        indiceEstampaCat = 0;
    }

    public File ObtenerEstampaIzqObtenerEstampaDer(int indice) {
        File a = arrayEstampa.get(indice).getEstampa();
        NombreActual = arrayEstampa.get(indice).getNombreEstampa();
        precioActual = Integer.toString(arrayEstampa.get(indice).getPrecioEstampa());
        CategoriaActual = arrayEstampa.get(indice).getTipoEstampa();
        return a;
    }

    public File ObtenerEstampaIzqObtenerEstampaCatDer(int indice) {
        File a = arrayEstampaCat.get(indice).getEstampa();
        NombreActual = arrayEstampaCat.get(indice).getNombreEstampa();
        precioActual = Integer.toString(arrayEstampaCat.get(indice).getPrecioEstampa());
        CategoriaActual = arrayEstampaCat.get(indice).getTipoEstampa();
        return a;
    }

    public int ObtenerPrecio(int indice) {
        return arrayEstampa.get(indice).getPrecioEstampa();
    }

    public boolean cambiarEstampa(String userName, String nombreEstampaAnt, String nombreEstampa, String tipoEstampa) {
        boolean Cambio = false;
        for (int i = 0; i < arrayEstampa.size() && Cambio == false; i++) {
            if (arrayEstampa.get(i).getUserName().equals(userName) && arrayEstampa.get(i).getNombreEstampa().equals(nombreEstampaAnt)) {
                arrayEstampa.get(i).setNombreEstampa(nombreEstampa);
                arrayEstampa.get(i).setTipoEstampa(tipoEstampa);
                Cambio = true;
            }
        }
        return Cambio;
    }
    static ArrayList<String> arrayCategoria = new ArrayList<>();
    static ArrayList<String> CategoriaOculta = new ArrayList<>();
    public static int inidiceCategoria = 0;

    public void almacenarCategoria(String categoria) {
        arrayCategoria.add(categoria);
        inidiceCategoria++;
    }

    public String RecojerCategoria(int indice) {
        return arrayCategoria.get(indice);
    }

    public boolean OcultarCategoria(String categoria) {
        Boolean Remplazo = false;
        for (int i = 0; i < arrayCategoria.size() && Remplazo == false; i++) {
            if (arrayCategoria.get(i).equals(categoria)) {
                CategoriaOculta.add(arrayCategoria.get(i));
                arrayCategoria.remove(arrayCategoria.get(i));
                Remplazo = true;
                inidiceCategoria--;
            }
        }
        return Remplazo;
    }

    public boolean RevisarOcultacionCategoria(String categoria) {
        Boolean Revisar = false;
        for (int i = 0; i < CategoriaOculta.size() && Revisar == false; i++) {
            if (CategoriaOculta.get(i).equals(categoria)) {
                Revisar = true;
            }
        }
        return Revisar;
    }

    public boolean TraerCatalogo(String categoria) {
        Boolean Restaurar = false;
        String copia = "";
        for (int i = 0; i < CategoriaOculta.size() && Restaurar == false; i++) {
            if (CategoriaOculta.get(i).equals(categoria)) {
                copia = CategoriaOculta.get(i);
                Restaurar = true;
                inidiceCategoria++;
            }
        }
        if (Restaurar == true) {
            arrayCategoria.add(copia);
        }
        return Restaurar;
    }

    public boolean revisarCategoria(String categoria) {
        Boolean Igual = false;
        for (int i = 0; i < arrayCategoria.size() && Igual == false; i++) {
            if (arrayCategoria.get(i).equals(categoria)) {
                Igual = true;
            }
        }
        return Igual;
    }
}
