import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  static int BOARD_SIZE = 10;

  public Board() {
    testBoxX = 300;
    testBoxY = 300;

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
//    graphics.fillRect(testBoxX, testBoxY, 100, 100);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.

//    PositionedImage image = new PositionedImage("./Assets/floor.png", 0, 0);
//    for (int i = 0; i < 720 ; i++) {
//      for (int j = 0; j < 720 ; j++) {
//        PositionedImage image = new PositionedImage("./ass")
//
//      }
    int[][] board = {
        {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
        {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
        {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
        {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
        {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
        {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
        {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
        {0, 1, 0, 1, 0, 1, 0, 0, 0, 0}};

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        PositionedImage floor = new PositionedImage("./Assets/floor.png", i * 72, j * 72);
        PositionedImage wall = new PositionedImage("./Assets/wall.png", i * 72, j * 72);
        if (board[i][j] == 0) {
          floor.draw(graphics);
        }
        else wall.draw(graphics);
      }
    }
  }


  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }


  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 100;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 100;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}