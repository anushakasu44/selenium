package interfacee;

public class InterfacePattern3 extends InheritanceTestA implements InterfacePattern1,InterfacePattern2{
	InterfacePattern3(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void patternrevnNumbers() {
		System.out.println("num");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void star() {
		// TODO Auto-generated method stub
		System.out.println("star");
	}

	@Override
	public void numbers() {
		System.out.println("numbers");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sta() {
		System.out.println("sta");
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterfacePattern1.same(); // default static methods can be called by interface name only after java 8 version 
InterfacePattern2.same();

	
	InterfacePattern3 ob2= new InterfacePattern3(2,3);//child class obj creation//
	ob2.patternrevnNumbers();
	ob2.numbers();
	ob2.star();
	ob2.sta();
	
	
	}

}
