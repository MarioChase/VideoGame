
abstract public class Enemy extends Character{
	IAttackPattern pattern;
	public Enemy(String sprite, int x, int y, int w, int h, int dX, int dY) {
		super(sprite, x, y, w, h, dX, dY);
		obj_type = "Enemy";
		// TODO Auto-generated constructor stub
	}
	public void collisionAction(IGameObject a){
	}
	public void setTarget(IGameObject target){
		pattern.setTarget(target);
	}
	public void setPattern(IAttackPattern a){
		pattern = a;
	}
	public double getDistance(){
		double xdistance = Math.abs(pattern.getTarget().getX() - this.getX());
		double ydistance = Math.abs(pattern.getTarget().getY() - this.getY());
		double distance = Math.sqrt(Math.pow(xdistance, 2) + Math.pow(ydistance, 2));
		return distance;
	}

}
