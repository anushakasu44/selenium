package Constructors;

public class ConstructorForPatterns {
	int n;
	
	ConstructorForPatterns(int n) {
	this.n=n;
	
	}
	
	void pattern1() {
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==2 && j==2) {
				System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			}
		System.out.println("-------------");
	
	}
	
	void pattern2() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	
	void pattern3() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
  
	void pattern4() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	

	void pattern5() {
		for(int i=1;i<=n;i++) {
			for(int j=2;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	
	
	void pattern6() {
		for(int i=1;i<=n;i++) {
			for(int j=2;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int l=1;l<=i-1;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
	
	
	void pattern7() {
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=2;k>=i;k--) {
				System.out.print("*");
			}
			for(int l=2;l>=i-1;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}

	

	void pattern8() {
		for(int i=1;i<=n;i++) {
			for(int j=2;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	for(int i=1;i<=n;i++) {
		for(int j=2;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=2;k>=i;k--) {
			System.out.print("*");
		}
		for(int l=2;l>=i-1;l--) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("-------------");
}
		
void pattern9() {
	
		for (int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				
				System.out.print(j);
				
			}
			System.out.println();
			}
		System.out.println("10-------------");
	
	}

void pattern10() {
	
	for (int i=1;i<=n;i++) {
		for(int j=3;j>=i;j--) {
			
			System.out.print(j);
			
		}
		System.out.println();
		}
	System.out.println("-------------");

}



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorForPatterns  p1=new ConstructorForPatterns(3);
		p1.pattern1();
		p1.pattern2();
		p1.pattern3();
		p1.pattern4();
		p1.pattern5();
		p1.pattern6();
		p1.pattern7();
		p1.pattern8();
		p1.pattern9();
		p1.pattern10();
		
		
	}
	

}
