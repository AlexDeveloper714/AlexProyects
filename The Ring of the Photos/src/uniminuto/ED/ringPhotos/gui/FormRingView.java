package uniminuto.ED.ringPhotos.gui;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import uniminuto.ED.ringPhotos.ring.FormatFileException;
import uniminuto.ED.ringPhotos.ring.Node;
import uniminuto.ED.ringPhotos.ring.Ring;


public class FormRingView extends JFrame {

	private static final long serialVersionUID = -7863659195286579457L;

	private Ring<String> l;

	private PanelRingView vp;

	public FormRingView(Ring<String> l) {
		super();
		this.l = l;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		vp = new PanelRingView(this.l);
		this.add(vp);

		this.addKeyListener(new EvTeclado(this.l, this));
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public void actualizar(){
		vp.actualizar();
	}

	protected void setRing(Ring<String> l){
		this.l = l;
		vp.setRing(l);
	}
	
	private class EvTeclado extends KeyAdapter {

		private Ring<String> l;

		private FormRingView fv;

		public EvTeclado(Ring<String> l, FormRingView fv) {
			this.l = l;
			this.fv = fv;
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				l.next();
				fv.actualizar();
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				l.prev();
				fv.actualizar();
			} else if (e.getKeyCode() == KeyEvent.VK_HOME) {
				l.first();
				fv.actualizar();
			} else if (e.getKeyCode() == KeyEvent.VK_END) {
				l.last();
				fv.actualizar();
			} else if (e.getKeyCode() == KeyEvent.VK_S) {
				l.sort();
				fv.actualizar();
			} else if (e.getKeyCode() == KeyEvent.VK_INSERT) {
				JTextArea path = new JTextArea();
				JFileChooser d = new JFileChooser(System.getProperty("user.dir"));
				int sel = d.showOpenDialog(path);
				if (sel == JFileChooser.APPROVE_OPTION){
					String p = d.getSelectedFile().getAbsolutePath();
					l.add(p);
				}
				fv.actualizar();
			} else if (e.getKeyCode() == KeyEvent.VK_A) {
				JTextArea path = new JTextArea();
				JFileChooser d = new JFileChooser(System.getProperty("user.dir"));
				int sel = d.showOpenDialog(path);
				if (sel == JFileChooser.APPROVE_OPTION){
					String p = d.getSelectedFile().getAbsolutePath();
					try {
						l = new Ring<String>(p);
						fv.setRing(l);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Error Leyendo el Archivo");
					} catch (FormatFileException e1) {
						JOptionPane.showMessageDialog(null, "Archivo Corrupto");
					}
				}
				fv.actualizar();
			} else if (e.getKeyCode() == KeyEvent.VK_G) {
				JTextArea path = new JTextArea();
				JFileChooser d = new JFileChooser(System.getProperty("user.dir"));
				int sel = d.showSaveDialog(path);
				if (sel == JFileChooser.APPROVE_OPTION){
					String p = d.getSelectedFile().getAbsolutePath();
					try {
						l.save(p);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "Error Guardando el Archivo");
					}
				}
				fv.actualizar();
			} else if (e.getKeyCode() == KeyEvent.VK_DELETE) {
				l.del();
				fv.actualizar();
			} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				Node<String> n = l.getActual();
				Image img = new ImageIcon(n.getVal()).getImage();
				FormPhotoView f = new FormPhotoView(new PanelFondo(img));
				f.setSize(img.getWidth(null), img.getHeight(null));
			} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				fv.dispose();
			}
			super.keyPressed(e);
		}

	}

}
