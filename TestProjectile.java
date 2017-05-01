
public class TestProjectile extends Projectile {

/*	public TestProjectile(int x, int y, int w, int h, int dX, int dY, int facing) {
		super("./Arrow/arrow (4).png", x, y, w, h, dX, dY, facing);
		m_facing = facing;
		
		// TODO Auto-generated constructor stub
	}*/
public TestProjectile(){
	range = 50;
	this.setImage("./Arrow/arrow (4).png");
}
	@Override
	public void tick(int maxw, int maxh) {
		m_ticks++;
		switch (m_facing) {
		case 0:
			this.setImage("./Arrow/arrow (4).png");
			this.m_w = m_h;
			this.m_h = m_w;
			setX(getX() + 15);
			break;
		case 1:
			this.setImage("./Arrow/arrow (3).png");
			this.m_w = m_h;
			this.m_h = m_w;
			setX(getX() - 15);
			break;
		case 2:
			this.setImage("./Arrow/arrow (1).png");
			this.m_w = m_h;
			this.m_h = m_w;
			setY(getY() - 15);
			break;
		case 3:
			this.setImage("./Arrow/arrow (2).png");
			this.m_w = m_h;
			this.m_h = m_w;
			setY(getY() + 15);
			break;
		}

	}

	@Override
	public void collisionAction(IGameObject a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(char c) {
		// TODO Auto-generated method stub

	}

}
