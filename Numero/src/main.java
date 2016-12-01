
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex
 */
public class main {

    public static void main(String[] args) {
        try {
            String z = "",x="";
            String s[] = {"suma", "resta", "multiplicación", "división","Salir"};
            int b = 0;
            
while(x!="Salir"){
    x = (String) JOptionPane.showInputDialog(null, "Digite unos posibles valores", "Operaciones comunes", JOptionPane.INFORMATION_MESSAGE, null, s, s[0]);
         switch (x) {
                case "suma":
                    JOptionPane.showMessageDialog(null, "Has elegido sumar");
                    break;
                case "multiplicación":
                    JOptionPane.showMessageDialog(null, "Has elegido multiplicar");
                    break;
                case "división":
                    JOptionPane.showMessageDialog(null, "Has elegido dividir");
                    break;
                case "resta":
                    JOptionPane.showMessageDialog(null, "Has elegido restar");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Hasta luego...");
                    break;
            }  
}
     
//            z = JOptionPane.showInputDialog("Digite un numero para sumar sus digitos: ");
//
//            for (int i = 0; i < z.length(); i++) {
//                if (Integer.parseInt(Character.toString(z.charAt(i))) >= 0) {
//                    b = b + Integer.parseInt(Character.toString(z.charAt(i)));
//                }
//            }
//            JOptionPane.showMessageDialog(null, "El resultado de la suma de los digitos "
//                    + "de tu número: " + z + " es: " + b);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite numeros validos e intente de nuevo");
        }
    }

}
