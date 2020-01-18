import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Set;

public class SeaPlane {
	static int _startPosX;
	static int _startPosY;
	private static int _pictureWidth;
	private  static int _pictureHeight;
	private  static  int planeWidth = 100;
	private static int planeHeight = 60;
	public  int MaxSpeed; {  Set get;}
	public  float Weight; { Set get;}
	public  static Color MainColor; { Set get;}
	public static Color DopColor; { Set get;}
	public static boolean LowerThelegs ; { Set get;}
	public static boolean Backwings ; { Set get;}

	public SeaPlane(int maxSpeed, float weight, Color mainColor, Color dopColor, boolean  lowerthelegs, boolean  wings)
	{
		MaxSpeed = maxSpeed;
		Weight = weight;
		MainColor = mainColor;
		DopColor = dopColor;
		LowerThelegs = lowerthelegs;
		Backwings = wings;

	}
	public void SetPosition(int x, int y, int width, int height)
	{
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}
	public void MoveTransport(Direction direction)
	{

		float step = MaxSpeed * 100 / Weight;
		switch (direction)
		{
		
		case Right:
			if (_startPosX + step < _pictureWidth - planeWidth)
			{
				_startPosX += step;
			}
			break;
			
		case Left:
			if (_startPosX - step > 0)

			{
				_startPosX -= step;
			}
			break;
			
		case Up:
			if (_startPosY - step > 0)
			{
				_startPosY -= step;
			}
			break;
	
		case Down:
			if (_startPosY + step < _pictureHeight - planeHeight)
			{
				_startPosY += step;
			}
			break;
		}
	}
	final  Random random = new Random();
	int count = random.nextInt(3) + 4;
	public  void DrawPlane(Graphics g)
	{	
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
		g.setColor(Color.BLACK);
		g.drawLine(_startPosX + 90, _startPosY + 20, _startPosX + 100, _startPosY + 20);
		g.drawLine(_startPosX + 100, _startPosY + 15, _startPosX + 100, _startPosY + 25);
		g.drawLine(_startPosX + 40, _startPosY + 20, _startPosX + 55, _startPosY - 10);
		g.drawLine(_startPosX + 55, _startPosY + 20, _startPosX + 40, _startPosY - 10);
		g.setColor(MainColor);
		g.fillRect(_startPosX, _startPosY + 10, 90, 20);
		g.fillRect(_startPosX + 40, _startPosY - 15, 17, 16);
		g.fillRect(_startPosX + 70, _startPosY + 5, 13, 15);
		g.fillRect(_startPosX - 10, _startPosY + 7, 10, 15);
		g.fillOval(_startPosX + 32, _startPosY + 20, 20, 20);
		switch (count)
		{
		case 4:
			new Engine().CountEngine(EngineCount.Four,g, _startPosX, _startPosY);
			break;
		case 5:
			new Engine().CountEngine(EngineCount.Five, g, _startPosX,_startPosY);
			break;
		case 6:
			new Engine().CountEngine(EngineCount.Six, g, _startPosX,_startPosY);
			break;          
		}
		
	}
}