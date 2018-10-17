
import java.awt.*;
import java.awt.geom.Line2D;

import javax.swing.*;
import javax.swing.event.ChangeEvent;

public class BarHeight extends JComponent
{
	private int h;
	
	public BarHeight( int h, int a, int b, int c)
	{
		this.h = h;
		r1 = new Rectangle(25, 305-a, 25, 20+a);
		r2 = new Rectangle(100, 305-b, 25, 20+b);
		r3 = new Rectangle(175, 305-c, 25, 20+c);
		
	}
	
	public  void setHeight(int height)
	{
		h = height;
	}
	public void paintComponent( Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.green);
//		Rectangle box = new Rectangle( 25, 305-h, 25, 20+h);
		g2.fill(r1);
		
		g2.setColor(Color.YELLOW);
//		Rectangle box1 = new Rectangle( 100, 305-h, 25, 20+h);
		g2.fill(r2);
		
		g2.setColor(Color.CYAN);
//		Rectangle box2 = new Rectangle( 175, 305-h, 25, 20+h);
		g2.fill(r3);
		
		g2.setColor(Color.BLACK);
		Line2D.Double x = new Line2D.Double(10,325,400,325);
		Line2D.Double y = new Line2D.Double(10,0 ,10, 325);
		
		g2.draw(x);
		g2.draw(y);
	}
	
	public Rectangle r1;
	public Rectangle r2;
	private Rectangle r3;
	
	

}