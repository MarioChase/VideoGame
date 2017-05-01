
abstract public class Enemy extends Character{
	IAttackPattern pattern = new Wandering();
	IGameObject m_target;
	/*public Enemy(String sprite, int x, int y, int w, int h, int dX, int dY) {
		super(sprite, x, y, w, h, dX, dY);
		obj_type = "Enemy";
		health = 100;
		// TODO Auto-generated constructor stub
	}*/
	public Enemy(){
		obj_type = "Enemy";
		health = 100;
	}
	public void collisionAction(IGameObject a){
		if(a.getType().equalsIgnoreCase("projectile")){
			this.health -= 25;
			System.out.println("Monster Health: " + this.health);
		}
	}
	public void setTarget(IGameObject target){
		m_target = target;
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
