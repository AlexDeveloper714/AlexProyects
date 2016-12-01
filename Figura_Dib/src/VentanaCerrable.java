import java.awt.*;
import java.awt.event.*;

class VentanaCerrable extends Frame implements WindowListener {

public VentanaCerrable() {
	super();
}
public VentanaCerrable(String title) {
	super(title);
	addWindowListener(this);
}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {System.exit(0);}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}