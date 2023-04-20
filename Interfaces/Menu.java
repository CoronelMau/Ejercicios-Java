import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener {
  private JMenuBar menuBar;
  private JMenu menu1;
  private JMenuItem item1, item2, item3;

  public Menu() {
    setLayout(null);

    menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    menu1 = new JMenu("Colores");
    menuBar.add(menu1);

    item1 = new JMenuItem("Rojo");
    item1.addActionListener(this);
    menu1.add(item1);

    item2 = new JMenuItem("Verde");
    item2.addActionListener(this);
    menu1.add(item2);

    item3 = new JMenuItem("Azul");
    item3.addActionListener(this);
    menu1.add(item3);
  }

  public void actionPerformed(ActionEvent e) {
    Container Fondo = this.getContentPane();

    if (e.getSource() == item1) {
      Fondo.setBackground(new Color(255, 0, 0));
    }
    if (e.getSource() == item2) {
      Fondo.setBackground(new Color(0, 255, 0));
    }
    if (e.getSource() == item3) {
      Fondo.setBackground(new Color(0, 0, 255));
    }
  }

  public static void main(String[] args) {
    Menu interfaz1 = new Menu();
    interfaz1.setBounds(0, 0, 400, 300);
    interfaz1.setVisible(true);
    interfaz1.setLocationRelativeTo(null);
  }
}
