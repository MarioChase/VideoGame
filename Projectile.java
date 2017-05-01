
public abstract class Projectile extends GameObject{
	int range;
	int m_facing;
	/*public Projectile(String image, int x, int y, int w, int h, int dX, int dY, int facing) {
		super(image, x, y, w, w, h, 0);
		obj_type = "projectile";
		m_facing = facing;
		// TODO Auto-generated constructor stub
	}*/
	public Projectile(){
		obj_type = "projectile";
		range = 10;
	}
	public boolean destroy(int m_ticks){
		if (m_ticks % range == 0){
			System.out.println("Projectile removed");
			return true;}
		else
			return false;
	}
	public void setConstructor(int x, int y, int w, int h, int dX, int dY, int facing) {
		m_x = x;
		m_y = y;
		m_w = w;
		m_h = h;
		m_dX = dX;
		m_dY = dY;
		m_facing = facing;
	}
}
