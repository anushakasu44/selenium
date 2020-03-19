package interfacee;

public interface InterfacePattern2 {
	
	abstract void patternrevnNumbers();
	
	static void same() {
		System.out.println("hello");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfacePattern2 b2= new InterfacePattern3(2,3);//upcating
		b2.patternrevnNumbers();
	}

}
