import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class TestHero extends Hero {
	/*public TestHero(int x, int y, int w, int h, int dX, int dY) {
		super("elf.png", x, y, w, h, 0, 0);
		
	}*/
	public TestHero(){
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
		Projectile item = new TestProjectile();
		item.setConstructor(this.getX(), this.getY(), 20, 20, 0, 0, this.facing);
		return item;
	}

	@Override
	public IGameObject ability2() {
		// TODO Auto-generated method stub
		switch(this.facing){
		case 0:
			m_dX -= 20;
			break;
		case 1:
			m_dX += 20;
			break;
		case 2:
			m_dY += 20;
			break;
		case 3:
			m_dY -= 20;
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
