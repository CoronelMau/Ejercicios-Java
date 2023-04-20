import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
  private JMenuBar mb;
  private JMenu mOpciones, mCalcular, mAcercaDe, mColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno,
      labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
  private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTabajador;
  private JComboBox comboDepartamento, comboAntiguedad;
  private JScrollPane scroll1;
  private JTextArea textArea1;
  String nombreAdmin = "";

  public Principal() {
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Principal");
    getContentPane().setBackground(new Color(255, 0, 0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombreAdmin = ventanaBienvenida.texto;

    mb = new JMenuBar();
    mb.setBackground(new Color(255, 0, 0));
    setJMenuBar(mb);

    mOpciones = new JMenu("Opciones");
    mOpciones.setBackground(new Color(255, 0, 0));
    mOpciones.setFont(new Font("Helvetica", 1, 14));
    mOpciones.setForeground(new Color(255, 255, 255));
    mb.add(mOpciones);

    mCalcular = new JMenu("Calcular");
    mCalcular.setBackground(new Color(255, 0, 0));
    mCalcular.setFont(new Font("Helvetica", 1, 14));
    mCalcular.setForeground(new Color(255, 255, 255));
    mb.add(mCalcular);

    mAcercaDe = new JMenu("Acerca de");
    mAcercaDe.setBackground(new Color(255, 0, 0));
    mAcercaDe.setFont(new Font("Helvetica", 1, 14));
    mAcercaDe.setForeground(new Color(255, 255, 255));
    mb.add(mAcercaDe);

    mColorFondo = new JMenu("Color de fondo");
    mColorFondo.setFont(new Font("Helvetica", 1, 14));
    mColorFondo.setForeground(new Color(255, 0, 0));
    mOpciones.add(mColorFondo);

    miCalculo = new JMenuItem("Vacaciones");
    miCalculo.setFont(new Font("Helvetica", 1, 14));
    miCalculo.setForeground(new Color(255, 0, 0));
    mCalcular.add(miCalculo);
    miCalculo.addActionListener(this);

    miRojo = new JMenuItem("Rojo");
    miRojo.setFont(new Font("Helvetica", 1, 14));
    miRojo.setForeground(new Color(255, 0, 0));
    mColorFondo.add(miRojo);
    miRojo.addActionListener(this);

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Helvetica", 1, 14));
    miNegro.setForeground(new Color(255, 0, 0));
    mColorFondo.add(miNegro);
    miNegro.addActionListener(this);

    miMorado = new JMenuItem("Morado");
    miMorado.setFont(new Font("Helvetica", 1, 14));
    miMorado.setForeground(new Color(255, 0, 0));
    mColorFondo.add(miMorado);
    miMorado.addActionListener(this);

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Helvetica", 1, 14));
    miNuevo.setForeground(new Color(255, 0, 0));
    mOpciones.add(miNuevo);
    miNuevo.addActionListener(this);

    miElCreador = new JMenuItem("El Creador");
    miElCreador.setFont(new Font("Helvetica", 1, 14));
    miElCreador.setForeground(new Color(255, 0, 0));
    mAcercaDe.add(miElCreador);
    miElCreador.addActionListener(this);

    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Helvetica", 1, 14));
    miSalir.setForeground(new Color(255, 0, 0));
    mOpciones.add(miSalir);
    miSalir.addActionListener(this);

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5, 5, 250, 100);
    add(labelLogo);

    labelBienvenido = new JLabel("Bienvenido(a) " + nombreAdmin);
    labelBienvenido.setBounds(280, 30, 300, 50);
    labelBienvenido.setFont(new Font("Helvetica", 1, 32));
    labelBienvenido.setForeground(new Color(255, 255, 255));
    add(labelBienvenido);

    labelTitle = new JLabel("Datos del trabajador opara el cálculo de vacaciones");
    labelTitle.setBounds(45, 140, 900, 25);
    labelTitle.setFont(new Font("Helvetica", 0, 24));
    labelTitle.setForeground(new Color(255, 255, 255));
    add(labelTitle);

    labelNombre = new JLabel("Nombre(s): ");
    labelNombre.setBounds(25, 188, 180, 25);
    labelNombre.setFont(new Font("Helvetica", 1, 12));
    labelNombre.setForeground(new Color(255, 255, 255));
    add(labelNombre);

    txtNombreTrabajador = new JTextField();
    txtNombreTrabajador.setBounds(25, 213, 150, 25);
    txtNombreTrabajador.setBackground(new Color(224, 224, 224));
    txtNombreTrabajador.setFont(new Font("Helvetica", 1, 14));
    txtNombreTrabajador.setForeground(new Color(255, 0, 0));
    add(txtNombreTrabajador);

    labelAPaterno = new JLabel("Apellido Paterno: ");
    labelAPaterno.setBounds(25, 248, 180, 25);
    labelAPaterno.setFont(new Font("Helvetica", 1, 12));
    labelAPaterno.setForeground(new Color(255, 255, 255));
    add(labelAPaterno);

    txtAPaternoTrabajador = new JTextField();
    txtAPaternoTrabajador.setBounds(25, 273, 150, 25);
    txtAPaternoTrabajador.setBackground(new Color(224, 224, 224));
    txtAPaternoTrabajador.setFont(new Font("Helvetica", 1, 14));
    txtAPaternoTrabajador.setForeground(new Color(255, 0, 0));
    add(txtAPaternoTrabajador);

    labelAMaterno = new JLabel("Apellido Materno: ");
    labelAMaterno.setBounds(25, 308, 180, 25);
    labelAMaterno.setFont(new Font("Helvetica", 1, 12));
    labelAMaterno.setForeground(new Color(255, 255, 255));
    add(labelAMaterno);

    txtAMaternoTabajador = new JTextField();
    txtAMaternoTabajador.setBounds(25, 334, 150, 25);
    txtAMaternoTabajador.setBackground(new Color(224, 224, 224));
    txtAMaternoTabajador.setFont(new Font("Helvetica", 1, 14));
    txtAMaternoTabajador.setForeground(new Color(255, 0, 0));
    add(txtAMaternoTabajador);

    labelDepartamento = new JLabel("Selecciona el Departamento: ");
    labelDepartamento.setBounds(220, 188, 180, 25);
    labelDepartamento.setFont(new Font("Helvetica", 1, 12));
    labelDepartamento.setForeground(new Color(255, 255, 255));
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220, 213, 220, 25);
    comboDepartamento.setBackground(new Color(224, 224, 224));
    comboDepartamento.setFont(new Font("Helvetica", 1, 14));
    comboDepartamento.setForeground(new Color(255, 0, 0));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atención al cliente");
    comboDepartamento.addItem("Departamento de logística");
    comboDepartamento.addItem("Departamento de gerencia");

    labelAntiguedad = new JLabel("Selecciona la Antigüedad: ");
    labelAntiguedad.setBounds(220, 248, 180, 25);
    labelAntiguedad.setFont(new Font("Helvetica", 1, 12));
    labelAntiguedad.setForeground(new Color(255, 255, 255));
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220, 273, 220, 25);
    comboAntiguedad.setBackground(new Color(224, 224, 224));
    comboAntiguedad.setFont(new Font("Helvetica", 1, 14));
    comboAntiguedad.setForeground(new Color(255, 0, 0));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 año de servicio");
    comboAntiguedad.addItem("2 a 6 años de servicio");
    comboAntiguedad.addItem("7 o más años de servicio");

    labelResultado = new JLabel("Resultado del Cálculo:");
    labelResultado.setBounds(220, 307, 180, 25);
    labelResultado.setFont(new Font("Helvetica", 1, 14));
    labelResultado.setForeground(new Color(255, 255, 255));
    add(labelResultado);

    textArea1 = new JTextArea();
    textArea1.setEditable(false);
    textArea1.setBackground(new Color(224, 224, 224));
    textArea1.setFont(new Font("Helvetica", 1, 11));
    textArea1.setForeground(new Color(255, 0, 0));
    textArea1.setText("\n Aquí aparece el resultado del cálculo de las vacaciones.");
    scroll1 = new JScrollPane(textArea1);
    scroll1.setBounds(220, 333, 385, 90);
    add(scroll1);

    labelFooter = new JLabel("©2023 The Coca-Cola Company | Todos los derechos reservados");
    labelFooter.setBounds(135, 445, 500, 30);
    labelFooter.setFont(new Font("Helvetica", 1, 12));
    labelFooter.setForeground(new Color(255, 255, 255));
    add(labelFooter);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == miCalculo) {

      String nombreTrabajador = txtNombreTrabajador.getText();
      String AP = txtAPaternoTrabajador.getText();
      String AM = txtAMaternoTabajador.getText();
      String Departamento = comboDepartamento.getSelectedItem().toString();
      String Antiguedad = comboAntiguedad.getSelectedItem().toString();

      if (nombreTrabajador.equals("") || AP.equals("") || AM.equals("")
          || Departamento.equals("") || Antiguedad.equals("")) {

        JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");

      } else {

        if (Departamento.equals("Atención al cliente")) {
          if (Antiguedad.equals("1 año de servicio")) {
            textArea1.setText("\n El trabajador: " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 6 días de vacaciones.");
          }
          if (Antiguedad.equals("2 a 6 años de servicio")) {
            textArea1.setText("\n El trabajador: " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 14 días de vacaciones.");
          }
          if (Antiguedad.equals("7 o más años de servicio")) {
            textArea1.setText("\n El trabajador: " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 20 días de vacaciones.");
          }
        }
        if (Departamento.equals("Departamento de logística")) {
          if (Antiguedad.equals("1 año de servicio")) {
            textArea1.setText("\n El trabajador: " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 7 días de vacaciones.");
          }
          if (Antiguedad.equals("2 a 6 años de servicio")) {
            textArea1.setText("\n El trabajador: " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 15 días de vacaciones.");
          }
          if (Antiguedad.equals("7 o más años de servicio")) {
            textArea1.setText("\n El trabajador: " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 22 días de vacaciones.");
          }
        }
        if (Departamento.equals("Departamento de gerencia")) {
          if (Antiguedad.equals("1 año de servicio")) {
            textArea1.setText("\n El trabajador: " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 10 días de vacaciones.");
          }
          if (Antiguedad.equals("2 a 6 años de servicio")) {
            textArea1.setText("\n El trabajador: " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 20 días de vacaciones.");
          }
          if (Antiguedad.equals("7 o más años de servicio")) {
            textArea1.setText("\n El trabajador: " + nombreTrabajador + " " + AP + " " + AM +
                "\n quien labora en " + Departamento + " con " + Antiguedad +
                "\n recibe 30 días de vacaciones.");
          }
        }
      }
    }
    if (e.getSource() == miRojo) {
      getContentPane().setBackground(new Color(255, 0, 0));
    }
    if (e.getSource() == miNegro) {
      getContentPane().setBackground(new Color(0, 0, 0));
    }
    if (e.getSource() == miMorado) {
      getContentPane().setBackground(new Color(51, 0, 51));
    }
    if (e.getSource() == miNuevo) {
      txtNombreTrabajador.setText("");
      txtAPaternoTrabajador.setText("");
      txtAMaternoTabajador.setText("");
      comboDepartamento.setSelectedIndex(0);
      comboAntiguedad.setSelectedIndex(0);
      textArea1.setText("\n Aquí aparece el resultado del cálculo de las vacaciones.");
    }
    if (e.getSource() == miElCreador) {
      JOptionPane.showMessageDialog(null, "Mauricio Coronel Lovera");
    }
    if (e.getSource() == miSalir) {
      Bienvenida ventanaBienvenido = new Bienvenida();
      ventanaBienvenido.setBounds(0, 0, 350, 450);
      ventanaBienvenido.setVisible(true);
      ventanaBienvenido.setResizable(false);
      ventanaBienvenido.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }

  public static void main(String[] args) {
    Principal ventanaPrincipal = new Principal();
    ventanaPrincipal.setBounds(0, 0, 640, 535);
    ventanaPrincipal.setVisible(true);
    ventanaPrincipal.setResizable(false);
    ventanaPrincipal.setLocationRelativeTo(null);
  }
}
