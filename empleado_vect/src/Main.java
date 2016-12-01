
import javax.swing.*;

public class Main {

    public static void main(String args[]) {
        String cedula = "", nombre = "", trabajo = "";
        double salario = 0;
        int horas = 0;
        Empleado p[] = new Empleado[2];
        for (int i = 0; i < p.length; i++) {
            cedula = JOptionPane.showInputDialog(null, "Digite cedula:");
            nombre = JOptionPane.showInputDialog(null, "Digite nombre del trabajador:");
            trabajo = JOptionPane.showInputDialog(null, "Digite tipo de trabajo(Digite horas o full):");
            salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite salario mensual:"));
            if (trabajo.equals("horas")) {
                horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite horas trabajadas:"));
            }
            p[i] = new Empleado(cedula, nombre, trabajo, salario, horas);
            p[i].CalcularSalario(trabajo, salario, horas);
            if (horas == 0) {
                JOptionPane.showMessageDialog(null, "El trabajador: " + nombre + " con cedula: " + cedula
                        + "\n tiene un salario mensual " + salario);
            } else {
                JOptionPane.showMessageDialog(null, "El trabajador: " + nombre + " con cedula: " + cedula
                        + "\n tiene un salario mensual " + salario + " y su salario por hora es: "
                        + p[i].CalcularSalario(trabajo, salario, horas));
            }

        }
        for (int i = 0; i < p.length; i++) {
JOptionPane.showMessageDialog(null, "El trabajador: " + i +" se llama "+ p[i].getNombre() + " y tieen cedula: " + p[i].getIdTrabajador());
        }

    }
}
