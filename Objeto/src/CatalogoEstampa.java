
public class CatalogoEstampa {
    /*Vector Estampas*/

    private final String idCatalogo, nombreCatalogo;

    public CatalogoEstampa(String idCatalogo, String nombreCatalogo) {
        this.idCatalogo = idCatalogo;
        this.nombreCatalogo = nombreCatalogo;
    }

//    Estampa[] vectorEstampas = new Estampa[2];
    public String gestionarEstampas(double precio, String nombre, int id, int CantidadUsuarios) {
        int i,j=0;
        String reserva = "";
        Estampa[] vectorEstampas = new Estampa[CantidadUsuarios];
        for (i = 0; i < 1; i++) {
            vectorEstampas[i] = new Estampa("", "", 0, 0);
            vectorEstampas[i].setNombre(nombre);
            vectorEstampas[i].setPrecio(precio);
            vectorEstampas[i].setId(id);
            reserva += "El cilente # " 
                    + vectorEstampas[i].getId()+"\ncon nombre "
                    + vectorEstampas[i].getNombre() +" tiene el ID de estampa: " + 
                    idCatalogo + " ,esa estampa es: " + nombreCatalogo + "\n con un precio de:" +
                    vectorEstampas[i].getPrecio();
        }
        return reserva;
    }

}
