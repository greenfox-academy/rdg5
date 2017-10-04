import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PositionedImage {

  final static int BOARDSIZE = 72;

  //ImageLoader
  BufferedImage image;
  int posX;
  int posY;

  public PositionedImage(String filename, int posX, int posY) {

    this.posX = posX;
    this.posY = posY;
    readFromFile(filename);
  }

  public void readFromFile(String filename) {
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX * BOARDSIZE, posY * BOARDSIZE, null);
    }
  }

}