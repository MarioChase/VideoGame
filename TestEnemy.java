public class TestEnemy extends Enemy
{
  public TestEnemy(int x, int y, int w, int h, int dX, int dY)
  {
    super("elf.png", x, y, w, h, dX, dY);
    loadImages("./SkeletonMageImages.txt");
    animate(0);
    pattern = new Patrol();
    
  }

  @Override
  public void tick(int maxw, int maxh)
  {	
	m_ticks ++;
	pattern.Movement(this, m_ticks);
    wrapAround(maxw,maxh);

  }

  @Override
	public int keyPressed(char ch) {
		// TODO Auto-generated method stub
		return 0;
	}


@Override
public void keyReleased(char c) {
	// TODO Auto-generated method stub
	
}

}
