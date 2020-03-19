package AllRemPrograms;

public class PrimeNumOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7; 
		int temp=0;
		
		
		 for(int i=2;i<num-1;i++) { //between 1 to 7,numbers are 2,3,4,5,6
				if(num%i==0) {
				temp=temp+1;
		                     }
		                          }
		
				if(temp==0) {
					System.out.println(num + " is a prime number");
							
				            }
				else        {
					System.out.println(num + " is not a prime number");
	                        }
	}
	}
	

