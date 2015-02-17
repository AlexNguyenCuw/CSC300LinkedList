import java.util.Random;


public class Driver 
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.display();
		ll.addEnd(3);
		ll.addEnd(7);
		ll.addEnd(4);
		ll.addFront(2);
		ll.display();
		System.out.println(ll.get(3));
		for(int i=0;i<ll.count(); i++)
		{
			System.out.println(ll.get(i));
		}
		ll.addAtIndex(8, 4);
		ll.display();
		
	}
}
