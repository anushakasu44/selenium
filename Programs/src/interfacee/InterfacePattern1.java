package interfacee;

public interface InterfacePattern1{


	abstract void star();
	
	abstract void numbers();
	
	static void same() { // default static methods can be called by interface name.methodname only after java 8 version 
		System.out.println("hello");
		
	}
	
	void sta();//it takes by default abstract as it has no body//
	//it is not required to mention abstract//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacePattern1 b1= new InterfacePattern3(2,3);//upcasting
		b1.numbers();
		b1.sta();
		b1.star();
		
	}

}
