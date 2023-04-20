import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class subMenu extends JFrame implements ActionListener {

  private JMenuBar menuBar;
  private JMenu menu1, menu2, menu3;
  private JMenuItem item1, item2, item3, item4;

  public subMenu() {
    setLayout(null);

    menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    menu1 = new JMenu("Opciones");
    menuBar.add(menu1);

    menu2 = new JMenu("Tamaño de Ventana");
    menu1.add(menu2);

    menu3 = new JMenu("Color de Fondo");
    menu1.add(menu3);

    item1 = new JMenuItem("300*200 px");
    menu2.add(item1);
    item1.addActionListener(this);

    item2 = new JMenuItem("640*480 px");
    menu2.add(item2);
    item2.addActionListener(this);

    item3 = new JMenuItem("Rojo");
    menu3.add(item3);
    item3.addActionListener(this);

    item4 = new JMenuItem("Azul");
    menu3.add(item4);
    item4.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == item1) {
      setSize(300, 200);
    }
    if (e.getSource() == item2) {
      setSize(640, 480);
    }
    if (e.getSource() == item3) {
      getContentPane().setBackground(new Color(255, 0, 0));
    }
    if (e.getSource() == item4) {
      getContentPane().setBackground(new Color(0, 0, 255));
    }
  }

  public static void main(String[] args) {
    subMenu interfaz1 = new subMenu();

    interfaz1.setBounds(0, 0, 300, 200);
    interfaz1.setVisible(true);
    interfaz1.setResizable(false);
    interfaz1.setLocationRelativeTo(null);
  }
}
