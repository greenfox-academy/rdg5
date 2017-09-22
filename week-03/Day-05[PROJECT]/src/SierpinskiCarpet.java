import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiCarpet {

  public static void mainDraw(Graphics graphics) {
//    graphics.drawRect(600,600,600,600);
//    graphics.setColor(Color.black);
//    graphics.fillRect(200,200,200,200);
    graphics.setColor(Color.black);
    carpetDrawer(graphics,50,50,300);

  }
  public static void carpetDrawer(Graphics g, int x, int y, int size){
      int frame =  size;
      int oneThird = frame / 3;
      g.setColor(Color.black);
      g.fillRect(x+oneThird, y+oneThird, oneThird-1,oneThird-1);

      if(oneThird >= 2) {
        carpetDrawer(g, x, y, oneThird);
      }
  }

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
