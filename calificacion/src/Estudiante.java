
public class Estudiante {

    private String idEstudiante, nombre, carrera;

    public Estudiante(String idEstudiante, String nombre, String carrera) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double SumarPromedio(double nota1, double nota2, double nota3) {
        /*Sin Variables de manera local
         return (nota1+nota2+nota3)/3;*/
        double promedio = 0;
        promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio <= 5 && promedio >= 0) {
            return promedio;
        } else {
            promedio = -1;
            return promedio;
        }
    }
}
