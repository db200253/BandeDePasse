package GPanel;

import java.awt.Graphics;
import javax.swing.JPanel;
import Fen.Point;

@SuppressWarnings("serial")
public class GPanMil extends JPanel {
	
private String code;
	
	public GPanMil(String code) {
		
		this.code = code;
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawLine(30, getHeight()/2, getWidth() - 30, getHeight()/2);  
		g.drawLine(30, 30, 30, getHeight() - 30);
		
		g.drawString("-nV", 10, getHeight() - 30);
		g.drawString("nV", 10, 30);
		
		Point[] tab = getPoints();
		int abs1, abs2, ord1, ord2;
		
		for(int i = 0; i < tab.length; ++i) {
			
			abs1 = 30 + i*(getWidth()-60)/tab.length;
			abs2 = 30 + (i+1)*(getWidth()-60)/tab.length;
			
			if(tab[i].getY() == 1) {
				
				ord1 = 30; 
				ord2 = getHeight() - 30;
			} else {
				
				ord1 = getHeight() - 30;
				ord2 = 30;
			}
			
			g.drawLine(abs1, ord1, (abs2+abs1)/2, ord1);
			g.drawLine((abs2+abs1)/2, 30, (abs2+abs1)/2, getHeight() - 30);
			g.drawLine((abs2+abs1)/2, ord2, abs2, ord2);
			
			if(i != tab.length - 1 && tab[i].getY() == tab[i+1].getY()) {
				
				g.drawLine(abs2, 30, abs2, getHeight() - 30);
			}
		}
	}
	
	public Point[] getPoints() {
		  
		  Point[] result = new Point[code.length()];
		  Point courant;
		  int abscisse = 0;
		  int ordonnee;
		  
		  for(int i = 0; i < code.length(); ++i) {
			  
			  if(code.charAt(i) == '1') {
				  
				  ordonnee = 1;
			  } else {
				  
				  ordonnee = -1;
			  }
			  
			  courant = new Point(abscisse, ordonnee);
			  result[i] = courant;
			  ++abscisse;
		  }
		  
		  return result;
	  }
}