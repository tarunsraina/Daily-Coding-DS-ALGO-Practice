package AdityaVermaProblems;

public class OneToN {

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
			// System.out.println(n); //prints n t0 1
			print(n-1);
			System.out.println(n); //prints 1 to n
		}
		
	}

}
