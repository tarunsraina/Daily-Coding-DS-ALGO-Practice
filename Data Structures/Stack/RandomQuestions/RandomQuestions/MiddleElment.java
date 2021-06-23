package RandomQuestions;

import java.util.Stack;

public class MiddleElment {
	
	//return and pprint the middle element in a stack

	public static void main(String[] args) {
	
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		st.push(100);
		st.push(110);
		int middle=findMiddle(st);
		System.out.print(middle);

	}

	private static int findMiddle(Stack<Integer> st) {
		if(st.size()==0)
		{
			return -1;
		}
		else
		{
			int mid=(st.size()/2);
			for(int i=0;i<mid;i++)
			{
				st.pop();
			}
			return st.peek();
		}
		
	}
}
