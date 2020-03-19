package recurtion;

public class FactNumber {
	
	static void recurtion() {
		System.out.println("factnum");
		// recurtion(); //calling the method again and again
	}

	static int factNum(int n) {
		if(n==1) {
			return 1;
		}
			else {
				return (n * factNum(n-1));
			}
				
		}
	
	
	
	public static void main(String[] args) {
		// recurtion:process of calling method itself cont//
		
		recurtion();
		System.out.println("Factorial of 5 is " + factNum(5));
		System.out.println(Math.ceil(10.6));
		System.out.println(Math.floor(10.6));
	}

}
