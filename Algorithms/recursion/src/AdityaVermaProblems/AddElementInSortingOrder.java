package AdityaVermaProblems;

import java.util.ArrayList;

public class AddElementInSortingOrder {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(5);   //     [1,3,5]
		int ele=4;  //'ele' should be added such that list is still sorted ie [1,3,4,5]
		addElement(al,ele);
		System.out.println(al);

	}

	private static void addElement(ArrayList<Integer> arr, int ele) {
		if(arr.size()==0||arr.get(arr.size()-1)<=ele) {
			arr.add(ele);
		}
		else 
		{
			int top=arr.get(arr.size()-1);
			arr.remove(arr.size()-1);
			addElement(arr,ele);
			arr.add(top);
		}
	}

}
