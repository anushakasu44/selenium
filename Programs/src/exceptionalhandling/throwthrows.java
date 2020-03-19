package exceptionalhandling;

public class throwthrows {
	
	public void test1() throws Exception  { //when we are giving exception scenaro,system itself throes and handles it
		int a[]= {1,5,3};
		System.out.println(a[3]);
		
		
		
	}
	void test3() throws Exception {
		throw new Exception("hello");
	}

	public void test2()  {
		      try {             //try catch:unchecked :handled exception
		    	  System.out.println(100/0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}

		
	}
	public static void main(String[] args) throws Exception  {
		
		Thread.sleep(10000);//interupted exception (10000 milliseconds= 10sec)
		//and checked exception which are unhandled exception
		
throwthrows ob=new throwthrows();

 
//ob.test1(); //it will show only one output
//ob.test2();
ob.test3();
	}

}
