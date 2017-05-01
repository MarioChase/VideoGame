import java.util.List;

import javax.swing.*;

public interface IGameView
{
  public void tick();
  public int getWidth();
  public int getHeight();
  public JPanel getJPanel();
public void setConstructor(List<IGameObject> objects);
}
