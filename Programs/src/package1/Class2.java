package package1;

public class Class2 extends Class1{
	
	int test() {
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class2 ob1=new Class2();
ob1.test();
System.out.println(ob1.protectedSpecifier(10));//we can call protected when we have parent child relationship//

Class2.publicSpecifier();
Class2.defaultSpecifier(12);
ob1.setb(10.02);
System.out.println(ob1.getb());
	}

}
