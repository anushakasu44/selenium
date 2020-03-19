package exceptionalhandling;

public class TryCatchFinally {
	
	
	public static void main(String[] args) {
		

	
		
		try {   //whenever we get any error-keep in try block//
			int  a =10;
			int b =0;
			
			int c= a/b; //ArithmeticException /Zero //
		}
		
		catch(ArithmeticException e){ //when exception comes,'e' obj is created in catch//
			System.out.println(e.getMessage());
			}
		catch(Exception e) {//when we dont know the exception name then we can use parent "exception"name//
			System.out.println(e.getLocalizedMessage());
		}
		finally {    //it will even excecute when there is no exception//
			System.out.println("Finally");
		}
		
		
		
		
		}
			
		
		
	}


