import java.util.Random;


public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		LinkedList ll = new LinkedList();
		try
		{
		System.out.println(ll.removeFront());
		}
		catch(Exception e)
		{
			System.out.println("Failed to remove");
		}
	
		ll.addEnd(3);
		ll.addEnd(7);
		ll.addEnd(4);
		ll.addFront(2);
		ll.addAtIndex(8, 4);
		ll.display();
		ll.removeAtIndex(2);
		ll.display();
		ll.displayInReverse();
		//ll.printOdds();
		/*try
		{
		System.out.println(ll.removeFront());
		}
		catch(Exception e)
		{
			System.out.println("Failed to remove");
		}
		ll.display();
		
		try
		{
		System.out.println(ll.removeEnd());
		}
		catch(Exception e)
		{
			System.out.println("Failed to remove");
		}
		ll.display();
		
		try
		{
		System.out.println(ll.removeAtIndex(3));
		}
		catch(Exception e)
		{
			System.out.println("Failed to remove");
		}
		*/
		
	}
}
