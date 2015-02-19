

public class LinkedList
{
	private Node head;
	private Node end;
	private int count;
	
	public LinkedList()
	{
		this.head = null;
		this.end = null;
		this.count = 0;
	}
	
	public int get(int index)
	{
		int count = this.count();
		if(index >= count || index < 0)
		{
			System.out.println(" Illegel Index");
			return -1;
		}
		else
		{
			Node curr = head;
			for(int i = 0; i < index; i++)
			{
				curr = curr.getNextNode();
			}
			return curr.getPayload();
		}
	}
	public void display()
	{
		if(head == null)
		{
			System.out.println("Empty list");
		}
		else
		{
			Node currNode = this.head;
			while(currNode.getNextNode() != null)
			{
				System.out.print(currNode.getPayload() + "->");
				currNode = currNode.getNextNode();
			}
			System.out.println(currNode.getPayload() + "-> null");
		}
	}
	public int count()
	{
		return this.count;
	}
	
	public void addAtIndex(int payload, int index)
	{
		
		if(index <= 0)
		{
			this.addFront(payload);
		}
		else if(index >= this.count)
		{
			this.addEnd(payload);
		}
		else
		{
			Node n = new Node(payload);
			Node curr = head;
			
			for(int i =0 ; i< index-1; i++)
			{
				curr =curr.getNextNode();
			}
			n.setNextNode(curr.getNextNode());
			curr.setNextNode(n);
			this.count++;
		}
		
	}
	
	public int removeAtIndex( int index) throws Exception
	{
		
		if(index == 0)
		{
			return this.removeFront();
		}
		else if(index == this.count - 1)
		{
			return this.removeEnd();
		}
		else if(index < 0 || index >= this.count)
		{
			throw new Exception ("Can Not Remove Node that not exit");
		}
		else
		{
			Node remove = head;
			Node currNode = head;
			for(int i =0 ; i< index-1; i++)
			{
				currNode =currNode.getNextNode();
			}
			remove = currNode.getNextNode();
			currNode.setNextNode(remove.getNextNode());
			remove.setNextNode(null);
			this.count--;
			return currNode.getPayload();
		}
		
	}
	
	void printOdds()
	{
		Node currNode = head;
		while(currNode != null)
		{
			if(currNode.getPayload() % 2 ==1)
			{
				System.out.println(currNode.getPayload());
			}
			currNode = currNode.getNextNode();
		}
	}
	
	public int removeFront() throws Exception 
	{
		if(head == null)
		{
			throw new Exception ("Can Not Remove Front: Empty List");
		}
		Node currNode = head;
		head = head.getNextNode();
		currNode.setNextNode(null);
		this.count--;
		return currNode.getPayload();
	}
	public int removeEnd() throws Exception
	{
		if(head == null)
		{
			throw new Exception ("Can Not Remove End: Empty List");
		}
		else if (this.count ==1)
		{
			return this.removeFront();
		}
		else 
		{
			Node currNode = this.head;
			Node remove = this.end;
			while(currNode.getNextNode() != remove)
			{
				currNode = currNode.getNextNode();
				
			}
			currNode.setNextNode(null);
			end = currNode;
			this.count--;
			return currNode.getPayload();
		}
		
	}
	
	public void addFront(int payload)
	{
		Node n = new Node(payload);
		if(this.head == null)
		{
			this.head = n;
		}
		else
		{
			n.setNextNode(head);
			head = n;
		}
		this.count++;
	}
	
	public void addEnd(int payload)
	{
		Node n = new Node(payload);
		if(this.head == null)
		{
			this.head = n;
		}
		else
		{
			Node currNode = this.head;
			while(currNode.getNextNode() != null)
			{
				currNode = currNode.getNextNode();
			}
			currNode.setNextNode(n);
		}
		this.count++;
	}
}
// record at 11:15