import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  Hero gyula;
  private Monster skel1, skel2, skel3;
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
    skel1 = new Monster();
    skel2 = new Monster();
    skel3 = new Monster();

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

    while (board[skel1.posY][skel1.posX] != 0) {
      skel1.reposition();
    }
    skel1.draw(graphics);

    while (board[skel2.posY][skel2.posX] != 0) {
      skel2.reposition();
    }
    skel2.draw(graphics);

    while (board[skel3.posY][skel3.posX] != 0) {
      skel3.reposition();
    }
    skel3.draw(graphics);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override

  public void keyReleased(KeyEvent e) {

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      gyula.turnUp();
      gyula.moveUp(board);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      gyula.turnDown();
      gyula.moveDown(board);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      gyula.turnLeft();
      gyula.moveLeft(board);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      gyula.turnRight();
      gyula.moveRight(board);
    }
    repaint();
  }

}
