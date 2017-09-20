import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics) {
    // draw a box that has different colored lines on each edge.

    graphics.setColor(Color.RED);
    graphics.drawLine(50, 40, 250, 40);

    graphics.setColor(Color.ORANGE);
    graphics.drawLine(250, 40, 250, 80);

    graphics.setColor(Color.BLUE);
    graphics.drawLine(250, 80, 50, 80);

    graphics.setColor(Color.CYAN);
    graphics.drawLine(50, 80, 50, 40);
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}