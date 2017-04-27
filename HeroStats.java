import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeroStats extends JPanel implements IGameView{
	private JLabel m_status = new JLabel();
	  List<IGameObject> m_objects;
	  public HeroStats(List<IGameObject> objects)
	  {
	    m_objects = objects;
	    setLayout(new BorderLayout());
	    m_status.setText("");
	    add(m_status, BorderLayout.CENTER);
	  }
	@Override
	public void tick() {
		if (m_objects.size()> 1)
	    {
	        m_status.setText(String.format("Health: %s Mana: %s ",
	          m_objects.get(1).getX(), m_objects.get(1).getY()));
	    }
	}

	@Override
	public JPanel getJPanel() {
		// TODO Auto-generated method stub
		return this;
	}

}
