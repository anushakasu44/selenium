package method;

public class MethodOverloading {
	
	//same method with different arguments//
	//to achive 3 conditions:arg diff type,order diff, no of arg diff//
	
	public static int mul(int a,int b) {
		System.out.println(a * b);
		int c=(a * b);
	    return c;
	}
	
	public static void mul(int a, double b, int d) {
		System.out.println(a + b+ d);
	}
	
public static void mul(double x,  int z) {
		System.out.println(x % z);
}



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 mul(10,20);
 mul(5,10,45);
 mul(10,22);

	}

}
