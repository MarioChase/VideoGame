
public class Patrol extends AttackPattern {

	@Override
	public void Movement(Enemy a, int tick) {
		int interval = a.move.size() / 4;
		if(tick%40 == 0){
			switch(a.facing){
			case 0:
				a.setX(a.getX() + 5);
				a.facing = 2;
				break;
			case 1:
				a.setX(a.getX() - 5);
				a.facing = 3;
				break;
			case 2:
				a.setY(a.getY() + 5);
				a.facing = 1;
				break;
			case 3:
				a.setY(a.getY() - 5);
				a.facing = 0;
				break;
			}
		}
		switch(a.facing){
		case 0:
			a.setX(a.getX() + 5);
			break;
		case 1:
			a.setX(a.getX() - 5);
			break;
		case 2:
			a.setY(a.getY() + 5);
			break;
		case 3:
			a.setY(a.getY() - 5);
			break;
		}
		a.animate(tick % (a.move.size() / 4) + (interval) * a.facing);
	}
}
