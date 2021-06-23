package RandomProblems;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseKElementsOfQueue {

	/*
	 * input:
	 * [10,20,30,40,50]  k=3
	 * 
	 * output:
	 * [30,20,10,40,50]
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		Queue<Integer> queue=new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		int k=3;
		Queue<Integer> queue1=new LinkedList<>();
		for(int i=0;i<k;i++)
		{
			queue1.add(queue.remove());
		}
		reverseQueue(queue1);
		queue1.addAll(queue);
		System.out.println(queue1);

	}

	private static void reverseQueue(Queue<Integer> queue1) {
		if(queue1.size()==1)
		{
			return;
		}
		int first=queue1.remove();
		reverseQueue(queue1);
		queue1.add(first);
		
	}

}
