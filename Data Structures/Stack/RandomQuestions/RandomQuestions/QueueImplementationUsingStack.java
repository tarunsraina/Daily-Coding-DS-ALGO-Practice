package RandomQuestions;

import java.util.*;

public class QueueImplementationUsingStack {
	static Scanner sc=new Scanner(System.in);
	static Stack<Integer> st1=new Stack<>();
	static Stack<Integer> st2=new Stack<>();

	public static void main(String[] args) {
		
	while(true)
	{
		System.out.println("Enter Your Choice");
		System.out.println("1.Enqueue");
		System.out.println("2.Dequeue");
		System.out.println("3.Display");
		System.out.println("4.size");
		System.out.println("5.EXIT");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:System.out.println("Enter the element");
					int ele=sc.nextInt();
					enqueue(ele);
					break;
					
			case 2:dequeue();
					break;
			
			case 3:System.out.println(st1);
					break;
			
			case 4:System.out.println(st1.size());
					break;
				
			case 5:System.exit(0);
			break;
			
			default:System.out.println("INVALID CHOICE");
			break;
		}
		
	}
		
	}

	private static void dequeue() {
		
		while(st1.size()!=1)
		{
			st2.push(st1.pop());
		}
		System.out.println("removed "+st1.pop());
		
		while(st2.size()!=0)
		{
			st1.push(st2.pop());
		}
	}

	private static void enqueue(int ele) {
		
		st1.push(ele);
		
	}

}



/*
 * 
 OUTPUT:
 
 Enter Your Choice
1.Enqueue
2.Dequeue
3.Display
4.size
5.EXIT
1
Enter the element
10
Enter Your Choice
1.Enqueue
2.Dequeue
3.Display
4.size
5.EXIT
3
[10]
Enter Your Choice
1.Enqueue
2.Dequeue
3.Display
4.size
5.EXIT
4
1
Enter Your Choice
1.Enqueue
2.Dequeue
3.Display
4.size
5.EXIT
1
Enter the element
20
Enter Your Choice
1.Enqueue
2.Dequeue
3.Display
4.size
5.EXIT
2
removed 10
Enter Your Choice
1.Enqueue
2.Dequeue
3.Display
4.size
5.EXIT
4
1
Enter Your Choice
1.Enqueue
2.Dequeue
3.Display
4.size
5.EXIT
2
removed 20
Enter Your Choice
1.Enqueue
2.Dequeue
3.Display
4.size
5.EXIT
4
0
Enter Your Choice
1.Enqueue
2.Dequeue
3.Display
4.size
5.EXIT

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



















