package question3and4;


import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Shape implements Icon {
	
	private int size;
	private Color color;
	
	public Shape(int size)
	{
		this.size = size;
		color = Color.RED;
	}
	
	public int getIconHeight()
	{
		return this.size;
	}
	
	public int getIconWidth()
	{
		return this.size;
	}
	
	public void paintIcon( Component c, Graphics g, int x, int y )
	{
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D.Double icon = new Ellipse2D.Double(x, y, size, size);
		g2.setColor(Color.red);
		g2.fill(icon);
	}
	
	public static void main(String[] args)
	{
		Shape c = new Shape(150);
		JLabel l = new JLabel(c);
		JFrame  frame = new JFrame();
		JButton red = new JButton("Red");
		JButton  blue  = new JButton("Blue");
		JButton green = new JButton("Green");

		frame.setLayout(new FlowLayout());
		frame.add(red);
		frame.add(green);
		frame.add(blue);
		frame.add(l);
	
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
	}


}

