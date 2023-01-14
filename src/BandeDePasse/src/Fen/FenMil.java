package Fen;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;

public class FenMil extends JDialog {
  
  private String code;
  
  public FenMil(String code) {
    
    this.code = code;
  }
  
  public void draw() {
    
    JInternalFrame fenetre = new JInternalFrame("Miller", true, true);
  }
}