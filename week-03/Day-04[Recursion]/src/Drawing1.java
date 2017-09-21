import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing1 {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.yellow);
    graphics.fillRect(0, 0, 600, 600);

    graphics.setColor(Color.black);
    graphics.drawRect(200, 200, WIDTH / 3, HEIGHT / 3);
    graphics.drawRect(400, 400, WIDTH / 3, HEIGHT / 3);
    graphics.drawRect(600, 600, WIDTH / 3, HEIGHT / 3);

  }
//  public static void drawBot (int n, int x, int y, int w, int h){
//    if (h <= min)
//  }

  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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