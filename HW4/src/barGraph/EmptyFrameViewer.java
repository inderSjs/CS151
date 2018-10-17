package barGraph;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EmptyFrameViewer 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BarHeight x = new BarHeight(0,0,0,0);
		frame.add(x);
		frame.setVisible(true);
		
		 JFrame frame1 = new JFrame();
	      frame1.setLayout(new EditorLayout());
	      frame1.add(new JLabel("Bar1"));
	      JTextField bar1Text = new JTextField(15);
	
	      bar1Text.setBackground(Color.GREEN);
	      frame1.add(bar1Text);
	      JTextField bar2Text = new JTextField(15);
	      bar2Text.setBackground(Color.ORANGE);
	      frame1.add(new JLabel("Bar2"));
	      frame1.add(bar2Text);
	      JTextField bar3Text = new JTextField(15);
	      bar3Text.setBackground(Color.CYAN);
	      frame1.add(new JLabel("Bar3"));
	      frame1.add(bar3Text);
	      
	      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame1.pack();
	      frame1.setVisible(true);
	      
	     
	      
	      bar1Text.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e)
	    	  {
	    		  JTextField source = (JTextField)e.getSource();
	    		  String e1 = source.getText();
	    		 
	    		  Integer x1 = Integer.parseInt(e1);
	    		  BarHeight x = new BarHeight(0,x1,0,0);
	    			frame.add(x);
	    			frame.setVisible(true);
	    		 
	    		  
	   
	
	    		  	    		  
	    	  }
	    	  
	      });
	      
	      bar2Text.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e)
	    	  {
	    		  JTextField source = (JTextField)e.getSource();
	    		  String e1 = source.getText();
	    		
	    		  Integer x1 = Integer.parseInt(e1);
	    		  BarHeight x = new BarHeight(0,0,x1,0);
	    			frame.add(x);
	    			frame.setVisible(true);
	    		  	    		  
	    	  }
	    	  
	      });
	      
	      bar3Text.addActionListener(new ActionListener() {
	    	  public void actionPerformed(ActionEvent e)
	    	  {
	    		  JTextField source = (JTextField)e.getSource();
	    		  String e1 = source.getText();
	
	    		  Integer x1 = Integer.parseInt(e1);
	    		  BarHeight x = new BarHeight(0,0,0,x1);
	    			frame.add(x);
	    			frame.setVisible(true);
	    		  	    		  
	    	  }
	    	  
	      });
			
		
	}
}
