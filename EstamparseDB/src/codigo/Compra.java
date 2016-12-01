package codigo;

public class Compra {

    public static int registroDescuento = 0;
    public static double descuentoCantidad[] = new double[3];
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

    /*Revisar Calculos...*/
    public double calcularCompra(int Precio, int CantidadCamiseta, String tipoCompra) {
        double TotalCompras = 0;
        double descuento = 0;
        double descuentoxCantidad = 0;
        if (CantidadCamiseta > 0) {
            switch (tipoCompra) {
                case "Credito":
                    descuento = Precio * descuentoTipoPago;
                    break;
                default:
                    descuento = 0;
                    break;
            }
            TotalCompras = (Precio * CantidadCamiseta) - descuento;
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

}
