
import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        String cedula = "", nombre = "", trabajo = "";
        double salario = 0;
        int horas = 0;

        //trabajador 1
        cedula = JOptionPane.showInputDialog(null, "Digite cedula:");
        nombre = JOptionPane.showInputDialog(null, "Digite nombre del trabajador:");
        trabajo = JOptionPane.showInputDialog(null, "Digite tipo de trabajo(Digite horas o full):");
        salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite salario mensual:"));
        if (trabajo.equals("horas")) {
            horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite horas trabajadas:"));
        }
        Empleado trabajador1 = new Empleado(cedula, nombre, trabajo, salario, horas);
        trabajador1.CalcularSalario(trabajo, salario, horas);
        if (horas == 0) {
            JOptionPane.showMessageDialog(null, "El trabajador: " + nombre + " con cedula: " + cedula
                    + "\n tiene un salario mensual " + salario);
        } else {

            JOptionPane.showMessageDialog(null, "El trabajador: " + nombre + " con cedula: " + cedula
                    + "\n tiene un salario mensual " + salario + " y su salario por hora es: "
                    + trabajador1.CalcularSalario(trabajo, salario, horas));
        }

        //trabajador 2
        cedula = JOptionPane.showInputDialog(null, "Digite cedula:");
        nombre = JOptionPane.showInputDialog(null, "Digite nombre del trabajador:");
        trabajo = JOptionPane.showInputDialog(null, "Digite tipo de trabajo(Digite horas o full):");
        salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite salario mensual:"));
        if (trabajo.equals("horas")) {
            horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite horas trabajadas:"));
        }
        Empleado trabajador2 = new Empleado(cedula, nombre, trabajo, salario, horas);
        trabajador2.CalcularSalario(trabajo, salario, horas);
        if (horas == 0) {
            JOptionPane.showMessageDialog(null, "El trabajador: " + nombre + " con cedula: " + cedula
                    + "\n tiene un salario mensual " + salario);
        } else {

            JOptionPane.showMessageDialog(null, "El trabajador: " + nombre + " con cedula: " + cedula
                    + "\n tiene un salario mensual " + salario + " y su salario por hora es: "
                    + trabajador2.CalcularSalario(trabajo, salario, horas));
        }
        if (trabajador1.CalcularSalario(trabajo, salario, horas) < trabajador2.CalcularSalario(trabajo, salario, horas)) {
            JOptionPane.showMessageDialog(null, "El trabajador: " + trabajador2.getNombre() + " con cedula: " + trabajador2.getIdTrabajador()
                    + "\n gana màs salario que " + trabajador1.getNombre() + " con cedula: " + trabajador1.getIdTrabajador());
        } else {
            JOptionPane.showMessageDialog(null, "El trabajador: " + trabajador1.getNombre() + " con cedula: " + trabajador1.getIdTrabajador()
                    + "\n gana más salario que " + trabajador1.getNombre() + " con cedula: " + trabajador1.getIdTrabajador());
        }

    }
}
