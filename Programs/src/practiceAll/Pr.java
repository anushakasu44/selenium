package practiceAll;

public class Pr {

	public static void method(int num) {
	
		
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method(5);
	}
	
}
