package figuras;
// fichero PanelDibujo.java

import java.awt.*;
import java.util.*;

public class PanelDibujo extends Panel {

	private final Vector v;

	// constructor
	public PanelDibujo(Vector vect) { 
		super(new FlowLayout()); 
		this.v = vect;
	}
        @Override
	public void paint(Graphics g) {
		Dibujable dib;
		Enumeration e;
		e = v.elements();
		while(e.hasMoreElements()){
			dib=(Dibujable)e.nextElement();
			dib.dibujar(g);
	   }
   }         
} // Fin de la clase DrawWindow