import javax.swing.*;

public class textIn extends JFrame {
  private JLabel label1;
  private JLabel label2;

  public textIn() {
    setLayout(null);

    label1 = new JLabel("Hola mundo");
    label1.setBounds(20, 20, 300, 30);
    add(label1);

    label2 = new JLabel("Interfaz 2.0");
    label2.setBounds(20, 50, 300, 30);
    add(label2);
  }

  public static void main(String[] args) {
    textIn interfaz1 = new textIn();
    interfaz1.setBounds(0, 0, 400, 300);
    interfaz1.setVisible(true);
    interfaz1.setLocationRelativeTo(null);
    interfaz1.setResizable(false);
  }
}