import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Set;

public class SeaPlane extends Plane {
	public static Color DopColor; { Set get;}
	public static boolean LowerThelegs ; { Set get;}
	public static boolean Backwings ; { Set get;}

	public SeaPlane(int maxSpeed, float weight, Color mainColor, Color dopColor,
			boolean lowerThelegs, boolean backwings) {
		super(maxSpeed, weight, mainColor);
		this.DopColor = dopColor;
		this.LowerThelegs = lowerThelegs;
		this.Backwings = backwings;

	}
	public  void DrawPlane(Graphics g)
	{	
		super.DrawPlane(g);   
		if (Backwings) 
		{ 
		g.setColor(DopColor); 
		g.fillOval(_startPosX - 10, _startPosY - 10, 15, 15); 
		g.drawLine( _startPosX, _startPosY, _startPosX + 10, _startPosY + 10); 
		g.drawLine( _startPosX - 8, _startPosY, _startPosX, _startPosY + 10); 
		} 
		if (LowerThelegs) 
		{ 
		g.setColor(DopColor); 
		g.fillOval(_startPosX + 65, _startPosY + 45, 25, 10); 
		g.fillOval(_startPosX + 25, _startPosY + 45, 25, 10); 
		g.setColor(Color.BLACK); 
		g.drawLine(_startPosX + 75, _startPosY + 45, _startPosX + 65, _startPosY + 30); 
		g.drawLine( _startPosX + 35, _startPosY + 45, _startPosX + 45, _startPosY + 30); 
		} 
	
	}
}