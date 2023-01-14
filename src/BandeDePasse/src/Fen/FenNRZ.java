package Fen;

import javax.swing.*;

public class FenNRZ extends JDialog{
  
  private String code;
  
  public FenNRZ(String code) {
    
    this.code = code;
  }
  
  public void draw() {
    
    JInternalFrame fenetre = new JInternalFrame("NRZ", true, true);
  }
}