import javax.swing.*;

public class formulario extends JFrame {
  private JLabel label1;

  public formulario() {
    setLayout(null);
    label1 = new JLabel("Hola mundo");
    label1.setBounds(50, 20, 600, 10);
    add(label1);
  }

  public static void main(String[] args) {
    formulario Formulario1 = new formulario();

    Formulario1.setBounds(0, 0, 400, 300);
    Formulario1.setVisible(true);
    Formulario1.setLocationRelativeTo(null);

  }
}