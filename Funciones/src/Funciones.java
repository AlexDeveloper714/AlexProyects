
import javax.swing.*;

public class Funciones {

    public static void main(String[] args) {
        int n, x, sele = 0;
        boolean esta;
        String z = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite número de datos:"));
        int datos[] = new int[n];
        leerdatos(datos, n);
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor a buscar:"));
        esta = datosvector(datos, n, x);
        if (esta == true) {
            JOptionPane.showMessageDialog(null, "El valor: " + x + " esta en el vector");
        } else {
            JOptionPane.showMessageDialog(null, "El valor: " + x + " NO ESTA EN EL VECTOR");
        }
        imprimirvector(datos, n);
        int aux[] = new int[n];
        System.arraycopy(datos, 0, aux, 0, n);
        while (sele < 7) {
            sele = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor para hacer operaciones"
                    + "\n 1. Ordenar por burbuja"
                    + "\n 2. Ordenar por selección"
                    + "\n 3. Ordenar por inserccion"
                    + "\n 4. Ordenar por insercion (metodo booleano)"
                    + "\n 5. Ordenar por Quicksort"
                    + "\n 6. Ordenar por Mergesort"
                    + "\n 7. Salir"));
            switch (sele) {
                case 1:
                    ordenarburbuja(datos, n);
                    break;
                case 2:
                    ordenarSeleccion(datos, n);
                    break;
                case 3:
                    ordenarInsercion(datos, n);
                    break;
                case 4:
                    ordenarInsercionBoo(datos, n);
                    break;
                case 5:
                    z = quicksort(datos, 0, n);
                    JOptionPane.showMessageDialog(null, "El vector ordenado es: " + z);
                    break;
                case 6:
                    z = mergesort(datos, 0, n);
                    JOptionPane.showMessageDialog(null, "El vector ordenado es: " + z);
                    System.arraycopy(aux, 0, datos, 0, n);
                    break;
            }
        }
    }

    public static void leerdatos(int x[], int n1) {
        for (int i = 0; i < n1; i++) {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor a ingresar:"));
        }
    }

    public static boolean datosvector(int datos[], int n, int x) {
        boolean r = false;
        for (int i = 0; i < n; i++) {
            if (datos[i] == x) {
                r = true;
            }
        }
        return r;

    }

    public static void imprimirvector(int datos[], int n1) {
        String m = "";
        for (int i = 0; i < n1; i++) {
            m += datos[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Tu vector es: " + m);
    }

    public static void ordenarburbuja(int datos[], int n1) {
        int aux = 0, i, j;
        String m = "";
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n1 - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                }
            }

        }
        for (i = 0; i < n1; i++) {
            m += datos[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Tu vector  ORDENADO es: " + m);
    }

    public static void ordenarSeleccion(int datos[], int n1) {
        int aux = 0, minimo = 0, i, j;
        String m = "";
        for (i = 0; i < n1; i++) {
            minimo = i;
            for (j = i + 1; j < n1; j++) {
                if (datos[minimo] > datos[j]) {
                    minimo = j;
                }

            }
            if (i != minimo) {
                aux = datos[minimo];
                datos[minimo] = datos[i];
                datos[i] = aux;
            }

        }

        for (i = 0; i < n1; i++) {
            m += datos[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Tu vector  ORDENADO es: " + m);
    }

    public static void ordenarInsercion(int datos[], int n1) {
        int aux = 0, i, j;
        String m = "";
        for (i = 1; i < n1; i++) {
            j = i - 1;
            aux = datos[i];
            while (j >= 0 && datos[j] > aux) {
                datos[j + 1] = datos[j];
                j--;
            }
            datos[j + 1] = aux;
        }
        for (i = 0; i < n1; i++) {
            m += datos[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Tu vector  ORDENADO es: " + m);
    }

    public static void ordenarInsercionBoo(int datos[], int n1) {
        int aux = 0, i, j;
        String m = "";
        for (i = 0; i < n1; i++) {
            j = i - 1;
            aux = datos[i];
            boolean hallo = false;
            while (j >= 0 && hallo == false) {
                if (datos[j] > aux) {
                    datos[j + 1] = datos[j];
                    j--;
                } else {
                    hallo = true;
                }

            }
            datos[j + 1] = aux;
        }
        for (i = 0; i < n1; i++) {
            m += datos[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Tu vector  ORDENADO es: " + m);
    }

    public static String quicksort(int datos[], int inicio, int fin) {
        int pivote = 0;
        String x = "";
        if (inicio < fin) {
            pivote = ColocarPivote(datos, inicio, fin);
            quicksort(datos, inicio, pivote - 1);
            quicksort(datos, pivote + 1, fin);
        }
        for (int i = inicio; i < fin; i++) {
            x += " " + datos[i];

        }
        return x;
    }

    public static int ColocarPivote(int datos[], int inicio, int n1) {
        int pivote = 0, aux = 0, i = 0;
        String x = "", y = "";
        pivote = inicio;
        for (i = pivote + 1; i < n1; i++) {
            if (datos[i] < datos[pivote]) {
                pivote++;
                aux = datos[pivote];
                datos[pivote] = datos[i];
                datos[i] = aux;

            }
        }
        for (i = 0; i < n1; i++) {
            x += " " + datos[i];
        }
        aux = datos[inicio];
        datos[inicio] = datos[pivote];
        datos[pivote] = aux;
        for (i = 0; i < n1; i++) {
            y += " " + datos[i];
        }
//        JOptionPane.showMessageDialog(null, "La posición del pivote es: " + pivote
//                + " El valor del pivote es: " + datos[pivote] + "\nEl vector anterior es:" + x
//        +"\n El vector ordenado es:" + y);
        return pivote;
    }

    public static String mergesort(int datos[], int inicio, int fin) {
        int mitad = 0;
        String x = "";
        if (inicio < fin) {
            mitad = (inicio + fin) / 2;
            mergesort(datos, inicio, mitad);
            mergesort(datos, mitad + 1, fin);
            mezclar(datos, inicio, mitad, fin);
        }
        for (int i = inicio; i < fin; i++) {
            x += " " + datos[i];
        }
        return x;
    }

    public static void mezclar(int datos[], int inicio, int mitad, int fin) {
        int i = 0, j = 0, k = 0, total = 0;
        int aux[] = new int[100];
        i = inicio;
        j = mitad + 1;
        while (i < mitad && j < fin) {
            if (datos[i] >= datos[j]) {
                aux[k] = datos[i];
                i++;
            } else {
                aux[k] = datos[j];
                j++;
            }
//            i++;
//            j++;
            k++;
        }
        /*Captura Inicio-Mitad+1*/
        while (i <= mitad) {
            aux[k] = datos[i];
            k++;
            i++;
        }
        /*¿No captura nada?*/
        while (j < fin) {
            aux[k] = datos[j];
            k++;
            j++;
        }
        total = fin - inicio;
        for (k = 0; k < total; k++) {
            datos[inicio + k] = aux[k];
            fin--;
        }

    }

}
