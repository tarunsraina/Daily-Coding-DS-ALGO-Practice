package RandomQuestions;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackImplementationUsingQueue {
	
	
	static Scanner sc=new Scanner(System.in);
	static int popCount=0;
	static Queue<Integer> q1=new LinkedList<Integer>();
	static Queue<Integer> q2=new LinkedList<Integer>();

	public static void main(String[] args) {
		
		
		
		
		while(true)
		{
			System.out.println("Enter your Choice");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.EXIT");
			
			int choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:System.out.println("Enter Element");
					   int ele=sc.nextInt();
					   push(ele);
					   break;
				
				
				case 2:pop();
				break;
				
				case 3:System.exit(0);
				break;
				
				
				default:System.out.println("INVALID,PLEASE TRY AGAIN");
				break;
					   
			}
		}

	}

	private static void pop() {
		
			popCount++;
			int popEle=q1.remove();
			q2.add(popEle);
			for(int i=0;i<q1.size()-q2.size();i++)
			{
				q2.add(q1.remove());
			}
	
		
	}

	private static void push(int ele) {
		q1.add(ele);
	}

}
