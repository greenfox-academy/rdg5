//import java.awt.event.KeyEvent;
//import java.awt.Graphics;
//
//public class Game {
//
//  public Game() {
//    int[][] board = {
//
//        {0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1},
//        {0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1},
//        {0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1},
//        {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
//        {1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1},
//        {0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1},
//        {0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1},
//        {0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1},
//        {0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1},
//        {0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1}
//    };
//
//  public void gameStart() {
//  }
//
//  public void movement() {
//    if (e.getKeyCode() == KeyEvent.VK_UP) {
//      heroImage = "./Assets/hero-up.png";
//      if (board[heroPosY - 1][heroPosX] != 1) {
//        heroPosY--;
//      }
//    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//      heroImage = "./Assets/hero-down.png";
//      if (board[heroPosY + 1][heroPosX] != 1) {
//        heroPosY++;
//      }
//
//    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//      heroImage = "./Assets/hero-left.png";
//      if (board[heroPosY][heroPosX - 1] != 1) {
//        heroPosX--;
//      }
//    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//      heroImage = "./Assets/hero-right.png";
//      if (board[heroPosY][heroPosX + 1] != 1) {
//        heroPosX++;
//      }
//    }
//    // and redraw to have a new picture with the new coordinates
//    repaint();
//  }
//}
// }
//     }
//
//
//
//
