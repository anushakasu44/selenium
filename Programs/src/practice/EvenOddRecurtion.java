package practice;

public class EvenOddRecurtion {
	
	
	public static void evenOdd(int n) {
		for(int i=0;i<=n;i++) {
if(n%2==1) {
		System.out.println("even");
		evenOdd(n);
	}else {
		System.out.println("odd");
		evenOdd(n);
	}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//EvenOddRecurtion ob=new EvenOddRecurtion();
		evenOdd(10);
	}

}
