import javax.swing.*;
import java.awt.event.*;

public class textField extends JFrame implements ActionListener {

  private JTextField textF1;
  private JLabel label1;
  private JButton boton1;

  public textField() {
    setLayout(null);

    label1 = new JLabel("Usuario");
    label1.setBounds(10, 10, 100, 30);
    add(label1);

    textF1 = new JTextField();
    textF1.setBounds(120, 17, 150, 20);
    add(textF1);

    boton1 = new JButton("Aceptar");
    boton1.setBounds(10, 80, 100, 30);
    add(boton1);
    boton1.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton1) {
      String texto1 = textF1.getText();
      setTitle(texto1);
    }
  }

  public static void main(String[] args) {
    textField interfaz1 = new textField();

    interfaz1.setBounds(0, 0, 300, 160);
    interfaz1.setVisible(true);
    interfaz1.setLocationRelativeTo(null);
    interfaz1.setResizable(false);

  }

}
