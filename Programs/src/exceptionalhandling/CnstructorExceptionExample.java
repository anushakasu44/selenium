package exceptionalhandling;

public class CnstructorExceptionExample extends Exception {
	int length;
	int breadth;
	
	CnstructorExceptionExample(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		System.out.println("Area of square is:"+(length*breadth));
	}
	
	void test1() {
		
	}
	

	public static void main(String[] args) {
		// square :parent class
		CnstructorExceptionExample obj=new CnstructorExceptionExample(2,3);
		obj.test1();
	}

}
