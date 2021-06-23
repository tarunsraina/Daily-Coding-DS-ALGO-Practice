package RandomQuestions;

import java.util.Stack;


//reverse a stack without using extra space

/*approach:
 * 
 *    [10,20,30,40]  take out top element and apply reverse to remaining stack elements
 *    
 *    ex:  40   [10,20,30]
 * 
 *    after reversing stack containg [10,20,30] add top element at the bottom of stack.
 *    
 *    to reverse stack,apply recursive leap of faith with base condition i.e returns when size is 1.
 * 
 * 
 */
public class ReverseStackUsingRecursion {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		reverseStack(st);
		System.out.println(st);
	}

	private static void reverseStack(Stack<Integer> st) {
		
	if(st.size()==1)
	{
		return;
	}
		int top=st.peek();
		st.pop();
		reverseStack(st);
		insertAtBottom(st,top);
	}

	private static void insertAtBottom(Stack<Integer> st, int ele) {
		if(st.size()==0)                        
		{
			st.push(ele); 
		}
		else
		{
			int top=st.peek();  
			st.pop();    	
			insertAtBottom(st,ele);
			st.push(top);
			
		}
		
	}

}
