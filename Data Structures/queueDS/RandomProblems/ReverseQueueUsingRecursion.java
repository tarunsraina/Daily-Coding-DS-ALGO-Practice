package RandomProblems;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {

	public static void main(String[] args) {
	
		Queue<Integer> queue=new LinkedList<>();
		queue.add(10);
		queue.add(20);  
		queue.add(30);
		queue.add(40);
		queue.add(50);
		System.out.println("Original Queue:"+queue);
		reverseQueue(queue);
		System.out.println("Reversed Queue:"+queue);
	}

	private static void reverseQueue(Queue<Integer> queue) {
		
		if(queue.size()==1)
		{
			return;
		}
		int first=queue.remove();
		reverseQueue(queue);
		queue.add(first);
		
	}

}
