package uniminuto.ED.ringPhotos.ring;

import java.io.Serializable;
import java.util.Iterator;

/**
 * 
 * Iterador de lista
 * 
 * @author Estructuras de Control
 * @version 1.0
 * 
 * @param <type>
 *            Tipo de nodo a iterar
 */

public class IteratorList<type extends Comparable<type> & Serializable>
		implements Iterator<Node<type>> {

	private Ring<type> l;

	private Node<type> nodeIt;

	/**
	 * Constructor
	 * 
	 * @param l
	 *            Anillo a iterar
	 */
	public IteratorList(Ring<type> l) {
		this.l = l;
		nodeIt = null;
	}

	/**
	 * Si existen mas elementos a iterar
	 * 
	 * @return Verdadero si el nodo iterador es diferente al ultimo nodo de la
	 *         lista
	 */
	public boolean hasNext() {
		return nodeIt != l.getLast();
	}

	/**
	 * Nodo iterador pasa a ser el siguiente nodo de la lista
	 * 
	 * @return El siguiente nodo de la lista
	 */
	public Node<type> next() {
		if (nodeIt == null) {
			nodeIt = l.getFirst();
		} else {
			if (nodeIt == l.getLast())
				return null;
			nodeIt = nodeIt.getNext();
		}
		return nodeIt;
	}

	/**
	 * Borra el último elemento retornado por next
	 */
	public void remove() {
		if (nodeIt != null) {
			l.del(nodeIt);
		}
	}
}
