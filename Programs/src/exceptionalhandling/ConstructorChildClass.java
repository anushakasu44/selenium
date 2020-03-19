package exceptionalhandling;

public class ConstructorChildClass {
	
	
public void example() throws Exception {
	throw new CnstructorExceptionExample(2,3);
}

	
	//void exception1() throws Exception  {
	//	throw new InterruptedException();
	//}
	public static void main(String[] args) {
		// Rectangle ::Child
		ConstructorChildClass obj2 =new ConstructorChildClass ();
		try {
			obj2.example();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
