package Model;

import java.util.Date;

public class Simulation {

	// Simulation Information 
	public Date date = new Date();
	public Graph graph ;
	public boolean etat  = false;
	public int walksCounter=0 ;
	//
	public Simulation (Graph parGraph ,String startVertex,int walks) 
	{
		// � completer
		graph=parGraph;
		etat = true;
		run(date,etat,walks); 
		
		
	}

	public String lastVertex()
	{ // � completer
		return "";
	}
	
	public void run(Date parDate, boolean parEtat,int parwalks)
	{
		while()
		{
			
		}
	}
	
	
	
}
