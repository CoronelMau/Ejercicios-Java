import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {
  private JTextField textField1;
  private JLabel label1, label2, label3, label4;
  private JButton boton1;
  public static String texto = "";

  public Bienvenida() {
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(255, 0, 0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    label1 = new JLabel(imagen);
    label1.setBounds(25, 15, 300, 150);
    add(label1);

    label2 = new JLabel("Sistema de Control Vacacional");
    label2.setBounds(35, 135, 300, 30);
    label2.setFont(new Font("Helvetica", 3, 18));
    label2.setForeground(new Color(255, 255, 255));
    add(label2);

    label3 = new JLabel("Ingrese su Nombre: ");
    label3.setBounds(45, 212, 200, 30);
    label3.setFont(new Font("Helvetica", 1, 12));
    label3.setForeground(new Color(255, 255, 255));
    add(label3);

    label4 = new JLabel("©2023 The Coca-Cola Company");
    label4.setBounds(85, 375, 300, 30);
    label4.setFont(new Font("Helvetica", 1, 12));
    label4.setForeground(new Color(255, 255, 255));
    add(label4);

    textField1 = new JTextField();
    textField1.setBounds(45, 240, 255, 25);
    textField1.setBackground(new Color(224, 224, 224));
    label4.setFont(new Font("Helvetica", 1, 12));
    label4.setForeground(new Color(255, 0, 0));
    add(textField1);

    boton1 = new JButton("Ingresar");
    boton1.setBounds(125, 280, 100, 30);
    boton1.setBackground(new Color(255, 255, 255));
    boton1.setFont(new Font("Helvetica", 1, 12));
    boton1.setForeground(new Color(255, 0, 0));
    boton1.addActionListener(this);
    add(boton1);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton1) {
      texto = textField1.getText().trim();
      if (texto.equals("")) {
        JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
      } else {
        Licencia licenciaVentana = new Licencia();
        licenciaVentana.setBounds(0, 0, 610, 370);
        licenciaVentana.setVisible(true);
        licenciaVentana.setResizable(false);
        licenciaVentana.setLocationRelativeTo(null);
        this.setVisible(false);
      }
    }
  }

  public static void main(String[] args) {
    Bienvenida ventanaBienvenido = new Bienvenida();
    ventanaBienvenido.setBounds(0, 0, 350, 450);
    ventanaBienvenido.setVisible(true);
    ventanaBienvenido.setResizable(false);
    ventanaBienvenido.setLocationRelativeTo(null);
  }
}