package codigo;

import java.util.*;

public class Compra {

    public static int inidiceTalla = 0;
    public static int inidiceColor = 0;
    public static int inidiceTipoCamiseta = 0;
    public static int registro = 0;
    public static int registroDescuento = 0;
    public static double descuentoCantidad[] = new double[3];
    public static double cantidadCompras = 0;
    public static double cantidadCamisetas = 0;
    public static double descuentoTipoPago = 0;

    public void SeteoDescuentoSistema() {
        if (registroDescuento == 0) {
            descuentoCantidad[0] = 0.03;
            descuentoCantidad[1] = 0.05;
            descuentoCantidad[2] = 0.1;
            descuentoTipoPago = descuentoCantidad[0];
            registroDescuento++;
        }

    }

    public void SetearDescuentoCantidad(double descuento, String tipoCompra) {
        switch (tipoCompra) {
            case "10-50":
                descuentoCantidad[0] = descuento / 100;
                break;
            case "50-100":
                descuentoCantidad[1] = descuento / 100;
                break;
            default:
                descuentoCantidad[2] = descuento / 100;
                break;
        }
    }

    public void SetearDescuentoTipoPago(double descuento) {
        descuentoTipoPago = descuento / 100;
    }

    public double calcularDatos(String talla, String tipoCompra, int PrecioEstampa, int CantidadCamiseta) {
        double TotalCompras = 0;
        int precioCamiseta = 0;
        double descuento = 0;
        double descuentoxCantidad = 0;
        switch (talla) {
            case "XS":
                precioCamiseta = 10000;
                break;
            case "S":
                precioCamiseta = 12000;
                break;
            case "M":
                precioCamiseta = 14000;
                break;
            case "L":
                precioCamiseta = 18000;
                break;
            case "XL":
                precioCamiseta = 20000;
                break;
            case "XXL":
                precioCamiseta = 24000;
                break;
        }
        if (CantidadCamiseta == 0) {
            TotalCompras = precioCamiseta + PrecioEstampa;
        } else {
            TotalCompras = ((precioCamiseta + PrecioEstampa) * CantidadCamiseta);
            switch (tipoCompra) {
                case "Credito":
                    descuento = TotalCompras * descuentoTipoPago;
                    break;
                default:
                    descuento = 0;
                    break;
            }
            if (CantidadCamiseta >= 10 && CantidadCamiseta <= 50) {
                descuentoxCantidad = TotalCompras * descuentoCantidad[0];
            }
            if (CantidadCamiseta > 50 && CantidadCamiseta <= 100) {
                descuentoxCantidad = TotalCompras * descuentoCantidad[1];
            }
            if (CantidadCamiseta > 100 && CantidadCamiseta <= 1000) {
                descuentoxCantidad = TotalCompras * descuentoCantidad[2];
            }
            TotalCompras = (TotalCompras - descuento) - descuentoxCantidad;
        }
        return TotalCompras;
    }

    static ArrayList<String> arrayTallas = new ArrayList<>();
    static ArrayList<String> arrayColor = new ArrayList<>();
    static ArrayList<String> arrayTipoCamiseta = new ArrayList<>();
    static ArrayList<String> TallaOculta = new ArrayList<>();
    static ArrayList<String> ColorOculto = new ArrayList<>();
    static ArrayList<String> TipoCamisetaOculta = new ArrayList<>();

    public void TallasAlamcenadas() {
        if (registro == 0) {
            String tallasComunes = "XS,S,M,L,XL,XXL";
            String[] tallasEstandar = tallasComunes.split(",");
            for (String tallasEstandar1 : tallasEstandar) {
                arrayTallas.add(tallasEstandar1);
                inidiceTalla++;
            }
            String ColoresComunes = "Amarillo,Azul,Rojo,Negro,Gris,"
                    + "Blanco,Rosado,Morado,"
                    + "Violeta,Verde,"
                    + "Naranja,Cafe";
            String[] colorEstandar = ColoresComunes.split(",");
            for (String colorEstandar1 : colorEstandar) {
                arrayColor.add(colorEstandar1);
                inidiceColor++;
            }
            String TipoCamisetaComunes = "Polo,Manga larga cuello V,"
                    + "Manga larga cuello tortuga,Manga corta cuello V,"
                    + "Manga corta cuello tortuga";
            String[] tipoCamisetaEstandar = TipoCamisetaComunes.split(",");
            for (String tipoCamisetaEstandar1 : tipoCamisetaEstandar) {
                arrayTipoCamiseta.add(tipoCamisetaEstandar1);
                inidiceTipoCamiseta++;
            }
            registro++;
        }
    }

    public void almacenarCamisas(String info, String Seleccion) {
        switch (Seleccion) {
            case "Color":
                arrayColor.add(info);
                inidiceColor++;
                break;
            case "Talla":
                arrayTallas.add(info);
                inidiceTalla++;
                break;
            default:
                arrayTipoCamiseta.add(info);
                inidiceTipoCamiseta++;
                break;
        }
    }

    public String RecojerTalla(int indice) {
        return arrayTallas.get(indice);
    }

    public String RecojerColor(int indice) {
        return arrayColor.get(indice);
    }

    public String RecojerTipoCamiseta(int indice) {
        return arrayTipoCamiseta.get(indice);
    }

    public boolean OcultarSeleccion(String info, String Seleccion) {
        boolean Remplazo = false;
        switch (Seleccion) {
            case "Color":
                for (int i = 0; i < arrayColor.size() && Remplazo == false; i++) {
                    if (arrayColor.get(i).equals(info)) {
                        ColorOculto.add(arrayColor.get(i));
                        arrayColor.remove(i);
                        inidiceColor--;
                        Remplazo = true;
                    }
                }
                break;
            case "Talla":
                for (int i = 0; i < arrayTallas.size() && Remplazo == false; i++) {
                    if (arrayTallas.get(i).equals(info)) {
                        TallaOculta.add(arrayTallas.get(i));
                        arrayTallas.remove(i);
                        inidiceTalla--;
                        Remplazo = true;
                    }
                }
                break;
            default:
                for (int i = 0; i < arrayTipoCamiseta.size() && Remplazo == false; i++) {
                    if (arrayTipoCamiseta.get(i).equals(info)) {
                        TipoCamisetaOculta.add(arrayTipoCamiseta.get(i));
                        arrayTipoCamiseta.remove(i);
                        inidiceTipoCamiseta--;
                        Remplazo = true;
                    }
                }
                break;
        }

        return Remplazo;
    }

    public boolean RestaurarSeleccion(String info, String Seleccion) {
        boolean Restaurar = false;
        String copia = "";
        switch (Seleccion) {
            case "Color":
                for (int i = 0; i < ColorOculto.size() && Restaurar == false; i++) {
                    if (ColorOculto.get(i).equals(info)) {
                        copia = ColorOculto.get(i);
                        ColorOculto.remove(i);
                        Restaurar = true;
                        inidiceColor++;
                    }
                }
                if (Restaurar == true) {
                    arrayColor.add(copia);
                }
                break;
            case "Talla":
                for (int i = 0; i < TallaOculta.size() && Restaurar == false; i++) {
                    if (TallaOculta.get(i).equals(info)) {
                        copia = TallaOculta.get(i);
                        TallaOculta.remove(i);
                        Restaurar = true;
                        inidiceTalla++;
                    }
                }
                if (Restaurar == true) {
                    arrayTallas.add(copia);
                }
                break;
            default:
                for (int i = 0; i < TipoCamisetaOculta.size() && Restaurar == false; i++) {
                    if (TipoCamisetaOculta.get(i).equals(info)) {
                        copia = TipoCamisetaOculta.get(i);
                        TipoCamisetaOculta.remove(i);
                        Restaurar = true;
                        inidiceTipoCamiseta++;
                    }
                }
                if (Restaurar == true) {
                    arrayTipoCamiseta.add(copia);
                }
                break;
        }

        return Restaurar;
    }

    public boolean VerificarSeleccion(String info, String Seleccion) {
        boolean Verficacion = false;
        switch (Seleccion) {
            case "Color":
                for (int i = 0; i < arrayColor.size() && Verficacion == false; i++) {
                    if (arrayColor.get(i).equals(info)) {
                        Verficacion = true;
                    }
                }
                break;
            case "Talla":
                for (int i = 0; i < arrayTallas.size() && Verficacion == false; i++) {
                    if (arrayTallas.get(i).equals(info)) {
                        Verficacion = true;
                    }
                }
                break;
            default:
                for (int i = 0; i < arrayTipoCamiseta.size() && Verficacion == false; i++) {
                    if (arrayTipoCamiseta.get(i).equals(info)) {
                        Verficacion = true;
                    }
                }
                break;
        }
        return Verficacion;
    }

    public boolean VerificarSeleccionOculta(String info, String Seleccion) {
        boolean VerificarOculto = false;
        switch (Seleccion) {
            case "Color":
                for (int i = 0; i < ColorOculto.size() && VerificarOculto == false; i++) {
                    if (ColorOculto.get(i).equals(info)) {
                        VerificarOculto = true;
                    }
                }
                break;
            case "Talla":
                for (int i = 0; i < TallaOculta.size() && VerificarOculto == false; i++) {
                    if (TallaOculta.get(i).equals(info)) {
                        VerificarOculto = true;
                    }
                }
                break;
            default:
                for (int i = 0; i < TipoCamisetaOculta.size() && VerificarOculto == false; i++) {
                    if (TipoCamisetaOculta.get(i).equals(info)) {
                        VerificarOculto = true;
                    }
                }
                break;
        }
        return VerificarOculto;
    }
}
