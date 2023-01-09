package Fen;

import javax.swing.*;

public class FenNRZ implements FenCode {
  
  private String code;
  
  public FenNRZ(String code) {
    
    this.code = code;
  }
  
  @Override
  public void draw() {
    
    JInternalFrame fenetre = new JInternalFrame("NRZ", true, true);
  }
}