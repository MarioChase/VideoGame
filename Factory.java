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
  public Enemy createEnemy(int x, int y, int w, int h, int dX, int dY, String classname)
  {
	  Enemy m = null;
//	  Enemy n = null;
	  Class c = null;
	  /*Class b = null;*/
	try {
		c = Class.forName(classname);
		/*b = Class.forName("");*/
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		m = (Enemy) c.newInstance();
		m.setConstructor(x, y, w, h, dX, dY);
		/*n = (Enemy) b.newInstance();
		n.setConstructor(x, y, w, h, dX, dY);*/
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  ArrayList<IGameObject> enemies = new ArrayList<IGameObject>();
	  enemies.add(m);
	  enemies.get(0).setConstructor(x, y, w, h, dX, dY);
/*	  enemies.add(n);
	  enemies.get(1).setConstructor(x, y, w, h, dX, dY);*/
    return m;
  }

  @Override
  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY, String classname)
  {
	  Hero m = null;
	  Class c = null;
	  
	try {
		c = Class.forName(classname);
		System.out.println("Class forname found");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		m = (Hero) c.newInstance();
		m.setConstructor(x, y, w, h, dX, dY);
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return m;
    //return new TestHero(x, y, w, h, dX, dY);
  }

  @Override
  public IGameView createMainView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects, String classname)
  {
	  IGameView m = null;
	  Class c = null;
	  
	try {
		c = Class.forName(classname);
		System.out.println("Class forname found");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  try {
		m = (IGameView) c.newInstance();
		m.setConstructor(objects);
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return m;
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views, List<String> settings)
  {
    return new GameController(interval, objects, views, settings);
  }
}
