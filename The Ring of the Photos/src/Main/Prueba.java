/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import uniminuto.ED.ringPhotos.gui.FormRingView;
import uniminuto.ED.ringPhotos.ring.Ring;

/**
 *
 * @author FELIPE
 */
public class Prueba {
    public static void main(String[] args) {
        
                       Ring<String> a = new Ring<String>();
		
		a.addEnd("/uniminuto/ED/ringPhotos/images/Flor1.jpg");
		a.addEnd("/uniminuto/ED/ringPhotos/images/Flor2.jpg");
		a.addEnd("/uniminuto/ED/ringPhotos/images/Flor3.jpg");
		a.addEnd("/uniminuto/ED/ringPhotos/images/Flor4.jpg");
		
                               
		new FormRingView(a);
        
        
}
}