import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener {
  private JButton boton1;

  public Boton() {
    setLayout(null);

    boton1 = new JButton("Cerrar");
    boton1.setBounds(250, 300, 100, 50);
    add(boton1);

    boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton1) {
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    Boton interfaz1 = new Boton();
    interfaz1.setBounds(0, 0, 500, 600);
    interfaz1.setVisible(true);
    interfaz1.setResizable(false);
    interfaz1.setLocationRelativeTo(null);
  }
}
