import javax.swing.*;

public class Label extends JFrame {

  private JLabel Label1;
  private JLabel Label2;

  public Label() {
    setLayout(null);
    Label1 = new JLabel("Hola Mundo");
    Label1.setBounds(10, 20, 300, 30);
    add(Label1);
    Label2 = new JLabel("Buenos días, mi niña hermosa");
    Label2.setBounds(10, 100, 300, 30);
    add(Label2);
  }

  public static void main(String[] args) {
    Label Frame = new Label();
    Frame.setBounds(0, 0, 350, 350);
    Frame.setVisible(true);
    Frame.setLocationRelativeTo(null);
  }
}
