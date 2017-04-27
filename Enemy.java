
abstract public class Enemy extends Character{

	public Enemy(String sprite, int x, int y, int w, int h, int dX, int dY) {
		super(sprite, x, y, w, h, dX, dY);
		obj_type = "Enemy";
		// TODO Auto-generated constructor stub
	}
	public void collisionAction(IGameObject a){
	}

}
