import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {
  private JLabel label1, label2;
  private JTextArea textArea1;
  private JScrollPane scroll1;
  private JCheckBox check1;
  private JButton boton1, boton2;
  String nombre = "";

  public Licencia() {
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de Uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.texto;

    label1 = new JLabel("TÉRMINOS Y CONDICIONES");
    label1.setBounds(215, 5, 200, 30);
    label1.setFont(new Font("Helvetica", 3, 14));
    label1.setForeground(new Color(0, 0, 0));
    add(label1);

    textArea1 = new JTextArea();
    textArea1.setEditable(false);
    textArea1.setFont(new Font("Helvetica", 0, 9));
    textArea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
        "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
        "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
        "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
        "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
        "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
        "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
        "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
        "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
        "\n          http://www.youtube.com/ernestoperezm");
    scroll1 = new JScrollPane(textArea1);
    scroll1.setBounds(10, 40, 575, 200);
    add(scroll1);

    check1 = new JCheckBox("Yo, " + nombre + ", acepto");
    check1.setBounds(10, 250, 300, 30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10, 290, 100, 30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(120, 290, 100, 30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);

    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    label2 = new JLabel(imagen);
    label2.setBounds(315, 135, 300, 300);
    add(label2);
  }

  public void stateChanged(ChangeEvent e) {
    if (check1.isSelected() == true) {
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    } else {
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton1) {
      Principal ventanaPrincipal = new Principal();
      ventanaPrincipal.setBounds(0, 0, 640, 535);
      ventanaPrincipal.setVisible(true);
      ventanaPrincipal.setResizable(false);
      ventanaPrincipal.setLocationRelativeTo(null);
      this.setVisible(false);
    } else if (e.getSource() == boton2) {
      Bienvenida ventanaBienvenido = new Bienvenida();
      ventanaBienvenido.setBounds(0, 0, 350, 450);
      ventanaBienvenido.setVisible(true);
      ventanaBienvenido.setResizable(false);
      ventanaBienvenido.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }

  public static void main(String[] args) {
    Licencia licenciaVentana = new Licencia();
    licenciaVentana.setBounds(0, 0, 610, 370);
    licenciaVentana.setVisible(true);
    licenciaVentana.setResizable(false);
    licenciaVentana.setLocationRelativeTo(null);
  }
}
