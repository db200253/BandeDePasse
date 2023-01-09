package Fen;

import javax.swing.JInternalFrame;

public class FenManD implements FenCode {
  
  private String code;
  
  public FenManD(String code) {
    
    this.code = code;
  }
  
  @Override
  public void draw() {
    
    JInternalFrame fenetre = new JInternalFrame("Manchester Diff.", true, true);
  }
}