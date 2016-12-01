
public class Empleado {

    private String cedula, nombre, TipoEmpleo
;
    public Empleado(String idTrabajador, String nombre, String trabajo,double salario,int horas) {
        this.cedula = idTrabajador;
        this.nombre = nombre;
        this.TipoEmpleo = trabajo;
    }

    public String getIdTrabajador() {
        return cedula;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.cedula = idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoTrabajador() {
        return TipoEmpleo;
    }

    public void setTipoTrabajador(String Trabajo) {
        this.TipoEmpleo = Trabajo;
    }
    
      

    public double CalcularSalario(String TipoTrabajo,double salario,int horas) {
        if ("horas".equals(TipoTrabajo)) {
             return (salario/(30*8))*horas;            
        } else {
            return salario;
        }
    }
}
