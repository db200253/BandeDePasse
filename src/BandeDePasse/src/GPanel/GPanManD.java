package GPanel;

import java.awt.Graphics;
import javax.swing.JPanel;
import Fen.Point;

@SuppressWarnings("serial")
public class GPanManD extends JPanel {
	
private String code;
	
	public GPanManD(String code) {
		
		this.code = code;
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawLine(30, getHeight()/2, getWidth() - 30, getHeight()/2);  
		g.drawLine(30, 30, 30, getHeight() - 30);
		
		g.drawString("-nV", 10, getHeight() - 30);
		g.drawString("nV", 10, 30);
		
		Point[] tab = getPoints();
		
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