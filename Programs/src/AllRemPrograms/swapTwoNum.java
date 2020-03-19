package AllRemPrograms;

public class swapTwoNum {

	public static void main(String[] args) {
		// Swapping 2 numbers without using 3rd variable//
		
		int a=10;
		int b=20;
		for (int i=0;i<=10;i++) {
			a=a+b;
			a=a-b;
			b=a-b;
			System.out.println(" "+a);
			System.out.println(" "+b);
			
		}

	}

}
