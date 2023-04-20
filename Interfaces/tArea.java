import javax.swing.*;

public class tArea extends JFrame {

  private JTextField textField1;
  private JTextArea textArea1;

  public tArea() {
    setLayout(null);

    textField1 = new JTextField();
    textField1.setBounds(10, 10, 200, 30);
    add(textField1);

    textArea1 = new JTextArea();
    textArea1.setBounds(10, 50, 400, 300);
    add(textArea1);

  }

  public static void main(String[] args) {

    tArea interfaz1 = new tArea();
    interfaz1.setBounds(0, 0, 540, 400);
    interfaz1.setVisible(true);
    interfaz1.setLocationRelativeTo(null);
    interfaz1.setResizable(false);

  }
}
