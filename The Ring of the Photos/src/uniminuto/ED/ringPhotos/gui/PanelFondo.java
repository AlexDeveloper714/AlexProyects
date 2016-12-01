package uniminuto.ED.ringPhotos.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class PanelFondo extends JPanel {

	private static final long serialVersionUID = -8364642964982782694L;

	private Image img;

	public PanelFondo() {
		super();
		this.setBackground(Color.red);
		this.img = null;
	}

	public PanelFondo(Image img) {
		super();
		this.img = img;
	}
	
	public void setImg(Image img){
		this.img = img;
	}

	public void paint(Graphics g) {
		super.paint(g);
		if (img != null)
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
		else
			g.clearRect(0, 0, this.getWidth(), this.getHeight());
	}

}
