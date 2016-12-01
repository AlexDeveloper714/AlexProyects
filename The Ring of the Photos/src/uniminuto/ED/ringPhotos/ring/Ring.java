package uniminuto.ED.ringPhotos.ring;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/**
 * 
 * Esructura de Control: Anillo
 * 
 * @author Estructuras de Control
 * @version 1.0
 * 
 * @param <type> Tipo de nodo a almacenar
 */
public class Ring<type extends Comparable<type> & Serializable> implements
        Iterable<Node<type>>, Serializable {

    private static final long serialVersionUID = -6320463705814800470L;
    private Node<type> first;
    private Node<type> last;
    private Node<type> actual;
    private int size;

    /**
     * Constructor por defecto, crea una anillo vacio
     */
    public Ring() {
        this.clear();
    }

    /**
     * Crea un anillo a partir de un archivo
     *
     * @param path Dirección absoluta del archivo
     * @throws IOException Error en la lectura del archivo
     * @throws FormatFileException Error a causa de un formato de archivo erroneo
     * @see #save(String)
     */
    @SuppressWarnings("unchecked")
    public Ring(String path) throws IOException, FormatFileException {
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fis);
        try {
            Ring<type> laux = (Ring<type>) in.readObject();
            Node n = laux.getFirst();
            if (n != null) {
                Node<type> nadd = new Node<type>((type) n.getVal());
                while (n != laux.getLast()) {
                    this.addEnd(nadd);
                    if (n == laux.getActual()) {
                        actual = nadd;
                    }
                    n = n.getNext();
                    nadd = new Node<type>((type) n.getVal());
                }
                this.addEnd(nadd);
                if (n == laux.getActual()) {
                    actual = nadd;
                }
            }
        } catch (ClassNotFoundException e) {
            throw new FormatFileException();
        }
        in.close();
        fis.close();
    }

    /**
     * Guarda el contenido del anillo en un archivo dado por path
     *
     * @param path Dirección donde se va a almacenar el anillo
     * @throws IOException Error en la escritura de archivo
     */
    public void save(String path) throws IOException {

        File f = new File(path);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(this);
        out.close();
        fos.close();
    }

    /**
     * Retorna el nodo actual
     *
     * @return Retorna el nodo actual
     */
    public Node<type> getActual() {
        return actual;
    }

    /**
     * Retorna el primer nodo del anillo
     *
     * @return Retorna el primer nodo del anillo
     */
    public Node<type> getFirst() {
        return first;
    }

    /**
     * Retorna el último nodo del anillo
     *
     * @return Retorna el último nodo del anillo
     */
    public Node<type> getLast() {
        return last;
    }

    /**
     * Retorna el número de nodos del anillo
     *
     * @return Retorna el número de nodos del anillo
     */
    public int getSize() {
        return size;
    }

    /**
     * Retorna el anillo ubicado en la posición i del anillo (inicia en 0)
     *
     * @param i Ubicación de nodo buscada
     * @return El nodo en la posición i del anillo
     */
    public Node<type> getNode(int i) {
        if (isEmpty()) {
            return null;
        }
        if (i >= this.size || i < 0) {
            return null;
        }

        Node<type> n = this.getFirst();

        for (int k = 0; k < i; ++k) {
            n = n.getNext();
        }

        return n;
    }

    /**
     * Retorna verdadero si la lista esta vacia
     *
     * @return Verdadero si la lista esta vacia
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Limpia el anillo eliminando todos sus nodos
     *
     */
    public void clear() {
        first = null;
        last = null;
        actual = null;
        size = 0;
    }

    /**
     * Adiciona un nodo al inicio del anillo
     *
     * @param v Contenido del nodo a adicionar
     */
    public void addBegin(type v) {
        addBegin(new Node<type>(v));
    }

    /**
     * Adiciona un nodo al inicio del anillo
     *
     * @param n Nodo a adicionar
     */
    public void addBegin(Node<type> n) {
        if (isEmpty()) {
            last = n;
            actual = n;
            n.setNext(n);
            n.setPrev(n);
        } else {
            first.setPrev(n);
            n.setNext(first);
            n.setPrev(last);
            last.setNext(n);
        }
        first = n;
        size++;
    }

    /**
     * Adicionar un nodo despues del actual
     *
     * @param v Contenido del nodo a adicionar
     */
    public void add(type v) {
        add(new Node<type>(v));
    }

    /**
     * Adicionar un nodo despues del actual
     *
     * @param n Nodo a adicionar
     */
    public void add(Node<type> n) {
        if (isEmpty()) {
            first = n;
            last = n;
            actual = n;
            n.setNext(n);
            n.setPrev(n);
        } else {
            actual.getNext().setPrev(n);
            n.setNext(actual.getNext());
            actual.setNext(n);
            n.setPrev(actual);
            if (actual == last) {
                last = n;
            }
        }
        size++;
    }

    /**
     * Adicionar un nodo al final del anillo
     *
     * @param v Contenido del nodo a adicionar
     */
    public void addEnd(type v) {
        addEnd(new Node<type>(v));
    }

    /**
     * Adicionar un nodo al final del anillo
     *
     * @param n Nodo a adicionar
     */
    public void addEnd(Node<type> n) {
        if (isEmpty()) {
            first = n;
            actual = n;
            n.setPrev(n);
            n.setNext(n);
        } else {
            last.setNext(n);
            n.setPrev(last);
            n.setNext(first);
            first.setPrev(n);
        }
        last = n;
        size++;
    }

    /**
     * Pasar Actual al primer nodo
     *
     * @return primer nodo
     */
    public Node<type> first() {
        if (!isEmpty()) {
            actual = first;
            return actual;
        }
        return null;
    }

    /**
     * Pasar Actual al ultimo nodo
     *
     * @return ultimo nodo
     */
    public Node<type> last() {
        if (!isEmpty()) {
            actual = last;
            return actual;
        }
        return null;
    }

    /**
     * Pasar Actual al nodo siguiente
     *
     * @return el nodo actual
     */
    public Node<type> next() {
        if (!isEmpty()) {
            actual = actual.getNext();
            return actual;
        }
        return null;
    }

    /**
     * Pasar Actual al nodo anterior
     *
     * @return el nodo actual
     */
    public Node<type> prev() {
        if (!isEmpty()) {
            actual = actual.getPrev();
            return actual;
        }
        return null;
    }

    /**
     * Borrar el último nodo del anillo
     *
     * @return El nodo eliminado
     */
    public Node<type> delEnd() {
        return delNode(last);
    }

    /**
     * Borrar el primer nodo del anillo
     *
     * @return El nodo eliminado
     */
    public Node<type> delBegin() {
        return delNode(first);
    }

    /**
     * Borrar el nodo actual (proximo nodo se convierte en nodo actual)
     *
     * @return El nodo eliminado
     */
    public Node<type> del() {
        return delNode(actual);
    }

    /**
     * Borra el nodo en la posición i del anillo
     *
     * @param i posicion del nodo a borrar
     * @return El nodo eliminado
     */
    public Node<type> del(int i) {
        return delNode(this.getNode(i));
    }

    /**
     * Borrar el nodo n, si se encuentra en el anillo
     *
     * @param n El nodo a eliminar
     * @return El nodo eliminado
     */
    public Node<type> del(Node<type> n) {
        for (Node<type> aux : this) {
            if (aux == n) {
                return delNode(aux);
            }
        }
        return null;
    }

    /**
     * Borrar un nodo existente del anillo
     *
     * @param n Nodo a eliminar
     * @return Nodo eliminado
     */
    private Node<type> delNode(Node<type> n) {

        // If la lista esta vacia o el nodo es nulo
        if (isEmpty() || n == null) {
            return null;
        }

        // Si la lista tiene un tamaño de un elemento
        if (this.getSize() == 1) {
            this.clear();
            return n;
        }

        // Si el nodo es igual al nodo actual pasar al siguiente elemento
        if (n == actual) {
            this.next();
        }
        // Si el nodo es igual al primer nodo, primero es el siguiente
        if (n == first) {
            first = n.getNext();
        }
        // Si el nodo es igual al último nodo, último es igual al anterior
        if (n == last) {
            last = n.getPrev();
        }

        // Borramos el nodo
        n.getPrev().setNext(n.getNext());
        n.getNext().setPrev(n.getPrev());
        --size;

        return n;

    }

    /**
     * Ordena la lista por un algoritmo de ordenamiento
     */
    public void sort() {
        for (Node<type> ni = first; ni != last; ni = ni.getNext()) {
            for (Node<type> nj = ni.getNext(); nj != first; nj = nj.getNext()) {
                if (ni.compareTo(nj) > 0) {
                    intercambiar(ni, nj);
                }
            }
        }
    }

    /**
     * Intercambia el contenido del nodo ni con nj
     *
     * @param ni Nodo a intercambiar
     * @param nj Nodo a intercambiar
     */
    private void intercambiar(Node<type> ni, Node<type> nj) {

        type val = ni.getVal();
        ni.setVal(nj.getVal());
        nj.setVal(val);

        // Si ni o nj son iguales al nodo actual
        if (ni == actual) {
            actual = nj;
        } else if (nj == actual) {
            actual = ni;
        }

    }

    @Override
    public Iterator<Node<type>> iterator() {
        return new IteratorList<type>(this);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Node<type> n : this) {
            if (n != first) {
                sb.append(" <--> ");
            }
            sb.append(n.toString());
            if (n == actual) {
                sb.append("*");
            }
        }
        return sb.toString();
    }
}
