package codigo;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class CatalogoCamiseta {

    private int idCamiseta = 0;
    private String talla;
    private String tipoCamiseta;
    private String colorCamiseta;
    private File estampaCamiseta;
    private String posicionEstampa;
    private int precioCamiseta;
    private String UsuarioCamiseta;
    public static int CarritoUsuario = 0;
    public static int CarritoActual = 0;

    public static int idCamisaActual = 0;
    public static int PrecioActual = 0;
    public static String tallaActual = "";
    public static String tipoCamisetaActual = "";
    public static String colorActual = "";
    public static String PosicionActual = "";

    public CatalogoCamiseta(int idCamiseta, String talla, String tipoCamiseta, String color, File estampa, String Posicion, int Precio, String Usuario) {
        this.idCamiseta = idCamiseta;
        this.talla = talla;
        this.tipoCamiseta = tipoCamiseta;
        this.colorCamiseta = color;
        this.estampaCamiseta = estampa;
        this.posicionEstampa = Posicion;
        this.precioCamiseta = Precio;
        this.UsuarioCamiseta = Usuario;
    }

    public int getIdCamiseta() {
        return idCamiseta;
    }

    public void setIdCamiseta(int idCamiseta) {
        this.idCamiseta = idCamiseta;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipoCamiseta() {
        return tipoCamiseta;
    }

    public void setTipoCamiseta(String tipoCamiseta) {
        this.tipoCamiseta = tipoCamiseta;
    }

    public String getColor() {
        return colorCamiseta;
    }

    public void setColor(String color) {
        this.colorCamiseta = color;
    }

    public String getColorCamiseta() {
        return colorCamiseta;
    }

    public void setColorCamiseta(String colorCamiseta) {
        this.colorCamiseta = colorCamiseta;
    }

    public File getEstampaCamiseta() {
        return estampaCamiseta;
    }

    public void setEstampaCamiseta(File estampaCamiseta) {
        this.estampaCamiseta = estampaCamiseta;
    }

    public String getPosicionEstampa() {
        return posicionEstampa;
    }

    public void setPosicionEstampa(String posicionEstampa) {
        this.posicionEstampa = posicionEstampa;
    }

    public int getPrecioCamiseta() {
        return precioCamiseta;
    }

    public void setPrecioCamiseta(int precioCamiseta) {
        this.precioCamiseta = precioCamiseta;
    }

    public String getUsuarioCamiseta() {
        return UsuarioCamiseta;
    }

    public void setUsuarioCamiseta(String UsuarioCamiseta) {
        this.UsuarioCamiseta = UsuarioCamiseta;
    }
    static ArrayList<Camiseta> carritoCompras = new ArrayList<>();
    static ArrayList<Camiseta> carritoUsuario = new ArrayList<>();

    public void AñadirAlCarrito(int idCamisa, String talla, String tipoCamiseta, String color, File estampa, String Posicion, int Precio, String Usuario) {
        idCamiseta++;
        carritoCompras.add(new Camiseta(idCamiseta, talla, tipoCamiseta, color, estampa, Posicion, Precio, Usuario));
        CarritoUsuario++;
    }

    public void revisarUsuario(String Usuario) {
          for (Camiseta carritoCompra : carritoCompras) {
            if (carritoCompra.getUsuarioCamiseta().equals(Usuario)) {
                carritoUsuario.add(carritoCompra);
                CarritoActual++;
            }
        }
    }

    public File ObtenerCamisaIzqDer(int indice) {
        File a = carritoUsuario.get(indice).getEstampaCamiseta();
        idCamisaActual = carritoUsuario.get(indice).getIdCamiseta();
        PrecioActual = carritoUsuario.get(indice).getPrecioCamiseta();
        tallaActual = carritoUsuario.get(indice).getTalla();
        tipoCamisetaActual = carritoUsuario.get(indice).getTipoCamiseta();
        colorActual = carritoUsuario.get(indice).getColor();
        PosicionActual = carritoUsuario.get(indice).getPosicionEstampa();
        return a;
    }
    
    public void borrarCarritoUsuario() {
        carritoUsuario.clear();
        CarritoActual = 0;
    }

}
