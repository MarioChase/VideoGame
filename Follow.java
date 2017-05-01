
public class Follow extends AttackPattern{
	@Override
	public void Movement(Enemy a, int tick) {
		int interval = a.move.size() / 4;
		if(m_target.getX() > a.getX()){
			a.facing = 0;
		}
		if(m_target.getY() > a.getY()){
			a.facing = 2;
		}
		else if(m_target.getX() < a.getX()){
			a.facing = 1;
		}
		else if(m_target.getY() < a.getY()){
			a.facing = 3;
		}
		switch (a.facing) {
		case 0:
			a.setX(a.getX() + 2);
			break;
		case 1:
			a.setX(a.getX() - 2);
			break;
		case 2:
			a.setY(a.getY() + 2);
			break;
		case 3:
			a.setY(a.getY() - 2);
			break;
		}
		a.animate(tick % (a.move.size() / 4) + (interval) * a.facing);
	}
	
}
