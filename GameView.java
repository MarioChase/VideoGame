import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.List;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameView extends JPanel implements IGameView
{
    private List<IGameObject> m_objects;

    public GameView(List<IGameObject> objects)
    {
      setOpaque(true);
      setIgnoreRepaint(true);
      setFocusable(true);
      requestFocusInWindow();
      m_objects = objects;
      
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Image bufferedImage = createImage(getWidth(), getHeight());
        Graphics2D buffer = (Graphics2D) bufferedImage.getGraphics();
        
        for (IGameObject obj : m_objects)
        {
          buffer.drawImage(obj.getImage(), obj.getX(), obj.getY(), obj.getW(), obj.getH(), this);
        }

        g.drawImage(bufferedImage, 0, 0, this);
    }

    @Override
    public void tick()
    {
      repaint();
    }

    @Override
    public JPanel getJPanel()
    { return this; }

	@Override
	public void setConstructor(List<IGameObject> objects) {
		// TODO Auto-generated method stub
		
	}


}
