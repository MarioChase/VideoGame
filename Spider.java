
public class Spider extends Enemy{
	public Spider(int x, int y, int w, int h, int dX, int dY)
	  {
	    super("elf.png", x, y, 50, 50, dX, dY);
	    loadImages("./SpiderImages.txt");
	    animate(0);
	    pattern = new Follow();
	    
	  }

	@Override
	public void tick(int maxw, int maxh) {
		// TODO Auto-generated method stub
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
