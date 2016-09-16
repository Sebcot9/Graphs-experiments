package Interface;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MainFrame extends JFrame{
	
	
	JMenuBar menu = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	
	JMenu drawMenu = new JMenu("Draw");
	JMenu helpMenu = new JMenu("Help");
	JMenuItem importItem = new JMenuItem("Import File");
	JMenuItem exportItem = new JMenuItem("Export as XML");
	JMenuItem exitItem = new JMenuItem("Exit");
	
	public MainFrame(String title)
	{
		super(title);
		this.setSize(800,600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		ChildPanel child = new ChildPanel();
		this.add(child);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.pack();
		
		
		/////////////////////////////
				/* Menu */
		//File_Menu
		fileMenu.add(importItem);
		fileMenu.add(exportItem);
		fileMenu.add(exitItem);
		menu.add(fileMenu);
		
		//Draw_Menu 
		menu.add(drawMenu);
		// Help 
		menu.add(helpMenu);
		
		this.setJMenuBar(menu);
		/////////////////////////////
		
		
		
		
		
	}
	
	public static void main(String [] args)
	{
		new MainFrame("Random Walk Simulation");
	}
}
