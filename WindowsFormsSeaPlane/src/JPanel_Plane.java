import java.awt.Graphics;
import javax.swing.JPanel;
public class JPanel_Plane extends JPanel {
	ITransport plane;
	public void  drawPlane(ITransport plane) {		
		this.plane = plane;
	}

	public void paint(Graphics g)  {		
		super.paint(g);		
		plane.DrawPlane(g);
	}
}
