package RandomQuestions;

import java.util.Stack;

public class AddElementAtBootomUsingRecursion {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		/*st.push(10);
		st.push(20);*/
		st.push(30);
		st.push(40);
		addElementAtBottom(st,1000);
		System.out.println(st);

	}
									               
	private static void addElementAtBottom(Stack<Integer> st, int element) {
		if(st.size()==0)                        
		{
			st.push(element); 
		}
		else
		{
			int top=st.peek();  
			st.pop();    	
			addElementAtBottom(st,element);
			st.push(top);
			
		}
	}
              
	
	//OP:[1000, 30, 40]
}

/*
 *     [30,40]   Element-1000
 *     
 *     top=40;
 *     
 *     40 gone      [30]  
 *     
 *      [40]
 *     
 *     recursive call      [30],1000
 *     
 *     top=30
 *     
 *     30 gone    []   100
 *     
 *     recursive call   [],100
 *     
 *     stack empty add 100
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









