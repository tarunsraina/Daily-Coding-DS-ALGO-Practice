package RandomQuestions;

import java.util.Stack;

public class AddAtBottom {
	
	/*We should add a element at the bottom of the stack without using 
	any other data structure
	
	Naive approach:i used an extra stack,can be optimized using recursion
	
	*/

	public static void main(String[] args) {
		
		
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		addAtBottom(st,100);


	}

	private static void addAtBottom(Stack<Integer> st, int num) {
	
		if(st.size()==0)
		{
			st.push(num);   
			System.out.println(st);
		}
		else
		{
			Stack<Integer> temp=new Stack<>();
			while(!st.isEmpty())
			{
				temp.push(st.pop());
			}
			st.push(num);
			while(!temp.isEmpty())
			{
				st.push(temp.pop());
			}
			System.out.println(st);
		}
		
	}

}
