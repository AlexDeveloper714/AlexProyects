package uniminuto.ED.ringPhotos.gui;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import uniminuto.ED.ringPhotos.ring.Node;
import uniminuto.ED.ringPhotos.ring.Ring;

public class PanelRingView extends JPanel {

    private static final long serialVersionUID = 7279254220042272588L;
    private Ring<String> l;
    private PanelFondo pAnt;
    private PanelFondo pAct;
    private PanelFondo pAnct;
    private PanelFondo pSig;

    public PanelRingView(Ring<String> l) {
        super();
        this.l = l;
        this.setLayout(new GridLayout(1, 3));
        pAnt = new PanelFondo();
        this.add(pAnt);
        pAct = new PanelFondo();
        this.add(pAct);
        pAnct = new PanelFondo();
        this.add(pAnct);
        pSig = new PanelFondo();
        this.add(pSig);
        actualizar();
    }

    public void actualizar() {
        Node<String> n = l.getActual();
        if (n != null) {
            if(getClass().getResource(n.getPrev().getVal()) == null){
                pAnt.setImg(new ImageIcon(n.getPrev().getVal()).getImage());
            }else{
                pAnt.setImg(new ImageIcon(getClass().getResource(
                    n.getPrev().getVal()).getPath().replaceAll("%20", " ")).getImage());
            }
            if(getClass().getResource(n.getNext().getVal()) == null){
               pAnct.setImg(new ImageIcon(n.getVal()).getImage());
            }else{
                pAnct.setImg(new ImageIcon(getClass().getResource(
                    n.getNext().getVal()).getPath().replaceAll("%20", " ")).getImage());
            }
            if(getClass().getResource(n.getVal())==null){
                pAct.setImg(new ImageIcon(n.getVal()).getImage());
            }else{
                pAct.setImg(new ImageIcon(getClass().getResource(
                    n.getVal()).getPath().replaceAll("%20", " ")).getImage());
            }
            if(getClass().getResource(n.getNext().getVal())==null){
                pSig.setImg(new ImageIcon(n.getNext().getVal()).getImage());
            }else{
                pSig.setImg(new ImageIcon(getClass().getResource(
                    n.getVal()).getPath().replaceAll("%20", " ")).getImage());
            }
        } else {
            pAnt.setImg(null);
            pAct.setImg(null);
            pAnct.setImg(null);
            pSig.setImg(null);
        }
        this.repaint();
    }

    protected void setRing(Ring<String> l) {
        this.l = l;
    }
}
