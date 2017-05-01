import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MainFrame extends JFrame
{
  public static void main(String args[])
  {
    JFrame frame = new MainFrame();
    frame.setVisible(true);
  }

  public MainFrame()
  {
    super("Game Engine Example");
    setSize(1040, 720);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    int interval = 100;
    ArrayList<String> settings = new ArrayList<String>();
    String hero = "";
    String enemy1 = "";
    String enemy2 = "";
    String statusview = "";
    try {
		Scanner f = new Scanner(new File("Settings.txt"));
		hero = f.nextLine();
		settings.add(hero);
		enemy1 = f.nextLine();
		settings.add(enemy1);
		enemy2 = f.nextLine();
		settings.add(enemy2);
		statusview = f.nextLine();
		settings.add(statusview);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    // model
    List<IGameObject> objects = Collections.synchronizedList(new ArrayList<IGameObject>());
    objects.add(Factory.getInstance().createEnemy(100, 100, 30, 50, 5, 5,enemy1));
    objects.add(Factory.getInstance().createEnemy(100, 100, 30, 50, 5, 5,enemy2));
    objects.add(Factory.getInstance().createHero(10, 100, 30, 50, 5, 5,hero));

    // view
    IGameView view = Factory.getInstance().createMainView(objects);
    IGameView statusView = Factory.getInstance().createStatusView(objects,statusview);
    List<IGameView> views = new ArrayList<IGameView>();
    views.add(view);
    views.add(statusView);

    // controller
    IGameController controller = Factory.getInstance().createController(interval, objects, views, settings);
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(view.getJPanel(), BorderLayout.CENTER);
    getContentPane().add(statusView.getJPanel(), BorderLayout.SOUTH);

    controller.startGame();
  }
}
