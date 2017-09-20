import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
   graphics.setColor(Color.ORANGE);
   graphics.drawRect(50,40,15,15);

   graphics.setColor(Color.RED);
   graphics.drawRect(150,60,25,40);

   graphics.setColor(Color.BLUE);
   graphics.drawRect(10,90,32,8);

   graphics.setColor(Color.CYAN);
   graphics.drawRect(70,200,42,95);

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