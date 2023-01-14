package Fen;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;

public class FenManD extends JDialog {
  
  private String code;
  
  public FenManD(String code) {
    
    this.code = code;
  }
  
  public void draw() {
    
    JInternalFrame fenetre = new JInternalFrame("Manchester Diff.", true, true);
  }
}