import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GameController implements ActionListener, IGameController, KeyListener {
	private Timer m_timer;
	private List<IGameObject> m_objects;
	private List<IGameView> m_views;
	public Hero player;

	public GameController(int interval, List<IGameObject> objects, List<IGameView> views) {
		m_objects = objects;
		m_views = views;
		m_timer = new Timer(interval, this);
		views.get(0).getJPanel().addKeyListener(this);
		for (IGameObject obj : m_objects) {
			if (obj.getType().equalsIgnoreCase("hero")) {
				player = (Hero) obj;
			}
			if (obj.getType().equalsIgnoreCase("enemy")) {
				Enemy a = (Enemy) obj;
				a.setTarget(player);
			}
		}
	}

	@Override
	public void startGame() {
		m_timer.start();
	}

	public void addGameObject(IGameObject a) {
		m_objects.add(a);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean enemy_left = false;
		for (Iterator<IGameObject> it = m_objects.iterator(); it.hasNext();) {
			IGameObject obj = it.next();
			obj.tick(m_views.get(0).getWidth(), m_views.get(0).getHeight());
			if (obj.getType().equalsIgnoreCase("projectile")) {
				Projectile testProjectile = (Projectile) obj;
				if (testProjectile.destroy(testProjectile.m_ticks) == true) {
					it.remove();
				}
			}
			if (obj.getType().equalsIgnoreCase("enemy")) {
				enemy_left = true;
			}
			for (IGameObject c_obj : m_objects) {
				if (c_obj != obj) {
					if(obj.hasCollided(c_obj)){
					obj.collisionAction(c_obj);}
				}
			}
		}

		for (IGameView obj : m_views) {
			obj.tick();
		}
		if(enemy_left == false){
			JOptionPane.showMessageDialog(null, "You defeated all the enemies you win!");
			System.exit(0);
		}
		if(player.health < 0){
			JOptionPane.showMessageDialog(null, "You died, Game Over");
			System.exit(0);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		for (Iterator<IGameObject> it = m_objects.iterator(); it.hasNext();) {
			IGameObject obj = it.next();
			switch (obj.keyPressed(e.getKeyChar())) {
			case 0:
				break;
			case 1:
				addGameObject(player.ability1());
				break;
			case 2:
				addGameObject(player.ability2());
				break;
			case 3:
				addGameObject(player.ability3());
				break;
			default:
				break;
			}
		}
		// cheat key for testing
		if (e.getKeyChar() == 'z') {
			for (IGameObject obj : m_objects) {
				if (obj.getType().equalsIgnoreCase("enemy")) {
					m_objects.remove(m_objects.indexOf(obj));
				}
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		for (IGameObject obj : m_objects) {
			obj.keyReleased(e.getKeyChar());
		}
	}
}
