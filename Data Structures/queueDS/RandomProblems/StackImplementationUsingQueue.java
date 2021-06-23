package RandomProblems;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackImplementationUsingQueue {
	
	
	static Scanner sc=new Scanner(System.in);
	static Queue<Integer> q1=new LinkedList<Integer>();
	static Queue<Integer> q2=new LinkedList<Integer>();

	public static void main(String[] args) {
		
		
		
		
		while(true)
		{
			System.out.println("Enter your Choice");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.Display");
			System.out.println("4.EXIT");
			
			int choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:System.out.println("Enter Element");
					   int ele=sc.nextInt();
					   push(ele);
					   break;
				
				
				case 2:int x=pop();
						if(x!=-1)
						{
							System.out.println("Popped "+x);
						}
						else
						{
							System.out.println("Empty");
						}
						break;
				
				case 3:Display();
				break;
				
				case 4:System.exit(0);
				break;
				
				
				default:System.out.println("INVALID,PLEASE TRY AGAIN");
				break;
					   
			}
		}

	}

	private static void Display() {
	
			System.out.println(q1);
			
	}

	private static int pop() {
			
		if(q1.isEmpty())
		{
			return -1;
		}
		else
		{
			while(q1.size()!=1)
			{
				q2.add(q1.remove());
			}
			int popElement=q1.remove();
			Queue<Integer> temp=new LinkedList<Integer>();
			temp=q1;
			q1=q2;
			q2=temp;
			return popElement;
			
		}
		
	}

	private static void push(int ele) {
		q1.add(ele);
	}

}
