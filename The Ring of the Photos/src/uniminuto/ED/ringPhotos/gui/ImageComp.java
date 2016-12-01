package uniminuto.ED.ringPhotos.gui;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageComp extends ImageIcon implements Comparable<ImageComp> {

	private static final long serialVersionUID = -5325044114012857291L;

	public ImageComp(Image img) {
		super(img);
	}

	public ImageComp(String path) {
		super(path);
	}

	public int compareTo(ImageComp arg0) {
		return 0;
	}

}
