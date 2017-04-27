import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class TestHero extends Hero {
	

	public TestHero(int x, int y, int w, int h, int dX, int dY) {
		super("./BaseHeroWalkRight/BaseHeroWalkRight (1).png", x, y, w, h, 0, 0);
		health = 100;
		mana = 100;
		move.add("./BaseHeroWalkRight/BaseHeroWalkRight (1).png");
		move.add("./BaseHeroWalkRight/BaseHeroWalkRight (2).png");
		move.add("./BaseHeroWalkRight/BaseHeroWalkRight (3).png");
		move.add("./BaseHeroWalkRight/BaseHeroWalkRight (4).png");
		move.add("./BaseHeroWalkRight/BaseHeroWalkRight (5).png");
		move.add("./BaseHeroWalkRight/BaseHeroWalkRight (6).png");
		move.add("./BaseHeroWalkRight/BaseHeroWalkRight (7).png");
		move.add("./BaseHeroWalkRight/BaseHeroWalkRight (8).png");
		move.add("./BaseHeroWalkRight/BaseHeroWalkRight (9).png");
		move.add("./BaseHeroWalkLeft/BaseHeroWalkLeft (1).png");
		move.add("./BaseHeroWalkLeft/BaseHeroWalkLeft (2).png");
		move.add("./BaseHeroWalkLeft/BaseHeroWalkLeft (3).png");
		move.add("./BaseHeroWalkLeft/BaseHeroWalkLeft (4).png");
		move.add("./BaseHeroWalkLeft/BaseHeroWalkLeft (5).png");
		move.add("./BaseHeroWalkLeft/BaseHeroWalkLeft (6).png");
		move.add("./BaseHeroWalkLeft/BaseHeroWalkLeft (7).png");
		move.add("./BaseHeroWalkLeft/BaseHeroWalkLeft (8).png");
		move.add("./BaseHeroWalkLeft/BaseHeroWalkLeft (9).png");
		move.add("./BaseHeroWalkDown/BaseHeroWalkDown (1).png");
		move.add("./BaseHeroWalkDown/BaseHeroWalkDown (2).png");
		move.add("./BaseHeroWalkDown/BaseHeroWalkDown (3).png");
		move.add("./BaseHeroWalkDown/BaseHeroWalkDown (4).png");
		move.add("./BaseHeroWalkDown/BaseHeroWalkDown (5).png");
		move.add("./BaseHeroWalkDown/BaseHeroWalkDown (6).png");
		move.add("./BaseHeroWalkDown/BaseHeroWalkDown (7).png");
		move.add("./BaseHeroWalkDown/BaseHeroWalkDown (8).png");
		move.add("./BaseHeroWalkDown/BaseHeroWalkDown (9).png");
		move.add("./BaseHeroWalkUp/BaseHeroWalkUp (1).png");
		move.add("./BaseHeroWalkUp/BaseHeroWalkUp (2).png");
		move.add("./BaseHeroWalkUp/BaseHeroWalkUp (3).png");
		move.add("./BaseHeroWalkUp/BaseHeroWalkUp (4).png");
		move.add("./BaseHeroWalkUp/BaseHeroWalkUp (5).png");
		move.add("./BaseHeroWalkUp/BaseHeroWalkUp (6).png");
		move.add("./BaseHeroWalkUp/BaseHeroWalkUp (7).png");
		move.add("./BaseHeroWalkUp/BaseHeroWalkUp (8).png");
		move.add("./BaseHeroWalkUp/BaseHeroWalkUp (9).png");
	}

	@Override
	public void tick(int maxw, int maxh) {
		m_ticks++;
		m_x += m_dX;
		m_y += m_dY;
		
		//Consolidate to one method in character class?
		if (m_x > maxw) {
			m_x = 0;
		} else if (m_x < 0) {
			m_x = maxw;
		}
		if (m_y > maxh) {
			m_y = 0;
		} else if (m_y < 0) {
			m_y = maxh;
		}
		
	}

	

	@Override
	public void ability1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void ability2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ability3() {
		// TODO Auto-generated method stub

	}

}
