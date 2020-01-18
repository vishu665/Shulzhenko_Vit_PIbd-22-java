import java.awt.Color;
import java.awt.Graphics;

public class EngineDoubleOval implements IEngine{
	public  void draw(EngineCount count, Graphics g,  int x ,int y,Color mainColor)
	{
		DrawEngine(g,x-50,y); 
		DrawEngine(g,x-55,y+5); 
		DrawEngine(g,x-45,y-5); 		
		
		DrawEngine(g,x,y); 
		
		if(count == EngineCount.Five || count == EngineCount.Six) {
			DrawEngine(g,x-5,y+5);           
		}
		if(count == EngineCount.Six) {		  
			DrawEngine(g,x-10,y+10);          
		}
	}
	public  void DrawEngine(Graphics g, int x,int y) {
		g.setColor(Color.DARK_GRAY);
		g.fillOval(  x + 50, y + 20, 15, 7);
		g.setColor(Color.BLACK);
		g.fillOval(  x + 60, y + 20, 5, 7);
	}
}