import java.util.Scanner;


public class RPCalc 
{
	private Stack theStack;
	private int count;
	
	public int count()
	{
		return this.count;
	}
	
	public RPCalc()
	{
		this.theStack = new Stack();
	}
	
	private boolean isNumber(String s)
	{
		try
		{
			Integer.parseInt(s);
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}
	
	private boolean isOperator(String s)
	{
		String map = "+-*/";
		return map.indexOf(s) != -1 && s.length() == 1;
	}
	
	public void on() throws Exception
	{
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("=> ");
			String val = input.nextLine().trim();
			if(val.equalsIgnoreCase("quit"))
			{
				break;
			}
			else if(val.equalsIgnoreCase("show"))
			{
				if(this.theStack.isEmpty())
				{
					System.out.println("Empty Stack");
					continue;
				}
				Stack temp = new Stack();
				while(!this.theStack.isEmpty())
				{
					temp.push(this.theStack.pop());
				}
				while(!temp.isEmpty())
				{
					int num = temp.pop();
					System.out.println(num);
					this.theStack.push(num);
					this.count++;
				}
			}
			else if(this.isNumber(val))
			{
				this.theStack.push(Integer.parseInt(val));
			}
			else if(this.isOperator(val))
			{
				int num1 = this.theStack.pop();
				int num2 = this.theStack.pop();
				if(val.equals("+"))
				{
					this.theStack.push(num1 + num2);
				}
				else if(val.equals("-"))
				{
					this.theStack.push(num1 - num2);
				}
				else if(val.equals("*"))
				{
					this.theStack.push(num1 * num2);
				}
				else if(val.equals("/"))
				{
					this.theStack.push(num1 / num2);
				}
			}
			else if(val.equalsIgnoreCase("sum"))
			{
				this.theStack.push(sumStack());
			}
			else
			{
				System.out.println("Illegal Input");
			}
		}
	}

	
	public int sumStack()throws Exception
	{
		
		int total = 0;
		Stack temp = new Stack();
		while(!this.theStack.isEmpty())
		{
			temp.push(this.theStack.pop());
		}
		while(!temp.isEmpty())
		{
			int num = temp.pop();
			this.theStack.push(num);
			total += num;		
			System.out.println(total);
		}
		return total;
		
	}
}