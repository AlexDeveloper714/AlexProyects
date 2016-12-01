package uniminuto.ED.ringPhotos.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class FormPhotoView extends JFrame{
	
	private static final long serialVersionUID = 6375176353722864369L;
	
	private PanelFondo p;
	
	public FormPhotoView(PanelFondo p){
		super();
		this.p = p;
		this.setSize(400, 600);
		this.setVisible(true);
		this.add(this.p);
		this.addKeyListener(new EvTeclado(this));
	}

	private class EvTeclado extends KeyAdapter {

		private FormPhotoView f;
		
		public EvTeclado(FormPhotoView f){
			this.f = f;
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				f.dispose();
			}
			super.keyPressed(e);
		}

	}

}
