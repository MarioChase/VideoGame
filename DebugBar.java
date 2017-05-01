import javax.swing.*;
import java.awt.BorderLayout;
import java.util.*;

class DebugBar extends JPanel implements IGameView {
	private JLabel m_status = new JLabel();
	List<IGameObject> m_objects;
	JComboBox<IGameObject> list_objects = new JComboBox<IGameObject>();
	public DebugBar() {
		
	}

	@Override
	public void tick() {
		if (m_objects.size() > 1) {
			m_status.setText(String.format("X: %s Y:%s -- EX: %s EY: %s", m_objects.get(0).getX(),
					m_objects.get(0).getY(), m_objects.get(list_objects.getSelectedIndex()).getX(), m_objects.get(list_objects.getSelectedIndex()).getY()));
		}
	}

	@Override
	public JPanel getJPanel() {
		return this;
	}

	@Override
	public void setConstructor(List<IGameObject> objects) {
		// TODO Auto-generated method stub
		m_objects = objects;
		for (IGameObject obj : m_objects) {
			list_objects.addItem(obj);
		}
		list_objects.setFocusable(false);
		setLayout(new BorderLayout());
		m_status.setText("");
		add(m_status, BorderLayout.CENTER);
		add(list_objects, BorderLayout.EAST);
	}
}
