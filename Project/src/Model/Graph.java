package Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class Graph{
	
	public ArrayList <Vertex> vertices = new ArrayList <Vertex>();
	public ArrayList <Link> links = new ArrayList <Link>();
	public String name ="";
	
	public Graph(String graphname,ArrayList <Vertex> parVertices,ArrayList <Link> parlinks)
	{
		name = graphname;
		vertices = parVertices;
		links = parlinks;
	}
	
	
	public void addVertex(Vertex parVertex)
	{
		vertices.add(parVertex);
	}
	
	public void addLink(Link parLink)
	{
		links.add(parLink);
	}
	
	public void removeVertex(Vertex parVertex)
	{
		vertices.remove(parVertex);
	}
	
	public void removeLink(Link parLink)
	{
		links.remove(parLink);
	}
	
	public int lengthOfGraph()
	{
		int size = vertices.size();
		return size;
	}
	
	
	
	
	
}
