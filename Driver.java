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
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.display();
		ll.pop();
		ll.display();
		System.out.println(ll.peek());
		
		
		
		/*ll.addEnd(3);
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
