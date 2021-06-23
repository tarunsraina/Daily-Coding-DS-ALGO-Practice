package RandomProblems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveQueueUsingStack {
	
	/*
	 * 			11 12 13 14 15 16 17 18 19 20 [input]  input.length should be even number
	 * 
	 *          11 12 13 14 15 [first half]  16 17 18 19 20[second half]
	 *          
				11 16 12 17 13 18 14 19 15 20  [output]
				
				//Only extra stack can be used as auxilary space.

	 * 
	 */
	static Stack<Integer> st=new Stack<>();

	public static void main(String[] args) {
		
		Queue<Integer> queue=new LinkedList<>();
		queue.add(11);
		queue.add(12);
		queue.add(13);
		queue.add(14);
		queue.add(15);
		queue.add(16);
		queue.add(17);
		queue.add(18);
		queue.add(19);
		queue.add(20);
		

		interleave(queue);  
		System.out.println(queue);
		
	}

	private static void interleave(Queue<Integer> queue) {
		Stack<Integer> st=new Stack<>();
		
		//insert half elements in stack
		for(int i=0;i<=queue.size()/2+1;i++)
		{
			st.push(queue.peek());
			queue.remove();
		}
		//System.out.println(st);
		//System.out.println(queue);
		
		//add to queue from stack
		while(!st.isEmpty())
		{
				queue.add(st.peek());
				st.pop();
		}
		//System.out.println(queue);
		
		//dequeue and enqueue first half stack of queue
		for(int i=0;i<queue.size()/2;i++)
		{
			queue.add(queue.peek());
			queue.remove();
		}
		//System.out.println(queue);
		
		//push half elements to stack
		for(int i=0;i<=queue.size()/2+1;i++)
		{
			st.push(queue.peek());
			queue.remove();
		}
		//System.out.println(queue);
		//System.out.println(st);
		
		
		while(st.size()>0)
		{
			queue.add(st.peek());
			st.pop();
			queue.add(queue.peek());
			queue.remove();
		}
		
	}
	
}



/*
 * 
 * 
 * OUTPUT:
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
 * 
 * 
 * 
 * 
 * 
 * 
 */
