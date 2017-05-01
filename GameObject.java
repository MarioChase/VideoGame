import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;
import java.awt.Rectangle;

public abstract class GameObject implements IGameObject {
	protected int m_ticks = 0;
	protected String obj_type;
	protected BufferedImage m_image;
	protected int m_x;
	protected int m_y;
	protected int m_w;
	protected int m_h;
	protected int m_dX; // x velocity in pixels per interval
	protected int m_dY; // y velocity in pixels per intercal

/*	public GameObject(String image, int x, int y, int w, int h, int dX, int dY) {
		m_x = x;
		m_y = y;
		m_w = w;
		m_h = h;
		m_dX = dX;
		m_dY = dY;
		setImage(image);
	}*/
	public GameObject(){}
	public void setConstructor(int x, int y, int w, int h, int dX, int dY){
		m_x = x;
		m_y = y;
		m_w = w;
		m_h = h;
		m_dX = dX;
		m_dY = dY;
	}
	public void setImage(String image_name){
		try {
			m_image = ImageIO.read(new File(image_name));
		} catch (IOException ex) {
			throw new Error(ex);
		}
	}
	public void wrapAround(int maxw, int maxh){
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
	public abstract void tick(int maxw, int maxh);

	@Override
	public BufferedImage getImage() {
		return m_image;
	}

	@Override
	public Rectangle getRectangle() {
		return new Rectangle(m_x, m_y, m_w, m_h);
	}
	public boolean hasCollided(IGameObject a){
		//Fine tune hitboxes
		if(this.getRectangle().contains(a.getX(), a.getY())){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public int getX() {
		return m_x;
	}
	public void setX(int x){
		m_x = x;
	}
	@Override
	public int getY() {
		return m_y;
	}
	public void setY(int y){
		m_y = y;
	}

	@Override
	public int getW() {
		return m_w;
	}

	@Override
	public String getType() {
		return obj_type;
	}

	@Override
	public int getH() {
		return m_h;
	}

	@Override
	public int getDX() {
		return m_dX;
	}

	@Override
	public int getDY() {
		return m_dY;
	}

	@Override
	public int keyPressed(char c) {
		return 0;
	}

}
