package GPanel;

import java.awt.Graphics;
import javax.swing.JPanel;
import Fen.Point;

@SuppressWarnings("serial")
public class GPanNRZ extends JPanel {
	
	private String code;
	
	public GPanNRZ(String code) {
		
		this.code = code;
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawLine(30, getHeight()/2, getWidth() - 30, getHeight()/2);  
		g.drawLine(30, 30, 30, getHeight() - 30);
		
		g.drawString("-nV", 10, getHeight() - 30);
		g.drawString("nV", 10, 30);
		
		Point[] tab = getPoints();
		int abs1, abs2, ord;
		
		for(int i = 0; i < tab.length; ++i) {
			
			abs1 = 30 + i*(getWidth()-60)/tab.length;
			abs2 = 30 + (i+1)*(getWidth()-60)/tab.length;
			if(tab[i].getY() == 1) ord = 30;
			else ord = getHeight() - 30;
			
			g.drawLine(abs1, ord, abs2, ord);
			
			if(i != tab.length - 1 && tab[i].getY() != tab[i+1].getY()) {
				
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