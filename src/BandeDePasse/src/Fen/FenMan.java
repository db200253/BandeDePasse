package Fen;

import javax.swing.JInternalFrame;

public class FenMan implements FenCode {
  
  private String code;
  
  public FenMan(String code) {
    
    this.code = code;
  }
  
  @Override
  public void draw() {
    
    JInternalFrame fenetre = new JInternalFrame("Manchester", true, true);
  }
}