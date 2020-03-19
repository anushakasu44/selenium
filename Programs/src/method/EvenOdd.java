package method;

public class EvenOdd {
	
	public static boolean evenOddNumber(int num) {
		if(num%2==0) {
			System.out.println("Even number is " +num);
			return true;
		}
		else {
			System.out.println("Odd number is " +num);
			return false;
		}
		
	}
	

			
		
	
	

	public static void main(String[] args) {
		
		evenOddNumber(9);
     
	}
	

}
