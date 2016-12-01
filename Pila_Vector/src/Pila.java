
import java.util.*;

public class Pila {

    Vector pil = new Vector(20);
    private int cabeza = -1;

    public boolean estaPilaVacia() {
        return (cabeza == -1);
    }

    public Object infoPila() {
        return (pil.elementAt(cabeza));
    }

    public Object getPila() {
        Object a;
        a = pil.elementAt(cabeza);
        pil.removeElementAt(cabeza);
        cabeza--;
        return a;
    }

    public void insertarPila(Object a) {
        cabeza++;
        pil.addElement(a);
    }

}
