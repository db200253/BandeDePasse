package Fen;

import java.awt.Graphics;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FenMil extends JDialog {
	
  private String code;
  
  public FenMil(JFrame frame, String code) {
    
    super(frame, "Miller");
    this.code = code;
    createComposants();
    setSize(500, 250);
    setLocationRelativeTo(frame);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public void createComposants() {
    
    JPanel panel = new JPanel();
    
    panel = graph(panel);
    
    setContentPane(panel);
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
  
  public JPanel graph(JPanel p) {
	  
	  Graphics g;
	  g = getGraphics();
	  p.paintComponents(g);
	  
	  g.drawLine(30, getHeight()/2, getWidth() - 30, getHeight()/2);
	  g.drawString("X", getWidth() - 30, getHeight() - 20);
	  
	  g.drawLine(30, 30, 30, getHeight() - 30);
	  g.drawString("Y", 20, 30);
	  
	  return p;
  }
}