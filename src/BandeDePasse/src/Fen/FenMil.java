package Fen;

import javax.swing.JInternalFrame;

public class FenMil implements FenCode {
  
  private String code;
  
  public FenMil(String code) {
    
    this.code = code;
  }
  
  @Override
  public void draw() {
    
    JInternalFrame fenetre = new JInternalFrame("Miller", true, true);
  }
}