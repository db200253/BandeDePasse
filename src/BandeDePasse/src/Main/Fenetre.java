package Main;

import Fen.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


@SuppressWarnings("serial")
public class Fenetre extends JFrame implements ActionListener {
  
  private JTextArea area = new JTextArea(1, 15);
  JComboBox<String> code = new JComboBox<>();
  JButton bouton = new JButton("Draw !");
  
  public Fenetre(){
    
    super("Bande de passe");
    createComposants();
    pack();
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
 
  public void createComposants() {
	  
	  JPanel principal = new JPanel();
	  principal.setLayout(new BoxLayout(principal, BoxLayout.Y_AXIS));
	  JPanel p1 = new JPanel();
	  p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
	  JPanel p2 = new JPanel();
	  p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
	  JPanel p3 = new JPanel();
	  
	  p1 = getP1(p1);
	  p2 = getP2(p2);
	  p3 = getP3(p3);
	  	  
	  principal.add(p1);
	  principal.add(p2);
	  principal.add(p3);
	  bouton.addActionListener(this);
	  setContentPane(principal);
  }
  
  public JPanel getP1(JPanel p) {
	  
	  JLabel titre1 = new JLabel("Entrez la trame binaire : ", SwingConstants.CENTER);
	  
	  p.add(Box.createRigidArea(new Dimension(10, 0)));
	  p.add(titre1);
	  p.add(Box.createHorizontalGlue());
	  p.add(Box.createRigidArea(new Dimension(10, 0)));
	  p.add(area);
	  p.add(Box.createRigidArea(new Dimension(10, 0)));
	  
	  return p;
  }
  
  public JPanel getP2(JPanel p) {
	  
	  JLabel titre2 = new JLabel("Choisissez le code à utiliser :", SwingConstants.CENTER);
	  
	  code.addItem("NRZ");
	  code.addItem("Manchester");
	  code.addItem("Manchester diff.");
	  code.addItem("Miller");
	  
	  p.add(Box.createRigidArea(new Dimension(10, 0)));
	  p.add(titre2);
	  p.add(Box.createHorizontalGlue());
	  p.add(Box.createRigidArea(new Dimension(10, 0)));
	  p.add(code);
	  p.add(Box.createRigidArea(new Dimension(10, 0)));
	  
	  return p;
  }
  
  public JPanel getP3(JPanel p) {
	  
	  p.add(bouton);
	  
	  return p;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
    if(e.getSource() == bouton) {
    
      String zone = area.getText();
      String nomCode = code.getSelectedItem().toString();
    
      for(int i = 0; i < zone.length(); ++i) {
      
        assert(zone.charAt(i) == 0 || zone.charAt(i) == 1);
      }
      
      switch(nomCode) {
      
        case "NRZ" : SwingUtilities.invokeLater(() -> new FenNRZ(zone));
        case "Manchester" : SwingUtilities.invokeLater(() -> new FenMan(zone));
        case "Manchester diff." : SwingUtilities.invokeLater(() -> new FenManD(zone));
        case "Miller" : SwingUtilities.invokeLater(() -> new FenMil(zone));
      }
    }
  }
}