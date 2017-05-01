
public class Wizard extends Hero {

	public Wizard(int x, int y, int w, int h, int dX, int dY) {
		super("elf.png", x, y, w, h, 0, 0);
		// TODO Auto-generated constructor stub
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
		return null;
	}

	@Override
	public IGameObject ability2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IGameObject ability3() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
