
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double precio = 0;
        int i, CantidadCatalogo = 0,id=0;
        String nombre = "", idEstampa = "", nombreEstampa = "", total="";
        CantidadCatalogo = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de catalogos: "));
        CatalogoEstampa catalogos[] = new CatalogoEstampa[CantidadCatalogo];
        for (i = 0; i < catalogos.length; i++) {
            id++;
            nombre = JOptionPane.showInputDialog("Digite su nombre: ");
            precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de la estampa: "));
            idEstampa = JOptionPane.showInputDialog("Digite la Id de su estampa: ");
            nombreEstampa = JOptionPane.showInputDialog("Digite el nombre de su estampa: ");
            catalogos[i] = new CatalogoEstampa(idEstampa, nombreEstampa);
            total+= catalogos[i].gestionarEstampas(precio, nombre, id, CantidadCatalogo) + "\n\n";
        }
        JOptionPane.showMessageDialog(null,total);
    }

}
