import java.util.*;

public class Factory implements IFactory
{
  private static IFactory m_instance;
  public static IFactory getInstance()
  {
    if (m_instance == null)
      m_instance = new Factory();
    return m_instance;
  }
  private Factory() {}

  @Override
  public ArrayList<IGameObject> createEnemy(int x, int y, int w, int h, int dX, int dY)
  {
	  ArrayList<IGameObject> enemies = new ArrayList<IGameObject>();
	  enemies.add(new Imp(0, 0, w, h, dX, dY));
	  enemies.add(new TestEnemy(0, 0, w, h, dX, dY));
    return enemies;
  }

  @Override
  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY)
  {
    return new TestHero(x, y, w, h, dX, dY);
  }

  @Override
  public IGameView createMainView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects)
  {
    return new HeroStats(objects);
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views)
  {
    return new GameController(interval, objects, views);
  }
}
