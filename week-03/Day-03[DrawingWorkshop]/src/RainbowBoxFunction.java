import java.lang.reflect.Array;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE,Color.CYAN,
                      Color.BLACK, Color.GRAY, Color.MAGENTA };

    rainbowSquares(graphics,280, colors);

  }
  public static void rainbowSquares(Graphics g, int size, Color[] color){
    for (int i = 0; i < color.length ; i++) {
      g.setColor(color[i]);
      g.fillRect(150 - size / 2, 150 - size / 2, size, size);
      size  -= 35;
    }
   // g.drawRect(150,150, size, size);
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
