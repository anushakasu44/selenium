package practice;

public class ClassE1 {

	int a;
	public static int b;
	private String name;;
	protected int d;
	
	
	static void add1() {
		System.out.println("Default");
	}
	public static void add2() {
		System.out.println("public");
	}
	
	private static void add3() {
		System.out.println("private");
	}
	
	public  void setname(String name) {
		this.name=name;
		
	}
	public String getname() {
		return name;
	}
	protected static void add4() {
		System.out.println("protected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
add2();
add1();
add3();
add4();

	}

}
