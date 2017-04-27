import java.util.ArrayList;

public abstract class Character extends GameObject
{
  protected int m_ticks = 0;
  protected java.util.Random m_rand = new java.util.Random();
  protected int health;
  protected ArrayList<String> move = new ArrayList<String>();
  public Character(String sprite, int x, int y, int w, int h, int dX, int dY)
  {
    super(sprite, x, y, w, h, dX, dY);
  }

  @Override
  abstract public void tick(int maxw, int maxh);
public int getHealth(){
	return health;
}
  @Override
 abstract public void keyPressed(char ch);
 abstract public void keyReleased(char c);
}
