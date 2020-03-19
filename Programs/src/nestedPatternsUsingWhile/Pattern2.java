package nestedPatternsUsingWhile;

public class Pattern2 {
	
	
	public static void patternTwo(int len) {
		int i=1;
		while(i<=len) {
			int j=1;
			while(j<=i){
				//if(((((i==2)&&(j==2||j==3||j==4)))||(((i==3)&&(j==2||j==3||j==4)))||(((i==4)&&(j==2||j==3||j==4))))) for boxes inside space {
				if((i==3&&j==2)||(i==4&&(j==2||j==3))){
				//if((i==j)|| (j==len+1))  {
				    System.out.print(" ") ;}
				else {
					System.out.print("*");
				}
				j=j+1;
				
			}
			
			i=i+1;
			System.out.println();
			
		}
	}
		
	
	
	
	

	public static void main(String[] args) {
		//*
		//**
        //***
		
		 patternTwo(5);
		
	}

}
