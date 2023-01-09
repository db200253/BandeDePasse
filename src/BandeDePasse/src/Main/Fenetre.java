package Main;

import Fen.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class Fenetre extends JFrame implements ActionListener{
  
  private JLabel titre1 = new JLabel("Entrez la trame binaire", SwingConstants.CENTER);
  private JTextArea area = new JTextArea(1, 15);
  private JLabel titre2 = new JLabel("Choisissez le code à utiliser :", SwingConstants.CENTER);
  private JComboBox<String> code = new JComboBox<>();
  private JButton bouton = new JButton("Draw !");
  
  public Fenetre(){
    
    setBounds(400, 150, 400, 150);
    setTitle("Choix chaîne et code");
    
    JPanel panel = new JPanel();
    panel.add(titre1);
    panel.add(area);
    panel.add(titre2);
    code.addItem("NRZ");
    code.addItem("Manchester");
    code.addItem("Manchester diff.");
    code.addItem("Miller");
    panel.add(code);
    panel.add(bouton);
    bouton.addActionListener(this);
    setContentPane(panel);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
    if(e.getSource() == bouton) {
    
      String zone = area.getText();
      String nomCode = code.getSelectedItem().toString();
    
      for(int i = 0; i < zone.length(); ++i) {
      
        assert(zone.charAt(i) == 0 || zone.charAt(i) == 1);
      }
      
      FenCode fc;
      
      switch(nomCode) {
      
        case "NRZ" : fc = new FenNRZ(zone); fc.draw();
        case "Manchester" : fc = new FenMan(zone); fc.draw();
        case "Manchester diff." : fc = new FenManD(zone); fc.draw();
        case "Miller" : fc = new FenMil(zone); fc.draw();
      }
    }
  }
}