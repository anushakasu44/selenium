package staticandnonstatic;

public class BasicLocalandNonlocal {
	//Global variable//
	int a=5;
	int b=10;
	
	void example() {
		//non static ...local//
	System.out.println(+a);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicLocalandNonlocal ob= new BasicLocalandNonlocal();
		ob.a=6;
		ob.example();
	}

}
