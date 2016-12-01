package Main;

import javax.swing.JOptionPane;
import uniminuto.ED.ringPhotos.ring.Ring;
import uniminuto.ED.ringPhotos.gui.FormRingView;


public class Portal {

	public static void main(String[] args) {
             String recibir;
        int numero;
        Camisa vectorCamisa[] = new Camisa[1];
        Usuario vectorUsuario[] = new Usuario[1];
        
        
        
            do {
          
        recibir = JOptionPane.showInputDialog("que opcion quiere realizar"
                + "\nver estampas por tema de: "
                + "     \n1-flores"
                + "     \n2-calaveras"
                + "     \n3-Games"
                + "     \n4-bandas"
                + "\nVer estampas por Autor: "
                + "     \n5-Antonio Solis"
                + "     \n6-Vicente Fernandez"
                + "     \n7-Jony Rivera"
                + "     \n8-Jhoany Ayala"
                + "     \n9-Ver camisas"
                + "     \n10-Hacer compra");
        numero= Integer.parseInt(recibir);
        
       switch (numero){ 
           case 1:  
               Ring<String> a = new Ring<String>();
		
		a.addEnd("/uniminuto/ED/ringPhotos/images/Flor1.jpg");
		a.addEnd("/uniminuto/ED/ringPhotos/images/Flor2.jpg");
		a.addEnd("/uniminuto/ED/ringPhotos/images/Flor3.jpg");
		a.addEnd("/uniminuto/ED/ringPhotos/images/Flor4.jpg");
		
                               
		new FormRingView(a);
               break;
               case 2:  
               Ring<String> b = new Ring<String>();
		
		b.addEnd("/uniminuto/ED/ringPhotos/images/calavera1.jpg");
		b.addEnd("/uniminuto/ED/ringPhotos/images/calavera2.jpg");
		b.addEnd("/uniminuto/ED/ringPhotos/images/calavera3.jpg");
		b.addEnd("/uniminuto/ED/ringPhotos/images/calavera4.jpg");
		
                
		new FormRingView(b);
               break;
                   case 3:  
               Ring<String> c = new Ring<String>();
		
		c.addEnd("/uniminuto/ED/ringPhotos/images/games1.jpg");
		c.addEnd("/uniminuto/ED/ringPhotos/images/games2.jpg");
		c.addEnd("/uniminuto/ED/ringPhotos/images/games3.jpg");
		c.addEnd("/uniminuto/ED/ringPhotos/images/games4.jpg");
		
                
		new FormRingView(c);
               break;
                       case 4:  
               Ring<String> d = new Ring<String>();
		
		d.addEnd("/uniminuto/ED/ringPhotos/images/banda1.jpg");
		d.addEnd("/uniminuto/ED/ringPhotos/images/banda2.jpg");
		d.addEnd("/uniminuto/ED/ringPhotos/images/banda3.jpg");
		d.addEnd("/uniminuto/ED/ringPhotos/images/banda4.jpg");
		
                
		new FormRingView(d);
               break;
                     case 5:  
               Ring<String> e = new Ring<String>();
		
		e.addEnd("/uniminuto/ED/ringPhotos/images/Flor1.jpg");
		e.addEnd("/uniminuto/ED/ringPhotos/images/calavera1.jpg");
		e.addEnd("/uniminuto/ED/ringPhotos/images/games1.jpg");
		e.addEnd("/uniminuto/ED/ringPhotos/images/banda1.jpg");
		
                
		new FormRingView(e);
               break;
               case 6:  
               Ring<String> f = new Ring<String>();
		
		f.addEnd("/uniminuto/ED/ringPhotos/images/flor2.jpg");
		f.addEnd("/uniminuto/ED/ringPhotos/images/calavera2.jpg");
		f.addEnd("/uniminuto/ED/ringPhotos/images/games2.jpg");
		f.addEnd("/uniminuto/ED/ringPhotos/images/banda2.jpg");
		
                
		new FormRingView(f);
               break;
                   case 7:  
               Ring<String> g = new Ring<String>();
		
		g.addEnd("/uniminuto/ED/ringPhotos/images/flor3.jpg");
		g.addEnd("/uniminuto/ED/ringPhotos/images/calavera3.jpg");
		g.addEnd("/uniminuto/ED/ringPhotos/images/games3.jpg");
		g.addEnd("/uniminuto/ED/ringPhotos/images/banda3.jpg");
		
                
		new FormRingView(g);
               break;
                       case 8:  
               Ring<String> h = new Ring<String>();
		
		h.addEnd("/uniminuto/ED/ringPhotos/images/flor4.jpg");
		h.addEnd("/uniminuto/ED/ringPhotos/images/calavera4.jpg");
		h.addEnd("/uniminuto/ED/ringPhotos/images/games4.jpg");
		h.addEnd("/uniminuto/ED/ringPhotos/images/banda4.jpg");
		
                
		new FormRingView(h);
               break;
                     
                    case 9:
                        Ring<String> i = new Ring<String>();
		
		i.addEnd("/uniminuto/ED/ringPhotos/images/camisa1.jpg");
		i.addEnd("/uniminuto/ED/ringPhotos/images/camisa2.jpg");
		i.addEnd("/uniminuto/ED/ringPhotos/images/camisa3.jpg");
		i.addEnd("/uniminuto/ED/ringPhotos/images/camisa4.jpg");
		
                
		new FormRingView(i);
             
                break;
              
               case 10:
                 
                 vectorCamisa[0] = new Camisa("" , "" , "" , "");
                 vectorCamisa[0].setNombreCamisa(JOptionPane.showInputDialog("ingrese el nombre de la camisa"));
                 vectorCamisa[0].setColor(JOptionPane.showInputDialog("ingrese el color de la camisa"));
                 vectorCamisa[0].setEstilo(JOptionPane.showInputDialog("ingrese estilo de la camisa"));
                 vectorCamisa[0].setTalla(JOptionPane.showInputDialog("ingrese la talla de la camisa"));
                 
                 vectorUsuario[0] = new Usuario("","","",0,0);
                 vectorUsuario[0].setNombreUsuario(JOptionPane.showInputDialog("ingrese su nombre"));
                 vectorUsuario[0].setCc(Integer.parseInt(JOptionPane.showInputDialog("ingrese su numero de documento")));
                 vectorUsuario[0].setTelefono(Integer.parseInt(JOptionPane.showInputDialog("ingrese su numero de telefono")));
                 vectorUsuario[0].setDireccion(JOptionPane.showInputDialog("ingrese su direccion"));
                 vectorUsuario[0].setCorreo(JOptionPane.showInputDialog("ingrese su correo"));
                                 
                   
		JOptionPane.showMessageDialog(null, "¡Se ha realizado su compra!"
                        + "\n-Al usuario con los siguientes datos:"
                        + "\n-nombre:"+vectorUsuario[0].getNombreUsuario()
                        + "\n-Numero de documento:"+vectorUsuario[0].getCc()
                        + "\n-Numero de telefono:"+vectorUsuario[0].getTelefono()
                        + "\n-Direccion:"+vectorUsuario[0].getDireccion()
                        + "\n-Correo:"+vectorUsuario[0].getCorreo());
                
		
               break;
                   
                   
               
           case 20:
               
		
		
               break;}   
                }  while(numero!=15);

		Ring<String> a = new Ring<String>();
		
		
		
	}

}
