
import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        String id = "", nombre = "", carrera = "";
        double nota1, nota2, nota3;
        boolean afirmar = false;
        id = JOptionPane.showInputDialog(null, "Digite id:");
        nombre = JOptionPane.showInputDialog(null, "Digite nombre:");
        carrera = JOptionPane.showInputDialog(null, "Digite carrera:");
        Estudiante estudiante1 = new Estudiante(id, nombre, carrera);
        while (afirmar == false) {
            nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la primera nota del estudiante(notas de 0 a 5):"));
            nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la segunda nota del estudiante(notas de 0 a 5):"));
            nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la tercera nota del estudiante(notas de 0 a 5):"));
            if (estudiante1.SumarPromedio(nota1, nota2, nota3) == -1) {
                JOptionPane.showMessageDialog(null, "Digitaste las notas, vuelve a intentarlo mas tarde");
            } else {
                JOptionPane.showMessageDialog(null, "El ID del estudiante es: " + estudiante1.getIdEstudiante()
                        + "\nel nombre del estudiante es: " + estudiante1.getNombre()
                        + "\n y la carrera del estudiante es: " + estudiante1.getCarrera()
                        + "\n la nota promedio que saco fue: " + estudiante1.SumarPromedio(nota1, nota2, nota3));
                afirmar = true;
            }
        }

    }
}
