import com.sun.deploy.ui.ImageLoader;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {

  final static int BOARDSIZE = 72;

  public String tile;
  public String wall;
  public String heroUp;
  public String heroDown;
  public String heroLeft;
  public String heroRight;
  public String skeleton;
  public String boss;


  //ImageLoader
  BufferedImage image;
  int posX, posY;

  public PositionedImage(String filename, int posX, int posY) {
    tile = "./Assets/floor.png";
    wall = "./Assets/wall.png";
    heroUp = "./Assets/hero-up.png";
    heroDown = "./Assets/hero-down.png";
    heroLeft = "./Assets/hero-left.png";
    heroRight = "./Assets/hero-right.png";
    skeleton = "./Assets/skeleton.png";
    boss = "./Assets/boss.png";

    this.posX = posX;
    this.posY = posY;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public int getPosX() {
    return this.posX;
  }

  public int getPosY() {
    return this.posY;
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX * BOARDSIZE, posY * BOARDSIZE, null);
    }
  }
}