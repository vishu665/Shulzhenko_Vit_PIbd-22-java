import java.awt.Graphics;
import javax.swing.JPanel;
public class JPanel_Plane extends JPanel {
	SeaPlane plane;
	public void  drawPlane(SeaPlane plane) {		
		this.plane = plane;
	}

	public void paint(Graphics g)  {		
		super.paint(g);		
		plane.DrawPlane(g);
	}
}
