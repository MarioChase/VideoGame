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
		System.out.println(a.getType());
		if(a.getType().equalsIgnoreCase("enemy")){
			this.health -= 10;
		}
	}
	@Override
	public int keyPressed(char ch) {
		int interval = move.size() / 4;
		switch (ch) {
		case 'a': {
			m_dX = -5;
			m_dY = 0;
			facing = 1;
			animate(m_ticks % (move.size() / 4) + (interval));
			return 0;
		}
		case 'd': {
			m_dX = 5;
			m_dY = 0;
			facing = 0;
			animate(m_ticks % (move.size() / 4));
			return 0;
		}
		case 'w': {
			m_dX = 0;
			m_dY = -5;
			facing = 2;
			animate(m_ticks % move.size() / 4 + (interval * 3));
			return 0;
		}
		case 's': {
			m_dX = 0;
			m_dY = 5;
			facing = 3;
			animate(m_ticks % move.size() / 4 + (interval * 2));
			return 0;
		}
		
		case 'q': {
			ability1();
			return 1;
		}
		case 'e': {
			ability2();
			return 2;
		}
		case ' ': {
			ability3();
			return 3;
		}
		default: {
			m_dX = 0;
			m_dY = 0;
			return 0;
		}
		}

	}

	

	abstract public IGameObject ability1();

	abstract public IGameObject ability2();

	abstract public IGameObject ability3();
}
