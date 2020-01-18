import java.awt.Color;
import java.awt.Graphics;
import java.util.Set;

 
public abstract class Vehicle implements ITransport{

	static int _startPosX;
	static int _startPosY;

	protected static int _pictureWidth;
	protected static int _pictureHeight;
	private  static  int planeWidth = 100;
	private static int planeHeight = 60;
	public  int MaxSpeed; {  Set get;}
	public  float Weight; { Set get;}
	public static Color MainColor; { Set get;}

    public void SetPosition(int x, int y, int width, int height)
    {
        _startPosX = x;
        _startPosY = y;
        _pictureWidth = width;
        _pictureHeight = height;
    }
    public abstract void DrawPlane(Graphics g);
    public abstract void MoveTransport(Direction direction);

}
