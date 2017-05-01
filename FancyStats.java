import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class FancyStats extends JPanel implements IGameView{
	JProgressBar health;
	JProgressBar mana;
	  List<IGameObject> m_objects;
	  Hero placeholder;
	  public FancyStats()
	  {
		
	  }
	@Override
	public void tick() {
		health.setValue(placeholder.getHealth());
	}

	@Override
	public JPanel getJPanel() {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public void setConstructor(List<IGameObject> objects) {
	    m_objects = objects;
	   
	    for(int i = 0; i < m_objects.size(); i++){
	    	if(m_objects.get(i).getType().equalsIgnoreCase("hero")){
	    		placeholder = (Hero) m_objects.get(i);
	    	}
	    }
	    int max_health = placeholder.getHealth();
	    health = new JProgressBar(0,max_health);
	    mana = new JProgressBar(0,placeholder.mana);
	    health.setForeground(Color.RED);
	    health.setBackground(Color.BLACK);
	    health.setBorderPainted(false);
	    mana.setForeground(Color.BLUE);
	    mana.setBackground(Color.CYAN);
	    mana.setBorderPainted(false);
	    setLayout(new BorderLayout());
	    mana.setStringPainted(true);
	    health.setStringPainted(true);
	    mana.setString("Mana");
	    health.setString("Health");
	    add(health, BorderLayout.WEST);
	    add(mana, BorderLayout.EAST);
	}

}
