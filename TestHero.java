import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class TestHero extends Hero {

	public TestHero(int x, int y, int w, int h, int dX, int dY) {
		super("elf.png", x, y, w, h, 0, 0);
		health = 100;
		mana = 100;
		loadImages("./BaseHeroImages.txt");
	}

	@Override
	public void tick(int maxw, int maxh) {
		m_ticks++;
		m_x += m_dX;
		m_y += m_dY;
		wrapAround(maxw, maxh);
		// Consolidate to one method in character class?

	}

	@Override
	public IGameObject ability1() {
		// TODO Auto-generated method stub
		return new TestProjectile(this.getX(), this.getY(), 15, 0, 0, 0, this.facing);

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
