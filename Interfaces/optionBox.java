import javax.swing.*;
import java.awt.event.*;

public class optionBox extends JFrame implements ItemListener {

  private JComboBox comboBox1;

  public optionBox() {
    setLayout(null);
    comboBox1 = new JComboBox();

    comboBox1.setBounds(10, 10, 80, 20);
    add(comboBox1);

    comboBox1.addItem("Rojo");
    comboBox1.addItem("Verde");
    comboBox1.addItem("Azul");
    comboBox1.addItem("Amarillo");
    comboBox1.addItem("Negro");

    comboBox1.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent e) {
    if (e.getSource() == comboBox1) {
      String Seleccion = comboBox1.getSelectedItem().toString();

      setTitle(Seleccion);
    }
  }

  public static void main(String[] args) {
    optionBox Interfaz = new optionBox();
    Interfaz.setBounds(0, 0, 300, 150);
    Interfaz.setVisible(true);
    Interfaz.setResizable(false);
    Interfaz.setLocationRelativeTo(null);
  }
}
