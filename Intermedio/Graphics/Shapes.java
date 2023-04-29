import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;

public class Shapes extends JFrame {
  public Shapes() {
    this.setBounds(0, 0, 600, 400);
    this.setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Shapes().setVisible(true);
      }
    });
  }

  public void paint(Graphics g) {
    super.paint(g);

    g.setColor(Color.BLUE);
    g.drawLine(0, 70, 100, 70);
    g.drawRect(150, 70, 50, 70);
    g.drawRoundRect(250, 70, 50, 70, 6, 6);
    g.drawOval(350, 70, 50, 70);

    int vectorX[] = { 500, 550, 450 };
    int vectorY[] = { 70, 120, 120 };
    g.drawPolygon(vectorX, vectorY, 3);

    g.setColor(Color.RED);
    g.fillRect(150, 270, 50, 70);
    g.fillRoundRect(250, 270, 50, 70, 6, 6);
    g.fillOval(350, 270, 50, 70);
    int vectorX2[] = { 500, 550, 450 };
    int vectorY2[] = { 270, 320, 320 };
    g.fillPolygon(vectorX2, vectorY2, 3);
  }

}