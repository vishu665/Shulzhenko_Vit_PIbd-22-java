import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class Plane extends Vehicle{
	private  static  int locoWidth = 100;
	private static int locoHeight = 60;

	int design;

	public Plane(int maxSpeed, float weight, Color mainColor) {
		this.MaxSpeed = maxSpeed;
		this.Weight = weight;
		this.MainColor = mainColor;
		Random rnd =new Random();
		design=rnd.nextInt(3)+1;
	}

	//@Override
	public  void MoveTransport(Direction direction)
	{
		float step = MaxSpeed * 100 / Weight;
		switch (direction)
		{
		// вправо
		case Right:
			if (_startPosX + step < _pictureWidth - locoWidth)
			{
				_startPosX += step;
			}
			break;
			//влево
		case Left:
			if (_startPosX - step > 0)
			{
				_startPosX -= step;
			}
			break;
			//вверх
		case Up:
			if (_startPosY - step > 0)
			{
				_startPosY -= step;
			}
			break;
			//вниз
		case Down:
			if (_startPosY + step < _pictureHeight - locoHeight)
			{
				_startPosY += step;
			}
			break;
		}
	}
	@Override
	public void DrawPlane(Graphics g)
	{
		
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
		switch (design) {
		case 1:
			new Engine().draw(EngineCount.Four,g, _startPosX, _startPosY, MainColor);
			break;
		case 2:
			new EngineRect().draw(EngineCount.Five,g, _startPosX, _startPosY, MainColor);
			break;
		case 3:
			new EngineDoubleOval().draw(EngineCount.Six,g, _startPosX, _startPosY, MainColor);
			break;
		}
	}
}

