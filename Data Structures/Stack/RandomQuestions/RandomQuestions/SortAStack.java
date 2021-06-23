package RandomQuestions;

import java.util.Stack;

public class SortAStack {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		st.push(5);
		st.push(10);
		st.push(1);
		st.push(41);
		st.push(38);
		st.push(32);
		st.push(51);
		st.push(100);
		st.push(111);
		st.push(4123);
		st.push(38);
		st.push(33);
		sortStack(st);
		System.out.println(st);
	}

	private static void sortStack(Stack<Integer> st) {
		
		if(st.size()==1)
		{
			return;
		}
		else
		{
			int top=st.pop();
			sortStack(st);
			insert(st,top);
		
		}
	}
                   
	private static void insert(Stack<Integer> st, int top) {
		
		if(st.size()==0) {
			st.push(top);
			return;
		}
		else
		{
				if(st.peek()>top)
				{
					int temp=st.pop();
					insert(st,top);
					st.push(temp);
				}
				else
				{
					st.push(top);
				}
			
		}
		
	}

}
