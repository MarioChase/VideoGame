import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeroStats extends JPanel implements IGameView{
	private JLabel m_status = new JLabel();
	  List<IGameObject> m_objects;
	  Hero placeholder;
	  public HeroStats()
	  {
	    
	  }
	@Override
	public void tick() {
		if (m_objects.size()> 1)
	    {
	        m_status.setText(String.format("Health: %s Mana: %s Time: %s",
	          placeholder.health, placeholder.mana, placeholder.m_ticks));
	    }
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
	    setLayout(new BorderLayout());
	    m_status.setText("");
	    add(m_status, BorderLayout.CENTER);
	}

}
