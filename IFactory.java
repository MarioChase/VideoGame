import java.util.*;

public interface IFactory
{
  public IGameObject createEnemy(int x, int y, int w, int h, int dX, int dY, String classname);
  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY, String classname);
  public IGameView createMainView(List<IGameObject> objects);
  public IGameView createStatusView(List<IGameObject> objects, String classname);
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views, List<String> settings);
}
