import javax.swing.*;
import java.awt.event.*;

public class Parse extends JFrame implements ActionListener {
  private JTextField textField1, textField2;
  private JLabel label1, label2, label3;
  private JButton button1;

  public Parse() {
    setLayout(null);

    label1 = new JLabel("Valor 1: ");
    label1.setBounds(50, 5, 100, 30);
    add(label1);

    label2 = new JLabel("Valor 2: ");
    label2.setBounds(50, 35, 100, 30);
    add(label2);

    label3 = new JLabel("Resultado:");
    label3.setBounds(120, 80, 100, 30);
    add(label3);

    textField1 = new JTextField();
    textField1.setBounds(120, 10, 150, 20);
    add(textField1);

    textField2 = new JTextField();
    textField2.setBounds(120, 40, 150, 20);
    add(textField2);

    button1 = new JButton("Sumar");
    button1.setBounds(10, 80, 100, 30);
    add(button1);
    button1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button1) {
      int num1 = 0, num2 = 0, result = 0;

      num1 = Integer.parseInt(textField1.getText());
      num2 = Integer.parseInt(textField2.getText());
      result = num1 + num2;

      label3.setText("Resultado: " + result);
    }
  }

  public static void main(String[] args) {

    Parse interfaz1 = new Parse();
    interfaz1.setBounds(0, 0, 300, 160);
    interfaz1.setVisible(true);
    interfaz1.setResizable(false);
    interfaz1.setLocationRelativeTo(null);
  }
}
