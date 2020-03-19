package nestedPatternsUsingWhile;

public class Patterns1to10 {
	
	public static void patternOne(int len) {
		int  i = 1;
		while(i<=len)
		{
			int j = 1;
			while(j<=len) {
				//if((i == j) || (j == 1) || (i == len)){
				if((i == j) || (i + j == len+1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}				
				j=j+1;				
			}
		i=i+1;		
		System.out.println();
		}
		
	}

	//*   *
	// * *
	//  *
	// * *
	//*   *

	// 
	
	public static void main(String[] args) {
		
      patternOne(10);
	}

}
