import javax.swing.*;

public class SecondInterface extends JFrame {
  public SecondInterface() {
    setLayout(null);
  }

  public static void main(String[] args) {
    SecondInterface Frame1 = new SecondInterface();
    Frame1.setBounds(0, 0, 300, 300);
    Frame1.setVisible(true);
    Frame1.setLocationRelativeTo(null);
    Frame1.setResizable(false);
  }
}