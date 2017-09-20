import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // draw 3 lines with that function.
    graphics.setColor(Color.RED);
    int[] startingPoints1 = {200, 250};
    horizontalDraw(graphics, startingPoints1);

    graphics.setColor(Color.ORANGE);
    int[] startingPoints2 = {100, 150};
    horizontalDraw(graphics, startingPoints2);

    graphics.setColor(Color.BLACK);
    int[] startingPoints3 = {90, 140};
    horizontalDraw(graphics, startingPoints3);
  }

  public static void horizontalDraw(Graphics g, int[] startingPoints) {
    g.drawLine(startingPoints[0], startingPoints[1], startingPoints[1] + 50, startingPoints[1]);
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