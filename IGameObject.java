import java.awt.image.BufferedImage;
import java.awt.Rectangle;

public interface IGameObject
{
  public void tick(int maxw, int maxh);
  public BufferedImage getImage();
  public Rectangle getRectangle();
  public int getX();
  public void setX(int x);
  public int getY();
  public void setY(int y);
  public int getW();
  public int getH();
  public int getDX();
  public int getDY();
  public void setConstructor(int x, int y, int w, int h, int dX, int dY);
  public boolean hasCollided(IGameObject a);
  public void collisionAction(IGameObject a);
  public String getType();
  public int keyPressed(char c);
public void keyReleased(char c);
}
