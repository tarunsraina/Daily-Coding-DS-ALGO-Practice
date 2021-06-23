package RandomProblems;
import java.util.Scanner;

public class QueueImplementationUsingArrays {
	
	static Scanner sc=new Scanner(System.in);
	static int n=100;
	static int front=-1;
	static int rear=-1; 
	static int[] queue=new int[n];

	public static void main(String[] args) {
		
		while(true)
		{
		System.out.println("Enter your choice");
		System.out.println("1.Enqueue");
		System.out.println("2.Dequeue");
		System.out.println("3.peek");
		System.out.println("4.Know Queue Size");
		System.out.println("5.is my Queue Empty?");
		System.out.println("6.is my Queue Full?");
		System.out.println("7.Display my Queue");
		System.out.println("8.EXIT");
		
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:enqueue();
			break;
			
			case 2:dequeue();
			break;
			
			case 3:peek();
			break;
			
			case 4:size();
			break;
			
			case 5:isEmpty();
			break;
			
			case 6:isFull();
			break;
			
			case 7:Display();
			break;
			
			case 8:System.exit(0);
			break;
			
			default:System.out.println("INVALID,PLEASE TRY AGAIN");
			break;
			
			
		}
		}
		
		

	}

	private static void Display() {
	
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Queue Elements are:");
			for(int i=front;i<=rear;i++)
			{
				System.out.print(queue[i]+" ");
			}
			
		}
		
	}

	private static void peek() {
		
		if(front==-1&&rear==-1)
		{
			System.out.println("No Elements in Queue");
		}
		else
		{
			System.out.println("Element is "+queue[front]);
		}
	}

	private static void isFull() {
		boolean bool;
		if(rear==n-1)
		{
			bool=true;
		}
		else
		{
			bool=false;
		}
		System.out.println(bool);
		
	}

	private static void isEmpty() {
		boolean bool;
		if(front==-1&&rear==-1)
		{
			bool=true;
		}
		else
		{
			bool=false;
		}
		System.out.println(bool);
	}

	private static void size() {
		int count=0;
		if(front==-1)
		{
			System.out.println("0");
		}
		else
		{
		for(int i=front;i<=rear;i++)
		{
			count++;
		}
		System.out.println(count);
		}
		
	}

	private static void dequeue() {
		
		if(front==-1 && rear==-1)
		{
			System.out.println("Underflow");
		}
		else
		{
			if(front==rear)  // only one element
			{
				front=rear=-1;
			}
			else
			{
				System.out.println("Deleted Element is "+queue[front]);
				front++;
			}
		}
	
		
	}

	private static void enqueue() {
		int ele;
		if(rear==n-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			if(front==-1)
			{
				front=0;
			}
			System.out.println("enter Element");
			ele=sc.nextInt();
			rear++;
			queue[rear]=ele;
			
		}
		
	}

}











/*
 * 
 * 
 * 
 * 
 OUTPUT:

 Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
4
0
Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
5
true
Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
6
false
Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
1
enter Element
10
Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
1
enter Element
20
Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
1
enter Element
30
Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
3
Element is 10
Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
7
Queue Elements are:
10 20 30 Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
2
Deleted Element is 10
Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT
7
Queue Elements are:
20 30 Enter your choice
1.Enqueue
2.Dequeue
3.peek
4.Know Queue Size
5.is my Queue Empty?
6.is my Queue Full?
7.Display my Queue
8.EXIT

 * 
 * 
 */
