package nestedforpatterns;

public class Pattern9 {

	public static void main(String[] args) {
		// Pattern9//
		
		for(int i=1;i<=4;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
				
			}
			for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			for(int l=3;l>=i;l--) {
				System.out.print("*");
				
			}
			for(int m=2;m<=i;m++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
