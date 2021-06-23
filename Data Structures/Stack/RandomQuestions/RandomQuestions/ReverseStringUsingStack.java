package RandomQuestions;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			st.push(str.charAt(i));
		}
		for(int i=0;i<str.length();i++)
		{
			System.out.print(st.pop());
		}

	}

}
