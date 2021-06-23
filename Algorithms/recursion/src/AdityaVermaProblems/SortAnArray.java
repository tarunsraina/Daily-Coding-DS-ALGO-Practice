package AdityaVermaProblems;

import java.util.ArrayList;

//sort array list

public class SortAnArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(41);
		al.add(5);
		al.add(92);
		al.add(43);
		al.add(59);
		al.add(89);
		sortList(al);
		System.out.println(al);
		
}

	private static void sortList(ArrayList<Integer> al) {
		
		if(al.size()==1) {
			return;
		}
		else
		{
			int last=al.get(al.size()-1);
			al.remove(al.size()-1);
			sortList(al);
			insert(al,last);
		}
		
	}

	private static void insert(ArrayList<Integer> al, int last) {
		
		if(al.size()==0||al.get(al.size()-1)<=last)
		{
			al.add(last);
			return;
		}
		else
		{
			int temp=al.get(al.size()-1); 
			al.remove(al.size()-1);
			insert(al,last);
			al.add(temp);
			return;
		}
	}
}