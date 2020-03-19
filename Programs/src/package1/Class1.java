package package1;

public class Class1 {

	int a;
	private double b;//create getter and setter methods//
	protected int c;
	public int d;
	
	static int defaultSpecifier(int a1) {
		int a=a1;
		System.out.println("default value is:"+a);
		return a;
		
	}
	
	public void setb(double b) {//setter method for private
		this.b=b;
		
	}
	
	public double getb() {//getter method for private
	 return b;
	 }
	 
	 static void privateSpecifier() {
		System.out.println("private access Specifier");
	}
	
	protected int protectedSpecifier(int c) {//non static 
		this.c=c;
		System.out.println("Protected access specifier");
		return c;
	}
	 
	 public static void publicSpecifier() {
		 System.out.println("public access specifier");
	 }
	 
	 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Class1.defaultSpecifier(10);
		
		Class1.publicSpecifier();
		Class1 ob=new Class1();
		System.out.println(ob.protectedSpecifier(12));
		
		Class1.privateSpecifier();
		

	}

}
