
public class Pila {

    int tamaño;
    char[] item;
    int i;

    Pila(int tamaño) {
        this.tamaño = tamaño;
        this.item = new char[tamaño];
        this.i = 0;
    }

    public boolean estaPilaVacio(){
        boolean r = false;
        if (tamaño==-1) {
            r = true;
        }
        return r; 
    }
    public boolean insertarPila(char item) {
        if (i < tamaño) {
            this.item[i++] = item;
            return true;
        }
        return false;
    }

    public char eliminarPila() {
        if (i <= 0) {
            return 0;
        }
        return item[--i];
    }

    public char nextPop() {
        if (i <= 0) {
            return 0;
        }
        return item[i - 1];
    }
}
