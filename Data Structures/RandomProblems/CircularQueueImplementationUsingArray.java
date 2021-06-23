package RandomProblems;

import java.util.*;


public class CircularQueueImplementationUsingArray {
	
	final static int max=5;
	static int[] queue=new int[max];
	static Scanner sc=new Scanner(System.in);
	static int rear=-1;
	static int front=-1;

	public static void main(String[] args) {
		while(true)
		{
		System.out.println("Enter your choice");
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.EXIT");
		
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:System.out.println("Enter Element");
					int ele=sc.nextInt();
					insert(ele);
					break;
			
			case 2:delete();
			break;
			
			
			case 3:System.exit(0);
			break;
			
			default:System.out.println("INVALID,PLEASE TRY AGAIN");
			break;
			
			
		}
		}
		

	}

	private static void delete() {
	
		if(front==-1)
		{
			System.out.println("Underflow");
			return;
		}
		int del=queue[front];
		if(rear==front)
		{
			front=rear=-1;
		}
		else if(front==max-1)
		{
			front=0;
		}
		else
		{
			front++;
		}
		System.out.println("Deleted "+del);
	}

	private static void insert(int ele) {
		
		if((front==0&&rear==max-1) || rear+1==front)
		{
			System.out.println("Overflow");
			return;
		}
		if(rear==-1)
		{
			front=rear=0;
		}
		else if(rear==max-1)
		{
			rear=0;
		}
		else
		{
			rear++;
		}
		queue[rear]=ele;
		
	} 

}
