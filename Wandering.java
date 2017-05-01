import java.util.Random;

public class Wandering extends AttackPattern {
	public Wandering() {
		// TODO Auto-generated constructor stub
	}
	Random r = new Random();
	@Override
	public void Movement(Enemy a, int tick) {
		
		int interval = a.move.size() / 4;
		if (tick % (r.nextInt(50) + 1) == 0) {
			switch (a.facing) {
			case 0:
				a.setX(a.getX() + 5);
				a.facing = r.nextInt(4);
				break;
			case 1:
				a.setX(a.getX() - 5);
				a.facing = r.nextInt(4);
				break;
			case 2:
				a.setY(a.getY() + 5);
				a.facing = r.nextInt(4);
				break;
			case 3:
				a.setY(a.getY() - 5);
				a.facing = r.nextInt(4);
				break;
			}
		}
		switch (a.facing) {
		case 0:
			a.setX(a.getX() - 5);
			break;
		case 1:
			a.setX(a.getX() + 5);
			break;
		case 2:
			a.setY(a.getY() + 5);
			break;
		case 3:
			a.setY(a.getY() - 5);
			break;
		}
		a.animate(tick % (a.move.size() / 4) + ((interval) * a.facing));
	}
}
