
public class Flying extends AttackPattern {

	public Flying() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Movement(Enemy a, int tick) {
		int interval = a.move.size() / 4;
		if (tick % 40 == 0) {
			switch (0) {
			case 0:
				a.facing = 2;
				break;
			case 1:
				a.facing = 3;
				break;
			case 2:
				a.facing = 1;
				break;
			case 3:
				a.facing = 0;
				break;
			}
		}
		switch (0) {
		case 0:
			a.setX(a.getX() + 5);
			a.setY(a.getY() + 3);
			break;
		case 1:
			a.setX(a.getX() - 5);
			a.setY(a.getY() - 3);
			break;
		case 2:
			a.setY(a.getY() + 5);
			a.setX(a.getX() - 3);
			break;
		case 3:
			a.setY(a.getY() - 5);
			a.setX(a.getX() + 3);
			break;
		}
		a.animate(tick % (a.move.size() / 4) + (interval) * a.facing);
	}
}
