import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Teemo extends Hero {

	public Teemo(int x, int y, int w, int h, int dX, int dY) {
		super("elf.png", x, y, 50, 60, 0, 0);
		health = 300;
		mana = 25;
		loadImages("./TeemoImages.txt");
	}

	@Override
	public void tick(int maxw, int maxh) {
		m_ticks++;
		m_x += m_dX;
		m_y += m_dY;
		wrapAround(maxw, maxh);

	}

	@Override
	public IGameObject ability1() {
		// TODO Auto-generated method stub
		return new Rock(this.getX(), this.getY(), 20, 20, 0, 0, this.facing);
	}

	@Override
	public IGameObject ability2() {
		// TODO Auto-generated method stub
		return new NullProjectile("./ball.png", this.getX(), this.getY(), 20, 20, 0, 0, this.facing);
	}

	@Override
	public IGameObject ability3() {
		// TODO Auto-generated method stub
		return new NullProjectile("./ball.png", this.getX(), this.getY(), 20, 20, 0, 0, this.facing);
	}

}
