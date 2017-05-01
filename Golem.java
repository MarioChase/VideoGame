
public class Golem extends Enemy {
	 /* public Golem(int x, int y, int w, int h, int dX, int dY)
	  {
	    super("elf.png", x, y, 65, 85, dX, dY);
	    loadImages("./GolemImages.txt");
	    animate(0);
	    pattern = new Patrol();
	    
	  }
*/
	  public Golem(){
		  loadImages("./GolemImages.txt");
		  	health = 500;
		    animate(0);
		    pattern = new Wandering();
	  }
	@Override
	public void tick(int maxw, int maxh) {
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
