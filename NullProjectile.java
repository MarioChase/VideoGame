
public class NullProjectile extends Projectile {
	IAttackPattern pattern = new Patrol();

	public NullProjectile(String image, int x, int y, int w, int h, int dX, int dY, int facing) {
		super(image, x, y, w, h, dX, dY, facing);
		m_facing = facing;
		range = 1;
		// TODO Auto-generated constructor stub
	}

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
