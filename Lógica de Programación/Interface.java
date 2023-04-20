import javax.swing.*;

public class Interface extends JFrame {
  private JLabel Label1;

  public Interface() {
    setLayout(null);
    Label1 = new JLabel("Hola Mundo");
    Label1.setBounds(10, 10, 100, 0);
    add(Label1);
  }

  public static void main(String[] args) {
    Interface Formulary1 = new Interface();
    Formulary1.setBounds(0, 0, 1000, 100);
    Formulary1.setVisible(true);
    Formulary1.setLocationRelativeTo(null);
  }
}
