package Fen;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;

public class FenMan extends JDialog {
  
  private String code;
  
  public FenMan(String code) {
    
    this.code = code;
  }
  
  public void draw() {
    
    JInternalFrame fenetre = new JInternalFrame("Manchester", true, true);
  }
}