package FilesHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;







import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Model.Link;
import Model.Vertex;

public class ManipulationFichierXML {

	public  String path="";
	public ManipulationFichierXML(String parPath) 
	{
		path=parPath;
	}
	
	public  ArrayList <Vertex> getVerticesFromXML ()
	{
		ArrayList <Vertex> vertices = new ArrayList <Vertex> ();
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null; 
		
		try
		{
			builder = builderFactory.newDocumentBuilder();
			Document documentGraph = builder.parse(new FileInputStream(path));
			NodeList listeNoeudsVertices = documentGraph.getElementsByTagName("vertex");
		   
			for (int i=0 ; i < listeNoeudsVertices.getLength() ; i++)	   
		   {
		       Element courant =  (Element) listeNoeudsVertices.item(i);
		       String name = courant.getAttribute("name");
		       int num = Integer.parseInt(courant.getAttribute("numero"));
		        
		       
		       Vertex vertex = new Vertex (name,num); 
	    	   vertices.add (vertex); 
		   }
		} //try
		catch (SAXException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();} 
		catch (ParserConfigurationException e) {e.printStackTrace();} 
		return vertices;
	}
	
	public  ArrayList <Link> getLinksFromXML ()
	{
		ArrayList <Link> links = new ArrayList <Link> ();
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null; 
		
		try
		{
			builder = builderFactory.newDocumentBuilder();
			Document documentGraph = builder.parse(new FileInputStream(path));
			NodeList listeNoeudsLinks = documentGraph.getElementsByTagName("link");
		   
			for (int i=0 ; i < listeNoeudsLinks.getLength() ; i++)	   
		   {
		       Element courant =  (Element) listeNoeudsLinks.item(i);
		       String vertexName1 = courant.getAttribute("vertex1");
		       
		       String vertexName2 = courant.getAttribute("vertex2"); 
		      
		       Vertex vertex1 =getVertexByName(vertexName1);
		       //System.out.println(vertex1.getVertexName());
		       Vertex vertex2 =  getVertexByName(vertexName2);
		      //System.out.println(vertex2.getVertexName());
		       Link link = new Link (vertex1,vertex2); 
		       links.add (link); 
		   }
		} //try
		catch (SAXException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();} 
		catch (ParserConfigurationException e) {e.printStackTrace();} 
		return links;
	}
	
	
	public  Vertex getVertexByName(String vertexName)
	{
		String name="";
		Iterator it =getVerticesFromXML().iterator();
		Vertex vertex =new Vertex("A",5);
		while(it.hasNext())
		{
			
			Object o =it.next();
			name=((Vertex) o).name;
			if(name.equals(vertexName))
			{
				
				return (Vertex) o;
			}
				
		}
		
		return vertex;
	}
	
}
