package Model;

public class Link {
	
	public Vertex vertex1 ;
	public Vertex vertex2 ;
	public Link (Vertex parVertex1, Vertex parVertex2)
	{
		vertex1=parVertex1;
		vertex2=parVertex2;
	}
	
	public Vertex getVertex1()
	{
		return vertex1 ;
	}
	
	public Vertex getVertex2()
	{
		return vertex2 ;
	}
	
	
	
	/*public ArrayList <Vertex> getVertexAdjacenty (Vertex parVertex)
	 * {
	 * ArrayList <Vertex> ladj = new ArrayList <Vertex>(); 
	 * ArrayList <Link> links = *********;
	 * 
	 * 	 if(link.getVertex1().getVertexName()== parVertexname.getVertexName())
	 * 	{
	 * 		ladj.add(link.getVertex2());
	 * 
	 *  }
	 *  
	 *  if(link.getVertex2().getVertexName()== parVertexname.getVertexName())
	 * 	{
	 * 		ladj.add(link.getVertex1());
	 * 
	 *  }
	 *  
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
}
