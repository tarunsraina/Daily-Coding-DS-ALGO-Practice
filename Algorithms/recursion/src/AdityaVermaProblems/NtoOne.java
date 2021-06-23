package AdityaVermaProblems;

public class NtoOne {

	public static void main(String[] args) {
		
		int n=7;
		print(n);

	}

	private static void print(int n) {
		
		if(n==1) {
			System.out.println(n);
		}
		else
		{
			System.out.println(n);
			print(n-1);
		}
		
	}

}
