package uniminuto.ED.ringPhotos.ring;

import java.io.Serializable;

/**
 * 
 * Nodo de una lista
 * 
 * @author Estructuras de Control
 * @version 1.0
 * 
 * @param <type>
 *            Tipo de valores a almacenar
 */

public class Node<type extends Comparable<type> & Serializable> implements
		Comparable<Node<type>>, Serializable {

	private static final long serialVersionUID = 3001718935244211975L;

	private Node<type> prev;

	private Node<type> next;

	private type val;

	/**
	 * Constructor
	 * 
	 * @param val
	 *            Valor a almacenar en el nodo
	 */
	public Node(type val) {
		this(val, null, null);
	}

	/**
	 * Constructor
	 * 
	 * @param val
	 *            Valor a almacenar en el nodo
	 * @param prev
	 *            Nodo anterior
	 * @param next
	 *            Nodo siguiente
	 */
	public Node(type val, Node<type> prev, Node<type> next) {
		super();
		this.prev = prev;
		this.next = next;
		this.val = val;
	}

	/**
	 * Retorna el siguiente nodo
	 * 
	 * @return Siguiente nodo
	 */
	public Node<type> getNext() {
		return next;
	}

	/**
	 * Modifica el nodo siguiente
	 * 
	 * @param next
	 *            Nodo siguiente
	 */
	protected void setNext(Node<type> next) {
		this.next = next;
	}

	/**
	 * Retorna el nodo anterior
	 * 
	 * @return Nodo anterior
	 */
	public Node<type> getPrev() {
		return prev;
	}

	/**
	 * Modifica el nodo anterior
	 * 
	 * @param prev
	 *            Nodo anterior
	 */
	protected void setPrev(Node<type> prev) {
		this.prev = prev;
	}

	/**
	 * Retorna el contenido del nodo
	 * 
	 * @return Contenido almacenado en el nodo
	 */
	public type getVal() {
		return val;
	}

	/**
	 * Modifica el contenido del nodo
	 * 
	 * @param val
	 *            Nuevo contenido del nodo
	 */
	public void setVal(type val) {
		this.val = val;
	}

	/**
	 * Compara el nodo con otro
	 * 
	 * @param n
	 *            Nodo contra el que se compara
	 * @return 0, si son iguales; 1, si el nodo es mayor que n, -1 si nodo es
	 *         menor que n
	 */
	public int compareTo(Node<type> n) {
		return val.compareTo(n.getVal());
	}

	/**
	 * Retorna verdadero si dos nodos contienen el mismo contenido, comparado
	 * este con compareTo
	 * 
	 * @param n
	 *            Nodo contra el que se compara
	 * @return verdadero si dos nodos contienen el mismo contenido
	 */
	public boolean equals(Node<type> n) {
		return this.compareTo(n) == 0;
	}

	@Override
	public String toString() {
		return val.toString();
	}

}
