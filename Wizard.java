
public class Wizard extends Hero {

/*	public Wizard(int x, int y, int w, int h, int dX, int dY) {
		super("elf.png", x, y, w, h, 0, 0);
		// TODO Auto-generated constructor stub
		
	}*/
	public Wizard(){
		health = 75;
		mana = 300;
		loadImages("./WizardImages.txt");
	}
	@Override
	public void tick(int maxw, int maxh) {
		// TODO Auto-generated method stub
		m_ticks++;
		m_x += m_dX;
		m_y += m_dY;
		wrapAround(maxw, maxh);
	}

	@Override
	public IGameObject ability1() {
		// TODO Auto-generated method stub
		return new Fireball();
	}

	@Override
	public IGameObject ability2() {
		// TODO Auto-generated method stub
		switch(this.facing){
		case 0:
			m_x += 100;
			break;
		case 1:
			m_x -= 100;
			break;
		case 2:
			m_y -= 100;
			break;
		case 3:
			m_y += 100;
			break;
		}
		return new NullProjectile();
	}

	@Override
	public IGameObject ability3() {
		// TODO Auto-generated method stub
		return new NullProjectile();
	}

	
}
