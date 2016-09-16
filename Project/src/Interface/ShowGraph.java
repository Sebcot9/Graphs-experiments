package Interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class ShowGraph extends JPanel 
{
	public ShowGraph()
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d =(Graphics2D) g;
		g2d.setColor(Color.BLACK);
		g2d.drawOval(10, 10, 50, 50);
		g2d.drawOval(10, 10, 50, 50);
	}
}
