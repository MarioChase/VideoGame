import java.awt.image.BufferedImage;
import java.awt.Rectangle;

public interface IGameObject
{
  public void tick(int maxw, int maxh);
  public BufferedImage getImage();
  public Rectangle getRectangle();
  public int getX();
  public int getY();
  public int getW();
  public int getH();
  public int getDX();
  public int getDY();
  public boolean hasCollided(IGameObject a);
  public void collisionAction(IGameObject a);
  public String getType();
  public void keyPressed(char c);
public void keyReleased(char c);
}
