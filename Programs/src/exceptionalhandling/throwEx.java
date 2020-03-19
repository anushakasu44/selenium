package exceptionalhandling;

public class throwEx {
	
	 void throwExExample(int i) throws Exception {
		
		while(i==0) {
			throw new Exception("true");//user itself throwing the exception
		}
		System.out.println("false");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		throwEx ob=new throwEx();
		ob.throwExExample(0);
	}

}
