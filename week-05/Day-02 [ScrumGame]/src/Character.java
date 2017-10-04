import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Character extends PositionedImage {

  int maxHp, currentHp, dp, sp;


  public Character(String filename, int posX, int posY) {
    super(filename, posX, posY);
  }


  public void moveUp(int[][] board) {

    if (posY != 0 && board[posY - 1][posX] != 1) {
      posY--;
    }
  }

  public void moveDown(int[][] board) {
    if (posY != 9 && board[posY + 1][posX] != 1) {
      posY++;
    }
  }

  public void moveLeft(int[][] board) {
    if (posX != 0 && board[posY][posX - 1] != 1) {
      posX--;
    }
  }

  public void moveRight(int[][] board) {
    if (posX != 9 && board[posY][posX + 1] != 1) {
      posX++;
    }
  }

  public void reposition() {
    this.posX = (int) (Math.random() * 10);
    this.posY = (int) (Math.random() * 10);
  }

}


