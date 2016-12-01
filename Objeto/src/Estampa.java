
public class Estampa {
    private String nombre,descripcion;
    private double precio;
    private int id;
    
    public Estampa(String descripcion,String nombre,double precios,int id){
        this.id=id;
        this.nombre=nombre;
        this.precio=precios;
        this.descripcion=descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
        
}
