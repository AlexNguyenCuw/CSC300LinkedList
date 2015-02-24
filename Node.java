
public class Node 
{
	private Node nextNode;
	private int payload;
	private Node prevNode;
	
	public Node getPrevNode() 
	{
		return this.prevNode;
	}
	
	public void setPrevNode(Node nextNode) 
	{
		this.nextNode = prevNode;
	}

	public Node(int payload)
	{
		this.payload = payload;
		this.nextNode = null;
	}

	public Node getNextNode() 
	{
		return this.nextNode;
	}
	
	public void setNextNode(Node nextNode) 
	{
		this.nextNode = nextNode;
	}

	public int getPayload() 
	{
		return payload;
	}
	
}
