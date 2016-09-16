package Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import FilesHandler.ManipulationFichierXML;
import Model.Graph;
import Model.Link;
import Model.Simulation;
import Model.Vertex;

public class ChildPanel extends JPanel implements ActionListener{
	
	// pannel used to organise the layouts of the application
	JPanel northPanel = new JPanel();
	ShowGraph graphshow = new ShowGraph();
	Console logs = new Console();

	// boutons used to handle the simulation
	JButton simulateButton = new JButton("Simulate");
	JButton stepByStep = new JButton("Step By Step");
	JButton stopSimutation = new JButton("Stop");
	
	// Labels 
	JLabel walks = new JLabel("Walks");
	JLabel startVertex = new JLabel("Start Vertex");
	// Text field => we are going to put the number of walks that the use want 
	JTextField nbOfWalks = new JTextField(3);
	
	// A box to select which edge we gonna start with.
	JComboBox selectStartVertex = new JComboBox();

	//Graph 
	ArrayList <Vertex> vertices=new ArrayList <Vertex>();
	ArrayList <Link> links = new ArrayList <Link> ();
	Graph graph = new Graph("Name",vertices,links);
	
	//simualtion 
	Simulation sim;
	
	public ChildPanel()
	{
		//panels modifications 
		graphshow.setBackground(Color.WHITE);
		
		
		// Gestionnaire de l'application
		this.setLayout(new BorderLayout(8,8));
		
		// Adding elements
		
		northPanel.add(walks);
		northPanel.add(nbOfWalks);
		northPanel.add(startVertex);
		northPanel.add(selectStartVertex);
		northPanel.add(simulateButton);
		northPanel.add(stepByStep);
		northPanel.add(stopSimutation);
		
		//Adding the panels to the Borderlayout
		this.add(northPanel,BorderLayout.NORTH);
		this.add(graphshow,BorderLayout.CENTER);
		this.add(logs,BorderLayout.SOUTH);
		
		//
		Iterator it =new ManipulationFichierXML("data/graph.xml").getVerticesFromXML().iterator();
		String name="";
		while(it.hasNext())
		{
			
			Object o =it.next();
			name=((Vertex) o).name;
			selectStartVertex.addItem(name);
				
		}
	}
	

	
	
	
	public void actionPerformed(ActionEvent e) {

		String lastVertex="";
		if(e.getSource()==simulateButton)
		{
			String startVertex = (String) selectStartVertex.getSelectedItem();
			int walks=Integer.parseInt(nbOfWalks.getText());
			sim=new Simulation(graph, startVertex , walks);
			
			
		}
		if(e.getSource()==stepByStep)
		{
			//sim=new Simulation(graph)
		}
		
		if(e.getSource()==stopSimutation)
		{
			sim.etat=true;
		}
		
	}

	

}
