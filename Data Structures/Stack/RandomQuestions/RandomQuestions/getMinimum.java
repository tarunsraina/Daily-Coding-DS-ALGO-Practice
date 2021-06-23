package RandomQuestions;

import java.util.Stack;

public class getMinimum {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<Integer>();
		st.push(999);
		st.push(10);
		st.push(99);
		st.push(4);
		st.push(47);
		st.push(1);
		int min=getMinimumElement(st);
		System.out.println(min);
	}

	private static int getMinimumElement(Stack<Integer> st) {
		
		while(st.size()>=3)
		{
		int a=st.pop();
		int b=st.pop();
		if(a>b)
		{
			st.push(b);
		}
		else
		{
			st.push(a);
		}
		}
		return st.peek();

}
}