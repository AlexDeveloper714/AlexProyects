
import java.util.Vector;

public class Cola {

    Vector pil = new Vector(20);
    private int fin = -1;

    public boolean estaColaVacia() {
        return (fin == -1);
    }

    public Object infoCola() {
        return (pil.elementAt(fin));
    }

    public Object getCola() {
        Object a;
        a = pil.elementAt(0);
        pil.removeElementAt(0);
        fin--;
        return a;
    }

    public void insertarCola(Object a) {
        fin++;
        pil.addElement(a);
    }
}
