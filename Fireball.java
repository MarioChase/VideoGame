
public class Fireball extends Projectile {

/*	public Fireball(int x, int y, int w, int h, int dX, int dY, int facing) {
		super("./FireBall1.png", x, y, w, h, dX, dY, facing);
		m_facing = facing;
		range = 25;
		// TODO Auto-generated constructor stub
	}*/
	public Fireball(){}
	@Override
	public void tick(int maxw, int maxh) {
		m_ticks++;
		switch (m_facing) {
		case 0:
			setX(getX() + 15);
			break;
		case 1:
			setX(getX() - 15);
			break;
		case 2:
			setY(getY() - 15);
			break;
		case 3:
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
