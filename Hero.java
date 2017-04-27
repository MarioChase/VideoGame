import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


abstract public class Hero extends Character {
	protected int mana;
	public Hero(String sprite, int x, int y, int w, int h, int dX, int dY) {
		super(sprite, x, y, w, h, dX, dY);
		obj_type = "hero";
	}


	@Override
	public void keyReleased(char c) {
		switch (c) {
		default: {
			m_dX = 0;
			m_dY = 0;
			break;
		}
		}

	}
	public int getMana(){
		return mana;
	}
	public void collisionAction(IGameObject a){
		if(hasCollided(a) == true){
			System.out.println(a.getType());
		}
	}
	@Override
	public void keyPressed(char ch) {
		int interval = move.size() / 4;
		switch (ch) {
		case 'a': {
			m_dX = -5;
			m_dY = 0;
			animate(m_ticks % (move.size() / 4) + (interval));
			break;
		}
		case 'd': {
			m_dX = 5;
			m_dY = 0;
			animate(m_ticks % (move.size() / 4));
			break;
		}
		case 'w': {
			m_dX = 0;
			m_dY = -5;
			animate(m_ticks % move.size() / 4 + (interval * 3));
			break;
		}
		case 's': {
			m_dX = 0;
			m_dY = 5;
			animate(m_ticks % move.size() / 4 + (interval * 2));
			break;
		}
		
		case 'q': {
			ability1();
			break;
		}
		case 'e': {
			ability2();
			break;
		}
		case ' ': {
			ability3();
			break;
		}
		default: {
			m_dX = 0;
			m_dY = 0;
		}
		}

	}

	public void animate(int frame) {
		try {
			m_image = ImageIO.read(new File(move.get(frame)));
		} catch (IOException ex) {
			throw new Error(ex);
		}
	}

	abstract public void ability1();

	abstract public void ability2();

	abstract public void ability3();
}
