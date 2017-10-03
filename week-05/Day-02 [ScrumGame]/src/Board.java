import java.util.Arrays;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  Graphics g;
  int heroPosX;
  int heroPosY;
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

  public Board() {
    heroPosX = 0;
    heroPosY = 0;

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }


  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.fillRect(heroPosX, heroPosY, 100, 100);
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
    PositionedImage hero = new PositionedImage("./Assets/hero-down.png", heroPosX, heroPosY);
    hero.draw(graphics);
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
    if (e.getKeyCode() == KeyEvent.VK_UP && (board[heroPosY - 1][heroPosX] != 1)) {
      heroPosY--;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && (board[heroPosY + 1][heroPosX] != 1)) {
      heroPosY++;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && (board[heroPosY][heroPosX - 1] != 1)) {
      heroPosX--;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && (board[heroPosY][heroPosX + 1] != 1)) {
      heroPosX++;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}