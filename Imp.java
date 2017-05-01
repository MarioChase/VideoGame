
public class Imp extends Enemy{
/*	public Imp(int x, int y, int w, int h, int dX, int dY)
	  {
	    super("elf.png", x, y, 50, 50, dX, dY);
	    
	  }*/
	public Imp(){
		loadImages("./Imp.txt");
	    animate(0);
	    pattern = new Flying();
	    health = 75;
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
