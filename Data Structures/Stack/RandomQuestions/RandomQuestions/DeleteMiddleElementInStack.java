package RandomQuestions;

import java.util.Stack;

public class DeleteMiddleElementInStack {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(1000);  //This shoud be deleted
		st.push(30);
		st.push(40);
		deleteMid(st,0);
		System.out.println(st);

	}

	private static void deleteMid(Stack<Integer> st,int curr) {
		if(st.size()==0||st.size()==curr)
		{
			return;
		}
		else
		{
			int top=st.pop();
			deleteMid(st,curr+1);
			if(curr!=st.size()-1/2)
			{
				st.push(top);
			}
		}
	}

}
