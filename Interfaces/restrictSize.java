import javax.swing.*;

public class restrictSize extends JFrame {

  public restrictSize() {
    setLayout(null);
  }

  public static void main(String[] args) {
    restrictSize window1 = new restrictSize();
    window1.setBounds(0, 0, 400, 600);
    window1.setVisible(true);
    window1.setLocationRelativeTo(null);
    window1.setResizable(false);
  }
}
