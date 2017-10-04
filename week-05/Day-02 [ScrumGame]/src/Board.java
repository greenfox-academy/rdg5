import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  Hero gyula;
  Character skeleton1, skeleton2, skeleton3;
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
      {0, 0, 0, 1, 0, 1, 1, 0, 0, 0}
  };


  public Board() {
    gyula = new Hero();
//    skeleton1 = new Skeleton();
//    skeleton2 = new Skeleton();
//    skeleton3 = new Skeleton();

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        PositionedImage floor = new PositionedImage("./Assets/floor.png", j, i);
        PositionedImage wall = new PositionedImage("./Assets/wall.png", j, i);
        if (board[i][j] == 0) {
          floor.draw(graphics);
        } else {
          wall.draw(graphics);
        }
      }
    }
    gyula.draw(graphics);

//    PositionedImage skel1 = new PositionedImage(skeleton1.image, skeleton1.posX, skeleton1.posY);
//    skel1.draw(graphics);
//
//     PositionedImage skel2 = new PositionedImage(skeleton2.image, skeleton2.posX,
//        skeleton2.posY);
//    skel2.draw(graphics);
//
//    PositionedImage skel3 = new PositionedImage(skeleton3.image, skeleton3.posX,
//        skeleton3.posY);
//    skel3.draw(graphics);
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
      gyula.moveUp(board);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      gyula.moveDown(board);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      gyula.moveLeft(board);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      gyula.moveRight(board);
    }
    repaint();
  }

}
