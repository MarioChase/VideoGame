import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;

public abstract class Character extends GameObject
{
  
  protected java.util.Random m_rand = new java.util.Random();
  protected int health;
  protected ArrayList<String> move = new ArrayList<String>();
  protected int facing = 0;
  public Character(String sprite, int x, int y, int w, int h, int dX, int dY)
  {
    super(sprite, x, y, w, h, dX, dY);
  }

  @Override
  abstract public void tick(int maxw, int maxh);
  public void animate(int frame) {
		try {
			m_image = ImageIO.read(new File(move.get(frame)));
		} catch (IOException ex) {
			throw new Error(ex);
		}
	}
  public void loadImages(String filename){
	  Scanner in = null;
		try {
			in = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (in.hasNextLine()) {
			move.add(in.nextLine());
		}
		animate(0);
  }
  public int getHealth(){
	return health;
}
  @Override
 abstract public int keyPressed(char ch);
 abstract public void keyReleased(char c);
}
