import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.
    graphics.setColor(Color.GREEN);
    int[] startingPoints1 = {100, 280};
    lineDrawer(graphics, startingPoints1);

    graphics.setColor(Color.RED);
    int[] startingPoints2 = {250, 170};
    lineDrawer(graphics, startingPoints2);

    graphics.setColor(Color.BLUE);
    int[] startingPoints3 = {120, 90};
    lineDrawer(graphics, startingPoints3);

  }

  public static void lineDrawer(Graphics g, int[] startingPoints) {
    g.drawLine(startingPoints[0], startingPoints[1], WIDTH / 2, HEIGHT / 2);
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