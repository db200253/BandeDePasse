package Fen;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import GPanel.GPanMan;

@SuppressWarnings("serial")
public class FenMan extends JDialog {
	
  private String code;
  
  public FenMan(JFrame frame, String code) {
    
    super(frame, "Manchester");
    this.code = code;
    createComposants();
    setSize(500, 500);
    setLocationRelativeTo(frame);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setVisible(true);
  }
  
  public void createComposants() {
    
	JPanel principal = new JPanel();
	principal.setLayout(new BoxLayout(principal, BoxLayout.Y_AXIS));
	
	JPanel p1 = new JPanel();
	JLabel trame = new JLabel("Trame binaire traduite : " + code);
	p1.add(trame);
	JPanel p2 = new GPanMan(code);
	
	
	principal.add(p1);
	principal.add(p2);
	principal.add(Box.createVerticalGlue());
    
    setContentPane(principal);
  }
}