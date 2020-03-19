package inheritance;

public class InheritanceTestB extends InheritanceTestA {
	
	int c;
	
	void b1() {
		System.out.println("name");
	}
	
	InheritanceTestB(int c){
		super(c,1);//super keyword is used to call the parent class constructor//
		this.c=c;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceTestB t2=new InheritanceTestB(6);
		t2.b1();
		t2.a1();
	}

}
